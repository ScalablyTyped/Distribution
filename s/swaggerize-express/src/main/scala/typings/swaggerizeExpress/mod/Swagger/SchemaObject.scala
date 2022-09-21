package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerizeExpress.mod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObject
  extends StObject
     with IJsonSchema
     with /* index */ StringDictionary[Any] {
  
  var discriminator: js.UndefOr[String] = js.undefined
  
  var example: Any
  
  var externalDocs: ExternalDocumentationObject
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var xml: js.UndefOr[XMLObject] = js.undefined
}
object SchemaObject {
  
  inline def apply(example: Any, externalDocs: ExternalDocumentationObject): SchemaObject = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any], externalDocs = externalDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
  
  extension [Self <: SchemaObject](x: Self) {
    
    inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setXml(value: XMLObject): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
