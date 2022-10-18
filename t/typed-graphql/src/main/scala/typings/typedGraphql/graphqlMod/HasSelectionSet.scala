package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.OperationDefinition
  - typings.typedGraphql.graphqlMod.FragmentDefinition
*/
trait HasSelectionSet extends StObject
object HasSelectionSet {
  
  inline def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typings.typedGraphql.graphqlMod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FragmentDefinition]
  }
  
  inline def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typings.typedGraphql.graphqlMod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.OperationDefinition]
  }
}
