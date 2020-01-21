package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccidentalChange extends js.Object {
  var accidental: String
  var change: Boolean
  var note: String
}

object AnonAccidentalChange {
  @scala.inline
  def apply(accidental: String, change: Boolean, note: String): AnonAccidentalChange = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccidentalChange]
  }
}

