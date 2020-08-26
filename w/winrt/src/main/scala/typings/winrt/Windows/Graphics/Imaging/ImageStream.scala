package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IContentTypeProvider
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageStream
  extends IRandomAccessStream
     with IContentTypeProvider {
  def dispose(): Unit = js.native
}

object ImageStream {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): ImageStream = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[ImageStream]
  }
  @scala.inline
  implicit class ImageStreamOps[Self <: ImageStream] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

