package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  var canRead: Boolean = js.native
  var canWrite: Boolean = js.native
  var position: Double = js.native
  var size: Double = js.native
  def cloneStream(): IRandomAccessStream = js.native
  def getInputStreamAt(position: Double): IInputStream = js.native
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  def seek(position: Double): Unit = js.native
}

object IRandomAccessStream {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IRandomAccessStream = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IRandomAccessStream]
  }
  @scala.inline
  implicit class IRandomAccessStreamOps[Self <: IRandomAccessStream] (val x: Self) extends AnyVal {
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
    def setGetInputStreamAt(value: Double => IInputStream): Self = this.set("getInputStreamAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOutputStreamAt(value: Double => IOutputStream): Self = this.set("getOutputStreamAt", js.Any.fromFunction1(value))
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

