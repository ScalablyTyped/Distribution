package typings.useGestureCore

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import typings.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEventStoreMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/EventStore", "EventStore")
  @js.native
  open class EventStore protected () extends StObject {
    def this(ctrl: Controller) = this()
    def this(ctrl: Controller, gestureKey: GestureKey) = this()
    
    /* private */ var _ctrl: Any = js.native
    
    /* private */ var _gestureKey: Any = js.native
    
    /* private */ var _listeners: Any = js.native
    
    def add(element: EventTarget, device: String, action: String, handler: js.Function1[/* event */ Any, Unit]): js.Function0[Unit] = js.native
    def add(
      element: EventTarget,
      device: String,
      action: String,
      handler: js.Function1[/* event */ Any, Unit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    
    def clean(): Unit = js.native
  }
}
