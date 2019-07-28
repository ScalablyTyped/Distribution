package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_DirectionFirstxpx
import typings.vexflow.Anon_FamilySize
import typings.vexflow.Anon_FirstindicesFirstnoteLastindices
import typings.vexflow.VexNs.IRenderContext
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
  def this(notes: Anon_FirstindicesFirstnoteLastindices) = this()
  def this(notes: Anon_FirstindicesFirstnoteLastindices, text: String) = this()
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  def renderTie(params: Anon_DirectionFirstxpx): Unit = js.native
  def setContext(context: IRenderContext): StaveTie = js.native
  def setFont(font: Anon_FamilySize): StaveTie = js.native
  def setNotes(notes: Anon_FirstindicesFirstnoteLastindices): StaveTie = js.native
}

