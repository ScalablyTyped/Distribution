package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents parameters for a query for certificates from the certificate store for an app. */
@js.native
trait CertificateQuery extends js.Object {
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
  @scala.inline
  implicit class CertificateQueryOps[Self <: CertificateQuery] (val x: Self) extends AnyVal {
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
    def setEnhancedKeyUsages(value: IVector[String]): Self = this.set("enhancedKeyUsages", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHardwareOnly(value: Boolean): Self = this.set("hardwareOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDuplicates(value: Boolean): Self = this.set("includeDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeExpiredCertificates(value: Boolean): Self = this.set("includeExpiredCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuerName(value: String): Self = this.set("issuerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbprint(value: Double): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
  }
  
}

