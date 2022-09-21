package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Information
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var contact: js.UndefOr[Contact] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var license: js.UndefOr[License] = js.undefined
  
  var termsOfService: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var version: String
}
object Information {
  
  inline def apply(title: String, version: String): Information = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Information]
  }
  
  extension [Self <: Information](x: Self) {
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLicense(value: License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
