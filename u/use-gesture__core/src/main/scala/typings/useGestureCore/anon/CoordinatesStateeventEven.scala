package typings.useGestureCore.anon

import typings.std.EventTarget
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.useGestureCore.useGestureCoreBooleans.`false`
import typings.useGestureCore.useGestureCoreStrings.x
import typings.useGestureCore.useGestureCoreStrings.y
import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.CoordinatesState & {  event :@use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.EventTypes['wheel']} */
trait CoordinatesStateeventEven extends StObject {
  
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
  
  var _step: js.Tuple2[`false` | Double, `false` | Double]
  
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
    * The initial axis (x or y) of the gesture.
    */
  var axis: js.UndefOr[x | y] = js.undefined
  
  /**
    * The event current target.
    */
  var currentTarget: EventTarget
  
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
  var event: UIEvent & WheelEvent
  
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
  
  /**
    * Pointer coordinates (alias to values)
    */
  var xy: Vector2
}
object CoordinatesStateeventEven {
  
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
    _step: js.Tuple2[`false` | Double, `false` | Double],
    _values: Vector2,
    active: Boolean,
    currentTarget: EventTarget,
    delta: Vector2,
    direction: Vector2,
    distance: Vector2,
    elapsedTime: Double,
    event: UIEvent & WheelEvent,
    first: Boolean,
    initial: Vector2,
    intentional: Boolean,
    last: Boolean,
    lastOffset: Vector2,
    movement: Vector2,
    offset: Vector2,
    overflow: Vector2,
    startTime: Double,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    values: Vector2,
    velocity: Vector2,
    xy: Vector2
  ): CoordinatesStateeventEven = {
    val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesStateeventEven]
  }
  
  extension [Self <: CoordinatesStateeventEven](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setAxis(value: typings.useGestureCore.useGestureCoreStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Vector2): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Vector2): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Vector2): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: UIEvent & WheelEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setIntentional(value: Boolean): Self = StObject.set(x, "intentional", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastOffset(value: Vector2): Self = StObject.set(x, "lastOffset", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: Any): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    
    inline def setMovement(value: Vector2): Self = StObject.set(x, "movement", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: Vector2): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Vector2): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Vector2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setXy(value: Vector2): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
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
    
    inline def set_step(value: js.Tuple2[`false` | Double, `false` | Double]): Self = StObject.set(x, "_step", value.asInstanceOf[js.Any])
    
    inline def set_values(value: Vector2): Self = StObject.set(x, "_values", value.asInstanceOf[js.Any])
  }
}
