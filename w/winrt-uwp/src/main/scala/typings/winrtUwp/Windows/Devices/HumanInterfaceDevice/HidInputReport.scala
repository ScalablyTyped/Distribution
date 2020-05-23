package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an input report. */
trait HidInputReport extends js.Object {
  /** Retrieves the currently activated Boolean controls for the given HID device. */
  var activatedBooleanControls: IVectorView[HidBooleanControl]
  /** Retrieves the data associated with a given input report. */
  var data: IBuffer
  var getBooleanControl: js.Any
  var getNumericControl: js.Any
  /** Retrieves the identifier associated with a given input report. */
  var id: Double
  /** Retrieves the recently transitioned Boolean controls for the given HID device. */
  var transitionedBooleanControls: IVectorView[HidBooleanControl]
   /* unmapped type */ /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl
   /* unmapped type */ /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl
}

object HidInputReport {
  @scala.inline
  def apply(
    activatedBooleanControls: IVectorView[HidBooleanControl],
    data: IBuffer,
    getBooleanControl: js.Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: js.Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double,
    transitionedBooleanControls: IVectorView[HidBooleanControl]
  ): HidInputReport = {
    val __obj = js.Dynamic.literal(activatedBooleanControls = activatedBooleanControls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any], transitionedBooleanControls = transitionedBooleanControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReport]
  }
}

