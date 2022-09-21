package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SymbolInformation {
  
  @JSImport("vscode-languageserver-protocol", "SymbolInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol.
    * @param containerName The name of the symbol containing the symbol.
    */
  inline def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SymbolInformation]
  inline def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    containerName: String
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.SymbolInformation]
}
