package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the service methods for content metering operations. */
@js.native
trait PlayReadyMeteringReportServiceRequest extends js.Object {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String = js.native
  /** Gets or sets the current metering certificate property. */
  var meteringCertificate: Double = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String = js.native
  /** Gets the GUID for the type of operation that the PlayReady metering report service request performs. */
  var `type`: String = js.native
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

object PlayReadyMeteringReportServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    meteringCertificate: Double,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): PlayReadyMeteringReportServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), meteringCertificate = meteringCertificate.asInstanceOf[js.Any], nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyMeteringReportServiceRequest]
  }
  @scala.inline
  implicit class PlayReadyMeteringReportServiceRequestOps[Self <: PlayReadyMeteringReportServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginServiceRequest(value: () => IAsyncAction): Self = this.set("beginServiceRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setChallengeCustomData(value: String): Self = this.set("challengeCustomData", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = this.set("generateManualEnablingChallenge", js.Any.fromFunction0(value))
    @scala.inline
    def setMeteringCertificate(value: Double): Self = this.set("meteringCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = this.set("nextServiceRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = this.set("processManualEnablingResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setProtectionSystem(value: String): Self = this.set("protectionSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseCustomData(value: String): Self = this.set("responseCustomData", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

