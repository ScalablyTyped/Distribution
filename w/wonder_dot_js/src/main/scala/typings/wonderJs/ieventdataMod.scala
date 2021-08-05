package typings.wonderJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieventdataMod {
  
  trait IEventData extends StObject {
    
    def preventDefault(): Unit
    
    var returnValue: Boolean
  }
  object IEventData {
    
    inline def apply(preventDefault: () => Unit, returnValue: Boolean): IEventData = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventData]
    }
    
    extension [Self <: IEventData](x: Self) {
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IKeyboardEventData
    extends StObject
       with IEventData {
    
    var altKey: Double
    
    var ctrlKey: Double
    
    var keyCode: Double
    
    var metaKey: Double
    
    var shiftKey: Double
  }
  object IKeyboardEventData {
    
    inline def apply(
      altKey: Double,
      ctrlKey: Double,
      keyCode: Double,
      metaKey: Double,
      preventDefault: () => Unit,
      returnValue: Boolean,
      shiftKey: Double
    ): IKeyboardEventData = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyboardEventData]
    }
    
    extension [Self <: IKeyboardEventData](x: Self) {
      
      inline def setAltKey(value: Double): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Double): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Double): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Double): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMouseEventData
    extends StObject
       with IEventData {
    
    var button: Double
    
    var clientX: Double
    
    var clientY: Double
    
    var currentTarget: HTMLElement
    
    var detail: js.UndefOr[Double] = js.undefined
    
    var movementX: js.UndefOr[Double] = js.undefined
    
    var movementY: js.UndefOr[Double] = js.undefined
    
    var mozMovementX: js.UndefOr[Double] = js.undefined
    
    var mozMovementY: js.UndefOr[Double] = js.undefined
    
    var pageX: Double
    
    var pageY: Double
    
    var target: HTMLElement
    
    var webkitMovementX: js.UndefOr[Double] = js.undefined
    
    var webkitMovementY: js.UndefOr[Double] = js.undefined
    
    var wheelDelta: js.UndefOr[Double] = js.undefined
  }
  object IMouseEventData {
    
    inline def apply(
      button: Double,
      clientX: Double,
      clientY: Double,
      currentTarget: HTMLElement,
      pageX: Double,
      pageY: Double,
      preventDefault: () => Unit,
      returnValue: Boolean,
      target: HTMLElement
    ): IMouseEventData = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMouseEventData]
    }
    
    extension [Self <: IMouseEventData](x: Self) {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      inline def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
      
      inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      inline def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
      
      inline def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
      
      inline def setMozMovementXUndefined: Self = StObject.set(x, "mozMovementX", js.undefined)
      
      inline def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
      
      inline def setMozMovementYUndefined: Self = StObject.set(x, "mozMovementY", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementXUndefined: Self = StObject.set(x, "webkitMovementX", js.undefined)
      
      inline def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementYUndefined: Self = StObject.set(x, "webkitMovementY", js.undefined)
      
      inline def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
      
      inline def setWheelDeltaUndefined: Self = StObject.set(x, "wheelDelta", js.undefined)
    }
  }
  
  trait IPointEventData
    extends StObject
       with IEventData {
    
    var button: js.UndefOr[Double] = js.undefined
    
    var clientX: Double
    
    var clientY: Double
    
    var currentTarget: HTMLElement | Null
    
    var detail: js.UndefOr[Double] = js.undefined
    
    var movementX: js.UndefOr[Double] = js.undefined
    
    var movementY: js.UndefOr[Double] = js.undefined
    
    var mozMovementX: js.UndefOr[Double] = js.undefined
    
    var mozMovementY: js.UndefOr[Double] = js.undefined
    
    var pageX: Double
    
    var pageY: Double
    
    var target: HTMLElement
    
    var webkitMovementX: js.UndefOr[Double] = js.undefined
    
    var webkitMovementY: js.UndefOr[Double] = js.undefined
    
    var wheelDelta: js.UndefOr[Double] = js.undefined
  }
  object IPointEventData {
    
    inline def apply(
      clientX: Double,
      clientY: Double,
      pageX: Double,
      pageY: Double,
      preventDefault: () => Unit,
      returnValue: Boolean,
      target: HTMLElement
    ): IPointEventData = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], currentTarget = null)
      __obj.asInstanceOf[IPointEventData]
    }
    
    extension [Self <: IPointEventData](x: Self) {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      inline def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
      
      inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      inline def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
      
      inline def setMozMovementX(value: Double): Self = StObject.set(x, "mozMovementX", value.asInstanceOf[js.Any])
      
      inline def setMozMovementXUndefined: Self = StObject.set(x, "mozMovementX", js.undefined)
      
      inline def setMozMovementY(value: Double): Self = StObject.set(x, "mozMovementY", value.asInstanceOf[js.Any])
      
      inline def setMozMovementYUndefined: Self = StObject.set(x, "mozMovementY", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementX(value: Double): Self = StObject.set(x, "webkitMovementX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementXUndefined: Self = StObject.set(x, "webkitMovementX", js.undefined)
      
      inline def setWebkitMovementY(value: Double): Self = StObject.set(x, "webkitMovementY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMovementYUndefined: Self = StObject.set(x, "webkitMovementY", js.undefined)
      
      inline def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
      
      inline def setWheelDeltaUndefined: Self = StObject.set(x, "wheelDelta", js.undefined)
    }
  }
  
  trait ITouchData extends StObject {
    
    var clientX: Double
    
    var clientY: Double
    
    var force: Double
    
    var identifier: Double
    
    var pageX: Double
    
    var pageY: Double
    
    var radiusX: Double
    
    var radiusY: Double
    
    var rotationAngle: Double
    
    var screenX: Double
    
    var screenY: Double
    
    var target: HTMLElement
  }
  object ITouchData {
    
    inline def apply(
      clientX: Double,
      clientY: Double,
      force: Double,
      identifier: Double,
      pageX: Double,
      pageY: Double,
      radiusX: Double,
      radiusY: Double,
      rotationAngle: Double,
      screenX: Double,
      screenY: Double,
      target: HTMLElement
    ): ITouchData = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITouchData]
    }
    
    extension [Self <: ITouchData](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
      
      inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITouchEventData
    extends StObject
       with IEventData {
    
    var changedTouches: js.Array[ITouchData]
    
    var currentTarget: HTMLElement | Null
    
    var target: HTMLElement
    
    var targetTouches: js.Array[ITouchData]
    
    var touches: js.Array[ITouchData]
  }
  object ITouchEventData {
    
    inline def apply(
      changedTouches: js.Array[ITouchData],
      preventDefault: () => Unit,
      returnValue: Boolean,
      target: HTMLElement,
      targetTouches: js.Array[ITouchData],
      touches: js.Array[ITouchData]
    ): ITouchEventData = {
      val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], currentTarget = null)
      __obj.asInstanceOf[ITouchEventData]
    }
    
    extension [Self <: ITouchEventData](x: Self) {
      
      inline def setChangedTouches(value: js.Array[ITouchData]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      inline def setChangedTouchesVarargs(value: ITouchData*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
      
      inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetTouches(value: js.Array[ITouchData]): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
      
      inline def setTargetTouchesVarargs(value: ITouchData*): Self = StObject.set(x, "targetTouches", js.Array(value :_*))
      
      inline def setTouches(value: js.Array[ITouchData]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setTouchesVarargs(value: ITouchData*): Self = StObject.set(x, "touches", js.Array(value :_*))
    }
  }
}
