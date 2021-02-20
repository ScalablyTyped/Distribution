package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionDirective extends StObject {
  
  var args: js.Array[IntrospectionInputValue] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var locations: js.Array[DirectiveLocationEnum] = js.native
  
  var name: String = js.native
}
object IntrospectionDirective {
  
  @scala.inline
  def apply(args: js.Array[IntrospectionInputValue], locations: js.Array[DirectiveLocationEnum], name: String): IntrospectionDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
  
  @scala.inline
  implicit class IntrospectionDirectiveMutableBuilder[Self <: IntrospectionDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[IntrospectionInputValue]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: IntrospectionInputValue*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[DirectiveLocationEnum]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: DirectiveLocationEnum*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
