package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "SymbolInformation")
@js.native
object SymbolInformationNs extends js.Object {
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  def create(name: String, kind: SymbolKind, range: Range): SymbolInformation = js.native
  def create(name: String, kind: SymbolKind, range: Range, uri: String): SymbolInformation = js.native
  def create(name: String, kind: SymbolKind, range: Range, uri: String, containerName: String): SymbolInformation = js.native
}

