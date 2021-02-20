package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionSchema extends StObject {
  
  var directives: js.Array[IntrospectionDirective] = js.native
  
  var mutationType: js.UndefOr[IntrospectionNamedTypeRef] = js.native
  
  var queryType: IntrospectionNamedTypeRef = js.native
  
  var subscriptionType: js.UndefOr[IntrospectionNamedTypeRef] = js.native
  
  var types: js.Array[IntrospectionType] = js.native
}
object IntrospectionSchema {
  
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef,
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
  
  @scala.inline
  implicit class IntrospectionSchemaMutableBuilder[Self <: IntrospectionSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: js.Array[IntrospectionDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: IntrospectionDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setMutationType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "mutationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationTypeUndefined: Self = StObject.set(x, "mutationType", js.undefined)
    
    @scala.inline
    def setQueryType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionType(value: IntrospectionNamedTypeRef): Self = StObject.set(x, "subscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionTypeUndefined: Self = StObject.set(x, "subscriptionType", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[IntrospectionType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: IntrospectionType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
