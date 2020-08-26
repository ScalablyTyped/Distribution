package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputStream extends IClosable {
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
}

object IInputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  @scala.inline
  implicit class IInputStreamOps[Self <: IInputStream] (val x: Self) extends AnyVal {
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
    def setReadAsync(value: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]): Self = this.set("readAsync", js.Any.fromFunction3(value))
  }
  
}

