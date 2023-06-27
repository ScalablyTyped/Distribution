package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Factory")
@js.native
open class Factory protected ()
  extends typings.vexflow.mod.Flow.Factory {
  def this(options: Any) = this()
}
object Factory {
  
  @JSImport("vextab", "Vex.Flow.Factory")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newFromElementId(elementId: Any): typings.vexflow.Vex.Flow.Factory = ^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double, height: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Unit, height: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
}
