package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: stdLib.BufferSource
  var transports: js.UndefOr[
    js.Array[
      webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.usb | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.nfc | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.ble | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.internal
    ]
  ] = js.undefined
  var `type`: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`public-key`
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(
    id: stdLib.BufferSource,
    `type`: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`public-key`,
    transports: js.Array[
      webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.usb | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.nfc | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.ble | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.internal
    ] = null
  ): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

