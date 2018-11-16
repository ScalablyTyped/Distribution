package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides arguments for the PlayReady-ND RegistrationCompleted event. */

trait INDRegistrationCompletedEventArgs extends js.Object {
  /** Gets custom data from a registration response. */
  var responseCustomData: INDCustomData
  /** Gets or sets whether to accept or reject a transmitter's certificate. */
  var transmitterCertificateAccepted: scala.Boolean
  /** Gets transmitter properties from the transmitter's certificate to verify the transmitter. */
  var transmitterProperties: INDTransmitterProperties
}

