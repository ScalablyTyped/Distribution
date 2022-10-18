package typings.useGestureCore

import typings.std.PointerEvent
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcEnginesCoordinatesEngineMod.CoordinatesEngine
import typings.useGestureCore.useGestureCoreStrings.hover
import typings.useGestureCore.useGestureCoreStrings.hovering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesHoverEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/HoverEngine", "HoverEngine")
  @js.native
  open class HoverEngine protected () extends CoordinatesEngine[hover] {
    def this(ctrl: Controller, args: js.Array[Any], key: hover) = this()
    
    def bind(bindFunction: Any): Unit = js.native
    
    def enter(event: PointerEvent): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_HoverEngine: hovering = js.native
    
    def leave(event: PointerEvent): Unit = js.native
  }
}
