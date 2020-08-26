package typings.winrtUwp.Windows.Devices.Input

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to identify the connected pointer devices and determine their capabilities. */
@js.native
trait PointerDevice extends js.Object {
  /** Gets a value indicating whether the pointer device is an integrated device. For example, a video display with an integrated touch digitizer compared to an external pen/stylus digitizer. */
  var isIntegrated: Boolean = js.native
  /** Gets a value indicating the maximum number of contacts supported by the input device. */
  var maxContacts: Double = js.native
  var maxPointersWithZDistance: js.Any = js.native
   /* unmapped type */ /** Gets the coordinates of the bounding rectangle supported by the input device. */
  var physicalDeviceRect: Rect = js.native
  /** Gets the pointer device type. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the screen coordinates that are mapped to the bounding rectangle supported by the input device. */
  var screenRect: Rect = js.native
  /** Gets a collection containing the supported pointer device usages . */
  var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
}

object PointerDevice {
  @scala.inline
  def apply(
    isIntegrated: Boolean,
    maxContacts: Double,
    maxPointersWithZDistance: js.Any,
    physicalDeviceRect: Rect,
    pointerDeviceType: PointerDeviceType,
    screenRect: Rect,
    supportedUsages: IVectorView[PointerDeviceUsage]
  ): PointerDevice = {
    val __obj = js.Dynamic.literal(isIntegrated = isIntegrated.asInstanceOf[js.Any], maxContacts = maxContacts.asInstanceOf[js.Any], maxPointersWithZDistance = maxPointersWithZDistance.asInstanceOf[js.Any], physicalDeviceRect = physicalDeviceRect.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], screenRect = screenRect.asInstanceOf[js.Any], supportedUsages = supportedUsages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDevice]
  }
  @scala.inline
  implicit class PointerDeviceOps[Self <: PointerDevice] (val x: Self) extends AnyVal {
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
    def setMaxPointersWithZDistance(value: js.Any): Self = this.set("maxPointersWithZDistance", value.asInstanceOf[js.Any])
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

