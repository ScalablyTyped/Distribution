package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerizeExpress.mod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any] {
  
  var discriminator: js.UndefOr[String] = js.native
  
  var example: js.Any = js.native
  
  var externalDocs: ExternalDocumentationObject = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var xml: js.UndefOr[XMLObject] = js.native
}
object SchemaObject {
  
  @scala.inline
  def apply(example: js.Any, externalDocs: ExternalDocumentationObject): SchemaObject = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any], externalDocs = externalDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  implicit class SchemaObjectMutableBuilder[Self <: SchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setXml(value: XMLObject): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
