package typings.useGestureCore

import typings.std.UIEvent
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcEnginesEngineMod.Engine
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesKey
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesCoordinatesEngineMod {
  
  /* note: abstract class */ @JSImport("@use-gesture/core/dist/declarations/src/engines/CoordinatesEngine", "CoordinatesEngine")
  @js.native
  open class CoordinatesEngine[Key /* <: CoordinatesKey */] protected () extends Engine[Key] {
    def this(ctrl: Controller, args: js.Array[Any], key: Key) = this()
    
    @JSName("axisIntent")
    def axisIntent_MCoordinatesEngine(): Unit = js.native
    @JSName("axisIntent")
    def axisIntent_MCoordinatesEngine(event: UIEvent): Unit = js.native
    
    @JSName("init")
    def init_MCoordinatesEngine(): Unit = js.native
    
    @JSName("restrictToAxis")
    def restrictToAxis_MCoordinatesEngine(v: Vector2): Unit = js.native
  }
}
