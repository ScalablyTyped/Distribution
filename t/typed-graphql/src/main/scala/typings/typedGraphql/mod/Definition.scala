package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.OperationDefinition
  - typings.typedGraphql.mod.FragmentDefinition
  - typings.typedGraphql.mod.TypeDefinition
*/
trait Definition extends js.Object

object Definition {
  @scala.inline
  def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

