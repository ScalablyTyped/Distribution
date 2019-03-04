package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inline extends js.Object {
  /**
    * When the pane is closed, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: java.lang.String
  /**
    * When the pane is closed, it is not visible and doesn't take up any space.
    **/
  var none: java.lang.String
}

object Anon_Inline {
  @scala.inline
  def apply(`inline`: java.lang.String, none: java.lang.String): Anon_Inline = {
    val __obj = js.Dynamic.literal(none = none)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_Inline]
  }
}

