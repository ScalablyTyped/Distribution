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
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getDocument: () => Document,
    getErrors: () => js.Array[GraphQLError],
    getFieldDef: () => GraphQLFieldDefinition,
    getFragment: java.lang.String => FragmentDefinition,
    getFragmentSpreads: SelectionSet => js.Array[FragmentSpread],
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getRecursiveVariableUsages: OperationDefinition => js.Array[VariableUsage],
    getRecursivelyReferencedFragments: OperationDefinition => js.Array[FragmentDefinition],
    getSchema: () => GraphQLSchema,
    getType: () => GraphQLOutputType,
    getVariableUsages: HasSelectionSet => js.Array[VariableUsage],
    reportError: GraphQLError => scala.Unit
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getDocument = js.Any.fromFunction0(getDocument), getErrors = js.Any.fromFunction0(getErrors), getFieldDef = js.Any.fromFunction0(getFieldDef), getFragment = js.Any.fromFunction1(getFragment), getFragmentSpreads = js.Any.fromFunction1(getFragmentSpreads), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getRecursiveVariableUsages = js.Any.fromFunction1(getRecursiveVariableUsages), getRecursivelyReferencedFragments = js.Any.fromFunction1(getRecursivelyReferencedFragments), getSchema = js.Any.fromFunction0(getSchema), getType = js.Any.fromFunction0(getType), getVariableUsages = js.Any.fromFunction1(getVariableUsages), reportError = js.Any.fromFunction1(reportError))
  
    __obj.asInstanceOf[ValidationContext]
  }
}

