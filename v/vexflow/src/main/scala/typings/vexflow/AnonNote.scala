package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNote extends js.Object {
  var accidental: String
  var note: String
}

object AnonNote {
  @scala.inline
  def apply(accidental: String, note: String): AnonNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNote]
  }
}

