package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashComputation extends js.Object {
  def append(data: IBuffer): Unit = js.native
  def getValueAndReset(): IBuffer = js.native
}

object IHashComputation {
  @scala.inline
  def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): IHashComputation = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
    __obj.asInstanceOf[IHashComputation]
  }
  @scala.inline
  implicit class IHashComputationOps[Self <: IHashComputation] (val x: Self) extends AnyVal {
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
    def setAppend(value: IBuffer => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueAndReset(value: () => IBuffer): Self = this.set("getValueAndReset", js.Any.fromFunction0(value))
  }
  
}

