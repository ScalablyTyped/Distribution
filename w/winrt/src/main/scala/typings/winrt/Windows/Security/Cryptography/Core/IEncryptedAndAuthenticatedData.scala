package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEncryptedAndAuthenticatedData extends js.Object {
  var authenticationTag: IBuffer = js.native
  var encryptedData: IBuffer = js.native
}

object IEncryptedAndAuthenticatedData {
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
  @scala.inline
  implicit class IEncryptedAndAuthenticatedDataOps[Self <: IEncryptedAndAuthenticatedData] (val x: Self) extends AnyVal {
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
    def setAuthenticationTag(value: IBuffer): Self = this.set("authenticationTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptedData(value: IBuffer): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
  }
  
}

