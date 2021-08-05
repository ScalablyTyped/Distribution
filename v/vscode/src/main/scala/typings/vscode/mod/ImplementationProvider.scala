package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationProvider extends StObject {
  
  /**
    * Provide the implementations of the symbol at the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @return A definition or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideImplementation(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[DefinitionLink]]
}
object ImplementationProvider {
  
  inline def apply(
    provideImplementation: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
  ): ImplementationProvider = {
    val __obj = js.Dynamic.literal(provideImplementation = js.Any.fromFunction3(provideImplementation))
    __obj.asInstanceOf[ImplementationProvider]
  }
  
  extension [Self <: ImplementationProvider](x: Self) {
    
    inline def setProvideImplementation(
      value: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
    ): Self = StObject.set(x, "provideImplementation", js.Any.fromFunction3(value))
  }
}
