package typings.webappsecDashCredentialDashManagement

import typings.std.BufferSource
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.`public-key`
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.ble
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.internal
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.nfc
import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.usb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.undefined
  var `type`: `public-key`
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(id: BufferSource, `type`: `public-key`, transports: js.Array[usb | nfc | ble | internal] = null): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

