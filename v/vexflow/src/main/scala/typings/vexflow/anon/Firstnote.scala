package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firstnote extends js.Object {
  var first_note: typings.vexflow.Vex.Flow.Note
  var last_note: typings.vexflow.Vex.Flow.Note
}

object Firstnote {
  @scala.inline
  def apply(first_note: typings.vexflow.Vex.Flow.Note, last_note: typings.vexflow.Vex.Flow.Note): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
}

