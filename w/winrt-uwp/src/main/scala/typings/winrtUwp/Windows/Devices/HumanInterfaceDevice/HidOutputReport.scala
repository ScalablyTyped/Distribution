package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an output report. */
trait HidOutputReport extends js.Object {
  /** Retrieves, or sets, the data associated with a given output report. */
  var data: IBuffer
  var getBooleanControl: js.Any
  var getNumericControl: js.Any
  /** Retrieves the identifier associated with a given output report. */
  var id: Double
   /* unmapped type */ /**
    * Retrieves the boolean control associated with the given controlDescription.
    * @param controlDescription Describes the Boolean control.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl
   /* unmapped type */ /**
    * Retrieves the numeric control associated with the given controlDescription.
    * @param controlDescription Describes the numeric control.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl
}

object HidOutputReport {
  @scala.inline
  def apply(
    data: IBuffer,
    getBooleanControl: js.Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: js.Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double
  ): HidOutputReport = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidOutputReport]
  }
}

