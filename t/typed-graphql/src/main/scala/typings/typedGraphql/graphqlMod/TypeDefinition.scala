package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Definition
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.ObjectTypeDefinition
  - typings.typedGraphql.graphqlMod.InterfaceTypeDefinition
  - typings.typedGraphql.graphqlMod.UnionTypeDefinition
  - typings.typedGraphql.graphqlMod.ScalarTypeDefinition
  - typings.typedGraphql.graphqlMod.EnumTypeDefinition
  - typings.typedGraphql.graphqlMod.InputObjectTypeDefinition
  - typings.typedGraphql.graphqlMod.TypeExtensionDefinition
*/
trait TypeDefinition
  extends StObject
     with Definition
object TypeDefinition {
  
  inline def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typings.typedGraphql.graphqlMod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumTypeDefinition]
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
