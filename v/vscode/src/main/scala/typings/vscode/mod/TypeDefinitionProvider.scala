package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDefinitionProvider extends StObject {
  
  /**
    * Provide the type definition of the symbol at the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @return A definition or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideTypeDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[DefinitionLink]] = js.native
}
object TypeDefinitionProvider {
  
  @scala.inline
  def apply(
    provideTypeDefinition: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
  ): TypeDefinitionProvider = {
    val __obj = js.Dynamic.literal(provideTypeDefinition = js.Any.fromFunction3(provideTypeDefinition))
    __obj.asInstanceOf[TypeDefinitionProvider]
  }
  
  @scala.inline
  implicit class TypeDefinitionProviderMutableBuilder[Self <: TypeDefinitionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideTypeDefinition(
      value: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
    ): Self = StObject.set(x, "provideTypeDefinition", js.Any.fromFunction3(value))
  }
}
