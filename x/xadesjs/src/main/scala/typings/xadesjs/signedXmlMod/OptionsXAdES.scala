package typings.xadesjs.signedXmlMod

import typings.xmldsigjs.signedXmlMod.OptionsSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsXAdES extends OptionsSign {
  var policy: js.UndefOr[OptionsPolicyId | Boolean] = js.native
  var productionPlace: js.UndefOr[OptionsProductionPlace] = js.native
  var signerRole: js.UndefOr[OptionsSignerRole] = js.native
  /**
    * Sets a certificate of signer for signature. Optional
    *
    * @type {string} base64 string of X509 certificate
    * @memberOf OptionsXAdES
    */
  var signingCertificate: js.UndefOr[String] = js.native
  /**
    * Sets signing time options
    */
  var signingTime: js.UndefOr[OptionsSigningTime] = js.native
}

object OptionsXAdES {
  @scala.inline
  def apply(): OptionsXAdES = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsXAdES]
  }
  @scala.inline
  implicit class OptionsXAdESOps[Self <: OptionsXAdES] (val x: Self) extends AnyVal {
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
    def setPolicy(value: OptionsPolicyId | Boolean): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setProductionPlace(value: OptionsProductionPlace): Self = this.set("productionPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductionPlace: Self = this.set("productionPlace", js.undefined)
    @scala.inline
    def setSignerRole(value: OptionsSignerRole): Self = this.set("signerRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignerRole: Self = this.set("signerRole", js.undefined)
    @scala.inline
    def setSigningCertificate(value: String): Self = this.set("signingCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningCertificate: Self = this.set("signingCertificate", js.undefined)
    @scala.inline
    def setSigningTime(value: OptionsSigningTime): Self = this.set("signingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningTime: Self = this.set("signingTime", js.undefined)
  }
  
}

