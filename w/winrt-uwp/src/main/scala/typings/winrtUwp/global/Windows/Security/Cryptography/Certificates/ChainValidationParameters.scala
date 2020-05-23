package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents values to use when verifying a certificate chain. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationParameters")
@js.native
/** Creates a new instance of the ChainValidationParameters class. */
class ChainValidationParameters ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationParameters {
  /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
  /* CompleteClass */
  override var certificateChainPolicy: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy = js.native
  /** Gets or sets the server DNS name to use for SSL policy. */
  /* CompleteClass */
  override var serverDnsName: HostName = js.native
}

