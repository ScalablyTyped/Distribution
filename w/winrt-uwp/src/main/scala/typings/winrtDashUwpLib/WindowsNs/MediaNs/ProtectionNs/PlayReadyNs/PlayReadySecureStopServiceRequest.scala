package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  def this(publisherCertBytes: js.Array[scala.Double]) = this()
  /**
    * Initializes a new instance of the PlayReadySecureStopServiceRequest class for the specified secure stop session.
    * @param sessionID The secure stop session identifier.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(sessionID: java.lang.String, publisherCertBytes: js.Array[scala.Double]) = this()
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: java.lang.String = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: java.lang.String = js.native
  /** Gets the current publisher certificate property. */
  var publisherCertificate: scala.Double = js.native
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: java.lang.String = js.native
  /** Gets the session identifier property. */
  var sessionID: java.lang.String = js.native
  /** Gets the secure stop session's start time property. */
  var startTime: stdLib.Date = js.native
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: scala.Boolean = js.native
  /** Gets the GUID for the type of operation that the PlayReady secure stop service request performs. */
  var `type`: java.lang.String = js.native
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: stdLib.Date = js.native
  /** Gets or sets the URI used to perform a service request action. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction = js.native
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
  def processManualEnablingResponse(responseBytes: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.WinRTError = js.native
}

