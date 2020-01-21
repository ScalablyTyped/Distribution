package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statusupdated
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
  var deviceId: String = js.native
  /** Occurs when the device detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs] = js.native
  /** Gets the card types supported by the magnetic stripe reader. */
  var supportedCardTypes: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs]
  ): Unit = js.native
  /**
    * Tests the health of the magnetic stripe reader.
    * @param level The specific health check level.
    * @return A text description of the text result. Returns an error if the specified check level is not supported by the device.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Attempts to get an exclusive access to the magnetic stripe reader.
    * @return When the method completes, it returns a ClaimedMagneticStripeReader or it returns null if the operation fails to claim a magnetic stripe reader.
    */
  def claimReaderAsync(): IPromiseWithIAsyncOperation[ClaimedMagneticStripeReader] = js.native
  /**
    * Gets the error reporting type the application wants to receive.
    * @return The error reporting type.
    */
  def getErrorReportingType(): MagneticStripeReaderErrorReportingType = js.native
  /** Occurs when the device detects an operation status change. */
  def onstatusupdated(ev: MagneticStripeReaderStatusUpdatedEventArgs with WinRTEvent[MagneticStripeReader]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs]
  ): Unit = js.native
  /**
    * Retrieves the requested statistics from the magnetic stripe reader.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return IBuffer representing the requested statistics.
    */
  def retrieveStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
object MagneticStripeReader extends js.Object {
  /**
    * Creates a MagneticStripeReader object from DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific magnetic stripe reader, which can be retrieved from the DeviceId property.
    * @return The magnetic stripe reader specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[MagneticStripeReader] = js.native
  /**
    * Returns the first magnetic stripe reader found.
    * @return The first magnetic stripe reader found. Returns a null object in the following cases:
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[MagneticStripeReader] = js.native
  /**
    * Returns an Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    */
  def getDeviceSelector(): String = js.native
}

