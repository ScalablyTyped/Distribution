package typings.xrm.Xrm.Utility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for window options.
  */
@js.native
trait WindowOptions extends js.Object {
  /**
    * Direct the form to open in a new window.
    */
  var openInNewWindow: Boolean = js.native
}

object WindowOptions {
  @scala.inline
  def apply(openInNewWindow: Boolean): WindowOptions = {
    val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
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

