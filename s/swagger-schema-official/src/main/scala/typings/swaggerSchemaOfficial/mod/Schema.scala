package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema
  extends StObject
     with BaseSchema {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var additionalProperties: js.UndefOr[Schema | Boolean] = js.undefined
  
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  
  var discriminator: js.UndefOr[String] = js.undefined
  
  var example: js.UndefOr[js.Any] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[Schema]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var xml: js.UndefOr[XML] = js.undefined
}
object Schema {
  
  @scala.inline
  def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: Schema | Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOf(value: js.Array[Schema]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: Schema*): Self = StObject.set(x, "allOf", js.Array(value :_*))
    
    @scala.inline
    def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocs): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[Schema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setXml(value: XML): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
