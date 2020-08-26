package typings.tizenCommonWeb.filesystemMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStream extends js.Object {
  /**
    * The number of bytes that are available for reading from the stream.
    * The number of bytes available for reading is the maximum amount of bytes that can be read in the next read operation.
    * It corresponds to the number of bytes available after the file pointer denoted by the `position` attribute.
    * ***-1 ***if EOF is ***true***.
    * @note `deprecated` 5.0
    */
  val bytesAvailable: Double = js.native
  /**
    * The flag indicating whether the current file pointer is at the end of the file.
    * If set to ***true***, this attribute indicates that the file pointer is at the end of the file.
    * If set to ***false***, this attribute indicates that the file pointer is not at the end of the file and so it is anywhere within the file.
    * @note `deprecated` 5.0
    */
  val eof: Boolean = js.native
  /**
    * The flag indicating the stream position for reads/writes.
    * The stream position is an offset of bytes from the start of the file stream. When invoking an operation that reads or writes from the stream, the operation will take place from the byte defined by this `position` attribute. If the read or write operation is successful, the position of the stream is advanced by the number of bytes read or written. If the read/write operation is not successful, the position of the stream is unchanged.
    * @note `deprecated` 5.0
    */
  var position: Double = js.native
  /**
    * Closes this FileStream.
    * Flushes any pending buffered writes and closes the File. Always succeeds.
    * Note that pending writes might not succeed.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    */
  def close(): Unit = js.native
  /**
    * Reads the specified number of characters from the position of the file pointer in a FileStream and returns the characters as a string.
    *        The resulting string length might be shorter than `charCount` if EOF is ***true***.
    *
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param charCount Number of characters being read.
    * @returns Array of read characters as a string.
    * @throw WebAPIException with error type IOError, TypeMismatchError, InvalidValuesError, SecurityError
    */
  def read(charCount: Double): String = js.native
  /**
    * Reads the specified number of bytes from this FileStream, encoding the result in base64.
    * @note `deprecated` 5.0
    *
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param byteCount Number of bytes to read.
    * @returns Array of read characters as base64 encoding string.
    * @throw WebAPIException with error type IOError, TypeMismatchError, InvalidValuesError, SecurityError
    */
  def readBase64(byteCount: Double): String = js.native
  /**
    * Reads the specified number of bytes from a FileStream.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.read
    * @param byteCount Number of bytes to read.
    * @returns Result of read bytes as a byte (or number) array.
    * @throw WebAPIException IOError, TypeMismatchError, InvalidValuesError, SecurityError
    */
  def readBytes(byteCount: Double): Uint8Array = js.native
  /**
    * Writes the specified DOMString to a FileStream.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param stringData Actual string to write.
    * @throw WebAPIException IOError, TypeMismatchError, SecurityError
    */
  def write(stringData: String): Unit = js.native
  /**
    * Writes the result to this FileStream after converting the specified base64 DOMString to bytes.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param base64Data The base64 data to written.
    * @throw WebAPIException with error type IOError, InvalidValuesError, SecurityError
    */
  def writeBase64(base64Data: String): Unit = js.native
  /**
    * Writes the specified bytes to this FileStream.
    * @note `deprecated` 5.0
    * @privilegeLevel public
    * @privilegeName      http://tizen.org/privilege/filesystem.write
    * @param byteData Byte data array being written.
    * @throw WebAPIException IOError, TypeMismatchError, SecurityError
    */
  def writeBytes(byteData: Uint8Array): Unit = js.native
}

object FileStream {
  @scala.inline
  def apply(
    bytesAvailable: Double,
    close: () => Unit,
    eof: Boolean,
    position: Double,
    read: Double => String,
    readBase64: Double => String,
    readBytes: Double => Uint8Array,
    write: String => Unit,
    writeBase64: String => Unit,
    writeBytes: Uint8Array => Unit
  ): FileStream = {
    val __obj = js.Dynamic.literal(bytesAvailable = bytesAvailable.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), eof = eof.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), readBase64 = js.Any.fromFunction1(readBase64), readBytes = js.Any.fromFunction1(readBytes), write = js.Any.fromFunction1(write), writeBase64 = js.Any.fromFunction1(writeBase64), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[FileStream]
  }
  @scala.inline
  implicit class FileStreamOps[Self <: FileStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesAvailable(value: Double): Self = this.set("bytesAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setEof(value: Boolean): Self = this.set("eof", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Double => String): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setReadBase64(value: Double => String): Self = this.set("readBase64", js.Any.fromFunction1(value))
    @scala.inline
    def setReadBytes(value: Double => Uint8Array): Self = this.set("readBytes", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteBase64(value: String => Unit): Self = this.set("writeBase64", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteBytes(value: Uint8Array => Unit): Self = this.set("writeBytes", js.Any.fromFunction1(value))
  }
  
}

