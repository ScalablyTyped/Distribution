package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  
  var name: String
}
object Tag {
  
  @scala.inline
  def apply(name: String): Tag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocs): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
