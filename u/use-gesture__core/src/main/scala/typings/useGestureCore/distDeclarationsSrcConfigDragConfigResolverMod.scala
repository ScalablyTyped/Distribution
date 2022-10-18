package typings.useGestureCore

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.useGestureCore.anon.Axis
import typings.useGestureCore.anon.Capture
import typings.useGestureCore.anon.Distance
import typings.useGestureCore.anon.Duration
import typings.useGestureCore.anon.Pointer
import typings.useGestureCore.anon.RecordPointerTypenumber
import typings.useGestureCore.anon.Shared
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesConfig
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesKey
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.DragBounds
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.DragConfig
import typings.useGestureCore.distDeclarationsSrcTypesStateMod.State
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typings.useGestureCore.useGestureCoreStrings.mouse
import typings.useGestureCore.useGestureCoreStrings.pointer
import typings.useGestureCore.useGestureCoreStrings.touch
import typings.useGestureCore.useGestureCoreStrings.x
import typings.useGestureCore.useGestureCoreStrings.xy
import typings.useGestureCore.useGestureCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigDragConfigResolverMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "DEFAULT_DRAG_DELAY")
  @js.native
  val DEFAULT_DRAG_DELAY: /* 180 */ Double = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "DEFAULT_PREVENT_SCROLL_DELAY")
  @js.native
  val DEFAULT_PREVENT_SCROLL_DELAY: /* 250 */ Double = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "DEFAULT_SWIPE_DISTANCE")
  @js.native
  val DEFAULT_SWIPE_DISTANCE: /* 50 */ Double = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "DEFAULT_SWIPE_DURATION")
  @js.native
  val DEFAULT_SWIPE_DURATION: /* 250 */ Double = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "DEFAULT_SWIPE_VELOCITY")
  @js.native
  val DEFAULT_SWIPE_VELOCITY: /* 0.5 */ Double = js.native
  
  object dragConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/dragConfigResolver", "dragConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def axis(_v: Any, _k: String, hasAxis: CoordinatesConfig[CoordinatesKey]): js.UndefOr[x | y] = (^.asInstanceOf[js.Dynamic].applyDynamic("axis")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasAxis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[x | y]]
    
    inline def axisThreshold(value: RecordPointerTypenumber): RecordPointerTypenumber = ^.asInstanceOf[js.Dynamic].applyDynamic("axisThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[RecordPointerTypenumber]
    
    inline def bounds(): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")().asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    inline def bounds(value: js.Function1[/* state */ State, DragBounds]): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(value.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    inline def bounds(value: DragBounds): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(value.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    
    inline def delay(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")().asInstanceOf[Double]
    inline def delay(value: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def delay(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def device(_v: Any, _k: String, hasHasTouchLockMouse: DragConfig): mouse | touch | pointer = (^.asInstanceOf[js.Dynamic].applyDynamic("device")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasHasTouchLockMouse.asInstanceOf[js.Any])).asInstanceOf[mouse | touch | pointer]
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(value: Unit, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    inline def eventOptions(value: AddEventListenerOptions, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    
    inline def from(value: js.Function1[/* s */ State, Vector2]): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Double): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Vector2): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    
    inline def keys(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[Boolean]
    inline def keys(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def pointerCapture(_v: Any, _k: String, hasHasCaptureButtons: Pointer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerCapture")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasHasCaptureButtons.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def preventDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")().asInstanceOf[Boolean]
    inline def preventDefault(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def preventScrollAxis(value: x | y | xy, _k: String, hasPreventScroll: DragConfig): js.UndefOr[x | y | xy] = (^.asInstanceOf[js.Dynamic].applyDynamic("preventScrollAxis")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasPreventScroll.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[x | y | xy]]
    
    inline def rubberband(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")().asInstanceOf[Vector2]
    inline def rubberband(value: Boolean): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Double): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Vector2): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    
    inline def swipe(): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("swipe")().asInstanceOf[Duration]
    inline def swipe(hasVelocityDistanceDuration: Distance): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("swipe")(hasVelocityDistanceDuration.asInstanceOf[js.Any]).asInstanceOf[Duration]
    
    inline def threshold(value: Double, _k: String, hasFilterTapsTapsThresholdAxis: Axis): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasFilterTapsTapsThresholdAxis.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    inline def threshold(value: Vector2, _k: String, hasFilterTapsTapsThresholdAxis: Axis): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasFilterTapsTapsThresholdAxis.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def transform(value: Any, _k: String, config: Shared): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def triggerAllEvents(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")().asInstanceOf[Boolean]
    inline def triggerAllEvents(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
