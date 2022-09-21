package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbol {
  
  @JSImport("vscode-languageserver", "DocumentSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  inline def create(
    name: String,
    detail: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  inline def create(
    name: String,
    detail: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range,
    children: js.Array[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  inline def create(
    name: String,
    detail: Unit,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  inline def create(
    name: String,
    detail: Unit,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range,
    children: js.Array[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean]
}
