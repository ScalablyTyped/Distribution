package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-siteboundcredentialdata}
  */
@js.native
trait SiteBoundCredentialData extends CredentialData {
  
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  var iconURL: js.UndefOr[String] = js.native
  
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  var name: js.UndefOr[String] = js.native
}
object SiteBoundCredentialData {
  
  @scala.inline
  def apply(id: String): SiteBoundCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteBoundCredentialData]
  }
  
  @scala.inline
  implicit class SiteBoundCredentialDataMutableBuilder[Self <: SiteBoundCredentialData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconURL(value: String): Self = StObject.set(x, "iconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURLUndefined: Self = StObject.set(x, "iconURL", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
