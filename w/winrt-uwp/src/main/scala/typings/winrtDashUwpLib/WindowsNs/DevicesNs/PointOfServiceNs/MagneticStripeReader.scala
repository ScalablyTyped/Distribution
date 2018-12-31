package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the magnetic stripe reader device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
abstract class MagneticStripeReader () extends js.Object {
  /** Gets the capabilities of the magnetic stripe reader. */
  var capabilities: MagneticStripeReaderCapabilities = js.native
  /** Device authentication protocol supported by the magnetic stripe reader. */
  var deviceAuthenticationProtocol: MagneticStripeReaderAuthenticationProtocol = js.native
  /** Gets the DeviceInformation.Id of the magnetic stripe reader. */
  var deviceId: java.lang.String = js.native
  /** Occurs when the device detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs] = js.native
  /** Gets the card types supported by the magnetic stripe reader. */
  var supportedCardTypes: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
    * Tests the health of the magnetic stripe reader.
    * @param level The specific health check level.
    * @return A text description of the text result. Returns an error if the specified check level is not supported by the device.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Attempts to get an exclusive access to the magnetic stripe reader.
    * @return When the method completes, it returns a ClaimedMagneticStripeReader or it returns null if the operation fails to claim a magnetic stripe reader.
    */
  def claimReaderAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ClaimedMagneticStripeReader] = js.native
  /**
    * Gets the error reporting type the application wants to receive.
    * @return The error reporting type.
    */
  def getErrorReportingType(): MagneticStripeReaderErrorReportingType = js.native
  /** Occurs when the device detects an operation status change. */
  def onstatusupdated(
    ev: MagneticStripeReaderStatusUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MagneticStripeReader]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
    * Retrieves the requested statistics from the magnetic stripe reader.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return IBuffer representing the requested statistics.
    */
  def retrieveStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
}

/** Represents the magnetic stripe reader device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
object MagneticStripeReader extends js.Object {
  /**
    * Creates a MagneticStripeReader object from DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific magnetic stripe reader, which can be retrieved from the DeviceId property.
    * @return The magnetic stripe reader specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReader] = js.native
  /**
    * Returns the first magnetic stripe reader found.
    * @return The first magnetic stripe reader found. Returns a null object in the following cases:
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReader] = js.native
  /**
    * Returns an Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

