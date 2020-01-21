package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an input report. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidInputReport")
@js.native
abstract class HidInputReport () extends js.Object {
  /** Retrieves the currently activated Boolean controls for the given HID device. */
  var activatedBooleanControls: IVectorView[HidBooleanControl] = js.native
  /** Retrieves the data associated with a given input report. */
  var data: IBuffer = js.native
  var getBooleanControl: js.Any = js.native
  var getNumericControl: js.Any = js.native
  /** Retrieves the identifier associated with a given input report. */
  var id: Double = js.native
  /** Retrieves the recently transitioned Boolean controls for the given HID device. */
  var transitionedBooleanControls: IVectorView[HidBooleanControl] = js.native
   /* unmapped type */ /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
   /* unmapped type */ /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
}

