package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Firstindices extends js.Object {
  var first_indices: js.Array[Double]
  var first_note: Note
  var last_indices: js.Array[Double]
  var last_note: Note
}

object Anon_Firstindices {
  @scala.inline
  def apply(first_indices: js.Array[Double], first_note: Note, last_indices: js.Array[Double], last_note: Note): Anon_Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices.asInstanceOf[js.Any], first_note = first_note.asInstanceOf[js.Any], last_indices = last_indices.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Firstindices]
  }
}

