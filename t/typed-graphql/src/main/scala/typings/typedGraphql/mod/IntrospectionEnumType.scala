package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionEnumType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var enumValues: js.Array[IntrospectionEnumValue] = js.native
  
  var kind: ENUM = js.native
  
  var name: String = js.native
}
object IntrospectionEnumType {
  
  @scala.inline
  def apply(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumType]
  }
  
  @scala.inline
  implicit class IntrospectionEnumTypeMutableBuilder[Self <: IntrospectionEnumType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnumValues(value: js.Array[IntrospectionEnumValue]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValuesVarargs(value: IntrospectionEnumValue*): Self = StObject.set(x, "enumValues", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ENUM): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
