package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.BoundingBox")
@js.native
class BoundingBox protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.BoundingBox {
  def this(x: Double, y: Double, w: Double, h: Double) = this()
}
object BoundingBox {
  
  @JSGlobal("Vex.Flow.BoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def copy(that: typings.vexflow.Vex.Flow.BoundingBox): typings.vexflow.Vex.Flow.BoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(that.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.BoundingBox]
}
