package typings.useGestureCore

import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import typings.useGestureCore.anon.Angle
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcEnginesEngineMod.Engine
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.WebKitGestureEvent
import typings.useGestureCore.useGestureCoreStrings.pinch
import typings.useGestureCore.useGestureCoreStrings.pinching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesPinchEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/PinchEngine", "PinchEngine")
  @js.native
  open class PinchEngine protected () extends Engine[pinch] {
    def this(ctrl: Controller, args: js.Array[Any], key: pinch) = this()
    
    @JSName("axisIntent")
    def axisIntent_MPinchEngine(): Unit = js.native
    
    def bind(bindFunction: Any): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def gestureEnd(event: WebKitGestureEvent): Unit = js.native
    
    def gestureMove(event: WebKitGestureEvent): Unit = js.native
    
    def gestureStart(event: WebKitGestureEvent): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_PinchEngine: pinching = js.native
    
    @JSName("init")
    def init_MPinchEngine(): Unit = js.native
    
    def pinchMove(event: PointerEvent, payload: Angle): Unit = js.native
    def pinchMove(event: TouchEvent, payload: Angle): Unit = js.native
    
    def pinchStart(event: PointerEvent, payload: Angle): Unit = js.native
    def pinchStart(event: TouchEvent, payload: Angle): Unit = js.native
    
    def pointerEnd(event: PointerEvent): Unit = js.native
    
    def pointerMove(event: PointerEvent): Unit = js.native
    
    def pointerStart(event: PointerEvent): Unit = js.native
    
    @JSName("restrictToAxis")
    def restrictToAxis_MPinchEngine(v: Vector2): Unit = js.native
    
    def touchEnd(event: TouchEvent): Unit = js.native
    
    def touchMove(event: TouchEvent): Unit = js.native
    
    def touchStart(event: TouchEvent): Unit = js.native
    
    def wheel(event: WheelEvent): Unit = js.native
    
    def wheelChange(event: WheelEvent): Unit = js.native
    
    def wheelEnd(): Unit = js.native
    
    def wheelStart(event: WheelEvent): Unit = js.native
  }
}
