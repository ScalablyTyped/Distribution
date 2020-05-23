package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Note extends js.Object {
  var accidental: Double
  var note: Double
}

object Note {
  @scala.inline
  def apply(accidental: Double, note: Double): Note = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
}

