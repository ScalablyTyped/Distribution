package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionProvider extends StObject {
  
  /**
    * Provide the definition of the symbol at the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @return A definition or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[DefinitionLink]]
}
object DefinitionProvider {
  
  inline def apply(
    provideDefinition: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal(provideDefinition = js.Any.fromFunction3(provideDefinition))
    __obj.asInstanceOf[DefinitionProvider]
  }
  
  extension [Self <: DefinitionProvider](x: Self) {
    
    inline def setProvideDefinition(
      value: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
    ): Self = StObject.set(x, "provideDefinition", js.Any.fromFunction3(value))
  }
}
