package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenWebresourceOptions extends DialogSizeOptions {
  /**
    * Indicates whether to open the web resource in a new window.
    */
  var openInNewWindow: Boolean = js.native
}

object OpenWebresourceOptions {
  @scala.inline
  def apply(height: Double, openInNewWindow: Boolean, width: Double): OpenWebresourceOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], openInNewWindow = openInNewWindow.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWebresourceOptions]
  }
  @scala.inline
  implicit class OpenWebresourceOptionsOps[Self <: OpenWebresourceOptions] (val x: Self) extends AnyVal {
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
    def setOpenInNewWindow(value: Boolean): Self = this.set("openInNewWindow", value.asInstanceOf[js.Any])
  }
  
}

