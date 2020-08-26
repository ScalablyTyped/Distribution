package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an output report. */
@js.native
trait HidOutputReport extends js.Object {
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
  @scala.inline
  implicit class HidOutputReportOps[Self <: HidOutputReport] (val x: Self) extends AnyVal {
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
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBooleanControl(value: js.Any): Self = this.set("getBooleanControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = this.set("getBooleanControlByDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNumericControl(value: js.Any): Self = this.set("getNumericControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = this.set("getNumericControlByDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

