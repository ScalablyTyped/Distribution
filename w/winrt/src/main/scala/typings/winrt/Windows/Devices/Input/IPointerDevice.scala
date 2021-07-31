package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerDevice extends StObject {
  
  var isIntegrated: Boolean
  
  var maxContacts: Double
  
  var physicalDeviceRect: Rect
  
  var pointerDeviceType: PointerDeviceType
  
  var screenRect: Rect
  
  var supportedUsages: IVectorView[PointerDeviceUsage]
}
object IPointerDevice {
  
  @scala.inline
  def apply(
    isIntegrated: Boolean,
    maxContacts: Double,
    physicalDeviceRect: Rect,
    pointerDeviceType: PointerDeviceType,
    screenRect: Rect,
    supportedUsages: IVectorView[PointerDeviceUsage]
  ): IPointerDevice = {
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated.asInstanceOf[js.Any], maxContacts = maxContacts.asInstanceOf[js.Any], physicalDeviceRect = physicalDeviceRect.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], screenRect = screenRect.asInstanceOf[js.Any], supportedUsages = supportedUsages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerDevice]
  }
  
  @scala.inline
  implicit class IPointerDeviceMutableBuilder[Self <: IPointerDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsIntegrated(value: Boolean): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxContacts(value: Double): Self = StObject.set(x, "maxContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalDeviceRect(value: Rect): Self = StObject.set(x, "physicalDeviceRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenRect(value: Rect): Self = StObject.set(x, "screenRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUsages(value: IVectorView[PointerDeviceUsage]): Self = StObject.set(x, "supportedUsages", value.asInstanceOf[js.Any])
  }
}
