package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SymbolInformation {
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  @JSImport("vscode-languageserver-protocol", "SymbolInformation.create")
  @js.native
  def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  @JSImport("vscode-languageserver-protocol", "SymbolInformation.create")
  @js.native
  def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    uri: js.UndefOr[scala.Nothing],
    containerName: String
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  @JSImport("vscode-languageserver-protocol", "SymbolInformation.create")
  @js.native
  def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    uri: String
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  @JSImport("vscode-languageserver-protocol", "SymbolInformation.create")
  @js.native
  def create(
    name: String,
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    uri: String,
    containerName: String
  ): typings.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
}
