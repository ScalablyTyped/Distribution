package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialdata}
  */
trait CredentialData extends js.Object {
  /**
    * The credential’s identifier. This might be a GUID, username, or email
    * address, for instance.
    */
  val id: String
}

object CredentialData {
  @scala.inline
  def apply(id: String): CredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialData]
  }
}

