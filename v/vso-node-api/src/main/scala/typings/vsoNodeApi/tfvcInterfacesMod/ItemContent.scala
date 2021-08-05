package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemContent extends StObject {
  
  var content: String
  
  var contentType: ItemContentType
}
object ItemContent {
  
  inline def apply(content: String, contentType: ItemContentType): ItemContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContent]
  }
  
  extension [Self <: ItemContent](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ItemContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
