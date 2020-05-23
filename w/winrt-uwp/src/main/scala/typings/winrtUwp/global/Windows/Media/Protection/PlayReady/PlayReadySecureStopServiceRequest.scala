package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest")
@js.native
class PlayReadySecureStopServiceRequest protected ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest {
  /**
    * Initializes a new instance of the PlayReadySecureStopServiceRequest class to include all secure stop sessions.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(publisherCertBytes: js.Array[Double]) = this()
  /**
    * Initializes a new instance of the PlayReadySecureStopServiceRequest class for the specified secure stop session.
    * @param sessionID The secure stop session identifier.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(sessionID: String, publisherCertBytes: js.Array[Double]) = this()
  /** Gets or sets the custom data of the request challenge. */
  /* CompleteClass */
  override var challengeCustomData: String = js.native
  /** Gets the vendor content protection system identifier. */
  /* CompleteClass */
  override var protectionSystem: String = js.native
  /** Gets the current publisher certificate property. */
  /* CompleteClass */
  override var publisherCertificate: Double = js.native
  /** Gets the custom data that was returned in the response from the service. */
  /* CompleteClass */
  override var responseCustomData: String = js.native
  /** Gets the session identifier property. */
  /* CompleteClass */
  override var sessionID: String = js.native
  /** Gets the secure stop session's start time property. */
  /* CompleteClass */
  override var startTime: Date = js.native
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  /* CompleteClass */
  override var stopped: Boolean = js.native
  /** Gets the GUID for the type of operation that the PlayReady secure stop service request performs. */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Gets the secure stop session's update/stop time property. */
  /* CompleteClass */
  override var updateTime: Date = js.native
  /** Gets or sets the URI used to perform a service request action. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  /* CompleteClass */
  override def beginServiceRequest(): IAsyncAction = js.native
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  /* CompleteClass */
  override def generateManualEnablingChallenge(): typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySoapMessage = js.native
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  /* CompleteClass */
  override def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  /* CompleteClass */
  override def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
}

