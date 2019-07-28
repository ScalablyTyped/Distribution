package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an output report. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidOutputReport")
@js.native
abstract class HidOutputReport () extends js.Object {
  /** Retrieves, or sets, the data associated with a given output report. */
  var data: IBuffer = js.native
  var getBooleanControl: js.Any = js.native
  var getNumericControl: js.Any = js.native
  /** Retrieves the identifier associated with a given output report. */
  var id: Double = js.native
   /* unmapped type */ /**
    * Retrieves the boolean control associated with the given controlDescription.
    * @param controlDescription Describes the Boolean control.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
   /* unmapped type */ /**
    * Retrieves the numeric control associated with the given controlDescription.
    * @param controlDescription Describes the numeric control.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
}

