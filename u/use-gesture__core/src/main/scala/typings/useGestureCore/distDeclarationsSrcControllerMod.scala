package typings.useGestureCore

import typings.std.PointerEvent
import typings.std.Set
import typings.std.TouchEvent
import typings.useGestureCore.anon.keyinGestureKeyEventStore
import typings.useGestureCore.anon.keyinGestureKeyTimeoutSto
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.UserGestureConfig
import typings.useGestureCore.distDeclarationsSrcTypesHandlersMod.InternalHandlers
import typings.useGestureCore.distDeclarationsSrcTypesHandlersMod.NativeHandlers
import typings.useGestureCore.distDeclarationsSrcTypesInternalConfigMod.InternalConfig
import typings.useGestureCore.distDeclarationsSrcTypesStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcControllerMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/Controller", "Controller")
  @js.native
  open class Controller protected () extends StObject {
    def this(handlers: InternalHandlers) = this()
    
    /**
      * The event store that keeps track of the config.target listeners.
      */
    /* private */ var _targetEventStore: Any = js.native
    
    /**
      * Compute and attaches a config to the controller.
      * @param config
      * @param gestureKey
      */
    def applyConfig(config: UserGestureConfig): Unit = js.native
    def applyConfig(config: UserGestureConfig, gestureKey: GestureKey): Unit = js.native
    
    /**
      * Attaches handlers to the controller.
      * @param handlers
      * @param nativeHandlers
      */
    def applyHandlers(handlers: InternalHandlers): Unit = js.native
    def applyHandlers(handlers: InternalHandlers, nativeHandlers: NativeHandlers[js.Object]): Unit = js.native
    
    /**
      * The bind function that can be returned by the gesture handler (a hook in
      * React for example.)
      * @param args
      */
    def bind(args: Any*): Any = js.native
    
    /**
      * Cleans all side effects (listeners, timeouts). When the gesture is
      * destroyed (in React, when the component is unmounted.)
      */
    def clean(): Unit = js.native
    
    var config: InternalConfig = js.native
    
    /**
      * Executes side effects (attaching listeners to a `config.target`). Ran on
      * each render.
      */
    def effect(): js.Function0[Unit] = js.native
    
    /**
      * Object that keeps track of all gesture event listeners.
      */
    var gestureEventStores: keyinGestureKeyEventStore = js.native
    
    var gestureTimeoutStores: keyinGestureKeyTimeoutSto = js.native
    
    /**
      * The list of gestures handled by the Controller.
      */
    var gestures: Set[GestureKey] = js.native
    
    var handlers: InternalHandlers = js.native
    
    /* private */ var nativeHandlers: Any = js.native
    
    var pointerIds: Set[Double] = js.native
    
    def setEventIds(event: PointerEvent): js.UndefOr[Set[Double]] = js.native
    /**
      * Sets pointer or touch ids based on the event.
      * @param event
      */
    def setEventIds(event: TouchEvent): js.UndefOr[Set[Double]] = js.native
    
    var state: State = js.native
    
    var touchIds: Set[Double] = js.native
  }
}
