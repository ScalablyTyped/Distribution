package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInline extends js.Object {
  /**
    * When the pane is closed, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: String
  /**
    * When the pane is closed, it is not visible and doesn't take up any space.
    **/
  var none: String
}

object AnonInline {
  @scala.inline
  def apply(`inline`: String, none: String): AnonInline = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInline]
  }
}

