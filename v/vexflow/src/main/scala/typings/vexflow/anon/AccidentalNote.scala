package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccidentalNote extends js.Object {
  var accidental: String
  var note: String
}

object AccidentalNote {
  @scala.inline
  def apply(accidental: String, note: String): AccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalNote]
  }
}

