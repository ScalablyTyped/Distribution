package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerDevice extends js.Object {
  var isIntegrated: Boolean = js.native
  var maxContacts: Double = js.native
  var physicalDeviceRect: Rect = js.native
  var pointerDeviceType: PointerDeviceType = js.native
  var screenRect: Rect = js.native
  var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
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
  implicit class IPointerDeviceOps[Self <: IPointerDevice] (val x: Self) extends AnyVal {
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
    def setIsIntegrated(value: Boolean): Self = this.set("isIntegrated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxContacts(value: Double): Self = this.set("maxContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysicalDeviceRect(value: Rect): Self = this.set("physicalDeviceRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = this.set("pointerDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenRect(value: Rect): Self = this.set("screenRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedUsages(value: IVectorView[PointerDeviceUsage]): Self = this.set("supportedUsages", value.asInstanceOf[js.Any])
  }
  
}

