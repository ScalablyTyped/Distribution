package typings.useGestureCore.anon

import typings.std.EventTarget
import typings.std.Map
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.WebKitGestureEvent
import typings.useGestureCore.useGestureCoreBooleans.`false`
import typings.useGestureCore.useGestureCoreStrings.angle
import typings.useGestureCore.useGestureCoreStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @use-gesture/core.@use-gesture/core/dist/declarations/src/types.PinchState & {  event :std.PointerEvent | std.TouchEvent | std.WheelEvent | @use-gesture/core.@use-gesture/core/dist/declarations/src/types.WebKitGestureEvent} */
trait PinchStateeventPointerEve extends StObject {
  
  var _active: Boolean
  
  var _blocked: Boolean
  
  var _bounds: js.Tuple2[Vector2, Vector2]
  
  var _delta: Vector2
  
  var _direction: Vector2
  
  var _distance: Vector2
  
  var _force: Boolean
  
  var _initial: Vector2
  
  var _movement: Vector2
  
  var _movementBound: js.Tuple2[`false` | Double, `false` | Double]
  
  var _pointerEvents: Map[Double, PointerEvent]
  
  var _step: js.Tuple2[`false` | Double, `false` | Double]
  
  var _touchIds: js.Array[Any] | (js.Tuple2[Double, Double])
  
  var _values: Vector2
  
  /**
    * True when the gesture is active.
    */
  var active: Boolean
  
  /**
    * The arguments passed to the bind function (only relevant in React when
    * using `<div {...bind(someArgument)} />`)
    */
  var args: js.UndefOr[Any] = js.undefined
  
  /**
    * The initial axis (scale or angle) of the gesture.
    */
  var axis: js.UndefOr[scale | angle] = js.undefined
  
  /**
    * Function that can be called to cancel the pinch.
    */
  def cancel(): Unit
  
  /**
    * True when the pinch gesture has been canceled by the `cancel` function.
    */
  var canceled: Boolean
  
  /**
    * The event current target.
    */
  var currentTarget: EventTarget
  
  /**
    * Distance and angle raw values (alias to values).
    */
  var da: Vector2
  
  /**
    * Difference between the current movement and the previous movement.
    */
  var delta: Vector2
  
  /**
    * Direction per axis. `-1` when going down, `1` when going up, `0` when still.
    */
  var direction: Vector2
  
  /**
    * Cumulative distance of the gesture. Deltas are summed with their absolute
    * values.
    */
  var distance: Vector2
  
  /**
    * Elapsed time (ms) of the current gesture.
    */
  var elapsedTime: Double
  
  /**
    * The event triggering the gesture.
    */
  var event: UIEvent & (PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent)
  
  /**
    * True when it's the first event of the active gesture.
    */
  var first: Boolean
  
  /**
    * Raw values when the gesture started.
    */
  var initial: Vector2
  
  /**
    * True when the gesture is intentional (passed the threshold).
    */
  var intentional: Boolean
  
  /**
    * True when it's the last event of the active gesture.
    */
  var last: Boolean
  
  /**
    * Offset when the gesture started.
    */
  var lastOffset: Vector2
  
  /**
    * Value returned by your handler on its previous run.
    */
  var memo: js.UndefOr[Any] = js.undefined
  
  /**
    * Displacement of the current gesture.
    */
  var movement: Vector2
  
  /**
    * Cumulative displacements of all gestures (sum of all movements triggered
    * by the handler)
    */
  var offset: Vector2
  
  /**
    * Coordinates of the center of touch events, or the cursor when using wheel
    * to pinch.
    */
  var origin: Vector2
  
  /**
    * Bound overflow per axis. `-1` when overflowing bounds to the left/top, `1` when overflowing bounds to the right/bottom.
    */
  var overflow: Vector2
  
  /**
    * The timestamp (ms) of when the gesture started.
    */
  var startTime: Double
  
  /**
    * The event target.
    */
  var target: EventTarget
  
  /**
    * The timestamp (ms) of the current event.
    */
  var timeStamp: Double
  
  /**
    * The number of full rotation the current gesture has performed.
    */
  var turns: Double
  
  /**
    * Event type.
    */
  var `type`: String
  
  /**
    * Current raw values of the gesture. Can be coordinates or distance / angle
    * depending on the gesture.
    */
  var values: Vector2
  
  /**
    * Velocity vector.
    */
  var velocity: Vector2
}
object PinchStateeventPointerEve {
  
  inline def apply(
    _active: Boolean,
    _blocked: Boolean,
    _bounds: js.Tuple2[Vector2, Vector2],
    _delta: Vector2,
    _direction: Vector2,
    _distance: Vector2,
    _force: Boolean,
    _initial: Vector2,
    _movement: Vector2,
    _movementBound: js.Tuple2[`false` | Double, `false` | Double],
    _pointerEvents: Map[Double, PointerEvent],
    _step: js.Tuple2[`false` | Double, `false` | Double],
    _touchIds: js.Array[Any] | (js.Tuple2[Double, Double]),
    _values: Vector2,
    active: Boolean,
    cancel: () => Unit,
    canceled: Boolean,
    currentTarget: EventTarget,
    da: Vector2,
    delta: Vector2,
    direction: Vector2,
    distance: Vector2,
    elapsedTime: Double,
    event: UIEvent & (PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent),
    first: Boolean,
    initial: Vector2,
    intentional: Boolean,
    last: Boolean,
    lastOffset: Vector2,
    movement: Vector2,
    offset: Vector2,
    origin: Vector2,
    overflow: Vector2,
    startTime: Double,
    target: EventTarget,
    timeStamp: Double,
    turns: Double,
    `type`: String,
    values: Vector2,
    velocity: Vector2
  ): PinchStateeventPointerEve = {
    val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _pointerEvents = _pointerEvents.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _touchIds = _touchIds.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), canceled = canceled.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], da = da.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], turns = turns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchStateeventPointerEve]
  }
  
  extension [Self <: PinchStateeventPointerEve](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setAxis(value: scale | angle): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDa(value: Vector2): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Vector2): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Vector2): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Vector2): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: UIEvent & (PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent)): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setIntentional(value: Boolean): Self = StObject.set(x, "intentional", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastOffset(value: Vector2): Self = StObject.set(x, "lastOffset", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: Any): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    
    inline def setMovement(value: Vector2): Self = StObject.set(x, "movement", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Vector2): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: Vector2): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setTurns(value: Double): Self = StObject.set(x, "turns", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Vector2): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Vector2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Boolean): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_blocked(value: Boolean): Self = StObject.set(x, "_blocked", value.asInstanceOf[js.Any])
    
    inline def set_bounds(value: js.Tuple2[Vector2, Vector2]): Self = StObject.set(x, "_bounds", value.asInstanceOf[js.Any])
    
    inline def set_delta(value: Vector2): Self = StObject.set(x, "_delta", value.asInstanceOf[js.Any])
    
    inline def set_direction(value: Vector2): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_distance(value: Vector2): Self = StObject.set(x, "_distance", value.asInstanceOf[js.Any])
    
    inline def set_force(value: Boolean): Self = StObject.set(x, "_force", value.asInstanceOf[js.Any])
    
    inline def set_initial(value: Vector2): Self = StObject.set(x, "_initial", value.asInstanceOf[js.Any])
    
    inline def set_movement(value: Vector2): Self = StObject.set(x, "_movement", value.asInstanceOf[js.Any])
    
    inline def set_movementBound(value: js.Tuple2[`false` | Double, `false` | Double]): Self = StObject.set(x, "_movementBound", value.asInstanceOf[js.Any])
    
    inline def set_pointerEvents(value: Map[Double, PointerEvent]): Self = StObject.set(x, "_pointerEvents", value.asInstanceOf[js.Any])
    
    inline def set_step(value: js.Tuple2[`false` | Double, `false` | Double]): Self = StObject.set(x, "_step", value.asInstanceOf[js.Any])
    
    inline def set_touchIds(value: js.Array[Any] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "_touchIds", value.asInstanceOf[js.Any])
    
    inline def set_touchIdsVarargs(value: Any*): Self = StObject.set(x, "_touchIds", js.Array(value*))
    
    inline def set_values(value: Vector2): Self = StObject.set(x, "_values", value.asInstanceOf[js.Any])
  }
}
