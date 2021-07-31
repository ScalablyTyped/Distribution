package typings.vscode.mod

import typings.vscode.anon.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameProvider extends StObject {
  
  /**
    * Optional function for resolving and validating a position *before* running rename. The result can
    * be a range or a range and a placeholder text. The placeholder text should be the identifier of the symbol
    * which is being renamed - when omitted the text in the returned range is used.
    *
    * *Note: * This function should throw an error or return a rejected thenable when the provided location
    * doesn't allow for a rename.
    *
    * @param document The document in which rename will be invoked.
    * @param position The position at which rename will be invoked.
    * @param token A cancellation token.
    * @return The range or range and placeholder text of the identifier that is to be renamed. The lack of a result can signaled by returning `undefined` or `null`.
    */
  var prepareRename: js.UndefOr[
    js.Function3[
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[Range | Placeholder]
    ]
  ] = js.undefined
  
  /**
    * Provide an edit that describes changes that have to be made to one
    * or many resources to rename a symbol to a different name.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param newName The new name of the symbol. If the given name is not valid, the provider must return a rejected promise.
    * @param token A cancellation token.
    * @return A workspace edit or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideRenameEdits(document: TextDocument, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit]
}
object RenameProvider {
  
  @scala.inline
  def apply(
    provideRenameEdits: (TextDocument, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    __obj.asInstanceOf[RenameProvider]
  }
  
  @scala.inline
  implicit class RenameProviderMutableBuilder[Self <: RenameProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrepareRename(
      value: (/* document */ TextDocument, /* position */ Position, /* token */ CancellationToken) => ProviderResult[Range | Placeholder]
    ): Self = StObject.set(x, "prepareRename", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrepareRenameUndefined: Self = StObject.set(x, "prepareRename", js.undefined)
    
    @scala.inline
    def setProvideRenameEdits(value: (TextDocument, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit]): Self = StObject.set(x, "provideRenameEdits", js.Any.fromFunction4(value))
  }
}
