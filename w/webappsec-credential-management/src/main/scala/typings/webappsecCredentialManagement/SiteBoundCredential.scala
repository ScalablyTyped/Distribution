package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the specific attributes shared by any Credential persisted in user
  * agent’s credential
  * store.
  */
// tslint:disable-next-line no-empty-interface
trait SiteBoundCredential extends Credential {
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  val iconURL: String | Null
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  val name: String | Null
}

object SiteBoundCredential {
  @scala.inline
  def apply(id: String, `type`: String, iconURL: String = null, name: String = null): SiteBoundCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iconURL = iconURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteBoundCredential]
  }
}

