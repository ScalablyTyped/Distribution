package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseObject
  extends StObject
     with Response {
  
  var description: String
  
  var examples: js.UndefOr[ExampleObject] = js.undefined
  
  var headers: js.UndefOr[HeadersObject] = js.undefined
  
  var schema: js.UndefOr[SchemaObject] = js.undefined
}
object ResponseObject {
  
  @scala.inline
  def apply(description: String): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  implicit class ResponseObjectMutableBuilder[Self <: ResponseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamples(value: ExampleObject): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeadersObject): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
