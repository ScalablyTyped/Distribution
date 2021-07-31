package typings.vexflow.mod.Flow

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.CanvasContext")
@js.native
class CanvasContext protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.CanvasContext {
  def this(context: CanvasRenderingContext2D) = this()
}
object CanvasContext {
  
  @JSImport("vexflow", "Flow.CanvasContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.CanvasContext.HEIGHT")
  @js.native
  def HEIGHT: Double = js.native
  @scala.inline
  def HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.CanvasContext.WIDTH")
  @js.native
  def WIDTH: Double = js.native
  @scala.inline
  def WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIDTH")(x.asInstanceOf[js.Any])
}
