package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.NamedType
  - typings.typedGraphql.mod.ListType
  - typings.typedGraphql.mod.NonNullType
*/
trait Type extends StObject
object Type {
  
  inline def ListType(kind: String, `type`: Type): typings.typedGraphql.mod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListType]
  }
  
  inline def NamedType(kind: String, name: Name): typings.typedGraphql.mod.NamedType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.NamedType]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typings.typedGraphql.mod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.NonNullType]
  }
}
