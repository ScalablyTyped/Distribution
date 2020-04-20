package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenWebresourceOptions extends DialogSizeOptions {
  /**
    * Indicates whether to open the web resource in a new window.
    */
  var openInNewWindow: Boolean
}

object OpenWebresourceOptions {
  @scala.inline
  def apply(height: Double, openInNewWindow: Boolean, width: Double): OpenWebresourceOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], openInNewWindow = openInNewWindow.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWebresourceOptions]
  }
}

