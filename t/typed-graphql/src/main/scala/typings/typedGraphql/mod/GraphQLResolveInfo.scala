package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResolveInfo extends js.Object {
  var fieldASTs: js.Array[Field] = js.native
  var fieldName: String = js.native
  var fragments: StringDictionary[FragmentDefinition] = js.native
  var operation: OperationDefinition = js.native
  var parentType: GraphQLCompositeType = js.native
  var returnType: GraphQLOutputType = js.native
  var rootValue: js.Any = js.native
  var schema: GraphQLSchema = js.native
  var variableValues: StringDictionary[js.Any] = js.native
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(
    fieldASTs: js.Array[Field],
    fieldName: String,
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    parentType: GraphQLCompositeType,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldASTs = fieldASTs.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
  @scala.inline
  implicit class GraphQLResolveInfoOps[Self <: GraphQLResolveInfo] (val x: Self) extends AnyVal {
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
    def setFieldASTsVarargs(value: Field*): Self = this.set("fieldASTs", js.Array(value :_*))
    @scala.inline
    def setFieldASTs(value: js.Array[Field]): Self = this.set("fieldASTs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragments(value: StringDictionary[FragmentDefinition]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationDefinition): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentType(value: GraphQLCompositeType): Self = this.set("parentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GraphQLOutputType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableValues(value: StringDictionary[js.Any]): Self = this.set("variableValues", value.asInstanceOf[js.Any])
  }
  
}

