package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDocumentationObject
  extends StObject
     with /* index */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var url: String
}
object ExternalDocumentationObject {
  
  inline def apply(url: String): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
  
  extension [Self <: ExternalDocumentationObject](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
