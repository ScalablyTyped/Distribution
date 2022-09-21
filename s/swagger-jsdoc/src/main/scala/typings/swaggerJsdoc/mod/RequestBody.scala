package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBody
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var content: StringDictionary[MediaType]
  
  var description: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object RequestBody {
  
  inline def apply(content: StringDictionary[MediaType]): RequestBody = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBody]
  }
  
  extension [Self <: RequestBody](x: Self) {
    
    inline def setContent(value: StringDictionary[MediaType]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
