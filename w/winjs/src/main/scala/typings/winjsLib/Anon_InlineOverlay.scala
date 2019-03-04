package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InlineOverlay extends js.Object {
  /**
    * When the pane is open, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: java.lang.String
  /**
    * When the pane is open, it doesn't take up any space and it is light dismissable.
    **/
  var overlay: java.lang.String
}

object Anon_InlineOverlay {
  @scala.inline
  def apply(`inline`: java.lang.String, overlay: java.lang.String): Anon_InlineOverlay = {
    val __obj = js.Dynamic.literal(overlay = overlay)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_InlineOverlay]
  }
}

