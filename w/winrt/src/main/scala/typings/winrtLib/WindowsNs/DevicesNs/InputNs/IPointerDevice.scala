package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDevice extends js.Object {
  var isIntegrated: scala.Boolean
  var maxContacts: scala.Double
  var physicalDeviceRect: winrtLib.WindowsNs.FoundationNs.Rect
  var pointerDeviceType: PointerDeviceType
  var screenRect: winrtLib.WindowsNs.FoundationNs.Rect
  var supportedUsages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDeviceUsage]
}

object IPointerDevice {
  @scala.inline
  def apply(
    isIntegrated: scala.Boolean,
    maxContacts: scala.Double,
    physicalDeviceRect: winrtLib.WindowsNs.FoundationNs.Rect,
    pointerDeviceType: PointerDeviceType,
    screenRect: winrtLib.WindowsNs.FoundationNs.Rect,
    supportedUsages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDeviceUsage]
  ): IPointerDevice = {
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated, maxContacts = maxContacts, physicalDeviceRect = physicalDeviceRect, pointerDeviceType = pointerDeviceType, screenRect = screenRect, supportedUsages = supportedUsages)
  
    __obj.asInstanceOf[IPointerDevice]
  }
}

