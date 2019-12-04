package typings.xmldsigjs

import typings.xmldsigjs.typesPkijsMod.Certificate
import typings.xmldsigjs.typesPkijsMod.PublicKeyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IssuerCertificate extends js.Object {
  var issuerCertificate: js.UndefOr[Certificate] = js.undefined
  var publicKeyInfo: js.UndefOr[PublicKeyInfo] = js.undefined
}

object Anon_IssuerCertificate {
  @scala.inline
  def apply(issuerCertificate: Certificate = null, publicKeyInfo: PublicKeyInfo = null): Anon_IssuerCertificate = {
    val __obj = js.Dynamic.literal()
    if (issuerCertificate != null) __obj.updateDynamic("issuerCertificate")(issuerCertificate.asInstanceOf[js.Any])
    if (publicKeyInfo != null) __obj.updateDynamic("publicKeyInfo")(publicKeyInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IssuerCertificate]
  }
}

