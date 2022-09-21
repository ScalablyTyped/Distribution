package typings.useGestureCore

import typings.std.UIEvent
import typings.useGestureCore.controllerMod.Controller
import typings.useGestureCore.coordinatesEngineMod.CoordinatesEngine
import typings.useGestureCore.useGestureCoreStrings.scroll
import typings.useGestureCore.useGestureCoreStrings.scrolling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/ScrollEngine", "ScrollEngine")
  @js.native
  open class ScrollEngine protected () extends CoordinatesEngine[scroll] {
    def this(ctrl: Controller, args: js.Array[Any], key: scroll) = this()
    
    def bind(bindFunction: Any): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_ScrollEngine: scrolling = js.native
    
    def scroll(event: UIEvent): Unit = js.native
    
    def scrollChange(event: UIEvent): Unit = js.native
    
    def scrollEnd(): Unit = js.native
  }
}
