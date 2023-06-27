package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileStream extends StObject {
  
  /**
    * The number of bytes that are available for reading from the stream.
    *
    * The number of bytes available for reading is the maximum amount of bytes that can be read in the next read operation.
    * It corresponds to the number of bytes available after the file pointer denoted by the _position_ attribute.
    *
    * \-1 if EOF is true.
    *
    * @note _deprecated_ 5.0 Since 5.0
    */
  val bytesAvailable: Double
  
  /**
    * Closes this FileStream.
    *
    * Flushes any pending buffered writes and closes the File. Always succeeds.
    * Note that pending writes might not succeed.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    */
  def close(): Unit
  
  /**
    * The flag indicating whether the current file pointer is at the end of the file.
    *
    * If set to true, this attribute indicates that the file pointer is at the end of the file.
    *
    * If set to false, this attribute indicates that the file pointer is not at the end of the file and so it is anywhere within the file.
    *
    * @note _deprecated_ 5.0 Since 5.0
    */
  val eof: Boolean
  
  /**
    * The flag indicating the stream position for reads/writes.
    *
    * The stream position is an offset of bytes from the start of the file stream. When invoking an operation that reads or writes from the stream, the operation will take place from the byte defined by this _position_ attribute. If the read or write operation is successful, the position of the stream is advanced by the number of bytes read or written. If the read/write operation is not successful, the position of the stream is unchanged.
    *
    * @note _deprecated_ 5.0 Since 5.0
    */
  var position: Double
  
  /**
    * Reads the specified number of characters from the position of the file pointer in a FileStream and returns the characters as a string.
    * The resulting string length might be shorter than _charCount_ if EOF is true.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param charCount Number of characters being read.
    *
    * @returns Array of read characters as a string.
    *
    * @throws WebAPIException with error type IOError, if a read error occurs, such as the bytes in the stream cannot be decoded with the encoding in use.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def read(charCount: Double): String
  
  /**
    * Reads the specified number of bytes from this FileStream, encoding the result in base64.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param byteCount Number of bytes to read.
    *
    * @returns Array of read characters as base64 encoding string.
    *
    * @throws WebAPIException with error type IOError, if a read error occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def readBase64(byteCount: Double): String
  
  /**
    * Reads the specified number of bytes from a FileStream.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param byteCount Number of bytes to read.
    *
    * @returns Result of read bytes as a byte (or number) array.
    *
    * @throws WebAPIException with error type IOError, if a read error occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def readBytes(byteCount: Double): js.Array[Double]
  
  /**
    * Writes the specified DOMString to a FileStream.
    *
    * @note _deprecated_ 5.0 Since 5.0
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param stringData Actual string to write.
    *
    * @throws WebAPIException with error type IOError, if a write error occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def write(stringData: String): Unit
  
  /**
    * Writes the result to this FileStream after converting the specified base64 DOMString to bytes.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param base64Data The base64 data to written.
    *
    * @throws WebAPIException with error type IOError, if an error occurs during writeBase64.
    * @throws WebAPIException with error type InvalidValuesError, if the input parameter contains an invalid value
    * (e.g. the base64Data input parameter is not a valid Base64 sequence).
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def writeBase64(base64Data: String): Unit
  
  /**
    * Writes the specified bytes to this FileStream.
    *
    * @note _deprecated_ 5.0 Since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param byteData Byte data array being written.
    *
    * @throws WebAPIException with error type IOError, if a write error occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def writeBytes(byteData: js.Array[Double]): Unit
}
object FileStream {
  
  inline def apply(
    bytesAvailable: Double,
    close: () => Unit,
    eof: Boolean,
    position: Double,
    read: Double => String,
    readBase64: Double => String,
    readBytes: Double => js.Array[Double],
    write: String => Unit,
    writeBase64: String => Unit,
    writeBytes: js.Array[Double] => Unit
  ): FileStream = {
    val __obj = js.Dynamic.literal(bytesAvailable = bytesAvailable.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), eof = eof.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), readBase64 = js.Any.fromFunction1(readBase64), readBytes = js.Any.fromFunction1(readBytes), write = js.Any.fromFunction1(write), writeBase64 = js.Any.fromFunction1(writeBase64), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[FileStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileStream] (val x: Self) extends AnyVal {
    
    inline def setBytesAvailable(value: Double): Self = StObject.set(x, "bytesAvailable", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Double => String): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadBase64(value: Double => String): Self = StObject.set(x, "readBase64", js.Any.fromFunction1(value))
    
    inline def setReadBytes(value: Double => js.Array[Double]): Self = StObject.set(x, "readBytes", js.Any.fromFunction1(value))
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteBase64(value: String => Unit): Self = StObject.set(x, "writeBase64", js.Any.fromFunction1(value))
    
    inline def setWriteBytes(value: js.Array[Double] => Unit): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1(value))
  }
}
