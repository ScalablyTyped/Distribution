package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statusupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the magnetic stripe reader device. */
@js.native
trait MagneticStripeReader extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs]
  ): Unit = js.native
  
  /** Gets the capabilities of the magnetic stripe reader. */
  var capabilities: MagneticStripeReaderCapabilities = js.native
  
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
  
  /** Device authentication protocol supported by the magnetic stripe reader. */
  var deviceAuthenticationProtocol: MagneticStripeReaderAuthenticationProtocol = js.native
  
  /** Gets the DeviceInformation.Id of the magnetic stripe reader. */
  var deviceId: String = js.native
  
  /**
    * Gets the error reporting type the application wants to receive.
    * @return The error reporting type.
    */
  def getErrorReportingType(): MagneticStripeReaderErrorReportingType = js.native
  
  /** Occurs when the device detects an operation status change. */
  def onstatusupdated(ev: MagneticStripeReaderStatusUpdatedEventArgs & WinRTEvent[MagneticStripeReader]): Unit = js.native
  /** Occurs when the device detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[MagneticStripeReader, MagneticStripeReaderStatusUpdatedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
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
  
  /** Gets the card types supported by the magnetic stripe reader. */
  var supportedCardTypes: Double = js.native
}
