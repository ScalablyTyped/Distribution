package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters for a query for certificates from the certificate store for an app. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateQuery")
@js.native
/** Creates a new instance of a certificate query. */
class CertificateQuery () extends js.Object {
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension to search for. */
  var enhancedKeyUsages: IVector[String] = js.native
  /** Gets or sets the certificate friendly name to search for. */
  var friendlyName: String = js.native
  /** Gets or sets a value that indicates whether only hardware certificates (SC or TPM) are to be returned from the query. */
  var hardwareOnly: Boolean = js.native
  /** Gets or sets whether to include duplicates. */
  var includeDuplicates: Boolean = js.native
  /** Gets or sets whether to include expired certificates. */
  var includeExpiredCertificates: Boolean = js.native
  /** Gets or sets the name of the certificate issuer to search for. */
  var issuerName: String = js.native
  /** Gets or sets the store name. */
  var storeName: String = js.native
  /** Gets or sets a certificate thumbprint to search for. */
  var thumbprint: Double = js.native
}

