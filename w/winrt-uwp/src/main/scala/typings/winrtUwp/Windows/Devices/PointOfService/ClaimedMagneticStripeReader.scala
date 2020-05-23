package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.aamvacarddatareceived
import typings.winrtUwp.winrtUwpStrings.bankcarddatareceived
import typings.winrtUwp.winrtUwpStrings.erroroccurred
import typings.winrtUwp.winrtUwpStrings.releasedevicerequested
import typings.winrtUwp.winrtUwpStrings.vendorspecificdatareceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the claimed magnetic stripe reader. */
@js.native
trait ClaimedMagneticStripeReader extends js.Object {
  /** Gets or sets the MagneticStripeReaderEncryptionAlgorithms that will be used to encrypt the track data. */
  var dataEncryptionAlgorithm: Double = js.native
   /* unmapped return type */ /** Gets the DeviceInformation.Id of the claimed magnetic stripe reader. */
  var deviceId: String = js.native
  /** Indicates whether to provide raw or decoded data from the most recently swiped card. */
  var isDecodeDataEnabled: Boolean = js.native
  /** Indicates whether the device is authenticated. */
  var isDeviceAuthenticated: Boolean = js.native
  /** Gets or sets a Boolean value that indicates whether the magnetic stripe reader is disabled after receiving the data from the most recently swiped card. */
  var isDisabledOnDataReceived: Boolean = js.native
  /** Indicates whether the magnetic stripe reader is ready to receive data events. */
  var isEnabled: Boolean = js.native
  /** Indicates whether the track data contains start and end sentinel values. */
  var isTransmitSentinelsEnabled: Boolean = js.native
  /** Occurs when a motor vehicle card is swiped. */
  @JSName("onaamvacarddatareceived")
  var onaamvacarddatareceived_Original: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs] = js.native
  /** Occurs when a bank card is swiped. */
  @JSName("onbankcarddatareceived")
  var onbankcarddatareceived_Original: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs] = js.native
  /** Occurs when the magnetic stripe reader detects an error when reading a card. */
  @JSName("onerroroccurred")
  var onerroroccurred_Original: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: EventHandler[_] = js.native
  /** Occurs when a vendor-specific card is swiped. */
  @JSName("onvendorspecificdatareceived")
  var onvendorspecificdatareceived_Original: TypedEventHandler[
    ClaimedMagneticStripeReader, 
    MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
  ] = js.native
  /** Gets or sets the track data that the application wants to receive following a card swipe. */
  var tracksToRead: MagneticStripeReaderTrackIds = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_aamvacarddatareceived(
    `type`: aamvacarddatareceived,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bankcarddatareceived(
    `type`: bankcarddatareceived,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vendorspecificdatareceived(
    `type`: vendorspecificdatareceived,
    listener: TypedEventHandler[
      ClaimedMagneticStripeReader, 
      MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
    ]
  ): Unit = js.native
  /**
    * Puts the device into an authenticated state.
    * @param responseToken A buffer containing the response token generated from the challenge token retrieved from a previous call to the RetrieveDeviceAuthenticationDataAsync method.
    */
  def authenticateDeviceAsync(responseToken: js.Array[Double]): js.Any = js.native
   /* unmapped return type */ /** Releases the exclusive claim to the magnetic strip reader. */
  def close(): Unit = js.native
  /**
    * Puts the device into an unauthenticated state.
    * @param responseToken A buffer containing the response token generated from the challenge token retrieved from a previous call to the RetrieveDeviceAuthenticationDataAsync method.
    */
  def deAuthenticateDeviceAsync(responseToken: js.Array[Double]): js.Any = js.native
  /**
    * Puts the ClaimedMagneticStripeReader into a state where it cannot receive data events.
    * @return No object or value is returned when this method completes.
    */
  def disableAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the magnetic stripe reader into a ready state to receive data events.
    * @return No object or value is returned by this method when it completes.
    */
  def enableAsync(): IPromiseWithIAsyncAction = js.native
  /** Occurs when a motor vehicle card is swiped. */
  def onaamvacarddatareceived(
    ev: MagneticStripeReaderAamvaCardDataReceivedEventArgs with WinRTEvent[ClaimedMagneticStripeReader]
  ): Unit = js.native
  /** Occurs when a bank card is swiped. */
  def onbankcarddatareceived(ev: MagneticStripeReaderBankCardDataReceivedEventArgs with WinRTEvent[ClaimedMagneticStripeReader]): Unit = js.native
  /** Occurs when the magnetic stripe reader detects an error when reading a card. */
  def onerroroccurred(ev: MagneticStripeReaderErrorOccurredEventArgs with WinRTEvent[ClaimedMagneticStripeReader]): Unit = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Occurs when a vendor-specific card is swiped. */
  def onvendorspecificdatareceived(
    ev: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs with WinRTEvent[ClaimedMagneticStripeReader]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_aamvacarddatareceived(
    `type`: aamvacarddatareceived,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bankcarddatareceived(
    `type`: bankcarddatareceived,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(`type`: releasedevicerequested, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vendorspecificdatareceived(
    `type`: vendorspecificdatareceived,
    listener: TypedEventHandler[
      ClaimedMagneticStripeReader, 
      MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
    ]
  ): Unit = js.native
  /**
    * Resets the specified statistics to zero for all statistics that can be reset.
    * @param statisticsCategories The list of names of the statistics to reset.
    * @return No object or value is returned by this method when it completes.
    */
  def resetStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /** Retains exclusive claim to the magnetic stripe reader. */
  def retainDevice(): Unit = js.native
  /**
    * Retrieves a challenge token from the device.
    * @return Buffer used to store the resulting challenge token from the device.
    */
  def retrieveDeviceAuthenticationDataAsync(): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Sets the type of error to report by the ErrorOccurred event.
    * @param value Error reporting type.
    */
  def setErrorReportingType(value: MagneticStripeReaderErrorReportingType): Unit = js.native
  /**
    * Provides a new encryption key to the device.
    * @param key The HEX-ASCII or base64-encoded value for the new key.
    * @param keyName The name used to identify the key.
    */
  def updateKeyAsync(key: String, keyName: String): js.Any = js.native
   /* unmapped return type */ /**
    * Updates the specified statistics.
    * @param statistics The list of key-value pairs of statistics to update.
    * @return No object or value is returned by this method when it completes.
    */
  def updateStatisticsAsync(statistics: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

