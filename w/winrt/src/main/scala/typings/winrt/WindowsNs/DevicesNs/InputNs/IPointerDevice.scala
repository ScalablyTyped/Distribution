package typings.winrt.WindowsNs.DevicesNs.InputNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDevice extends js.Object {
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
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated, maxContacts = maxContacts, physicalDeviceRect = physicalDeviceRect, pointerDeviceType = pointerDeviceType, screenRect = screenRect, supportedUsages = supportedUsages)
  
    __obj.asInstanceOf[IPointerDevice]
  }
}

