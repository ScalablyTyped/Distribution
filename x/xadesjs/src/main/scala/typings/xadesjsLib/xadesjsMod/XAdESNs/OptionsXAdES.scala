package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsXAdES
  extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.OptionsSign {
  var policy: js.UndefOr[OptionsPolicyId] = js.undefined
  var productionPlace: js.UndefOr[OptionsProductionPlace] = js.undefined
  var signerRole: js.UndefOr[OptionsSignerRole] = js.undefined
  /**
    * Sets a certificate of signer for signature. Optional
    *
    * @type {string} base64 string of X509 certificate
    * @memberOf OptionsXAdES
    */
  var signingCertificate: js.UndefOr[java.lang.String] = js.undefined
}

