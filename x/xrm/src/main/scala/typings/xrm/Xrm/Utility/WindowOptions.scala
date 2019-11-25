package typings.xrm.Xrm.Utility

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
  var openInNewWindow: Boolean
}

object WindowOptions {
  @scala.inline
  def apply(openInNewWindow: Boolean): WindowOptions = {
    val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowOptions]
  }
}

