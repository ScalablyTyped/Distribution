package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.LIST
import typings.typedGraphql.typedGraphqlStrings.NON_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.IntrospectionNamedTypeRef
  - typings.typedGraphql.mod.IntrospectionListTypeRef
  - typings.typedGraphql.mod.IntrospectionNonNullTypeRef
*/
trait IntrospectionTypeRef extends StObject
object IntrospectionTypeRef {
  
  @scala.inline
  def IntrospectionListTypeRef(kind: LIST): typings.typedGraphql.mod.IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionListTypeRef]
  }
  
  @scala.inline
  def IntrospectionNamedTypeRef(kind: String, name: String): typings.typedGraphql.mod.IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionNamedTypeRef]
  }
  
  @scala.inline
  def IntrospectionNonNullTypeRef(kind: NON_NULL): typings.typedGraphql.mod.IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionNonNullTypeRef]
  }
}
