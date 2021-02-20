package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
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
  implicit class SiteBoundCredentialMutableBuilder[Self <: SiteBoundCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconURL(value: String): Self = StObject.set(x, "iconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURLNull: Self = StObject.set(x, "iconURL", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
  }
}
