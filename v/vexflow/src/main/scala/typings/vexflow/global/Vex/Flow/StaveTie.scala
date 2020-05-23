package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveTie")
@js.native
class StaveTie protected ()
  extends typings.vexflow.Vex.Flow.StaveTie {
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
  def this(notes: Lastindices) = this()
  def this(notes: Lastindices, text: String) = this()
  /* CompleteClass */
  override def draw(): Boolean = js.native
  /* CompleteClass */
  override def isPartial(): Boolean = js.native
  /* CompleteClass */
  override def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  /* CompleteClass */
  override def renderTie(params: Firstxpx): Unit = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.StaveTie = js.native
  /* CompleteClass */
  override def setFont(font: Family): typings.vexflow.Vex.Flow.StaveTie = js.native
  /* CompleteClass */
  override def setNotes(notes: Lastindices): typings.vexflow.Vex.Flow.StaveTie = js.native
}

