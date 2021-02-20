package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoObject extends StObject {
  
  var contact: js.UndefOr[ContactObject] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var license: js.UndefOr[LicenseObject] = js.native
  
  var termsOfService: js.UndefOr[String] = js.native
  
  var title: String = js.native
  
  var version: String = js.native
}
object InfoObject {
  
  @scala.inline
  def apply(title: String, version: String): InfoObject = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoObject]
  }
  
  @scala.inline
  implicit class InfoObjectMutableBuilder[Self <: InfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: ContactObject): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLicense(value: LicenseObject): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    @scala.inline
    def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
