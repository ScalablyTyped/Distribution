package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents values to use when verifying a certificate chain. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationParameters")
@js.native
/** Creates a new instance of the ChainValidationParameters class. */
class ChainValidationParameters () extends js.Object {
  /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
  var certificateChainPolicy: CertificateChainPolicy = js.native
  /** Gets or sets the server DNS name to use for SSL policy. */
  var serverDnsName: HostName = js.native
}

