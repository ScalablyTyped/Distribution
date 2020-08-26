package typings.xmldsigjs.signedXmlMod

import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSign extends js.Object {
  /**
    * Id of Signature
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Public key for KeyInfo block
    *
    * @type {boolean}
    * @memberOf OptionsSign
    */
  var keyValue: js.UndefOr[CryptoKey] = js.native
  /**
    * List of Reference
    * Default is Reference with hash alg SHA-256 and exc-c14n transform
    *
    * @type {OptionsSignReference[]}
    * @memberOf OptionsSign
    */
  var references: js.UndefOr[js.Array[OptionsSignReference]] = js.native
  /**
    * List of X509 Certificates
    *
    * @type {string[]}
    * @memberOf OptionsSign
    */
  var x509: js.UndefOr[js.Array[String]] = js.native
}

object OptionsSign {
  @scala.inline
  def apply(): OptionsSign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSign]
  }
  @scala.inline
  implicit class OptionsSignOps[Self <: OptionsSign] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyValue(value: CryptoKey): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
    @scala.inline
    def setReferencesVarargs(value: OptionsSignReference*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[OptionsSignReference]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setX509Varargs(value: String*): Self = this.set("x509", js.Array(value :_*))
    @scala.inline
    def setX509(value: js.Array[String]): Self = this.set("x509", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX509: Self = this.set("x509", js.undefined)
  }
  
}

