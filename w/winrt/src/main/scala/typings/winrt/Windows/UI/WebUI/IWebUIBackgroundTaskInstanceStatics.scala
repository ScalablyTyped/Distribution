package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebUIBackgroundTaskInstanceStatics extends js.Object {
  var current: IWebUIBackgroundTaskInstance = js.native
}

object IWebUIBackgroundTaskInstanceStatics {
  @scala.inline
  def apply(current: IWebUIBackgroundTaskInstance): IWebUIBackgroundTaskInstanceStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstanceStatics]
  }
  @scala.inline
  implicit class IWebUIBackgroundTaskInstanceStaticsOps[Self <: IWebUIBackgroundTaskInstanceStatics] (val x: Self) extends AnyVal {
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
    def setCurrent(value: IWebUIBackgroundTaskInstance): Self = this.set("current", value.asInstanceOf[js.Any])
  }
  
}

