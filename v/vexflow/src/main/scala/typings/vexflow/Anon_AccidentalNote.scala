package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalNote extends js.Object {
  var accidental: String
  var note: String
}

object Anon_AccidentalNote {
  @scala.inline
  def apply(accidental: String, note: String): Anon_AccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental, note = note)
  
    __obj.asInstanceOf[Anon_AccidentalNote]
  }
}

