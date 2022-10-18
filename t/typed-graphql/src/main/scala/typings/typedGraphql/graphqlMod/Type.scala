package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.NamedType
  - typings.typedGraphql.graphqlMod.ListType
  - typings.typedGraphql.graphqlMod.NonNullType
*/
trait Type extends StObject
object Type {
  
  inline def ListType(kind: String, `type`: Type): typings.typedGraphql.graphqlMod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ListType]
  }
  
  inline def NamedType(kind: String, name: Name): typings.typedGraphql.graphqlMod.NamedType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.NamedType]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typings.typedGraphql.graphqlMod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.NonNullType]
  }
}
