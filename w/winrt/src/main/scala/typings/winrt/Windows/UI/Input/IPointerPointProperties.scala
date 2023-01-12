package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerPointProperties extends StObject {
  
  var contactRect: Rect
  
  var contactRectRaw: Rect
  
  def getUsageValue(usagePage: Double, usageId: Double): Double
  
  def hasUsage(usagePage: Double, usageId: Double): Boolean
  
  var isBarrelButtonPressed: Boolean
  
  var isCanceled: Boolean
  
  var isEraser: Boolean
  
  var isHorizontalMouseWheel: Boolean
  
  var isInRange: Boolean
  
  var isInverted: Boolean
  
  var isLeftButtonPressed: Boolean
  
  var isMiddleButtonPressed: Boolean
  
  var isPrimary: Boolean
  
  var isRightButtonPressed: Boolean
  
  var isXButton1Pressed: Boolean
  
  var isXButton2Pressed: Boolean
  
  var mouseWheelDelta: Double
  
  var orientation: Double
  
  var pointerUpdateKind: PointerUpdateKind
  
  var pressure: Double
  
  var touchConfidence: Boolean
  
  var twist: Double
  
  var xTilt: Double
  
  var yTilt: Double
}
object IPointerPointProperties {
  
  inline def apply(
    contactRect: Rect,
    contactRectRaw: Rect,
    getUsageValue: (Double, Double) => Double,
    hasUsage: (Double, Double) => Boolean,
    isBarrelButtonPressed: Boolean,
    isCanceled: Boolean,
    isEraser: Boolean,
    isHorizontalMouseWheel: Boolean,
    isInRange: Boolean,
    isInverted: Boolean,
    isLeftButtonPressed: Boolean,
    isMiddleButtonPressed: Boolean,
    isPrimary: Boolean,
    isRightButtonPressed: Boolean,
    isXButton1Pressed: Boolean,
    isXButton2Pressed: Boolean,
    mouseWheelDelta: Double,
    orientation: Double,
    pointerUpdateKind: PointerUpdateKind,
    pressure: Double,
    touchConfidence: Boolean,
    twist: Double,
    xTilt: Double,
    yTilt: Double
  ): IPointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect.asInstanceOf[js.Any], contactRectRaw = contactRectRaw.asInstanceOf[js.Any], getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalMouseWheel = isHorizontalMouseWheel.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], isLeftButtonPressed = isLeftButtonPressed.asInstanceOf[js.Any], isMiddleButtonPressed = isMiddleButtonPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isRightButtonPressed = isRightButtonPressed.asInstanceOf[js.Any], isXButton1Pressed = isXButton1Pressed.asInstanceOf[js.Any], isXButton2Pressed = isXButton2Pressed.asInstanceOf[js.Any], mouseWheelDelta = mouseWheelDelta.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointerUpdateKind = pointerUpdateKind.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], touchConfidence = touchConfidence.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], xTilt = xTilt.asInstanceOf[js.Any], yTilt = yTilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerPointProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPointerPointProperties] (val x: Self) extends AnyVal {
    
    inline def setContactRect(value: Rect): Self = StObject.set(x, "contactRect", value.asInstanceOf[js.Any])
    
    inline def setContactRectRaw(value: Rect): Self = StObject.set(x, "contactRectRaw", value.asInstanceOf[js.Any])
    
    inline def setGetUsageValue(value: (Double, Double) => Double): Self = StObject.set(x, "getUsageValue", js.Any.fromFunction2(value))
    
    inline def setHasUsage(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasUsage", js.Any.fromFunction2(value))
    
    inline def setIsBarrelButtonPressed(value: Boolean): Self = StObject.set(x, "isBarrelButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setIsEraser(value: Boolean): Self = StObject.set(x, "isEraser", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontalMouseWheel(value: Boolean): Self = StObject.set(x, "isHorizontalMouseWheel", value.asInstanceOf[js.Any])
    
    inline def setIsInRange(value: Boolean): Self = StObject.set(x, "isInRange", value.asInstanceOf[js.Any])
    
    inline def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    inline def setIsLeftButtonPressed(value: Boolean): Self = StObject.set(x, "isLeftButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setIsMiddleButtonPressed(value: Boolean): Self = StObject.set(x, "isMiddleButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsRightButtonPressed(value: Boolean): Self = StObject.set(x, "isRightButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setIsXButton1Pressed(value: Boolean): Self = StObject.set(x, "isXButton1Pressed", value.asInstanceOf[js.Any])
    
    inline def setIsXButton2Pressed(value: Boolean): Self = StObject.set(x, "isXButton2Pressed", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelDelta(value: Double): Self = StObject.set(x, "mouseWheelDelta", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPointerUpdateKind(value: PointerUpdateKind): Self = StObject.set(x, "pointerUpdateKind", value.asInstanceOf[js.Any])
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setTouchConfidence(value: Boolean): Self = StObject.set(x, "touchConfidence", value.asInstanceOf[js.Any])
    
    inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setXTilt(value: Double): Self = StObject.set(x, "xTilt", value.asInstanceOf[js.Any])
    
    inline def setYTilt(value: Double): Self = StObject.set(x, "yTilt", value.asInstanceOf[js.Any])
  }
}
