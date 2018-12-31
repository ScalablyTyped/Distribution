package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates PlayReady-ND sessions, coordinates with the download engine and the stream parser (for example, an MPEG-2 demuxer), manages the sample buffer, and listens to media stream source events. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDClient")
@js.native
class NDClient protected () extends js.Object {
  /**
    * Creates a new instance of the NDClient class.
    * @param downloadEngine The download engine used to stream protected media content from a transmitter.
    * @param streamParser The stream parser used to parse data from a media stream.
    * @param pMessenger The messenger used to send messages between the PlayReady-ND receiver and transmitter.
    */
  def this(downloadEngine: INDDownloadEngine, streamParser: INDStreamParser, pMessenger: INDMessenger) = this()
  /** Notifies listeners that a closed caption acquisition operation has completed. */
  @JSName("onclosedcaptiondatareceived")
  var onclosedcaptiondatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs] = js.native
  /** Notifies listeners that a license fetch operation has completed. */
  @JSName("onlicensefetchcompleted")
  var onlicensefetchcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs] = js.native
  /** Notifies listeners that a proximity detection operation has completed. */
  @JSName("onproximitydetectioncompleted")
  var onproximitydetectioncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs] = js.native
  /** Notifies listeners that a registration operation has completed. */
  @JSName("onregistrationcompleted")
  var onregistrationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs] = js.native
  /** Notifies listeners that the app should start re-registration by calling the ReRegistrationAsync method. */
  @JSName("onreregistrationneeded")
  var onreregistrationneeded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closedcaptiondatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closedcaptiondatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_licensefetchcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.licensefetchcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_proximitydetectioncompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.proximitydetectioncompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_registrationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.registrationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reregistrationneeded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.reregistrationneeded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, _]
  ): scala.Unit = js.native
  /** Closes the current playback session regardless of whether it is in the registration, proximity detection, license fetch, or play state. */
  def close(): scala.Unit = js.native
  /**
    * Performs a license fetch between a client receiver and a transmitter.
    * @param licenseFetchDescriptor Descriptor for the license being fetched.
    * @return The result of the asynchronous license fetch call.
    */
  def licenseFetchAsync(licenseFetchDescriptor: INDLicenseFetchDescriptor): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDLicenseFetchResult] = js.native
  /** Notifies listeners that a closed caption acquisition operation has completed. */
  def onclosedcaptiondatareceived(ev: INDClosedCaptionDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[NDClient]): scala.Unit = js.native
  /** Notifies listeners that a license fetch operation has completed. */
  def onlicensefetchcompleted(ev: INDLicenseFetchCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[NDClient]): scala.Unit = js.native
  /** Notifies listeners that a proximity detection operation has completed. */
  def onproximitydetectioncompleted(ev: INDProximityDetectionCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[NDClient]): scala.Unit = js.native
  /** Notifies listeners that a registration operation has completed. */
  def onregistrationcompleted(ev: INDRegistrationCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[NDClient]): scala.Unit = js.native
  /** Notifies listeners that the app should start re-registration by calling the ReRegistrationAsync method. */
  def onreregistrationneeded(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[NDClient]): scala.Unit = js.native
  /**
    * Performs a proximity detection and reregistration between a client receiver and a transmitter.
    * @param registrationCustomData Custom data for the registration request.
    * @return The result of the asynchronous reregistration call.
    */
  def reRegistrationAsync(registrationCustomData: INDCustomData): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closedcaptiondatareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closedcaptiondatareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_licensefetchcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.licensefetchcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_proximitydetectioncompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.proximitydetectioncompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_registrationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.registrationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reregistrationneeded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.reregistrationneeded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[NDClient, _]
  ): scala.Unit = js.native
  /**
    * Starts the registration, proximity detection, and license fetch procedures between a client receiver and a transmitter.
    * @param contentUrl The URL of the streamed content.
    * @param startAsyncOptions The asynchronous start options. See the NDStartAsyncOptions enumeration for a detailed description of these options.
    * @param registrationCustomData The custom data type identifier that is used for registration with the transmitter.
    * @param licenseFetchDescriptor The descriptor used for license fetching.
    * @return The result of the asynchronous start call.
    */
  def startAsync(
    contentUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    startAsyncOptions: scala.Double,
    registrationCustomData: INDCustomData,
    licenseFetchDescriptor: INDLicenseFetchDescriptor
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDStartResult] = js.native
}

