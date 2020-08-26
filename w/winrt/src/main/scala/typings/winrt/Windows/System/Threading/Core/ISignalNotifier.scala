package typings.winrt.Windows.System.Threading.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignalNotifier extends js.Object {
  def enable(): Unit = js.native
  def terminate(): Unit = js.native
}

object ISignalNotifier {
  @scala.inline
  def apply(enable: () => Unit, terminate: () => Unit): ISignalNotifier = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[ISignalNotifier]
  }
  @scala.inline
  implicit class ISignalNotifierOps[Self <: ISignalNotifier] (val x: Self) extends AnyVal {
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
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
  
}

