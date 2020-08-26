package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
@js.native
trait PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  var id: js.UndefOr[String] = js.native
}

object PublicKeyCredentialRpEntity {
  @scala.inline
  def apply(name: String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
  @scala.inline
  implicit class PublicKeyCredentialRpEntityOps[Self <: PublicKeyCredentialRpEntity] (val x: Self) extends AnyVal {
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
  }
  
}

