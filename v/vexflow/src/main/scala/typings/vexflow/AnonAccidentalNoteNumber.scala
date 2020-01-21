package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccidentalNoteNumber extends js.Object {
  var accidental: Double
  var note: Double
}

object AnonAccidentalNoteNumber {
  @scala.inline
  def apply(accidental: Double, note: Double): AnonAccidentalNoteNumber = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccidentalNoteNumber]
  }
}

