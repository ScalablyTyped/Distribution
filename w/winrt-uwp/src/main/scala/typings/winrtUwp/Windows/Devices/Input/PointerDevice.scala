package typings.winrtUwp.Windows.Devices.Input

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to identify the connected pointer devices and determine their capabilities. */
@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
abstract class PointerDevice () extends js.Object {
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

/* static members */
@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
object PointerDevice extends js.Object {
  /**
    * Gets information about the pointer device associated with the specified input pointer ID.
    * @param pointerId The ID of the pointer input.
    * @return The PointerDevice object that represents the associated pointer device.
    */
  def getPointerDevice(pointerId: Double): PointerDevice = js.native
  /**
    * Gets information about the pointer devices attached to the system.
    * @return The collection of PointerDevice objects that represent the pointer devices attached to the system.
    */
  def getPointerDevices(): IVectorView[PointerDevice] = js.native
}

