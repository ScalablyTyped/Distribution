package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// execution/*.js
@js.native
trait ExecutionContext extends js.Object {
  var errors: js.Array[GraphQLError] = js.native
  var fragments: StringDictionary[FragmentDefinition] = js.native
  var operation: OperationDefinition = js.native
  var rootValue: js.Any = js.native
  var schema: GraphQLSchema = js.native
  var variableValues: StringDictionary[js.Any] = js.native
}

object ExecutionContext {
  @scala.inline
  def apply(
    errors: js.Array[GraphQLError],
    fragments: StringDictionary[FragmentDefinition],
    operation: OperationDefinition,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContext]
  }
  @scala.inline
  implicit class ExecutionContextOps[Self <: ExecutionContext] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragments(value: StringDictionary[FragmentDefinition]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationDefinition): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableValues(value: StringDictionary[js.Any]): Self = this.set("variableValues", value.asInstanceOf[js.Any])
  }
  
}

