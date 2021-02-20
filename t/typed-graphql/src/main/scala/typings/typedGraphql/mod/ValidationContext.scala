package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationContext extends StObject {
  
  def getArgument(): GraphQLArgument = js.native
  
  def getDirective(): GraphQLDirective = js.native
  
  def getDocument(): Document = js.native
  
  def getErrors(): js.Array[GraphQLError] = js.native
  
  def getFieldDef(): GraphQLFieldDefinition = js.native
  
  def getFragment(name: String): FragmentDefinition = js.native
  
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread] = js.native
  
  def getInputType(): GraphQLInputType = js.native
  
  def getParentType(): GraphQLCompositeType = js.native
  
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage] = js.native
  
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition] = js.native
  
  def getSchema(): GraphQLSchema = js.native
  
  def getType(): GraphQLOutputType = js.native
  
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage] = js.native
  
  def reportError(error: GraphQLError): Unit = js.native
}
object ValidationContext {
  
  @scala.inline
  def apply(
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getDocument: () => Document,
    getErrors: () => js.Array[GraphQLError],
    getFieldDef: () => GraphQLFieldDefinition,
    getFragment: String => FragmentDefinition,
    getFragmentSpreads: SelectionSet => js.Array[FragmentSpread],
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getRecursiveVariableUsages: OperationDefinition => js.Array[VariableUsage],
    getRecursivelyReferencedFragments: OperationDefinition => js.Array[FragmentDefinition],
    getSchema: () => GraphQLSchema,
    getType: () => GraphQLOutputType,
    getVariableUsages: HasSelectionSet => js.Array[VariableUsage],
    reportError: GraphQLError => Unit
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getDocument = js.Any.fromFunction0(getDocument), getErrors = js.Any.fromFunction0(getErrors), getFieldDef = js.Any.fromFunction0(getFieldDef), getFragment = js.Any.fromFunction1(getFragment), getFragmentSpreads = js.Any.fromFunction1(getFragmentSpreads), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getRecursiveVariableUsages = js.Any.fromFunction1(getRecursiveVariableUsages), getRecursivelyReferencedFragments = js.Any.fromFunction1(getRecursivelyReferencedFragments), getSchema = js.Any.fromFunction0(getSchema), getType = js.Any.fromFunction0(getType), getVariableUsages = js.Any.fromFunction1(getVariableUsages), reportError = js.Any.fromFunction1(reportError))
    __obj.asInstanceOf[ValidationContext]
  }
  
  @scala.inline
  implicit class ValidationContextMutableBuilder[Self <: ValidationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetArgument(value: () => GraphQLArgument): Self = StObject.set(x, "getArgument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirective(value: () => GraphQLDirective): Self = StObject.set(x, "getDirective", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocument(value: () => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrors(value: () => js.Array[GraphQLError]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldDef(value: () => GraphQLFieldDefinition): Self = StObject.set(x, "getFieldDef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFragment(value: String => FragmentDefinition): Self = StObject.set(x, "getFragment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFragmentSpreads(value: SelectionSet => js.Array[FragmentSpread]): Self = StObject.set(x, "getFragmentSpreads", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInputType(value: () => GraphQLInputType): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentType(value: () => GraphQLCompositeType): Self = StObject.set(x, "getParentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecursiveVariableUsages(value: OperationDefinition => js.Array[VariableUsage]): Self = StObject.set(x, "getRecursiveVariableUsages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRecursivelyReferencedFragments(value: OperationDefinition => js.Array[FragmentDefinition]): Self = StObject.set(x, "getRecursivelyReferencedFragments", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSchema(value: () => GraphQLSchema): Self = StObject.set(x, "getSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => GraphQLOutputType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVariableUsages(value: HasSelectionSet => js.Array[VariableUsage]): Self = StObject.set(x, "getVariableUsages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportError(value: GraphQLError => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
  }
}
