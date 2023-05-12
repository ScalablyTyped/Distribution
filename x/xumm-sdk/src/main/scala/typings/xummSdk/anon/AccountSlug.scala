package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSlug extends StObject {
  
  var accountSlug: String | Null
  
  var payString: String | Null
  
  var profileUrl: String | Null
  
  var slug: String | Null
}
object AccountSlug {
  
  inline def apply(): AccountSlug = {
    val __obj = js.Dynamic.literal(accountSlug = null, payString = null, profileUrl = null, slug = null)
    __obj.asInstanceOf[AccountSlug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSlug] (val x: Self) extends AnyVal {
    
    inline def setAccountSlug(value: String): Self = StObject.set(x, "accountSlug", value.asInstanceOf[js.Any])
    
    inline def setAccountSlugNull: Self = StObject.set(x, "accountSlug", null)
    
    inline def setPayString(value: String): Self = StObject.set(x, "payString", value.asInstanceOf[js.Any])
    
    inline def setPayStringNull: Self = StObject.set(x, "payString", null)
    
    inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlNull: Self = StObject.set(x, "profileUrl", null)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugNull: Self = StObject.set(x, "slug", null)
  }
}
