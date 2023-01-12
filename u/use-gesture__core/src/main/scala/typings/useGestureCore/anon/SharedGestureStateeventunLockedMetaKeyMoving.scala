package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.SharedGestureState & {  event :undefined extends any | undefined ? @use-gesture/core.@use-gesture/core/dist/declarations/src/types/handlers.GetEventType<'onKeyUpCapture'> : any | undefined,   args :any} */
trait SharedGestureStateeventunLockedMetaKeyMoving extends StObject {
  
  /**
    * True when the Alt key is pressed.
    */
  var altKey: Boolean
  
  var args: Any
  
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
  
  var event: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends any | undefined ? @use-gesture/core.@use-gesture/core/dist/declarations/src/types/handlers.GetEventType<'onKeyUpCapture'> : any | undefined */ js.Any
  
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
object SharedGestureStateeventunLockedMetaKeyMoving {
  
  inline def apply(
    altKey: Boolean,
    args: Any,
    buttons: Double,
    ctrlKey: Boolean,
    down: Boolean,
    event: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends any | undefined ? @use-gesture/core.@use-gesture/core/dist/declarations/src/types/handlers.GetEventType<'onKeyUpCapture'> : any | undefined */ js.Any,
    locked: Boolean,
    metaKey: Boolean,
    pressed: Boolean,
    shiftKey: Boolean,
    touches: Double
  ): SharedGestureStateeventunLockedMetaKeyMoving = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedGestureStateeventunLockedMetaKeyMoving]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedGestureStateeventunLockedMetaKeyMoving] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends any | undefined ? @use-gesture/core.@use-gesture/core/dist/declarations/src/types/handlers.GetEventType<'onKeyUpCapture'> : any | undefined */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
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
