package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents signer information for a signed CMS message which contains a set of properties. */
@js.native
trait CmsSignerInfo extends js.Object {
  /** Gets or sets the signer certificate that is used to sign the message. */
  var certificate: Certificate = js.native
  /** Gets or sets the hash algorithm that is used to sign the CMS message. */
  var hashAlgorithmName: String = js.native
  /** Gets the RFC3161 unauthenticated timestamp information. */
  var timestampInfo: CmsTimestampInfo = js.native
}

object CmsSignerInfo {
  @scala.inline
  def apply(certificate: Certificate, hashAlgorithmName: String, timestampInfo: CmsTimestampInfo): CmsSignerInfo = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], timestampInfo = timestampInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsSignerInfo]
  }
  @scala.inline
  implicit class CmsSignerInfoOps[Self <: CmsSignerInfo] (val x: Self) extends AnyVal {
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
    def setCertificate(value: Certificate): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlgorithmName(value: String): Self = this.set("hashAlgorithmName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampInfo(value: CmsTimestampInfo): Self = this.set("timestampInfo", value.asInstanceOf[js.Any])
  }
  
}

