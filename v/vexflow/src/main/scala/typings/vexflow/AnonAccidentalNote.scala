package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccidentalNote extends js.Object {
  var accidental: String
  var note: String
}

object AnonAccidentalNote {
  @scala.inline
  def apply(accidental: String, note: String): AnonAccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccidentalNote]
  }
}

