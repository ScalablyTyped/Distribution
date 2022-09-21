package typings.useGestureCore

import typings.std.EventTarget
import typings.std.KeyboardEvent
import typings.std.Map
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.useGestureCore.anon.CoordinatesStateeventEven
import typings.useGestureCore.anon.CoordinatesStateeventEvenActive
import typings.useGestureCore.anon.CoordinatesStateeventEvenArgs
import typings.useGestureCore.anon.DragStateeventEventTypesd
import typings.useGestureCore.anon.PinchStateeventEventTypesActive
import typings.useGestureCore.configMod.GestureKey
import typings.useGestureCore.useGestureCoreBooleans.`false`
import typings.useGestureCore.useGestureCoreStrings.angle
import typings.useGestureCore.useGestureCoreStrings.scale
import typings.useGestureCore.useGestureCoreStrings.x
import typings.useGestureCore.useGestureCoreStrings.y
import typings.useGestureCore.utilsMod.NonUndefined
import typings.useGestureCore.utilsMod.Vector2
import typings.useGestureCore.utilsMod.WebKitGestureEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  trait CommonGestureState extends StObject {
    
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
    var event: UIEvent
    
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
  }
  object CommonGestureState {
    
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
      event: UIEvent,
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
      velocity: Vector2
    ): CommonGestureState = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonGestureState]
    }
    
    extension [Self <: CommonGestureState](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Vector2): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Vector2): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Vector2): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: UIEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
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
  
  trait CoordinatesState
    extends StObject
       with CommonGestureState {
    
    /**
      * The initial axis (x or y) of the gesture.
      */
    var axis: js.UndefOr[x | y] = js.undefined
    
    /**
      * Pointer coordinates (alias to values)
      */
    var xy: Vector2
  }
  object CoordinatesState {
    
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
      event: UIEvent,
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
    ): CoordinatesState = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinatesState]
    }
    
    extension [Self <: CoordinatesState](x: Self) {
      
      inline def setAxis(value: typings.useGestureCore.useGestureCoreStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setXy(value: Vector2): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragState
    extends StObject
       with CoordinatesState {
    
    var _delayed: Boolean
    
    var _keyboardActive: Boolean
    
    var _pointerActive: Boolean
    
    var _pointerId: js.UndefOr[Double] = js.undefined
    
    var _preventScroll: Boolean
    
    /**
      * Function that can be called to cancel the drag.
      */
    def cancel(): Unit
    
    /**
      * True when the drag gesture has been canceled by the `cancel` function.
      */
    var canceled: Boolean
    
    /**
      * [swipeX, swipeY] is [0, 0] if no swipe detected, -1 or 1 otherwise.
      */
    var swipe: Vector2
    
    /**
      * True if the drag gesture is recognized as a tap (ie when the displacement
      * is lower than 3px per axis).
      */
    var tap: Boolean
  }
  object DragState {
    
    inline def apply(
      _active: Boolean,
      _blocked: Boolean,
      _bounds: js.Tuple2[Vector2, Vector2],
      _delayed: Boolean,
      _delta: Vector2,
      _direction: Vector2,
      _distance: Vector2,
      _force: Boolean,
      _initial: Vector2,
      _keyboardActive: Boolean,
      _movement: Vector2,
      _movementBound: js.Tuple2[`false` | Double, `false` | Double],
      _pointerActive: Boolean,
      _preventScroll: Boolean,
      _step: js.Tuple2[`false` | Double, `false` | Double],
      _values: Vector2,
      active: Boolean,
      cancel: () => Unit,
      canceled: Boolean,
      currentTarget: EventTarget,
      delta: Vector2,
      direction: Vector2,
      distance: Vector2,
      elapsedTime: Double,
      event: UIEvent,
      first: Boolean,
      initial: Vector2,
      intentional: Boolean,
      last: Boolean,
      lastOffset: Vector2,
      movement: Vector2,
      offset: Vector2,
      overflow: Vector2,
      startTime: Double,
      swipe: Vector2,
      tap: Boolean,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      values: Vector2,
      velocity: Vector2,
      xy: Vector2
    ): DragState = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delayed = _delayed.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _keyboardActive = _keyboardActive.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _pointerActive = _pointerActive.asInstanceOf[js.Any], _preventScroll = _preventScroll.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), canceled = canceled.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragState]
    }
    
    extension [Self <: DragState](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      inline def setSwipe(value: Vector2): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def set_delayed(value: Boolean): Self = StObject.set(x, "_delayed", value.asInstanceOf[js.Any])
      
      inline def set_keyboardActive(value: Boolean): Self = StObject.set(x, "_keyboardActive", value.asInstanceOf[js.Any])
      
      inline def set_pointerActive(value: Boolean): Self = StObject.set(x, "_pointerActive", value.asInstanceOf[js.Any])
      
      inline def set_pointerId(value: Double): Self = StObject.set(x, "_pointerId", value.asInstanceOf[js.Any])
      
      inline def set_pointerIdUndefined: Self = StObject.set(x, "_pointerId", js.undefined)
      
      inline def set_preventScroll(value: Boolean): Self = StObject.set(x, "_preventScroll", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTypes extends StObject {
    
    var drag: PointerEvent | TouchEvent | MouseEvent | KeyboardEvent
    
    var hover: PointerEvent
    
    var move: PointerEvent
    
    var pinch: PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent
    
    var scroll: UIEvent
    
    var wheel: WheelEvent
  }
  object EventTypes {
    
    inline def apply(
      drag: PointerEvent | TouchEvent | MouseEvent | KeyboardEvent,
      hover: PointerEvent,
      move: PointerEvent,
      pinch: PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent,
      scroll: UIEvent,
      wheel: WheelEvent
    ): EventTypes = {
      val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypes]
    }
    
    extension [Self <: EventTypes](x: Self) {
      
      inline def setDrag(value: PointerEvent | TouchEvent | MouseEvent | KeyboardEvent): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setHover(value: PointerEvent): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setMove(value: PointerEvent): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setPinch(value: PointerEvent | TouchEvent | WheelEvent | WebKitGestureEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: UIEvent): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: WheelEvent): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    }
  }
  
  type FullGestureState[Key /* <: GestureKey */] = SharedGestureState & (NonUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ js.Any
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.useGestureCore.useGestureCoreStrings.dragging
    - typings.useGestureCore.useGestureCoreStrings.wheeling
    - typings.useGestureCore.useGestureCoreStrings.moving
    - typings.useGestureCore.useGestureCoreStrings.hovering
    - typings.useGestureCore.useGestureCoreStrings.scrolling
    - typings.useGestureCore.useGestureCoreStrings.pinching
  */
  trait IngKey extends StObject
  object IngKey {
    
    inline def dragging: typings.useGestureCore.useGestureCoreStrings.dragging = "dragging".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.dragging]
    
    inline def hovering: typings.useGestureCore.useGestureCoreStrings.hovering = "hovering".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.hovering]
    
    inline def moving: typings.useGestureCore.useGestureCoreStrings.moving = "moving".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.moving]
    
    inline def pinching: typings.useGestureCore.useGestureCoreStrings.pinching = "pinching".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.pinching]
    
    inline def scrolling: typings.useGestureCore.useGestureCoreStrings.scrolling = "scrolling".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.scrolling]
    
    inline def wheeling: typings.useGestureCore.useGestureCoreStrings.wheeling = "wheeling".asInstanceOf[typings.useGestureCore.useGestureCoreStrings.wheeling]
  }
  
  trait PinchState
    extends StObject
       with CommonGestureState {
    
    var _pointerEvents: Map[Double, PointerEvent]
    
    var _touchIds: js.Array[Any] | (js.Tuple2[Double, Double])
    
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
      * Distance and angle raw values (alias to values).
      */
    var da: Vector2
    
    /**
      * Coordinates of the center of touch events, or the cursor when using wheel
      * to pinch.
      */
    var origin: Vector2
    
    /**
      * The number of full rotation the current gesture has performed.
      */
    var turns: Double
  }
  object PinchState {
    
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
      event: UIEvent,
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
    ): PinchState = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _blocked = _blocked.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _delta = _delta.asInstanceOf[js.Any], _direction = _direction.asInstanceOf[js.Any], _distance = _distance.asInstanceOf[js.Any], _force = _force.asInstanceOf[js.Any], _initial = _initial.asInstanceOf[js.Any], _movement = _movement.asInstanceOf[js.Any], _movementBound = _movementBound.asInstanceOf[js.Any], _pointerEvents = _pointerEvents.asInstanceOf[js.Any], _step = _step.asInstanceOf[js.Any], _touchIds = _touchIds.asInstanceOf[js.Any], _values = _values.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), canceled = canceled.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], da = da.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], intentional = intentional.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], movement = movement.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], turns = turns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinchState]
    }
    
    extension [Self <: PinchState](x: Self) {
      
      inline def setAxis(value: scale | angle): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      inline def setDa(value: Vector2): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Vector2): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setTurns(value: Double): Self = StObject.set(x, "turns", value.asInstanceOf[js.Any])
      
      inline def set_pointerEvents(value: Map[Double, PointerEvent]): Self = StObject.set(x, "_pointerEvents", value.asInstanceOf[js.Any])
      
      inline def set_touchIds(value: js.Array[Any] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "_touchIds", value.asInstanceOf[js.Any])
      
      inline def set_touchIdsVarargs(value: Any*): Self = StObject.set(x, "_touchIds", js.Array(value*))
    }
  }
  
  trait SharedGestureState extends StObject {
    
    /**
      * True when the Alt key is pressed.
      */
    var altKey: Boolean
    
    /**
      * Indicates which buttons are pressed (https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons).
      */
    var buttons: Double
    
    /**
      * True when the Control key is pressed.
      */
    var ctrlKey: Boolean
    
    /**
      * Alias for pressed.
      */
    var down: Boolean
    
    /**
      * True if the element is being dragged.
      */
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True if the element is being hovered.
      */
    var hovering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True if the document is in lock mode.
      */
    var locked: Boolean
    
    /**
      * True when the Meta key is pressed.
      */
    var metaKey: Boolean
    
    /**
      * True if the element is being moved.
      */
    var moving: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True if the element is being pinched.
      */
    var pinching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True when the main mouse button or touch is pressed.
      */
    var pressed: Boolean
    
    /**
      * True if the element is being scrolled.
      */
    var scrolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True when the Shift key is pressed.
      */
    var shiftKey: Boolean
    
    /**
      * Number of fingers touching the screen.
      */
    var touches: Double
    
    /**
      * True if the element is being wheeled.
      */
    var wheeling: js.UndefOr[Boolean] = js.undefined
  }
  object SharedGestureState {
    
    inline def apply(
      altKey: Boolean,
      buttons: Double,
      ctrlKey: Boolean,
      down: Boolean,
      locked: Boolean,
      metaKey: Boolean,
      pressed: Boolean,
      shiftKey: Boolean,
      touches: Double
    ): SharedGestureState = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedGestureState]
    }
    
    extension [Self <: SharedGestureState](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      inline def setHoveringUndefined: Self = StObject.set(x, "hovering", js.undefined)
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      inline def setMovingUndefined: Self = StObject.set(x, "moving", js.undefined)
      
      inline def setPinching(value: Boolean): Self = StObject.set(x, "pinching", value.asInstanceOf[js.Any])
      
      inline def setPinchingUndefined: Self = StObject.set(x, "pinching", js.undefined)
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setTouches(value: Double): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setWheeling(value: Boolean): Self = StObject.set(x, "wheeling", value.asInstanceOf[js.Any])
      
      inline def setWheelingUndefined: Self = StObject.set(x, "wheeling", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var drag: js.UndefOr[DragStateeventEventTypesd] = js.undefined
    
    var hover: js.UndefOr[CoordinatesStateeventEvenArgs] = js.undefined
    
    var move: js.UndefOr[CoordinatesStateeventEvenArgs] = js.undefined
    
    var pinch: js.UndefOr[PinchStateeventEventTypesActive] = js.undefined
    
    var scroll: js.UndefOr[CoordinatesStateeventEvenActive] = js.undefined
    
    var shared: SharedGestureState
    
    var wheel: js.UndefOr[CoordinatesStateeventEven] = js.undefined
  }
  object State {
    
    inline def apply(shared: SharedGestureState): State = {
      val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDrag(value: DragStateeventEventTypesd): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setHover(value: CoordinatesStateeventEvenArgs): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setMove(value: CoordinatesStateeventEvenArgs): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setPinch(value: PinchStateeventEventTypesActive): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      inline def setScroll(value: CoordinatesStateeventEvenActive): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShared(value: SharedGestureState): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: CoordinatesStateeventEven): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
}
