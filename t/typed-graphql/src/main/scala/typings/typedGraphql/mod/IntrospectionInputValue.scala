package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionInputValue extends StObject {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `type`: IntrospectionTypeRef = js.native
}
object IntrospectionInputValue {
  
  @scala.inline
  def apply(name: String, `type`: IntrospectionTypeRef): IntrospectionInputValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputValue]
  }
  
  @scala.inline
  implicit class IntrospectionInputValueMutableBuilder[Self <: IntrospectionInputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IntrospectionTypeRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
