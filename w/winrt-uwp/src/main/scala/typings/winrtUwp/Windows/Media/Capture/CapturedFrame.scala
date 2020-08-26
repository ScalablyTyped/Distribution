package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a captured video frame. */
@js.native
trait CapturedFrame extends js.Object {
  /** Gets a value that indicates if the captured frame can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates if the captured frame can be written to. */
  var canWrite: Boolean = js.native
  /** Gets the content type of the captured frame. */
  var contentType: String = js.native
  /** Gets the height of the captured frame */
  var height: Double = js.native
  /** Gets the position of the captured frame. */
  var position: Double = js.native
  /** Gets the size of the captured frame in bytes. */
  var size: Double = js.native
  /** Gets a SoftwareBitmap object representing the captured frame. */
  var softwareBitmap: SoftwareBitmap = js.native
  /** Gets the width of the captured frame. */
  var width: Double = js.native
  /**
    * Creates a copy of the stream.
    * @return The clone of the strem.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the captured framed object. */
  def close(): Unit = js.native
  /**
    * Asynchronously commits and flushes all of the data of the CapturedFrame .
    * @return When this method completes, a boolean value is returned which specifies true if the operation completed successfully; otherwise, false.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Gets the input stream at the specified position.
    * @param position The position in the input stream.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Gets the output stream at the specified position.
    * @param position The position in the output stream.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Seeks the stream to the specified position.
    * @param position The position in the stream to seek too.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Asynchronously writes the specified data to the stream.
    * @param buffer The data to write to the stream.
    * @return Represents an asynchronous operation that returns a result and reports progress.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object CapturedFrame {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    height: Double,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    softwareBitmap: SoftwareBitmap,
    width: Double,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): CapturedFrame = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], softwareBitmap = softwareBitmap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[CapturedFrame]
  }
  @scala.inline
  implicit class CapturedFrameOps[Self <: CapturedFrame] (val x: Self) extends AnyVal {
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
    def setCanRead(value: Boolean): Self = this.set("canRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanWrite(value: Boolean): Self = this.set("canWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloneStream(value: () => IRandomAccessStream): Self = this.set("cloneStream", js.Any.fromFunction0(value))
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlushAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("flushAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInputStreamAt(value: Double => IInputStream): Self = this.set("getInputStreamAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOutputStreamAt(value: Double => IOutputStream): Self = this.set("getOutputStreamAt", js.Any.fromFunction1(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = this.set("readAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftwareBitmap(value: SoftwareBitmap): Self = this.set("softwareBitmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = this.set("writeAsync", js.Any.fromFunction1(value))
  }
  
}

