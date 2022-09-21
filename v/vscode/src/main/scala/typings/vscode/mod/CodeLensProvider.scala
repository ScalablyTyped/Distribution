package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensProvider[T /* <: CodeLens */] extends StObject {
  
  /**
    * An optional event to signal that the code lenses from this provider have changed.
    */
  var onDidChangeCodeLenses: js.UndefOr[Event[Unit]] = js.undefined
  
  /**
    * Compute a list of {@link CodeLens lenses}. This call should return as fast as possible and if
    * computing the commands is expensive implementors should only return code lens objects with the
    * range set and implement {@link CodeLensProvider.resolveCodeLens resolve}.
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of code lenses or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[T]]
  
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * calls to {@link CodeLensProvider.provideCodeLenses compute}-lenses.
    *
    * @param codeLens Code lens that must be resolved.
    * @param token A cancellation token.
    * @return The given, resolved code lens or thenable that resolves to such.
    */
  var resolveCodeLens: js.UndefOr[js.Function2[/* codeLens */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.undefined
}
object CodeLensProvider {
  
  inline def apply[T /* <: CodeLens */](provideCodeLenses: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): CodeLensProvider[T] = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider[T]]
  }
  
  extension [Self <: CodeLensProvider[?], T /* <: CodeLens */](x: Self & CodeLensProvider[T]) {
    
    inline def setOnDidChangeCodeLenses(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeCodeLenses", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeCodeLensesUndefined: Self = StObject.set(x, "onDidChangeCodeLenses", js.undefined)
    
    inline def setProvideCodeLenses(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideCodeLenses", js.Any.fromFunction2(value))
    
    inline def setResolveCodeLens(value: (/* codeLens */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "resolveCodeLens", js.Any.fromFunction2(value))
    
    inline def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
  }
}
