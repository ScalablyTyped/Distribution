package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationContext extends js.Object {
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getDocument(): Document
  def getErrors(): js.Array[GraphQLError]
  def getFieldDef(): GraphQLFieldDefinition
  def getFragment(name: java.lang.String): FragmentDefinition
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread]
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage]
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition]
  def getSchema(): GraphQLSchema
  def getType(): GraphQLOutputType
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage]
  def reportError(error: GraphQLError): scala.Unit
}

object ValidationContext {
  @scala.inline
  def apply(
    getArgument: js.Function0[GraphQLArgument],
    getDirective: js.Function0[GraphQLDirective],
    getDocument: js.Function0[Document],
    getErrors: js.Function0[js.Array[GraphQLError]],
    getFieldDef: js.Function0[GraphQLFieldDefinition],
    getFragment: js.Function1[java.lang.String, FragmentDefinition],
    getFragmentSpreads: js.Function1[SelectionSet, js.Array[FragmentSpread]],
    getInputType: js.Function0[GraphQLInputType],
    getParentType: js.Function0[GraphQLCompositeType],
    getRecursiveVariableUsages: js.Function1[OperationDefinition, js.Array[VariableUsage]],
    getRecursivelyReferencedFragments: js.Function1[OperationDefinition, js.Array[FragmentDefinition]],
    getSchema: js.Function0[GraphQLSchema],
    getType: js.Function0[GraphQLOutputType],
    getVariableUsages: js.Function1[HasSelectionSet, js.Array[VariableUsage]],
    reportError: js.Function1[GraphQLError, scala.Unit]
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = getArgument, getDirective = getDirective, getDocument = getDocument, getErrors = getErrors, getFieldDef = getFieldDef, getFragment = getFragment, getFragmentSpreads = getFragmentSpreads, getInputType = getInputType, getParentType = getParentType, getRecursiveVariableUsages = getRecursiveVariableUsages, getRecursivelyReferencedFragments = getRecursivelyReferencedFragments, getSchema = getSchema, getType = getType, getVariableUsages = getVariableUsages, reportError = reportError)
  
    __obj.asInstanceOf[ValidationContext]
  }
}

