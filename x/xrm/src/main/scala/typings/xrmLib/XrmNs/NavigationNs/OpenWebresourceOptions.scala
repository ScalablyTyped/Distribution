package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenWebresourceOptions extends DialogSizeOptions {
  /**
    * Indicates whether to open the web resource in a new window.
    */
  var openInNewWindow: scala.Boolean
}

object OpenWebresourceOptions {
  @scala.inline
  def apply(height: scala.Double, openInNewWindow: scala.Boolean, width: scala.Double): OpenWebresourceOptions = {
    val __obj = js.Dynamic.literal(height = height, openInNewWindow = openInNewWindow, width = width)
  
    __obj.asInstanceOf[OpenWebresourceOptions]
  }
}

