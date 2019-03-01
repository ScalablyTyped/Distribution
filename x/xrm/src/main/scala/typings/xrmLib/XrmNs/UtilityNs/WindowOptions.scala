package typings
package xrmLib.XrmNs.UtilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for window options.
  */
trait WindowOptions extends js.Object {
  /**
    * Direct the form to open in a new window.
    */
  var openInNewWindow: scala.Boolean
}

object WindowOptions {
  @scala.inline
  def apply(openInNewWindow: scala.Boolean): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openInNewWindow")(openInNewWindow)
    __obj.asInstanceOf[WindowOptions]
  }
}

