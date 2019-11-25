package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalChange extends js.Object {
  var accidental: String
  var change: Boolean
  var note: String
}

object Anon_AccidentalChange {
  @scala.inline
  def apply(accidental: String, change: Boolean, note: String): Anon_AccidentalChange = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccidentalChange]
  }
}

