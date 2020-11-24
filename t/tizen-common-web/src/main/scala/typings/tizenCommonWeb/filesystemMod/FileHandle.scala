package typings.tizenCommonWeb.filesystemMod

import typings.std.Blob
import typings.std.Uint8Array
import typings.tizenCommonWeb.tizenCommonWebStrings.BEGIN
import typings.tizenCommonWeb.tizenCommonWebStrings.CURRENT
import typings.tizenCommonWeb.tizenCommonWebStrings.END
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import typings.tizenCommonWeb.tizenMod.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHandle extends js.Object {
  
  /**
    * Closes file handle.
    * Closes the given file stream. Closing file guarantees writing changes made to `FileHandle` to the storage device. Further operations on this file handle are not allowed.
    * @remark This method is synchronous. If any asynchronous method was called before close, close will block further instructions until all background jobs finish execution.
    * Note, that if file handle functions are put into any callbacks and this callback was not yet called, synchronous close will wait only for already ordered background jobs to finish, preventing successful execution of any further operations on closed file handle.
    * @throw WebAPIException IOError
    */
  def close(): Unit = js.native
  
  /**
    * Closes file handle.
    * Closes the given file stream. Closing file guarantees writing changes made to `FileHandle` to the storage device. Further operations on this file handle are not allowed.
    * Successful closing invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if close fails or any error related to file handle occurs.
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @throw WebAPIException TypeMismatchError
    */
  def closeNonBlocking(): Unit = js.native
  def closeNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def closeNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def closeNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Flushes data.
    * For file handles with permission to write, flush writes any changes made to file content to underlying buffer.
    * Flush does not ensure that data is written on storage device, it only synchronizes RAM with file descriptor.
    * To ensure storage synchronization use `sync`, `close` or their asynchronous equivalent methods, which guarantee such synchronization.
    * @throw WebAPIException IOError
    */
  def flush(): Unit = js.native
  
  /**
    * Flushes data.
    * For file handles with permission to write, flush writes any changes made to file content to underlying buffer.
    * Flush does not ensure that data is written on storage device, it only synchronizes RAM with file descriptor.
    * To ensure storage synchronization use `sync`, `close` or their asynchronous equivalent methods, which guarantee such synchronization.
    * Successful flushing invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if flush fails or any error related to file handle occurs.
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @throw WebAPIException TypeMismatchError
    */
  def flushNonBlocking(): Unit = js.native
  def flushNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def flushNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def flushNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Path, as passed to `openFile`.
    */
  val path: Path = js.native
  
  /**
    * Reads file content as `Blob`.
    * Sets file handle position indicator at the end of read data.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    * @returns Blob object with file content.
    * @throw WebAPIException InvalidValuesError IOError
    */
  def readBlob(size: Double): Blob = js.native
  
  /**
    * Reads file content as `Blob`.
    * Sets file handle position indicator at the end of read data.
    * readBlobNonBlocking is executed in background and does not block further instructions.
    * Successful read operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    *
    * The `ErrorCallback` is launched with these error types:
    *   - IOError, if read fails or any error related to file handle occurs.
    *
    * @param onsuccess Callback function with `Blob` object to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    * @throw WebAPIException InvalidValuesError, TypeMismatchError
    */
  def readBlobNonBlocking(): Unit = js.native
  def readBlobNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: js.UndefOr[scala.Nothing], size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: js.UndefOr[scala.Nothing], size: Double): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readBlobNonBlocking(onsuccess: ReadBlobSuccessCallback, onerror: ErrorCallback, size: Double): Unit = js.native
  
  /**
    * Reads file content as binary data.
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of read data.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    * @returns Read data as Uint8Array.
    * @throw WebAPIException InvalidValuesError, IOError
    */
  def readData(size: Double): Uint8Array = js.native
  
  /**
    * Reads file content as binary data.
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of read data.
    * readDataNonBlocking is executed in background and does not block further instructions.
    * Successful read operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if read fails or any error related to file handle occurs.
    *
    * @param onsuccess Callback function with read data from file to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param size Size in bytes of data to read from file. If none is given, method attempts to read whole file.
    * @throw WebAPIException InvalidValuesError, TypeMismatchError
    */
  def readDataNonBlocking(): Unit = js.native
  def readDataNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: js.UndefOr[scala.Nothing], size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: js.UndefOr[scala.Nothing], size: Double): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readDataNonBlocking(onsuccess: ReadDataSuccessCallback, onerror: ErrorCallback, size: Double): Unit = js.native
  
  /**
    * Reads file content as string.
    * Sets file handle position indicator at the end of read data.
    * Reads given number of characters.
    * @param count Number of characters to read from file. If none is given, method attempts to read whole file.
    * @param inputEncoding Default value: ***"UTF-8"***. Encoding to use for read operation on the file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    * @returns String with data read from file.
    * @throw WebAPIException InvalidValuesError IOError, NotSupportedError, TypeMismatchError
    * @remark Resulting string can have `length` larger than `count`, due to possible UTF-16 surrogate pairs in it. String length in JavaScript is counted in UTF-16 encoding, so for example string containing one emoji (surrogate of two UTF-16) character will have `length` of two.
    */
  def readString(): String = js.native
  def readString(count: js.UndefOr[scala.Nothing], inputEncoding: String): String = js.native
  def readString(count: Double): String = js.native
  def readString(count: Double, inputEncoding: String): String = js.native
  
  /**
    * Reads file content as string.
    * Reads given number of characters.
    * Sets file handle position indicator at the end of read data.
    * readStringNonBlocking is executed in background and does not block further instructions.
    * Successful read operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if read fails or any error related to file handle occurs.
    *
    * @param onsuccess Callback function with read data from file to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param count Number of characters to read from file. If none is given, method attempts to read whole file.
    * @param inputEncoding Default value: ***"UTF-8"***. Encoding to use for read operation on the file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    * @throw WebAPIException InvalidValuesError, NotSupportedError, TypeMismatchError
    */
  def readStringNonBlocking(): Unit = js.native
  def readStringNonBlocking(
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    count: js.UndefOr[scala.Nothing],
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
  def readStringNonBlocking(
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    count: Double,
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def readStringNonBlocking(
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback,
    count: js.UndefOr[scala.Nothing],
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, count: Double, inputEncoding: String): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback): Unit = js.native
  def readStringNonBlocking(
    onsuccess: ReadStringSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    count: js.UndefOr[scala.Nothing],
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
  def readStringNonBlocking(
    onsuccess: ReadStringSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    count: Double,
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def readStringNonBlocking(
    onsuccess: ReadStringSuccessCallback,
    onerror: ErrorCallback,
    count: js.UndefOr[scala.Nothing],
    inputEncoding: String
  ): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback, count: Double): Unit = js.native
  def readStringNonBlocking(onsuccess: ReadStringSuccessCallback, onerror: ErrorCallback, count: Double, inputEncoding: String): Unit = js.native
  
  /**
    * Sets position indicator in file stream to ***offset***.
    * Note, that current position indicator value, can be obtained by calling ***seek(0, "CURRENT")***.
    * @param offset Number of bytes to shift the position relative to ***whence***.
    * @param whence Determines position in file stream to which ***offset*** is added. Default value: "BEGIN".
    * @returns File position indicator.
    * @throw WebAPIException IOError, TypeMismatchError
    */
  def seek(offset: Double): Double = js.native
  def seek(offset: Double, whence: BaseSeekPosition): Double = js.native
  
  /**
    * Sets position indicator in file stream to ***offset***.
    * Successful seek operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if any error related to file handle occurs.
    *
    * Note, that current position indicator value, can be obtained in SeekSuccessCallback by calling ***seekNonBlocking(0, "CURRENT")***.
    * seekNonBlocking is executed in background and does not block further instructions.
    * @param offset Number of bytes to shift the position relative to ***whence***.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param whence Determines position in file stream to which ***offset*** is added. Default value: "BEGIN".
    * @throw WebAPIException TypeMismatchError
    */
  def seekNonBlocking(offset: Double): Unit = js.native
  def seekNonBlocking(
    offset: Double,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    whence: BaseSeekPosition
  ): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def seekNonBlocking(
    offset: Double,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback,
    whence: BaseSeekPosition
  ): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback): Unit = js.native
  def seekNonBlocking(
    offset: Double,
    onsuccess: SeekSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    whence: BaseSeekPosition
  ): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def seekNonBlocking(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback, whence: BaseSeekPosition): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_BEGIN(
    offset: Double,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    whence: BEGIN
  ): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_BEGIN(offset: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, whence: BEGIN): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_BEGIN(offset: Double, onsuccess: SeekSuccessCallback, onerror: js.UndefOr[scala.Nothing], whence: BEGIN): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_BEGIN(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback, whence: BEGIN): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_CURRENT(
    offset: Double,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    whence: CURRENT
  ): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_CURRENT(offset: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, whence: CURRENT): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_CURRENT(
    offset: Double,
    onsuccess: SeekSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    whence: CURRENT
  ): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_CURRENT(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback, whence: CURRENT): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_END(
    offset: Double,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    whence: END
  ): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_END(offset: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback, whence: END): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_END(offset: Double, onsuccess: SeekSuccessCallback, onerror: js.UndefOr[scala.Nothing], whence: END): Unit = js.native
  @JSName("seekNonBlocking")
  def seekNonBlocking_END(offset: Double, onsuccess: SeekSuccessCallback, onerror: ErrorCallback, whence: END): Unit = js.native
  
  @JSName("seek")
  def seek_BEGIN(offset: Double, whence: BEGIN): Double = js.native
  @JSName("seek")
  def seek_CURRENT(offset: Double, whence: CURRENT): Double = js.native
  @JSName("seek")
  def seek_END(offset: Double, whence: END): Double = js.native
  
  /**
    * Synchronizes data to storage device.
    * The sync function is intended to force a physical write of data from the buffer cache and to assure that after a system crash or other failure that all data up to the time of the sync() call is recorded on the disk.
    * @throw WebAPIException IOError
    */
  def sync(): Unit = js.native
  
  /**
    * Synchronizes data to storage device.
    * The syncNonBlocking function is intended to force a physical write of data from the buffer cache and to assure that after a system crash or other failure that all data up to the time of the syncNonBlocking() execution is recorded on the disk.
    * Successful syncing invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if sync fails or any error related to file handle occurs.
    *
    * This method is asynchronous. Its execution will occur in background and after all previously commissioned background jobs will finish.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @throw WebAPIException TypeMismatchError
    */
  def syncNonBlocking(): Unit = js.native
  def syncNonBlocking(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def syncNonBlocking(onsuccess: SuccessCallback): Unit = js.native
  def syncNonBlocking(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes `Blob` to file.
    * Sets file handle position indicator at the end of written data.
    * @param blob Object of type Blob, which content will be written to a file.
    * @throw WebAPIException IOError, TypeMismatchError
    */
  def writeBlob(blob: Blob): Unit = js.native
  
  /**
    * Writes `Blob` to file.
    * Sets file handle position indicator at the end of written data.
    * writeBlobNonBlocking is executed in background and does not block further instructions.
    * Successful write operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if write fails or any error related to file handle occurs.
    *
    * @param blob Object of type Blob, which content will be written to a file.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @throw WebAPIException TypeMismatchError
    */
  def writeBlobNonBlocking(blob: Blob): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: SuccessCallback): Unit = js.native
  def writeBlobNonBlocking(blob: Blob, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes binary data to file.
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of written data.
    * @param data An array of type Uint8Array, which content will be written to file as binary data.
    * @throw WebAPIException with error type IOError, TypeMismatchError
    */
  def writeData(data: Uint8Array): Unit = js.native
  
  /**
    * Writes binary data to file.
    * Can be used in combination with [atob() or btoa()](https://dev.w3.org/html5/spec-LC/webappapis.html#atob) functions.
    * Sets file handle position indicator at the end of written data.
    * writeDataNonBlocking is executed in background and does not block further instructions.
    * Successful write operation invokes `onsuccess` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if write fails or any error related to file handle occurs.
    *
    * @param data An array of type Uint8Array, which content will be written to file as binary data.
    * @param onsuccess Callback function to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @throw WebAPIException TypeMismatchError
    */
  def writeDataNonBlocking(data: Uint8Array): Unit = js.native
  def writeDataNonBlocking(data: Uint8Array, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def writeDataNonBlocking(data: Uint8Array, onsuccess: SuccessCallback): Unit = js.native
  def writeDataNonBlocking(data: Uint8Array, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Writes ***inputString*** content to a file.
    * Sets file handle position indicator at the end of written data.
    * @param inputString String value to be written to a file.
    * @param outputEncoding  Default value: UTF-8. Encoding to use for write operation on the file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    * @returns Number of bytes written (can be more than `inputString` length for multibyte encodings and will never be less)
    * @throw WebAPIException IOError, NotSupportedError
    */
  def writeString(inputString: String): Double = js.native
  def writeString(inputString: String, outputEncoding: String): Double = js.native
  
  /**
    * Writes ***inputString*** content to a file.
    * Sets file handle position indicator at the end of written data.
    * writeStringNonBlocking is executed in background and does not block further instructions.
    * Successful write operation invokes `successCallback` function, if specified. In case of failure `onerror` function is invoked, if specified.
    * The `ErrorCallback` is launched with these error types:
    *
    *   - IOError, if write fails or any error related to file handle occurs.
    *
    * @param inputString String value to be written to a file.
    * @param onsuccess Callback function with a number of bytes written as parameter to be invoked on success.
    * @param onerror Callback function to be invoked when an error occurs.
    * @param outputEncoding Default value: ***"UTF-8"***. Encoding to use for write operation on the file, at least the following encodings must be supported:
    *                  "[UTF-8](http://www.ietf.org/rfc/rfc2279.txt)" default encoding
    *                  "[ISO-8859-1](http://en.wikipedia.org/wiki/ISO/IEC_8859-1)" Latin-1 encoding
    * @throw WebAPIException NotSupportedError, TypeMismatchError
    */
  def writeStringNonBlocking(inputString: String): Unit = js.native
  def writeStringNonBlocking(
    inputString: String,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: js.UndefOr[scala.Nothing],
    outputEncoding: String
  ): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def writeStringNonBlocking(
    inputString: String,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback,
    outputEncoding: String
  ): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback): Unit = js.native
  def writeStringNonBlocking(
    inputString: String,
    onsuccess: WriteStringSuccessCallback,
    onerror: js.UndefOr[scala.Nothing],
    outputEncoding: String
  ): Unit = js.native
  def writeStringNonBlocking(inputString: String, onsuccess: WriteStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def writeStringNonBlocking(
    inputString: String,
    onsuccess: WriteStringSuccessCallback,
    onerror: ErrorCallback,
    outputEncoding: String
  ): Unit = js.native
}
