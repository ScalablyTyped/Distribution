package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.BoundingBox")
@js.native
open class BoundingBox protected ()
  extends typings.vexflow.mod.Flow.BoundingBox {
  def this(x: Double, y: Double, w: Double, h: Double) = this()
}
object BoundingBox {
  
  @JSImport("vextab", "Vex.Flow.BoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def copy(that: typings.vexflow.Vex.Flow.BoundingBox): typings.vexflow.Vex.Flow.BoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(that.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.BoundingBox]
}
