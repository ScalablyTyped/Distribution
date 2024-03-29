package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyParameter
  extends StObject
     with BaseParameter {
  
  @JSName("in")
  var in_BodyParameter: body
  
  var schema: js.UndefOr[Schema] = js.undefined
}
object BodyParameter {
  
  inline def apply(name: String): BodyParameter = {
    val __obj = js.Dynamic.literal(in = "body", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyParameter] (val x: Self) extends AnyVal {
    
    inline def setIn(value: body): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
