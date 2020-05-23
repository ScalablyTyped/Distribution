package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TabTie")
@js.native
class TabTie protected ()
  extends typings.vexflow.Vex.Flow.TabTie {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, text: String) = this()
  /* CompleteClass */
  override def createHammeron(notes: Firstindices): typings.vexflow.Vex.Flow.TabTie = js.native
  /* CompleteClass */
  override def createPulloff(notes: Firstindices): typings.vexflow.Vex.Flow.TabTie = js.native
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

