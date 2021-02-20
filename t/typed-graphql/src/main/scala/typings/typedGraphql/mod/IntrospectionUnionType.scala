package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionUnionType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var kind: UNION = js.native
  
  var name: String = js.native
  
  var possibleTypes: js.Array[IntrospectionNamedTypeRef] = js.native
}
object IntrospectionUnionType {
  
  @scala.inline
  def apply(kind: UNION, name: String, possibleTypes: js.Array[IntrospectionNamedTypeRef]): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
  
  @scala.inline
  implicit class IntrospectionUnionTypeMutableBuilder[Self <: IntrospectionUnionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: UNION): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleTypes(value: js.Array[IntrospectionNamedTypeRef]): Self = StObject.set(x, "possibleTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleTypesVarargs(value: IntrospectionNamedTypeRef*): Self = StObject.set(x, "possibleTypes", js.Array(value :_*))
  }
}
