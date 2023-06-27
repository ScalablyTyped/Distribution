package typings.tizenCommonWeb.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHandle extends StObject {
  
  /**
    * Closes file handle.
    *
    * Closes the given file stream. Closing file guarantees writing changes made to _FileHandle_ to the storage device. Further operations on this file handle are not allowed.
    *
    * @remark This method is synchronous. If any asynchronous method was called before close, close will block further instructions until all background jobs finish execution.
    * Note, that if file handle functions are put into any callbacks and this callback was not yet called, synchronous close will wait only for already ordered background jobs to finish, preventing successful execution of any further operations on closed file handle.
    *
    * @throws WebAPIException with error type IOError, if close fails or any error related to file handle occurs.
    */
  def close(): Unit = js.native
  
  /**
    * Closes file handle.
    *
    * Closes the given file stream. Closing file guarantees writing changes made to _FileHandle_ to the storage device. Further operations on this file handle are not allowed.
    *
    * Successful closing invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if close fails or any error related to file handle occurs.
    *
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    *
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def closeNonBlocking(): Unit = js.native
  def closeNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def closeNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def closeNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def closeNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Flushes data.
    *
    * For file handles with permission to write, flush writes any changes made to file content to underlying buffer.
    *
    * Flush does not ensure that data is written on storage device, it only synchronizes RAM with file descriptor.
    * To ensure storage synchronization use _sync_, _close_ or their asynchronous equivalent methods, which guarantee such synchronization.
    *
    * @throws WebAPIException with error type IOError, if flush fails or any error related to file handle occurs.
    */
  def flush(): Unit = js.native
  
  /**
    * Flushes data.
    *
    * For file handles with permission to write, flush writes any changes made to file content to underlying buffer.
    *
    * Flush does not ensure that data is written on storage device, it only synchronizes RAM with file descriptor.
    * To ensure storage synchronization use _sync_, _close_ or their asynchronous equivalent methods, which guarantee such synchronization.
    *
    * Successful flushing invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if flush fails or any error related to file handle occurs.
    *
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    *
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def flushNonBlocking(): Unit = js.native
  def flushNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def flushNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def flushNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def flushNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Path, as passed to [openFile](#FileSystemManager::openFile).
    */
  val path: Path = js.native
  
  /**
    * Reads file content as [Blob](#Blob).
    *
    * Sets file handle position indicator at the end of read data.
    *
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    *
    * @returns Blob object with file content.
    *
    * @throws WebAPIException with error type InvalidValuesError if given _size_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type IOError, if read fails or any error related to file handle occurs.
    */
  def readBlob(): Blob = js.native
  def readBlob(size: Double): Blob = js.native
  
  /**
    * Reads file content as [Blob](#Blob).
    *
    * Sets file handle position indicator at the end of read data.
    * readBlobNonBlocking is executed in background and does not block further instructions.
    *
    * Successful read operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if read fails or any error related to file handle occurs.
    *
    *
    * @param onsuccess Callback function with [Blob](#Blob) object to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    *
    * @throws WebAPIException with error type InvalidValuesError if given _size_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def readBlobNonBlocking(): Unit = js.native
  def readBlobNonBlocking(onsuccess: Null, onerror: Null, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: Null, onerror: Unit, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: Null, onerror: ErrorCallback, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: Unit, onerror: Null, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: Unit, onerror: Unit, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: Unit, onerror: ErrorCallback, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: Null, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: Unit, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: ErrorCallback, size: Double): Unit = js.native
  
  /**
    * Reads file content as binary data.
    *
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of read data.
    *
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    *
    * @returns Read data as Uint8Array.
    *
    * @throws WebAPIException with error type InvalidValuesError if given _size_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type IOError, if read fails or any error related to file handle occurs.
    */
  def readData(): js.typedarray.Uint8Array = js.native
  def readData(size: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Reads file content as binary data.
    *
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of read data.
    * readDataNonBlocking is executed in background and does not block further instructions.
    *
    * Successful read operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if read fails or any error related to file handle occurs.
    *
    *
    * @param onsuccess Callback function with read data from file to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    *
    * @throws WebAPIException with error type InvalidValuesError if given _size_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def readDataNonBlocking(): Unit = js.native
  def readDataNonBlocking(onsuccess: Null, onerror: Null, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: Null, onerror: Unit, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: Null, onerror: ErrorCallback, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: Unit, onerror: Null, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: Unit, onerror: Unit, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: Unit, onerror: ErrorCallback, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: Null, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: Unit, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: ErrorCallback, size: Double): Unit = js.native
  
  /**
    * Reads file content as string.
    *
    * Sets file handle position indicator at the end of read data.
    * Reads given number of characters.
    *
    * @remark Resulting string can have _length_ larger than _count_, due to possible UTF-16 surrogate pairs in it. String length in JavaScript is counted in UTF-16 encoding, so for example string containing one emoji (surrogate of two UTF-16) character will have _length_ of two.
    *
    * @param count Number of characters to read from file. If none is given, method attempts to read whole file.
    * @param inputEncoding Default value: "UTF-8". Encoding to use for read operation on the file, at least the following encodings must be supported:
    * "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    * "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    *
    * @returns String with data read from file.
    *
    * @throws WebAPIException with error type InvalidValuesError if given _count_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type IOError, if read fails or any error related to file handle occurs.
    * @throws WebAPIException with error type NotSupportedError, if the given encoding is not supported.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def readString(): String = js.native
  def readString(count: Double): String = js.native
  def readString(count: Double, inputEncoding: String): String = js.native
  def readString(count: Null, inputEncoding: String): String = js.native
  def readString(count: Unit, inputEncoding: String): String = js.native
  
  /**
    * Reads file content as string.
    *
    * Reads given number of characters.
    * Sets file handle position indicator at the end of read data.
    * readStringNonBlocking is executed in background and does not block further instructions.
    *
    * Successful read operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if read fails or any error related to file handle occurs.
    *
    *
    * @param onsuccess Callback function with read data from file to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param count Number of characters to read from file. If none is given, method attempts to read whole file.
    * @param inputEncoding Default value: "UTF-8". Encoding to use for read operation on the file, at least the following encodings must be supported:
    * "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    * "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    *
    * @throws WebAPIException with error type InvalidValuesError if given _count_ exceeds maximum value supported by the device.
    * @throws WebAPIException with error type NotSupportedError, if the given encoding is not supported.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def readStringNonBlocking(): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Null, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Null, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Null, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Unit, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Unit, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: Unit, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: ErrorCallback, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: ErrorCallback, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Null, onerror: ErrorCallback, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Null, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Null, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Null, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Unit, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Unit, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: Unit, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: ErrorCallback, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: ErrorCallback, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: Unit, onerror: ErrorCallback, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Null, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Null, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Null, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Unit, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Unit, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: Unit, count: Unit, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback, count: Unit, inputEncoding: String): Unit = js.native
  
  /**
    * Sets position indicator in file stream to offset.
    *
    * Note, that current position indicator value, can be obtained by calling seek(0, "CURRENT").
    *
    * @param offset Number of bytes to shift the position relative to whence.
    * @param whence Determines position in file stream to which offset is added. Default value: "BEGIN".
    *
    * @returns File position indicator.
    *
    * @throws WebAPIException with error type IOError, if seek fails or any error related to file handle occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def seek(offset: Double): Double = js.native
  def seek(offset: Double, whence: BaseSeekPosition): Double = js.native
  
  /**
    * Sets position indicator in file stream to offset.
    *
    * Successful seek operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if any error related to file handle occurs.
    *
    *
    * Note, that current position indicator value, can be obtained in SeekSuccessCallback by calling seekNonBlocking(0, "CURRENT").
    * seekNonBlocking is executed in background and does not block further instructions.
    *
    * @param offset Number of bytes to shift the position relative to whence.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param whence Determines position in file stream to which offset is added. Default value: "BEGIN".
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def seekNonBlocking(offset: Double): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Null, onerror: Null, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Null, onerror: Unit, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Null, onerror: ErrorCallback, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Unit, onerror: Null, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Unit, onerror: Unit, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: Unit, onerror: ErrorCallback, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: Null, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: Unit, whence: BaseSeekPosition): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback, whence: BaseSeekPosition): Unit = js.native
  
  /**
    * Synchronizes data to storage device.
    *
    * The sync function is intended to force a physical write of data from the buffer cache and to assure that after a system crash or other failure that all data up to the time of the sync() call is recorded on the disk.
    *
    * @throws WebAPIException with error type IOError, if sync fails or any error related to file handle occurs.
    */
  def sync(): Unit = js.native
  
  /**
    * Synchronizes data to storage device.
    *
    * The syncNonBlocking function is intended to force a physical write of data from the buffer cache and to assure that after a system crash or other failure that all data up to the time of the syncNonBlocking() execution is recorded on the disk.
    *
    * Successful syncing invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if sync fails or any error related to file handle occurs.
    *
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    *
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def syncNonBlocking(): Unit = js.native
  def syncNonBlocking(onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def syncNonBlocking(onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def syncNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def syncNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes [Blob](#Blob) to file.
    *
    * Sets file handle position indicator at the end of written data.
    *
    * @param blob Object of type Blob, which content will be written to a file.
    *
    * @throws WebAPIException with error type IOError, if write fails or any error related to file handle occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def writeBlob(blob: Blob): Unit = js.native
  
  /**
    * Writes [Blob](#Blob) to file.
    *
    * Sets file handle position indicator at the end of written data.
    * writeBlobNonBlocking is executed in background and does not block further instructions.
    *
    * Successful write operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if write fails or any error related to file handle occurs.
    *
    *
    * @param blob Object of type Blob, which content will be written to a file.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def writeBlobNonBlocking(blob: Blob): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: SuccessCallback): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes binary data to file.
    *
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of written data.
    *
    * @param data An array of type Uint8Array, which content will be written to file as binary data.
    *
    * @throws WebAPIException with error type IOError, if write fails or any error related to file handle occurs.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def writeData(data: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Writes binary data to file.
    *
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of written data.
    * writeDataNonBlocking is executed in background and does not block further instructions.
    *
    * Successful write operation invokes _onsuccess_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if write fails or any error related to file handle occurs.
    *
    *
    * @param data An array of type Uint8Array, which content will be written to file as binary data.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def writeDataNonBlocking(data: js.typedarray.Uint8Array): Unit = js.native
  def writeDataNonBlocking(data: js.typedarray.Uint8Array, onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def writeDataNonBlocking(data: js.typedarray.Uint8Array, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def writeDataNonBlocking(data: js.typedarray.Uint8Array, onsuccess: SuccessCallback): Unit = js.native
  def writeDataNonBlocking(data: js.typedarray.Uint8Array, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes inputString content to a file.
    *
    * Sets file handle position indicator at the end of written data.
    *
    * @param inputString String value to be written to a file.
    * @param outputEncoding Default value: UTF-8. Encoding to use for write operation on the file, at least the following encodings must be supported:
    * "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    * "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    *
    * @returns Number of bytes written (can be more than _inputString_ length for multibyte encodings and will never be less)
    *
    * @throws WebAPIException with error type IOError, if input/output error occurs.
    * @throws WebAPIException with error type NotSupportedError, if the given encoding is not supported.
    */
  def writeString(inputString: String): Double = js.native
  def writeString(inputString: String, outputEncoding: String): Double = js.native
  
  /**
    * Writes inputString content to a file.
    *
    * Sets file handle position indicator at the end of written data.
    * writeStringNonBlocking is executed in background and does not block further instructions.
    *
    * Successful write operation invokes _successCallback_ function, if specified. In case of failure _onerror_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if write fails or any error related to file handle occurs.
    *
    *
    * @param inputString String value to be written to a file.
    * @param onsuccess Callback function with a number of bytes written as parameter to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param outputEncoding Default value: "UTF-8". Encoding to use for write operation on the file, at least the following encodings must be supported:
    * "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    * "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    *
    * @throws WebAPIException with error type NotSupportedError, if the given encoding is not supported.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    */
  def writeStringNonBlocking(inputString: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Null, onerror: Null, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Null, onerror: Unit, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Null, onerror: ErrorCallback): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Null, onerror: ErrorCallback, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Unit, onerror: Null, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Unit, onerror: Unit, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Unit, onerror: ErrorCallback): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: Unit, onerror: ErrorCallback, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback, onerror: Null, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback, onerror: Unit, outputEncoding: String): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def writeStringNonBlocking(
    inputString: String,
    onsuccess: WriteStringSuccessCallback,
    onerror: ErrorCallback,
    outputEncoding: String
  ): Unit = js.native
}
