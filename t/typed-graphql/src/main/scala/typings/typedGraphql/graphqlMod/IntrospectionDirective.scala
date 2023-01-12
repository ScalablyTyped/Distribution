package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionDirective extends StObject {
  
  var args: js.Array[IntrospectionInputValue]
  
  var description: js.UndefOr[String] = js.undefined
  
  var locations: js.Array[DirectiveLocationEnum]
  
  var name: String
}
object IntrospectionDirective {
  
  inline def apply(args: js.Array[IntrospectionInputValue], locations: js.Array[DirectiveLocationEnum], name: String): IntrospectionDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntrospectionDirective] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[IntrospectionInputValue]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: IntrospectionInputValue*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocations(value: js.Array[DirectiveLocationEnum]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: DirectiveLocationEnum*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
