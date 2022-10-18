package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.IntrospectionNamedTypeRef
  - typings.typedGraphql.graphqlMod.IntrospectionListTypeRef
  - typings.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef
*/
trait IntrospectionTypeRef extends StObject
object IntrospectionTypeRef {
  
  inline def IntrospectionListTypeRef(): typings.typedGraphql.graphqlMod.IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = "LIST")
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.IntrospectionListTypeRef]
  }
  
  inline def IntrospectionNamedTypeRef(kind: String, name: String): typings.typedGraphql.graphqlMod.IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.IntrospectionNamedTypeRef]
  }
  
  inline def IntrospectionNonNullTypeRef(): typings.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = "NON_NULL")
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef]
  }
}
