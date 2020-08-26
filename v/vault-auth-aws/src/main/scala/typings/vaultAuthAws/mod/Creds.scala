package typings.vaultAuthAws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Creds extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.native
  var secretAccessKey: js.UndefOr[String] = js.native
  var sessionToken: js.UndefOr[String] = js.native
}

object Creds {
  @scala.inline
  def apply(): Creds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creds]
  }
  @scala.inline
  implicit class CredsOps[Self <: Creds] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
  
}

