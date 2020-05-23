package typings.winrtUwp.Windows.Devices.Input

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to identify the connected pointer devices and determine their capabilities. */
trait PointerDevice extends js.Object {
  /** Gets a value indicating whether the pointer device is an integrated device. For example, a video display with an integrated touch digitizer compared to an external pen/stylus digitizer. */
  var isIntegrated: Boolean
  /** Gets a value indicating the maximum number of contacts supported by the input device. */
  var maxContacts: Double
  var maxPointersWithZDistance: js.Any
   /* unmapped type */ /** Gets the coordinates of the bounding rectangle supported by the input device. */
  var physicalDeviceRect: Rect
  /** Gets the pointer device type. */
  var pointerDeviceType: PointerDeviceType
  /** Gets the screen coordinates that are mapped to the bounding rectangle supported by the input device. */
  var screenRect: Rect
  /** Gets a collection containing the supported pointer device usages . */
  var supportedUsages: IVectorView[PointerDeviceUsage]
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
}

