package typings.vexflow.Vex.Flow

import typings.vexflow.AnonFirstxpx
import typings.vexflow.AnonLastnote
import typings.vexflow.AnonSize
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTie")
@js.native
class StaveTie protected () extends js.Object {
  /**
    * @see https://github.com/0xfe/vexflow/blob/master/src/stavetie.js#L12
    *
    * Notes is a struct that has:
    *
    *  {
    *    first_note: Note,
    *    last_note: Note,
    *    first_indices: [n1, n2, n3],
    *    last_indices: [n1, n2, n3]
    *  }
    * All properties are optional, since ties can span line breaks in which case
    * two ties can be used, each with either "first_note" or "last_note" missing.
    *
    **/
  def this(notes: AnonLastnote) = this()
  def this(notes: AnonLastnote, text: String) = this()
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  def renderTie(params: AnonFirstxpx): Unit = js.native
  def setContext(context: IRenderContext): StaveTie = js.native
  def setFont(font: AnonSize): StaveTie = js.native
  def setNotes(notes: AnonLastnote): StaveTie = js.native
}

