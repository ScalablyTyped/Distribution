package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeLensProvider[T /* <: CodeLens */] extends StObject {
  
  /**
    * An optional event to signal that the code lenses from this provider have changed.
    */
  var onDidChangeCodeLenses: js.UndefOr[Event[Unit]] = js.native
  
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementors should only return code lens objects with the
    * range set and implement [resolve](#CodeLensProvider.resolveCodeLens).
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of code lenses or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[T]] = js.native
  
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * calls to [compute](#CodeLensProvider.provideCodeLenses)-lenses.
    *
    * @param codeLens Code lens that must be resolved.
    * @param token A cancellation token.
    * @return The given, resolved code lens or thenable that resolves to such.
    */
  var resolveCodeLens: js.UndefOr[js.Function2[/* codeLens */ T, /* token */ CancellationToken, ProviderResult[T]]] = js.native
}
object CodeLensProvider {
  
  @scala.inline
  def apply[T /* <: CodeLens */](provideCodeLenses: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): CodeLensProvider[T] = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider[T]]
  }
  
  @scala.inline
  implicit class CodeLensProviderMutableBuilder[Self <: CodeLensProvider[_], T /* <: CodeLens */] (val x: Self with CodeLensProvider[T]) extends AnyVal {
    
    @scala.inline
    def setOnDidChangeCodeLenses(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeCodeLenses", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDidChangeCodeLensesUndefined: Self = StObject.set(x, "onDidChangeCodeLenses", js.undefined)
    
    @scala.inline
    def setProvideCodeLenses(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideCodeLenses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveCodeLens(value: (/* codeLens */ T, /* token */ CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "resolveCodeLens", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
  }
}
