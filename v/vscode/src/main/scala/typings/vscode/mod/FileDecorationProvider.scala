package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDecorationProvider extends StObject {
  
  /**
    * An optional event to signal that decorations for one or many files have changed.
    *
    * *Note* that this event should be used to propagate information about children.
    *
    * @see {@link EventEmitter}
    */
  var onDidChangeFileDecorations: js.UndefOr[Event[js.UndefOr[Uri | js.Array[Uri]]]] = js.undefined
  
  /**
    * Provide decorations for a given uri.
    *
    * *Note* that this function is only called when a file gets rendered in the UI.
    * This means a decoration from a descendent that propagates upwards must be signaled
    * to the editor via the {@link FileDecorationProvider.onDidChangeFileDecorations onDidChangeFileDecorations}-event.
    *
    * @param uri The uri of the file to provide a decoration for.
    * @param token A cancellation token.
    * @returns A decoration or a thenable that resolves to such.
    */
  def provideFileDecoration(uri: Uri, token: CancellationToken): ProviderResult[FileDecoration]
}
object FileDecorationProvider {
  
  inline def apply(provideFileDecoration: (Uri, CancellationToken) => ProviderResult[FileDecoration]): FileDecorationProvider = {
    val __obj = js.Dynamic.literal(provideFileDecoration = js.Any.fromFunction2(provideFileDecoration))
    __obj.asInstanceOf[FileDecorationProvider]
  }
  
  extension [Self <: FileDecorationProvider](x: Self) {
    
    inline def setOnDidChangeFileDecorations(
      value: (/* listener */ js.Function1[js.UndefOr[Uri | js.Array[Uri]], Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidChangeFileDecorations", js.Any.fromFunction3(value))
    
    inline def setOnDidChangeFileDecorationsUndefined: Self = StObject.set(x, "onDidChangeFileDecorations", js.undefined)
    
    inline def setProvideFileDecoration(value: (Uri, CancellationToken) => ProviderResult[FileDecoration]): Self = StObject.set(x, "provideFileDecoration", js.Any.fromFunction2(value))
  }
}
