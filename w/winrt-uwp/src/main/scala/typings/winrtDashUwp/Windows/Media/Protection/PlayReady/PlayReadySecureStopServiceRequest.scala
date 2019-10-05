package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest")
@js.native
class PlayReadySecureStopServiceRequest protected () extends js.Object {
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
  var challengeCustomData: String = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double = js.native
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String = js.native
  /** Gets the session identifier property. */
  var sessionID: String = js.native
  /** Gets the secure stop session's start time property. */
  var startTime: Date = js.native
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean = js.native
  /** Gets the GUID for the type of operation that the PlayReady secure stop service request performs. */
  var `type`: String = js.native
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: Date = js.native
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction = js.native
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage = js.native
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
}

