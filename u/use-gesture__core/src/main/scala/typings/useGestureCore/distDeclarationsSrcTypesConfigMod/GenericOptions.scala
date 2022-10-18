package typings.useGestureCore.distDeclarationsSrcTypesConfigMod

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Target
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericOptions extends StObject {
  
  /**
    * When set to false none of the handlers will be fired.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lets you customize if you want events to be passive or captured.
    */
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
  
  /**
    * Lets you specify a dom node or ref you want to attach the gesture to.
    */
  var target: js.UndefOr[Target] = js.undefined
  
  /**
    * A function that you can use to transform movement and offset values. Useful
    * to map your screen coordinates to custom space coordinates such as a
    * canvas.
    */
  var transform: js.UndefOr[js.Function1[/* v */ Vector2, Vector2]] = js.undefined
  
  /**
    * Lets you specify which window element the gesture should bind events to
    * (only relevant for the drag gesture).
    */
  var window: js.UndefOr[EventTarget] = js.undefined
}
object GenericOptions {
  
  inline def apply(): GenericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericOptions]
  }
  
  extension [Self <: GenericOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
    
    inline def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransform(value: /* v */ Vector2 => Vector2): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWindow(value: EventTarget): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
