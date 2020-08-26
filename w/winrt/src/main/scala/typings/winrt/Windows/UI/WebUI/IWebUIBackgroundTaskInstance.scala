package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebUIBackgroundTaskInstance extends js.Object {
  var succeeded: Boolean = js.native
}

object IWebUIBackgroundTaskInstance {
  @scala.inline
  def apply(succeeded: Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
  @scala.inline
  implicit class IWebUIBackgroundTaskInstanceOps[Self <: IWebUIBackgroundTaskInstance] (val x: Self) extends AnyVal {
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
    def setSucceeded(value: Boolean): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

