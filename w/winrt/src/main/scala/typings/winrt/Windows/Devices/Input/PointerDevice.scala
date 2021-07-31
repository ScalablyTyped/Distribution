package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerDevice
  extends StObject
     with IPointerDevice
object PointerDevice {
  
  @scala.inline
  def apply(
    isIntegrated: Boolean,
    maxContacts: Double,
    physicalDeviceRect: Rect,
    pointerDeviceType: PointerDeviceType,
    screenRect: Rect,
    supportedUsages: IVectorView[PointerDeviceUsage]
  ): PointerDevice = {
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated.asInstanceOf[js.Any], maxContacts = maxContacts.asInstanceOf[js.Any], physicalDeviceRect = physicalDeviceRect.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], screenRect = screenRect.asInstanceOf[js.Any], supportedUsages = supportedUsages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDevice]
  }
}
