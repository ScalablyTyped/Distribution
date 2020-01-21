package typings.xmldsigjs.signedXmlMod

import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSign extends js.Object {
  /**
    * Id of Signature
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Public key for KeyInfo block
    *
    * @type {boolean}
    * @memberOf OptionsSign
    */
  var keyValue: js.UndefOr[CryptoKey] = js.undefined
  /**
    * List of Reference
    * Default is Reference with hash alg SHA-256 and exc-c14n transform
    *
    * @type {OptionsSignReference[]}
    * @memberOf OptionsSign
    */
  var references: js.UndefOr[js.Array[OptionsSignReference]] = js.undefined
  /**
    * List of X509 Certificates
    *
    * @type {string[]}
    * @memberOf OptionsSign
    */
  var x509: js.UndefOr[js.Array[String]] = js.undefined
}

object OptionsSign {
  @scala.inline
  def apply(
    id: String = null,
    keyValue: CryptoKey = null,
    references: js.Array[OptionsSignReference] = null,
    x509: js.Array[String] = null
  ): OptionsSign = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (x509 != null) __obj.updateDynamic("x509")(x509.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSign]
  }
}

