package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstnote extends js.Object {
  var first_note: Note
  var last_note: Note
}

object AnonFirstnote {
  @scala.inline
  def apply(first_note: Note, last_note: Note): AnonFirstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstnote]
  }
}

