package typings.xadesjs.buildTypesSignedUnderscoreXmlMod

import typings.std.CryptoKey
import typings.xmldsigjs.buildTypesSignedUnderscoreXmlMod.OptionsSign
import typings.xmldsigjs.buildTypesSignedUnderscoreXmlMod.OptionsSignReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsXAdES extends OptionsSign {
  var policy: js.UndefOr[OptionsPolicyId | Boolean] = js.undefined
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
    policy: OptionsPolicyId | Boolean = null,
    productionPlace: OptionsProductionPlace = null,
    references: js.Array[OptionsSignReference] = null,
    signerRole: OptionsSignerRole = null,
    signingCertificate: String = null,
    signingTime: OptionsSigningTime = null,
    x509: js.Array[String] = null
  ): OptionsXAdES = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (productionPlace != null) __obj.updateDynamic("productionPlace")(productionPlace.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (signerRole != null) __obj.updateDynamic("signerRole")(signerRole.asInstanceOf[js.Any])
    if (signingCertificate != null) __obj.updateDynamic("signingCertificate")(signingCertificate.asInstanceOf[js.Any])
    if (signingTime != null) __obj.updateDynamic("signingTime")(signingTime.asInstanceOf[js.Any])
    if (x509 != null) __obj.updateDynamic("x509")(x509.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsXAdES]
  }
}

