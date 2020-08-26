package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaProtectionServiceCompletion extends js.Object {
  def complete(success: Boolean): Unit = js.native
}

object IMediaProtectionServiceCompletion {
  @scala.inline
  def apply(complete: Boolean => Unit): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
  @scala.inline
  implicit class IMediaProtectionServiceCompletionOps[Self <: IMediaProtectionServiceCompletion] (val x: Self) extends AnyVal {
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
    def setComplete(value: Boolean => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
  }
  
}

