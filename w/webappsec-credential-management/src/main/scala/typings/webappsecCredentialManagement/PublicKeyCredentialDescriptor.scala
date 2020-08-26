package typings.webappsecCredentialManagement

import typings.std.BufferSource
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.ble
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.internal
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.nfc
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.usb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
@js.native
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource = js.native
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.native
  var `type`: `public-key` = js.native
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(id: BufferSource, `type`: `public-key`): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  @scala.inline
  implicit class PublicKeyCredentialDescriptorOps[Self <: PublicKeyCredentialDescriptor] (val x: Self) extends AnyVal {
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
    def setId(value: BufferSource): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `public-key`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportsVarargs(value: (usb | nfc | ble | internal)*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[usb | nfc | ble | internal]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
  }
  
}

