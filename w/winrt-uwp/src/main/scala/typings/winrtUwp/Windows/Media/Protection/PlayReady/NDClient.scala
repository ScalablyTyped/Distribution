package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.closedcaptiondatareceived
import typings.winrtUwp.winrtUwpStrings.licensefetchcompleted
import typings.winrtUwp.winrtUwpStrings.proximitydetectioncompleted
import typings.winrtUwp.winrtUwpStrings.registrationcompleted
import typings.winrtUwp.winrtUwpStrings.reregistrationneeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates PlayReady-ND sessions, coordinates with the download engine and the stream parser (for example, an MPEG-2 demuxer), manages the sample buffer, and listens to media stream source events. */
@js.native
trait NDClient extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closedcaptiondatareceived(
    `type`: closedcaptiondatareceived,
    listener: TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_licensefetchcompleted(
    `type`: licensefetchcompleted,
    listener: TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_proximitydetectioncompleted(
    `type`: proximitydetectioncompleted,
    listener: TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_registrationcompleted(
    `type`: registrationcompleted,
    listener: TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reregistrationneeded(`type`: reregistrationneeded, listener: TypedEventHandler[NDClient, _]): Unit = js.native
  
  /** Closes the current playback session regardless of whether it is in the registration, proximity detection, license fetch, or play state. */
  def close(): Unit = js.native
  
  /**
    * Performs a license fetch between a client receiver and a transmitter.
    * @param licenseFetchDescriptor Descriptor for the license being fetched.
    * @return The result of the asynchronous license fetch call.
    */
  def licenseFetchAsync(licenseFetchDescriptor: INDLicenseFetchDescriptor): IPromiseWithIAsyncOperation[INDLicenseFetchResult] = js.native
  
  /** Notifies listeners that a closed caption acquisition operation has completed. */
  def onclosedcaptiondatareceived(ev: INDClosedCaptionDataReceivedEventArgs with WinRTEvent[NDClient]): Unit = js.native
  /** Notifies listeners that a closed caption acquisition operation has completed. */
  @JSName("onclosedcaptiondatareceived")
  var onclosedcaptiondatareceived_Original: TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs] = js.native
  
  /** Notifies listeners that a license fetch operation has completed. */
  def onlicensefetchcompleted(ev: INDLicenseFetchCompletedEventArgs with WinRTEvent[NDClient]): Unit = js.native
  /** Notifies listeners that a license fetch operation has completed. */
  @JSName("onlicensefetchcompleted")
  var onlicensefetchcompleted_Original: TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs] = js.native
  
  /** Notifies listeners that a proximity detection operation has completed. */
  def onproximitydetectioncompleted(ev: INDProximityDetectionCompletedEventArgs with WinRTEvent[NDClient]): Unit = js.native
  /** Notifies listeners that a proximity detection operation has completed. */
  @JSName("onproximitydetectioncompleted")
  var onproximitydetectioncompleted_Original: TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs] = js.native
  
  /** Notifies listeners that a registration operation has completed. */
  def onregistrationcompleted(ev: INDRegistrationCompletedEventArgs with WinRTEvent[NDClient]): Unit = js.native
  /** Notifies listeners that a registration operation has completed. */
  @JSName("onregistrationcompleted")
  var onregistrationcompleted_Original: TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs] = js.native
  
  /** Notifies listeners that the app should start re-registration by calling the ReRegistrationAsync method. */
  def onreregistrationneeded(ev: js.Any with WinRTEvent[NDClient]): Unit = js.native
  /** Notifies listeners that the app should start re-registration by calling the ReRegistrationAsync method. */
  @JSName("onreregistrationneeded")
  var onreregistrationneeded_Original: TypedEventHandler[NDClient, _] = js.native
  
  /**
    * Performs a proximity detection and reregistration between a client receiver and a transmitter.
    * @param registrationCustomData Custom data for the registration request.
    * @return The result of the asynchronous reregistration call.
    */
  def reRegistrationAsync(registrationCustomData: INDCustomData): IPromiseWithIAsyncAction = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closedcaptiondatareceived(
    `type`: closedcaptiondatareceived,
    listener: TypedEventHandler[NDClient, INDClosedCaptionDataReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_licensefetchcompleted(
    `type`: licensefetchcompleted,
    listener: TypedEventHandler[NDClient, INDLicenseFetchCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_proximitydetectioncompleted(
    `type`: proximitydetectioncompleted,
    listener: TypedEventHandler[NDClient, INDProximityDetectionCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_registrationcompleted(
    `type`: registrationcompleted,
    listener: TypedEventHandler[NDClient, INDRegistrationCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reregistrationneeded(`type`: reregistrationneeded, listener: TypedEventHandler[NDClient, _]): Unit = js.native
  
  /**
    * Starts the registration, proximity detection, and license fetch procedures between a client receiver and a transmitter.
    * @param contentUrl The URL of the streamed content.
    * @param startAsyncOptions The asynchronous start options. See the NDStartAsyncOptions enumeration for a detailed description of these options.
    * @param registrationCustomData The custom data type identifier that is used for registration with the transmitter.
    * @param licenseFetchDescriptor The descriptor used for license fetching.
    * @return The result of the asynchronous start call.
    */
  def startAsync(
    contentUrl: Uri,
    startAsyncOptions: Double,
    registrationCustomData: INDCustomData,
    licenseFetchDescriptor: INDLicenseFetchDescriptor
  ): IPromiseWithIAsyncOperation[INDStartResult] = js.native
}
