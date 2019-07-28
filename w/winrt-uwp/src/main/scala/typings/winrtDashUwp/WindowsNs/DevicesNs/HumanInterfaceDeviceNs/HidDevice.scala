package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.StorageNs.FileAccessMode
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.inputreportreceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a top-level collection and the corresponding device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice")
@js.native
abstract class HidDevice () extends js.Object {
  /** Establishes an event listener which handles input reports issued by the device. */
  @JSName("oninputreportreceived")
  var oninputreportreceived_Original: TypedEventHandler[HidDevice, HidInputReportReceivedEventArgs] = js.native
  /** Gets the product identifier for the given HID device. */
  var productId: Double = js.native
  /** Gets the usage identifier for the given HID device. */
  var usageId: Double = js.native
  /** Gets the usage page of the top-level collection. */
  var usagePage: Double = js.native
  /** Gets the vendor identifier for the given HID device. */
  var vendorId: Double = js.native
  /** Gets the version, or revision, number for the given HID device. */
  var version: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputreportreceived(
    `type`: inputreportreceived,
    listener: TypedEventHandler[HidDevice, HidInputReportReceivedEventArgs]
  ): Unit = js.native
  /** Closes the connection between the host and the given HID device. */
  def close(): Unit = js.native
  /**
    * Creates the only, or default, feature report that the host will send to the device.
    * @return A HidFeatureReport object.
    */
  def createFeatureReport(): HidFeatureReport = js.native
  /**
    * Creates a feature report, identified by the reportId parameter, that the host will send to the device.
    * @param reportId Identifies the report being created.
    * @return A HidFeatureReport object.
    */
  def createFeatureReport(reportId: Double): HidFeatureReport = js.native
  /**
    * Creates the only, or default, output report that the host will send to the device.
    * @return A HidOutputReport object.
    */
  def createOutputReport(): HidOutputReport = js.native
  /**
    * Creates an output report, identified by the reportId parameter, that the host will send to the device.
    * @param reportId Identifies the report being created.
    * @return A HidOutputReport object.
    */
  def createOutputReport(reportId: Double): HidOutputReport = js.native
  /**
    * Retrieves the descriptions of the boolean controls for the given HID device.
    * @param reportType Specifies the type of report for which the control descriptions are requested.
    * @param usagePage Identifies the usage page associated with the controls.
    * @param usageId Identifies the usage associated with the controls.
    * @return A vector of HidBooleanControlDescription objects.
    */
  def getBooleanControlDescriptions(reportType: HidReportType, usagePage: Double, usageId: Double): IVectorView[HidBooleanControlDescription] = js.native
  /**
    * Asynchronously retrieves the first, or default, feature report from the given HID device.
    * @return A HidFeatureReport object.
    */
  def getFeatureReportAsync(): IPromiseWithIAsyncOperation[HidFeatureReport] = js.native
  /**
    * Asynchronously retrieves a feature report, identified by the reportId parameter, for the given HID device.
    * @param reportId Identifies the requested feature report.
    * @return A HidFeatureReport object.
    */
  def getFeatureReportAsync(reportId: Double): IPromiseWithIAsyncOperation[HidFeatureReport] = js.native
  /**
    * Asynchronously retrieves the default, or first, input report from the given HID device.
    * @return A HidInputReport object.
    */
  def getInputReportAsync(): IPromiseWithIAsyncOperation[HidInputReport] = js.native
  /**
    * Asynchronously retrieves an input report, identified by the reportId parameter, from the given HID device.
    * @param reportId Identifies the requested input report.
    * @return A HidInputReport object.
    */
  def getInputReportAsync(reportId: Double): IPromiseWithIAsyncOperation[HidInputReport] = js.native
  /**
    * Retrieves the descriptions of the numeric controls for the given HID device.
    * @param reportType Specifies the type of report for which the control descriptions are requested.
    * @param usagePage Identifies the usage page associated with the controls.
    * @param usageId Identifies the usage associated with the controls.
    * @return A vector of HidNumericControlDescription objects.
    */
  def getNumericControlDescriptions(reportType: HidReportType, usagePage: Double, usageId: Double): IVectorView[HidNumericControlDescription] = js.native
  /** Establishes an event listener which handles input reports issued by the device. */
  def oninputreportreceived(ev: HidInputReportReceivedEventArgs with WinRTEvent[HidDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputreportreceived(
    `type`: inputreportreceived,
    listener: TypedEventHandler[HidDevice, HidInputReportReceivedEventArgs]
  ): Unit = js.native
  /**
    * Sends an feature report asynchronously from the host to the device.
    * @param featureReport The feature report which the host sends to the device.
    * @return The result of the asynchronous operation.
    */
  def sendFeatureReportAsync(featureReport: HidFeatureReport): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Sends an output report asynchronously from the host to the device.
    * @param outputReport The output report which the host sends to the device.
    * @return Specifies the count of bytes written to the device.
    */
  def sendOutputReportAsync(outputReport: HidOutputReport): IPromiseWithIAsyncOperation[Double] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidDevice")
@js.native
object HidDevice extends js.Object {
  /**
    * Opens a handle to the device identified by the deviceId parameter. The acess type is specified by the accessMode parameter.
    * @param deviceId The DeviceInformation ID that identifies the HID device.
    * @param accessMode Specifies the access mode. The supported access modes are Read and ReadWrite.
    * @return A HidDevice object.
    */
  def fromIdAsync(deviceId: String, accessMode: FileAccessMode): IPromiseWithIAsyncOperation[HidDevice] = js.native
  /**
    * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage and usageId.
    * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
    * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
    * @return An Advanced Query Syntax (AQS) string that represents a device selector.
    */
  def getDeviceSelector(usagePage: Double, usageId: Double): String = js.native
  /**
    * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage, usageId, vendorId, and productId.
    * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
    * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
    * @param vendorId Identifies the device vendor.
    * @param productId Identifies the product.
    * @return An Advanced Query Syntax (AQS) string that represents a device selector.
    */
  def getDeviceSelector(usagePage: Double, usageId: Double, vendorId: Double, productId: Double): String = js.native
}

