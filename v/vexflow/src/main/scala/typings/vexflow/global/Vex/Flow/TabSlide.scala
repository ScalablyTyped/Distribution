package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.TabSlide")
@js.native
class TabSlide protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.TabSlide {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, direction: Double) = this()
  
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
object TabSlide {
  
  @JSGlobal("Vex.Flow.TabSlide")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.TabSlide.SLIDE_DOWN")
  @js.native
  val SLIDE_DOWN: Double = js.native
  
  @JSGlobal("Vex.Flow.TabSlide.SLIDE_UP")
  @js.native
  val SLIDE_UP: Double = js.native
  
  /* static member */
  @scala.inline
  def createSlideDown(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideDown")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.TabSlide]
  
  /* static member */
  @scala.inline
  def createSlideUp(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideUp")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.TabSlide]
}
