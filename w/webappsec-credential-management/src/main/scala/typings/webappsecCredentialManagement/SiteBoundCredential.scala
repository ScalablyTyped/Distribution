package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the specific attributes shared by any Credential persisted in user
  * agent’s credential
  * store.
  */
// tslint:disable-next-line no-empty-interface
@js.native
trait SiteBoundCredential extends Credential {
  
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  val iconURL: String | Null = js.native
  
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  val name: String | Null = js.native
}
object SiteBoundCredential {
  
  @scala.inline
  def apply(id: String, `type`: String): SiteBoundCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteBoundCredential]
  }
  
  @scala.inline
  implicit class SiteBoundCredentialOps[Self <: SiteBoundCredential] (val x: Self) extends AnyVal {
    
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
    def setIconURL(value: String): Self = this.set("iconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURLNull: Self = this.set("iconURL", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
