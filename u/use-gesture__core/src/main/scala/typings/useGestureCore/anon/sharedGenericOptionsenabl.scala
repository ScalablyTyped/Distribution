package typings.useGestureCore.anon

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GenericOptions
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.ModifierKey
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.PinchBounds
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Target
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typings.useGestureCore.useGestureCoreStrings.lock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  shared :@use-gesture/core.@use-gesture/core/dist/declarations/src/types.GenericOptions,   enabled :boolean | undefined,   eventOptions :std.AddEventListenerOptions | undefined,   from :@use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2 | (state : @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchState & {  event :std.PointerEvent | std.TouchEvent | std.WheelEvent | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.WebKitGestureEvent}): @use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2 | undefined,   threshold :number | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2 | undefined,   preventDefault :boolean | undefined,   triggerAllEvents :boolean | undefined,   rubberband :number | boolean | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2 | undefined,   transform :(v : @use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2): @use-gesture/core.@use-gesture/core/dist/declarations/src/types.Vector2 | undefined,   pointer :{  touch :boolean | undefined} | undefined,   scaleBounds :@use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchBounds | (state : @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchState & {  event :std.PointerEvent | std.TouchEvent | std.WheelEvent | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.WebKitGestureEvent} | undefined): @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchBounds | undefined,   angleBounds :@use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchBounds | (state : @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchState & {  event :std.PointerEvent | std.TouchEvent | std.WheelEvent | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.WebKitGestureEvent} | undefined): @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchBounds | undefined,   axis :'lock' | undefined,   modifierKey :@use-gesture/core.@use-gesture/core/dist/declarations/src/types.ModifierKey | undefined} & @use-gesture/core.@use-gesture/core/dist/declarations/src/types.GenericOptions */
trait sharedGenericOptionsenabl extends StObject {
  
  var angleBounds: js.UndefOr[
    PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventPointerEve], PinchBounds])
  ] = js.undefined
  
  var axis: js.UndefOr[lock] = js.undefined
  
  /**
    * When set to false none of the handlers will be fired.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lets you customize if you want events to be passive or captured.
    */
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
  
  var from: js.UndefOr[Vector2 | (js.Function1[/* state */ PinchStateeventPointerEve, Vector2])] = js.undefined
  
  var modifierKey: js.UndefOr[ModifierKey] = js.undefined
  
  var pointer: js.UndefOr[Touch] = js.undefined
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  var rubberband: js.UndefOr[Double | Boolean | Vector2] = js.undefined
  
  var scaleBounds: js.UndefOr[
    PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventPointerEve], PinchBounds])
  ] = js.undefined
  
  var shared: GenericOptions
  
  /**
    * Lets you specify a dom node or ref you want to attach the gesture to.
    */
  var target: js.UndefOr[Target] = js.undefined
  
  var threshold: js.UndefOr[Double | Vector2] = js.undefined
  
  /**
    * A function that you can use to transform movement and offset values. Useful
    * to map your screen coordinates to custom space coordinates such as a
    * canvas.
    */
  var transform: js.UndefOr[js.Function1[/* v */ Vector2, Vector2]] = js.undefined
  
  var triggerAllEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lets you specify which window element the gesture should bind events to
    * (only relevant for the drag gesture).
    */
  var window: js.UndefOr[EventTarget] = js.undefined
}
object sharedGenericOptionsenabl {
  
  inline def apply(shared: GenericOptions): sharedGenericOptionsenabl = {
    val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[sharedGenericOptionsenabl]
  }
  
  extension [Self <: sharedGenericOptionsenabl](x: Self) {
    
    inline def setAngleBounds(
      value: PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventPointerEve], PinchBounds])
    ): Self = StObject.set(x, "angleBounds", value.asInstanceOf[js.Any])
    
    inline def setAngleBoundsFunction1(value: /* state */ js.UndefOr[PinchStateeventPointerEve] => PinchBounds): Self = StObject.set(x, "angleBounds", js.Any.fromFunction1(value))
    
    inline def setAngleBoundsUndefined: Self = StObject.set(x, "angleBounds", js.undefined)
    
    inline def setAxis(value: lock): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
    
    inline def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
    
    inline def setFrom(value: Vector2 | (js.Function1[/* state */ PinchStateeventPointerEve, Vector2])): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromFunction1(value: /* state */ PinchStateeventPointerEve => Vector2): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setModifierKey(value: ModifierKey): Self = StObject.set(x, "modifierKey", value.asInstanceOf[js.Any])
    
    inline def setModifierKeyNull: Self = StObject.set(x, "modifierKey", null)
    
    inline def setModifierKeyUndefined: Self = StObject.set(x, "modifierKey", js.undefined)
    
    inline def setPointer(value: Touch): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setRubberband(value: Double | Boolean | Vector2): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
    
    inline def setRubberbandUndefined: Self = StObject.set(x, "rubberband", js.undefined)
    
    inline def setScaleBounds(
      value: PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventPointerEve], PinchBounds])
    ): Self = StObject.set(x, "scaleBounds", value.asInstanceOf[js.Any])
    
    inline def setScaleBoundsFunction1(value: /* state */ js.UndefOr[PinchStateeventPointerEve] => PinchBounds): Self = StObject.set(x, "scaleBounds", js.Any.fromFunction1(value))
    
    inline def setScaleBoundsUndefined: Self = StObject.set(x, "scaleBounds", js.undefined)
    
    inline def setShared(value: GenericOptions): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setThreshold(value: Double | Vector2): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTransform(value: /* v */ Vector2 => Vector2): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTriggerAllEvents(value: Boolean): Self = StObject.set(x, "triggerAllEvents", value.asInstanceOf[js.Any])
    
    inline def setTriggerAllEventsUndefined: Self = StObject.set(x, "triggerAllEvents", js.undefined)
    
    inline def setWindow(value: EventTarget): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
