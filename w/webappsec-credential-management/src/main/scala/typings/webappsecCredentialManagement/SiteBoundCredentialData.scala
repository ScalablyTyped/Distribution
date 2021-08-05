package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-siteboundcredentialdata}
  */
trait SiteBoundCredentialData
  extends StObject
     with CredentialData {
  
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  var iconURL: js.UndefOr[String] = js.undefined
  
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SiteBoundCredentialData {
  
  inline def apply(id: String): SiteBoundCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteBoundCredentialData]
  }
  
  extension [Self <: SiteBoundCredentialData](x: Self) {
    
    inline def setIconURL(value: String): Self = StObject.set(x, "iconURL", value.asInstanceOf[js.Any])
    
    inline def setIconURLUndefined: Self = StObject.set(x, "iconURL", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
