package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompactFull extends js.Object {
  /**
    * When the ToolBar is closed, the height of the ToolBar is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String
  /**
    * When the ToolBar is closed, the height of the ToolBar is always sized to content.
    **/
  var full: String
}

object AnonCompactFull {
  @scala.inline
  def apply(compact: String, full: String): AnonCompactFull = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompactFull]
  }
}

