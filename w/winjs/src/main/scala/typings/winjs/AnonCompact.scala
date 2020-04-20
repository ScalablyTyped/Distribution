package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompact extends js.Object {
  /**
    * When the AppBar is closed, its height is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String
  /**
    * When the AppBar is closed, its height is always sized to content.
    **/
  var full: String
  /**
    * When the AppBar is closed, its height is reduced to the minimal height required to display only its overflowbutton. All other content in the AppBar is not displayed.
    **/
  var minimal: String
  /**
    * When the AppBar is closed, it is not visible and doesn't take up any space.
    **/
  var none: String
}

object AnonCompact {
  @scala.inline
  def apply(compact: String, full: String, minimal: String, none: String): AnonCompact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompact]
  }
}

