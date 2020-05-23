package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters for a query for certificates from the certificate store for an app. */
trait CertificateQuery extends js.Object {
  /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension to search for. */
  var enhancedKeyUsages: IVector[String]
  /** Gets or sets the certificate friendly name to search for. */
  var friendlyName: String
  /** Gets or sets a value that indicates whether only hardware certificates (SC or TPM) are to be returned from the query. */
  var hardwareOnly: Boolean
  /** Gets or sets whether to include duplicates. */
  var includeDuplicates: Boolean
  /** Gets or sets whether to include expired certificates. */
  var includeExpiredCertificates: Boolean
  /** Gets or sets the name of the certificate issuer to search for. */
  var issuerName: String
  /** Gets or sets the store name. */
  var storeName: String
  /** Gets or sets a certificate thumbprint to search for. */
  var thumbprint: Double
}

object CertificateQuery {
  @scala.inline
  def apply(
    enhancedKeyUsages: IVector[String],
    friendlyName: String,
    hardwareOnly: Boolean,
    includeDuplicates: Boolean,
    includeExpiredCertificates: Boolean,
    issuerName: String,
    storeName: String,
    thumbprint: Double
  ): CertificateQuery = {
    val __obj = js.Dynamic.literal(enhancedKeyUsages = enhancedKeyUsages.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hardwareOnly = hardwareOnly.asInstanceOf[js.Any], includeDuplicates = includeDuplicates.asInstanceOf[js.Any], includeExpiredCertificates = includeExpiredCertificates.asInstanceOf[js.Any], issuerName = issuerName.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateQuery]
  }
}

