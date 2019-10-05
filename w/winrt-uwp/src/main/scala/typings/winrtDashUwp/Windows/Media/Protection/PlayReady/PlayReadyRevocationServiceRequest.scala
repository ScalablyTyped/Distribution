package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Updates the revocation data required by PlayReady. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyRevocationServiceRequest")
@js.native
/** Initializes a new instance of the PlayReadyRevocationServiceRequest class. */
class PlayReadyRevocationServiceRequest () extends js.Object {
  /** Gets or sets the custom data of the request challenge. This property is not supported in this class. */
  var challengeCustomData: String = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  /** Gets the custom data that was returned in the response from the service. This property is not supported in this class. */
  var responseCustomData: String = js.native
  /** Gets the GUID for the type of operation that the PlayReady revocation service request performs. */
  var `type`: String = js.native
  /** Gets or sets the URI used to perform a service request action. This property is not supported in this class. */
  var uri: Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction = js.native
  /**
    * Begins the process of manually enabling. This method is not supported in this class.
    * @return This method always returns 0x80070032 (the request is not supported).
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage = js.native
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  /**
    * Process the raw binary result of a manual enabling challenge. This method is not supported in this class.
    * @param responseBytes The response result to be processed.
    * @return This method always returns 0x80070032 (the request is not supported).
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
}

