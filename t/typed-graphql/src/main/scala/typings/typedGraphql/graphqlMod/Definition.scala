package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.OperationDefinition
  - typings.typedGraphql.graphqlMod.FragmentDefinition
  - typings.typedGraphql.graphqlMod.TypeDefinition
*/
trait Definition extends StObject
object Definition {
  
  inline def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typings.typedGraphql.graphqlMod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumTypeDefinition]
  }
  
  inline def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typings.typedGraphql.graphqlMod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FragmentDefinition]
  }
  
  inline def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InputObjectTypeDefinition]
  }
  
  inline def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InterfaceTypeDefinition]
  }
  
  inline def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ObjectTypeDefinition]
  }
  
  inline def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typings.typedGraphql.graphqlMod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.OperationDefinition]
  }
  
  inline def ScalarTypeDefinition(kind: String, name: Name): typings.typedGraphql.graphqlMod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ScalarTypeDefinition]
  }
  
  inline def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typings.typedGraphql.graphqlMod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.TypeExtensionDefinition]
  }
  
  inline def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typings.typedGraphql.graphqlMod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.UnionTypeDefinition]
  }
}
