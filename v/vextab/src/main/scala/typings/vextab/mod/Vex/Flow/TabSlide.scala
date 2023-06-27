package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Firstindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.TabSlide")
@js.native
open class TabSlide protected ()
  extends typings.vexflow.mod.Flow.TabSlide {
  def this(notes: Firstindices) = this()
  def this(notes: Firstindices, direction: Double) = this()
}
object TabSlide {
  
  @JSImport("vextab", "Vex.Flow.TabSlide")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.TabSlide.SLIDE_DOWN")
  @js.native
  val SLIDE_DOWN: Double = js.native
  
  @JSImport("vextab", "Vex.Flow.TabSlide.SLIDE_UP")
  @js.native
  val SLIDE_UP: Double = js.native
  
  /* static member */
  inline def createSlideDown(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideDown")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.TabSlide]
  
  /* static member */
  inline def createSlideUp(notes: Firstindices): typings.vexflow.Vex.Flow.TabSlide = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideUp")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.TabSlide]
}
