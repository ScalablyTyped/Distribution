package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the claimed magnetic stripe reader. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedMagneticStripeReader")
@js.native
abstract class ClaimedMagneticStripeReader () extends js.Object {
  /** Gets or sets the MagneticStripeReaderEncryptionAlgorithms that will be used to encrypt the track data. */
  var dataEncryptionAlgorithm: scala.Double = js.native
   /* unmapped return type *//** Gets the DeviceInformation.Id of the claimed magnetic stripe reader. */
  var deviceId: java.lang.String = js.native
  /** Indicates whether to provide raw or decoded data from the most recently swiped card. */
  var isDecodeDataEnabled: scala.Boolean = js.native
  /** Indicates whether the device is authenticated. */
  var isDeviceAuthenticated: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates whether the magnetic stripe reader is disabled after receiving the data from the most recently swiped card. */
  var isDisabledOnDataReceived: scala.Boolean = js.native
  /** Indicates whether the magnetic stripe reader is ready to receive data events. */
  var isEnabled: scala.Boolean = js.native
  /** Indicates whether the track data contains start and end sentinel values. */
  var isTransmitSentinelsEnabled: scala.Boolean = js.native
  /** Occurs when a motor vehicle card is swiped. */
  @JSName("onaamvacarddatareceived")
  var onaamvacarddatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs] = js.native
  /** Occurs when a bank card is swiped. */
  @JSName("onbankcarddatareceived")
  var onbankcarddatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs] = js.native
  /** Occurs when the magnetic stripe reader detects an error when reading a card. */
  @JSName("onerroroccurred")
  var onerroroccurred_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs] = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  @JSName("onreleasedevicerequested")
  var onreleasedevicerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when a vendor-specific card is swiped. */
  @JSName("onvendorspecificdatareceived")
  var onvendorspecificdatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    ClaimedMagneticStripeReader, 
    MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
  ] = js.native
  /** Gets or sets the track data that the application wants to receive following a card swipe. */
  var tracksToRead: MagneticStripeReaderTrackIds = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_aamvacarddatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.aamvacarddatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bankcarddatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bankcarddatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vendorspecificdatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.vendorspecificdatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      ClaimedMagneticStripeReader, 
      MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
    ]
  ): scala.Unit = js.native
  /**
                   * Puts the device into an authenticated state.
                   * @param responseToken A buffer containing the response token generated from the challenge token retrieved from a previous call to the RetrieveDeviceAuthenticationDataAsync method.
                   */
  def authenticateDeviceAsync(responseToken: js.Array[scala.Double]): js.Any = js.native
   /* unmapped return type *//** Releases the exclusive claim to the magnetic strip reader. */
  def close(): scala.Unit = js.native
  /**
                   * Puts the device into an unauthenticated state.
                   * @param responseToken A buffer containing the response token generated from the challenge token retrieved from a previous call to the RetrieveDeviceAuthenticationDataAsync method.
                   */
  def deAuthenticateDeviceAsync(responseToken: js.Array[scala.Double]): js.Any = js.native
  /**
                   * Puts the ClaimedMagneticStripeReader into a state where it cannot receive data events.
                   * @return No object or value is returned when this method completes.
                   */
  def disableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Gets the magnetic stripe reader into a ready state to receive data events.
                   * @return No object or value is returned by this method when it completes.
                   */
  def enableAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when a motor vehicle card is swiped. */
  def onaamvacarddatareceived(
    ev: MagneticStripeReaderAamvaCardDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedMagneticStripeReader]
  ): scala.Unit = js.native
  /** Occurs when a bank card is swiped. */
  def onbankcarddatareceived(
    ev: MagneticStripeReaderBankCardDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedMagneticStripeReader]
  ): scala.Unit = js.native
  /** Occurs when the magnetic stripe reader detects an error when reading a card. */
  def onerroroccurred(
    ev: MagneticStripeReaderErrorOccurredEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedMagneticStripeReader]
  ): scala.Unit = js.native
  /** Occurs when the device gets a request to release its exclusive claim. */
  def onreleasedevicerequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when a vendor-specific card is swiped. */
  def onvendorspecificdatareceived(
    ev: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ClaimedMagneticStripeReader]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_aamvacarddatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.aamvacarddatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bankcarddatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.bankcarddatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderBankCardDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ClaimedMagneticStripeReader, MagneticStripeReaderErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_releasedevicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.releasedevicerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vendorspecificdatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.vendorspecificdatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      ClaimedMagneticStripeReader, 
      MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs
    ]
  ): scala.Unit = js.native
  /**
                   * Resets the specified statistics to zero for all statistics that can be reset.
                   * @param statisticsCategories The list of names of the statistics to reset.
                   * @return No object or value is returned by this method when it completes.
                   */
  def resetStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Retains exclusive claim to the magnetic stripe reader. */
  def retainDevice(): scala.Unit = js.native
  /**
                   * Retrieves a challenge token from the device.
                   * @return Buffer used to store the resulting challenge token from the device.
                   */
  def retrieveDeviceAuthenticationDataAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
                   * Sets the type of error to report by the ErrorOccurred event.
                   * @param value Error reporting type.
                   */
  def setErrorReportingType(value: MagneticStripeReaderErrorReportingType): scala.Unit = js.native
  /**
                   * Provides a new encryption key to the device.
                   * @param key The HEX-ASCII or base64-encoded value for the new key.
                   * @param keyName The name used to identify the key.
                   */
  def updateKeyAsync(key: java.lang.String, keyName: java.lang.String): js.Any = js.native
   /* unmapped return type *//**
                   * Updates the specified statistics.
                   * @param statistics The list of key-value pairs of statistics to update.
                   * @return No object or value is returned by this method when it completes.
                   */
  def updateStatisticsAsync(
    statistics: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

