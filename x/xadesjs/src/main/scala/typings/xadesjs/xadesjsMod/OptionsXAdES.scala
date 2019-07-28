package typings.xadesjs.xadesjsMod

import typings.std.CryptoKey
import typings.xmldsigjs.xmldsigjsMod.OptionsSign
import typings.xmldsigjs.xmldsigjsMod.OptionsSignReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsXAdES extends OptionsSign {
  var policy: js.UndefOr[OptionsPolicyId] = js.undefined
  var productionPlace: js.UndefOr[OptionsProductionPlace] = js.undefined
  var signerRole: js.UndefOr[OptionsSignerRole] = js.undefined
  /**
    * Sets a certificate of signer for signature. Optional
    *
    * @type {string} base64 string of X509 certificate
    * @memberOf OptionsXAdES
    */
  var signingCertificate: js.UndefOr[String] = js.undefined
  /**
    * Sets signing time options
    */
  var signingTime: js.UndefOr[OptionsSigningTime] = js.undefined
}

object OptionsXAdES {
  @scala.inline
  def apply(
    id: String = null,
    keyValue: CryptoKey = null,
    policy: OptionsPolicyId = null,
    productionPlace: OptionsProductionPlace = null,
    references: js.Array[OptionsSignReference] = null,
    signerRole: OptionsSignerRole = null,
    signingCertificate: String = null,
    signingTime: OptionsSigningTime = null,
    x509: js.Array[String] = null
  ): OptionsXAdES = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (productionPlace != null) __obj.updateDynamic("productionPlace")(productionPlace)
    if (references != null) __obj.updateDynamic("references")(references)
    if (signerRole != null) __obj.updateDynamic("signerRole")(signerRole)
    if (signingCertificate != null) __obj.updateDynamic("signingCertificate")(signingCertificate)
    if (signingTime != null) __obj.updateDynamic("signingTime")(signingTime)
    if (x509 != null) __obj.updateDynamic("x509")(x509)
    __obj.asInstanceOf[OptionsXAdES]
  }
}

