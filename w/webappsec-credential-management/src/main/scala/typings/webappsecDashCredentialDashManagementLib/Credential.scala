package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic and extensible Credential interface from which all credentials
  * will inherit.
  * @see {@link https://www.w3.org/TR/credential-management-1/#credential}
  */
trait Credential extends js.Object {
  /**
    * The credential’s identifier. This might be a GUID, username, or email
    * address, for instance.
    */
  val id: java.lang.String
  /**
    * The credential’s type.
    */
  val `type`: java.lang.String
}

object Credential {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): Credential = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Credential]
  }
}

