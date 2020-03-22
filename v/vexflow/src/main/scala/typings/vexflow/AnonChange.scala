package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChange extends js.Object {
  var accidental: String
  var change: Boolean
  var note: String
}

object AnonChange {
  @scala.inline
  def apply(accidental: String, change: Boolean, note: String): AnonChange = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChange]
  }
}

