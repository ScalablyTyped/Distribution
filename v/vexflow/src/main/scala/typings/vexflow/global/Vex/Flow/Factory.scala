package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Factory")
@js.native
open class Factory protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Factory {
  def this(options: Any) = this()
}
object Factory {
  
  @JSGlobal("Vex.Flow.Factory")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newFromElementId(elementId: Any): typings.vexflow.Vex.Flow.Factory = ^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double, height: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Unit, height: Double): typings.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Factory]
}
