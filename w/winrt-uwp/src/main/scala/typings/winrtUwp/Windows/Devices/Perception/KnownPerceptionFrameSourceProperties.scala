package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static properties that are applicable to all types of frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties")
@js.native
abstract class KnownPerceptionFrameSourceProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties")
@js.native
object KnownPerceptionFrameSourceProperties extends js.Object {
  var deviceId: js.Any = js.native
   /* unmapped type */ /** Gets a string key used to look up a string property with the device, model, version string for the physical sensor device this frame source represents. */
  var deviceModelVersion: String = js.native
  /** Gets a string key used to look up an enumeration property indicating the physical location of the sensor on the Windows device. */
  var enclosureLocation: String = js.native
  /** Gets a string key used to look up a string property that is a string key indicating the kind of frame the source provides. */
  var frameKind: String = js.native
  /** Gets a string key used to look up a string property with the unique ID of the frame source. */
  var id: String = js.native
  /** Gets a string key used to look up a string array property containing the physical device IDs of the sensor this frame source represents. */
  var physicalDeviceIds: String = js.native
}

