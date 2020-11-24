package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerPointProperties extends js.Object {
  
  var contactRect: Rect = js.native
  
  var contactRectRaw: Rect = js.native
  
  def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
  
  def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
  
  var isBarrelButtonPressed: Boolean = js.native
  
  var isCanceled: Boolean = js.native
  
  var isEraser: Boolean = js.native
  
  var isHorizontalMouseWheel: Boolean = js.native
  
  var isInRange: Boolean = js.native
  
  var isInverted: Boolean = js.native
  
  var isLeftButtonPressed: Boolean = js.native
  
  var isMiddleButtonPressed: Boolean = js.native
  
  var isPrimary: Boolean = js.native
  
  var isRightButtonPressed: Boolean = js.native
  
  var isXButton1Pressed: Boolean = js.native
  
  var isXButton2Pressed: Boolean = js.native
  
  var mouseWheelDelta: Double = js.native
  
  var orientation: Double = js.native
  
  var pointerUpdateKind: PointerUpdateKind = js.native
  
  var pressure: Double = js.native
  
  var touchConfidence: Boolean = js.native
  
  var twist: Double = js.native
  
  var xTilt: Double = js.native
  
  var yTilt: Double = js.native
}
object IPointerPointProperties {
  
  @scala.inline
  def apply(
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
  implicit class IPointerPointPropertiesOps[Self <: IPointerPointProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactRect(value: Rect): Self = this.set("contactRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactRectRaw(value: Rect): Self = this.set("contactRectRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUsageValue(value: (Double, Double) => Double): Self = this.set("getUsageValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasUsage(value: (Double, Double) => Boolean): Self = this.set("hasUsage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsBarrelButtonPressed(value: Boolean): Self = this.set("isBarrelButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = this.set("isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEraser(value: Boolean): Self = this.set("isEraser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalMouseWheel(value: Boolean): Self = this.set("isHorizontalMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInRange(value: Boolean): Self = this.set("isInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = this.set("isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeftButtonPressed(value: Boolean): Self = this.set("isLeftButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMiddleButtonPressed(value: Boolean): Self = this.set("isMiddleButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightButtonPressed(value: Boolean): Self = this.set("isRightButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXButton1Pressed(value: Boolean): Self = this.set("isXButton1Pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXButton2Pressed(value: Boolean): Self = this.set("isXButton2Pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelDelta(value: Double): Self = this.set("mouseWheelDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerUpdateKind(value: PointerUpdateKind): Self = this.set("pointerUpdateKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchConfidence(value: Boolean): Self = this.set("touchConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwist(value: Double): Self = this.set("twist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTilt(value: Double): Self = this.set("xTilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYTilt(value: Double): Self = this.set("yTilt", value.asInstanceOf[js.Any])
  }
}
