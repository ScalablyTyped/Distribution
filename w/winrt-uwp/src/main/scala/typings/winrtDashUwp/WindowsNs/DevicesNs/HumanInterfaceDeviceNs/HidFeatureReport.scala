package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a feature report. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidFeatureReport")
@js.native
abstract class HidFeatureReport () extends js.Object {
  /** Retrieves, or sets, the data associated with a given feature report. */
  var data: IBuffer = js.native
  /** Retrieves the identifier associated with a given feature report. */
  var id: Double = js.native
  /**
    * Retrieves the Boolean control associated with the usagePage and usageIdparameter and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidBooleanControl object.
    */
  def getBooleanControl(usagePage: Double, usageId: Double): HidBooleanControl = js.native
  /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
  /**
    * Retrieves the numeric control associated with the usagePage and usageId parameters and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidNumericControl object.
    */
  def getNumericControl(usagePage: Double, usageId: Double): HidNumericControl = js.native
  /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
}

