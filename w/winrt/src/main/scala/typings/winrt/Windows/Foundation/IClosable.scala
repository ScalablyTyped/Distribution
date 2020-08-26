package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClosable extends js.Object {
  def close(): Unit = js.native
}

object IClosable {
  @scala.inline
  def apply(close: () => Unit): IClosable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[IClosable]
  }
  @scala.inline
  implicit class IClosableOps[Self <: IClosable] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
  }
  
}

