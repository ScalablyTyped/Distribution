package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValuesProvider extends StObject {
  
  /**
  		 * An optional event to signal that inline values have changed.
  		 * @see {@link EventEmitter}
  		 */
  var onDidChangeInlineValues: js.UndefOr[Event[Unit]] = js.undefined
  
  /**
  		 * Provide "inline value" information for a given document and range.
  		 * The editor calls this method whenever debugging stops in the given document.
  		 * The returned inline values information is rendered in the editor at the end of lines.
  		 *
  		 * @param document The document for which the inline values information is needed.
  		 * @param viewPort The visible document range for which inline values should be computed.
  		 * @param context A bag containing contextual information like the current location.
  		 * @param token A cancellation token.
  		 * @return An array of InlineValueDescriptors or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideInlineValues(document: TextDocument, viewPort: Range, context: InlineValueContext, token: CancellationToken): ProviderResult[js.Array[InlineValue]]
}
object InlineValuesProvider {
  
  inline def apply(
    provideInlineValues: (TextDocument, Range, InlineValueContext, CancellationToken) => ProviderResult[js.Array[InlineValue]]
  ): InlineValuesProvider = {
    val __obj = js.Dynamic.literal(provideInlineValues = js.Any.fromFunction4(provideInlineValues))
    __obj.asInstanceOf[InlineValuesProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineValuesProvider] (val x: Self) extends AnyVal {
    
    inline def setOnDidChangeInlineValues(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeInlineValues", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeInlineValuesUndefined: Self = StObject.set(x, "onDidChangeInlineValues", js.undefined)
    
    inline def setProvideInlineValues(
      value: (TextDocument, Range, InlineValueContext, CancellationToken) => ProviderResult[js.Array[InlineValue]]
    ): Self = StObject.set(x, "provideInlineValues", js.Any.fromFunction4(value))
  }
}
