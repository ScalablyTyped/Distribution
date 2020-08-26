package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyGenOptions extends js.Object {
  var cert: js.UndefOr[String] = js.native
  var commonName: js.UndefOr[String] = js.native
  var entrust: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var subjectAltName: js.UndefOr[js.Array[String]] = js.native
}

object KeyGenOptions {
  @scala.inline
  def apply(): KeyGenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyGenOptions]
  }
  @scala.inline
  implicit class KeyGenOptionsOps[Self <: KeyGenOptions] (val x: Self) extends AnyVal {
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    @scala.inline
    def setEntrust(value: Boolean): Self = this.set("entrust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrust: Self = this.set("entrust", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setSubjectAltNameVarargs(value: String*): Self = this.set("subjectAltName", js.Array(value :_*))
    @scala.inline
    def setSubjectAltName(value: js.Array[String]): Self = this.set("subjectAltName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectAltName: Self = this.set("subjectAltName", js.undefined)
  }
  
}

