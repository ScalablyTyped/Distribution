package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialuserentity}
  */
trait PublicKeyCredentialUserEntity extends js.Object {
  var displayName: java.lang.String
  var id: stdLib.BufferSource
  var name: java.lang.String
}

object PublicKeyCredentialUserEntity {
  @scala.inline
  def apply(displayName: java.lang.String, id: stdLib.BufferSource, name: java.lang.String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, name = name)
  
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
}

