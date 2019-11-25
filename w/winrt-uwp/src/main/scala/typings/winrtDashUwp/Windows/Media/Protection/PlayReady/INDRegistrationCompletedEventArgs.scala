package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides arguments for the PlayReady-ND RegistrationCompleted event. */
trait INDRegistrationCompletedEventArgs extends js.Object {
  /** Gets custom data from a registration response. */
  var responseCustomData: INDCustomData
  /** Gets or sets whether to accept or reject a transmitter's certificate. */
  var transmitterCertificateAccepted: Boolean
  /** Gets transmitter properties from the transmitter's certificate to verify the transmitter. */
  var transmitterProperties: INDTransmitterProperties
}

object INDRegistrationCompletedEventArgs {
  @scala.inline
  def apply(
    responseCustomData: INDCustomData,
    transmitterCertificateAccepted: Boolean,
    transmitterProperties: INDTransmitterProperties
  ): INDRegistrationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any], transmitterCertificateAccepted = transmitterCertificateAccepted.asInstanceOf[js.Any], transmitterProperties = transmitterProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDRegistrationCompletedEventArgs]
  }
}

