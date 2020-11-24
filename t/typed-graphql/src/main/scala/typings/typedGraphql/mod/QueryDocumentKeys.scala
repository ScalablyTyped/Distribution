package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// language/visitor.js
@js.native
trait QueryDocumentKeys extends js.Object {
  
  var Argument: js.Array[String] = js.native
  
  var BooleanValue: js.Array[Boolean] = js.native
  
  var Directive: js.Array[String] = js.native
  
  var Document: js.Array[String] = js.native
  
  var EnumTypeDefinition: js.Array[String] = js.native
  
  var EnumValue: js.Array[_] = js.native
  
  var EnumValueDefinition: js.Array[String] = js.native
  
  var Field: js.Array[String] = js.native
  
  var FieldDefinition: js.Array[String] = js.native
  
  var FloatValue: js.Array[Double] = js.native
  
  var FragmentDefinition: js.Array[String] = js.native
  
  var FragmentSpread: js.Array[String] = js.native
  
  var InlineFragment: js.Array[String] = js.native
  
  var InputObjectTypeDefinition: js.Array[String] = js.native
  
  var InputValueDefinition: js.Array[String] = js.native
  
  var IntValue: js.Array[Double] = js.native
  
  var InterfaceTypeDefinition: js.Array[String] = js.native
  
  var ListType: js.Array[String] = js.native
  
  var ListValue: js.Array[String] = js.native
  
  var Name: js.Array[_] = js.native
  
  var NamedType: js.Array[String] = js.native
  
  var NonNullType: js.Array[String] = js.native
  
  var ObjectField: js.Array[String] = js.native
  
  var ObjectTypeDefinition: js.Array[String] = js.native
  
  var ObjectValue: js.Array[String] = js.native
  
  var OperationDefinition: js.Array[String] = js.native
  
  var ScalarTypeDefinition: js.Array[String] = js.native
  
  var SelectionSet: js.Array[String] = js.native
  
  var StringValue: js.Array[String] = js.native
  
  var TypeExtensionDefinition: js.Array[String] = js.native
  
  var UnionTypeDefinition: js.Array[String] = js.native
  
  var Variable: js.Array[String] = js.native
  
  var VariableDefinition: js.Array[String] = js.native
}
object QueryDocumentKeys {
  
  @scala.inline
  def apply(
    Argument: js.Array[String],
    BooleanValue: js.Array[Boolean],
    Directive: js.Array[String],
    Document: js.Array[String],
    EnumTypeDefinition: js.Array[String],
    EnumValue: js.Array[_],
    EnumValueDefinition: js.Array[String],
    Field: js.Array[String],
    FieldDefinition: js.Array[String],
    FloatValue: js.Array[Double],
    FragmentDefinition: js.Array[String],
    FragmentSpread: js.Array[String],
    InlineFragment: js.Array[String],
    InputObjectTypeDefinition: js.Array[String],
    InputValueDefinition: js.Array[String],
    IntValue: js.Array[Double],
    InterfaceTypeDefinition: js.Array[String],
    ListType: js.Array[String],
    ListValue: js.Array[String],
    Name: js.Array[_],
    NamedType: js.Array[String],
    NonNullType: js.Array[String],
    ObjectField: js.Array[String],
    ObjectTypeDefinition: js.Array[String],
    ObjectValue: js.Array[String],
    OperationDefinition: js.Array[String],
    ScalarTypeDefinition: js.Array[String],
    SelectionSet: js.Array[String],
    StringValue: js.Array[String],
    TypeExtensionDefinition: js.Array[String],
    UnionTypeDefinition: js.Array[String],
    Variable: js.Array[String],
    VariableDefinition: js.Array[String]
  ): QueryDocumentKeys = {
    val __obj = js.Dynamic.literal(Argument = Argument.asInstanceOf[js.Any], BooleanValue = BooleanValue.asInstanceOf[js.Any], Directive = Directive.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], EnumTypeDefinition = EnumTypeDefinition.asInstanceOf[js.Any], EnumValue = EnumValue.asInstanceOf[js.Any], EnumValueDefinition = EnumValueDefinition.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldDefinition = FieldDefinition.asInstanceOf[js.Any], FloatValue = FloatValue.asInstanceOf[js.Any], FragmentDefinition = FragmentDefinition.asInstanceOf[js.Any], FragmentSpread = FragmentSpread.asInstanceOf[js.Any], InlineFragment = InlineFragment.asInstanceOf[js.Any], InputObjectTypeDefinition = InputObjectTypeDefinition.asInstanceOf[js.Any], InputValueDefinition = InputValueDefinition.asInstanceOf[js.Any], IntValue = IntValue.asInstanceOf[js.Any], InterfaceTypeDefinition = InterfaceTypeDefinition.asInstanceOf[js.Any], ListType = ListType.asInstanceOf[js.Any], ListValue = ListValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedType = NamedType.asInstanceOf[js.Any], NonNullType = NonNullType.asInstanceOf[js.Any], ObjectField = ObjectField.asInstanceOf[js.Any], ObjectTypeDefinition = ObjectTypeDefinition.asInstanceOf[js.Any], ObjectValue = ObjectValue.asInstanceOf[js.Any], OperationDefinition = OperationDefinition.asInstanceOf[js.Any], ScalarTypeDefinition = ScalarTypeDefinition.asInstanceOf[js.Any], SelectionSet = SelectionSet.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], TypeExtensionDefinition = TypeExtensionDefinition.asInstanceOf[js.Any], UnionTypeDefinition = UnionTypeDefinition.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], VariableDefinition = VariableDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocumentKeys]
  }
  
  @scala.inline
  implicit class QueryDocumentKeysOps[Self <: QueryDocumentKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentVarargs(value: String*): Self = this.set("Argument", js.Array(value :_*))
    
    @scala.inline
    def setArgument(value: js.Array[String]): Self = this.set("Argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueVarargs(value: Boolean*): Self = this.set("BooleanValue", js.Array(value :_*))
    
    @scala.inline
    def setBooleanValue(value: js.Array[Boolean]): Self = this.set("BooleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveVarargs(value: String*): Self = this.set("Directive", js.Array(value :_*))
    
    @scala.inline
    def setDirective(value: js.Array[String]): Self = this.set("Directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVarargs(value: String*): Self = this.set("Document", js.Array(value :_*))
    
    @scala.inline
    def setDocument(value: js.Array[String]): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeDefinitionVarargs(value: String*): Self = this.set("EnumTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setEnumTypeDefinition(value: js.Array[String]): Self = this.set("EnumTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValueVarargs(value: js.Any*): Self = this.set("EnumValue", js.Array(value :_*))
    
    @scala.inline
    def setEnumValue(value: js.Array[_]): Self = this.set("EnumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValueDefinitionVarargs(value: String*): Self = this.set("EnumValueDefinition", js.Array(value :_*))
    
    @scala.inline
    def setEnumValueDefinition(value: js.Array[String]): Self = this.set("EnumValueDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldVarargs(value: String*): Self = this.set("Field", js.Array(value :_*))
    
    @scala.inline
    def setField(value: js.Array[String]): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDefinitionVarargs(value: String*): Self = this.set("FieldDefinition", js.Array(value :_*))
    
    @scala.inline
    def setFieldDefinition(value: js.Array[String]): Self = this.set("FieldDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueVarargs(value: Double*): Self = this.set("FloatValue", js.Array(value :_*))
    
    @scala.inline
    def setFloatValue(value: js.Array[Double]): Self = this.set("FloatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentDefinitionVarargs(value: String*): Self = this.set("FragmentDefinition", js.Array(value :_*))
    
    @scala.inline
    def setFragmentDefinition(value: js.Array[String]): Self = this.set("FragmentDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentSpreadVarargs(value: String*): Self = this.set("FragmentSpread", js.Array(value :_*))
    
    @scala.inline
    def setFragmentSpread(value: js.Array[String]): Self = this.set("FragmentSpread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineFragmentVarargs(value: String*): Self = this.set("InlineFragment", js.Array(value :_*))
    
    @scala.inline
    def setInlineFragment(value: js.Array[String]): Self = this.set("InlineFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputObjectTypeDefinitionVarargs(value: String*): Self = this.set("InputObjectTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setInputObjectTypeDefinition(value: js.Array[String]): Self = this.set("InputObjectTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueDefinitionVarargs(value: String*): Self = this.set("InputValueDefinition", js.Array(value :_*))
    
    @scala.inline
    def setInputValueDefinition(value: js.Array[String]): Self = this.set("InputValueDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueVarargs(value: Double*): Self = this.set("IntValue", js.Array(value :_*))
    
    @scala.inline
    def setIntValue(value: js.Array[Double]): Self = this.set("IntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeDefinitionVarargs(value: String*): Self = this.set("InterfaceTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceTypeDefinition(value: js.Array[String]): Self = this.set("InterfaceTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTypeVarargs(value: String*): Self = this.set("ListType", js.Array(value :_*))
    
    @scala.inline
    def setListType(value: js.Array[String]): Self = this.set("ListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListValueVarargs(value: String*): Self = this.set("ListValue", js.Array(value :_*))
    
    @scala.inline
    def setListValue(value: js.Array[String]): Self = this.set("ListValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: js.Any*): Self = this.set("Name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[_]): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedTypeVarargs(value: String*): Self = this.set("NamedType", js.Array(value :_*))
    
    @scala.inline
    def setNamedType(value: js.Array[String]): Self = this.set("NamedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonNullTypeVarargs(value: String*): Self = this.set("NonNullType", js.Array(value :_*))
    
    @scala.inline
    def setNonNullType(value: js.Array[String]): Self = this.set("NonNullType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFieldVarargs(value: String*): Self = this.set("ObjectField", js.Array(value :_*))
    
    @scala.inline
    def setObjectField(value: js.Array[String]): Self = this.set("ObjectField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeDefinitionVarargs(value: String*): Self = this.set("ObjectTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setObjectTypeDefinition(value: js.Array[String]): Self = this.set("ObjectTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectValueVarargs(value: String*): Self = this.set("ObjectValue", js.Array(value :_*))
    
    @scala.inline
    def setObjectValue(value: js.Array[String]): Self = this.set("ObjectValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationDefinitionVarargs(value: String*): Self = this.set("OperationDefinition", js.Array(value :_*))
    
    @scala.inline
    def setOperationDefinition(value: js.Array[String]): Self = this.set("OperationDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarTypeDefinitionVarargs(value: String*): Self = this.set("ScalarTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setScalarTypeDefinition(value: js.Array[String]): Self = this.set("ScalarTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSetVarargs(value: String*): Self = this.set("SelectionSet", js.Array(value :_*))
    
    @scala.inline
    def setSelectionSet(value: js.Array[String]): Self = this.set("SelectionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueVarargs(value: String*): Self = this.set("StringValue", js.Array(value :_*))
    
    @scala.inline
    def setStringValue(value: js.Array[String]): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeExtensionDefinitionVarargs(value: String*): Self = this.set("TypeExtensionDefinition", js.Array(value :_*))
    
    @scala.inline
    def setTypeExtensionDefinition(value: js.Array[String]): Self = this.set("TypeExtensionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionTypeDefinitionVarargs(value: String*): Self = this.set("UnionTypeDefinition", js.Array(value :_*))
    
    @scala.inline
    def setUnionTypeDefinition(value: js.Array[String]): Self = this.set("UnionTypeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableVarargs(value: String*): Self = this.set("Variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[String]): Self = this.set("Variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDefinitionVarargs(value: String*): Self = this.set("VariableDefinition", js.Array(value :_*))
    
    @scala.inline
    def setVariableDefinition(value: js.Array[String]): Self = this.set("VariableDefinition", value.asInstanceOf[js.Any])
  }
}
