package typings.useGestureCore.distDeclarationsSrcTypesConfigMod

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import typings.useGestureCore.anon.DragStateeventEventTypesd
import typings.useGestureCore.anon.DragStateeventEventTypesdActive
import typings.useGestureCore.anon.Keys
import typings.useGestureCore.anon.PartialRecordPointerTypen
import typings.useGestureCore.anon.Velocity
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.NonUndefined
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Target
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typings.useGestureCore.useGestureCoreStrings.lock
import typings.useGestureCore.useGestureCoreStrings.x
import typings.useGestureCore.useGestureCoreStrings.xy
import typings.useGestureCore.useGestureCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/config.CoordinatesConfig<'drag'>, 'axisThreshold' | 'bounds'> & {  filterTaps :boolean | undefined,   tapsThreshold :number | undefined,   bounds :@use-gesture/core.@use-gesture/core/dist/declarations/src/types/config.DragBounds | (state : @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State['drag']): @use-gesture/core.@use-gesture/core/dist/declarations/src/types/config.DragBounds | undefined,   pointer :{  buttons :number | std.Array<number> | undefined,   touch :boolean | undefined,   mouse :boolean | undefined,   keys :boolean | undefined,   capture :boolean | undefined,   lock :boolean | undefined} | undefined,   swipe :{  velocity :number | @use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.Vector2 | undefined,   distance :number | @use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.Vector2 | undefined,   duration :number | undefined} | undefined,   preventScroll :boolean | number | undefined,   preventScrollAxis :'x' | 'y' | 'xy' | undefined,   delay :boolean | number | undefined,   axisThreshold :std.Partial<std.Record<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.PointerType, number>> | undefined} */
trait DragConfig extends StObject {
  
  var axis: js.UndefOr[x | y | lock] = js.undefined
  
  /**
    * Key-number record that determines for each device (`'mouse'`, `'touch'`,
    * `'pen'`) the number of pixels of drag in one direction needed for axises to
    * be calculated.
    */
  var axisThreshold: js.UndefOr[PartialRecordPointerTypen] = js.undefined
  
  /**
    * Set this option to true when using with @react-three/fiber objects.
    */
  /**
    * Limits the gesture `offset` to the specified bounds. Can be a ref or a dom
    * node.
    */
  var bounds: js.UndefOr[
    DragBounds | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesdActive], DragBounds])
  ] = js.undefined
  
  /**
    * If set, the handler will be delayed for the duration of the delay (in ms)
    * — or if the user starts moving. When set to true, delay is defaulted
    * to 180ms.
    */
  var delay: js.UndefOr[Boolean | Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
  
  /**
    * If true, the component won't trigger your drag logic if the user just clicked on the component.
    */
  var filterTaps: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[
    Vector2 | (js.Function1[/* state */ NonUndefined[js.UndefOr[DragStateeventEventTypesd]], Vector2])
  ] = js.undefined
  
  var pointer: js.UndefOr[Keys] = js.undefined
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, the drag will be triggered after the duration of the delay (in ms).
    * When set to true, delay is defaulted to 250ms.
    */
  var preventScroll: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * If set, the drag will allow scrolling in the direction of this axis until
    * the preventScroll duration has elapsed. Defaults to only 'y'.
    */
  var preventScrollAxis: js.UndefOr[x | y | xy] = js.undefined
  
  var rubberband: js.UndefOr[Boolean | Double | Vector2] = js.undefined
  
  var swipe: js.UndefOr[Velocity] = js.undefined
  
  /**
    * The maximum total displacement a tap can have
    */
  var tapsThreshold: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[Target] = js.undefined
  
  var threshold: js.UndefOr[Double | Vector2] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* v */ Vector2, Vector2]] = js.undefined
  
  var triggerAllEvents: js.UndefOr[Boolean] = js.undefined
  
  var window: js.UndefOr[EventTarget] = js.undefined
}
object DragConfig {
  
  inline def apply(): DragConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragConfig] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: typings.useGestureCore.useGestureCoreStrings.x | y | lock): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisThreshold(value: PartialRecordPointerTypen): Self = StObject.set(x, "axisThreshold", value.asInstanceOf[js.Any])
    
    inline def setAxisThresholdUndefined: Self = StObject.set(x, "axisThreshold", js.undefined)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBounds(
      value: DragBounds | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesdActive], DragBounds])
    ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsFunction1(value: /* state */ js.UndefOr[DragStateeventEventTypesdActive] => DragBounds): Self = StObject.set(x, "bounds", js.Any.fromFunction1(value))
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDelay(value: Boolean | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
    
    inline def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
    
    inline def setFilterTaps(value: Boolean): Self = StObject.set(x, "filterTaps", value.asInstanceOf[js.Any])
    
    inline def setFilterTapsUndefined: Self = StObject.set(x, "filterTaps", js.undefined)
    
    inline def setFrom(
      value: Vector2 | (js.Function1[/* state */ NonUndefined[js.UndefOr[DragStateeventEventTypesd]], Vector2])
    ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromFunction1(value: /* state */ NonUndefined[js.UndefOr[DragStateeventEventTypesd]] => Vector2): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPointer(value: Keys): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setPreventScroll(value: Boolean | Double): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollAxis(value: typings.useGestureCore.useGestureCoreStrings.x | y | xy): Self = StObject.set(x, "preventScrollAxis", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollAxisUndefined: Self = StObject.set(x, "preventScrollAxis", js.undefined)
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    inline def setRubberband(value: Boolean | Double | Vector2): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
    
    inline def setRubberbandUndefined: Self = StObject.set(x, "rubberband", js.undefined)
    
    inline def setSwipe(value: Velocity): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    inline def setTapsThreshold(value: Double): Self = StObject.set(x, "tapsThreshold", value.asInstanceOf[js.Any])
    
    inline def setTapsThresholdUndefined: Self = StObject.set(x, "tapsThreshold", js.undefined)
    
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
