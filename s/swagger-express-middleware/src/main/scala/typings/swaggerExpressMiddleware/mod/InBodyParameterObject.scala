package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InBodyParameterObject
  extends StObject
     with ParameterObject {
  
  var schema: SchemaObject
}
object InBodyParameterObject {
  
  @scala.inline
  def apply(in: String, name: String, schema: SchemaObject): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBodyParameterObject]
  }
  
  @scala.inline
  implicit class InBodyParameterObjectMutableBuilder[Self <: InBodyParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
