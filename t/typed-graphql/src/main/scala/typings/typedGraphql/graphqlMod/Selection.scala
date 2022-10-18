package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.Field
  - typings.typedGraphql.graphqlMod.FragmentSpread
  - typings.typedGraphql.graphqlMod.InlineFragment
*/
trait Selection extends StObject
object Selection {
  
  inline def Field(kind: String, name: Name): typings.typedGraphql.graphqlMod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Field]
  }
  
  inline def FragmentSpread(kind: String, name: Name): typings.typedGraphql.graphqlMod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FragmentSpread]
  }
  
  inline def InlineFragment(kind: String, selectionSet: SelectionSet): typings.typedGraphql.graphqlMod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InlineFragment]
  }
}
