package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "SymbolInformation")
@js.native
object SymbolInformation extends js.Object {
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  def create(
    name: String,
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
  def create(
    name: String,
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    uri: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
  def create(
    name: String,
    kind: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range,
    uri: String,
    containerName: String
  ): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
}

