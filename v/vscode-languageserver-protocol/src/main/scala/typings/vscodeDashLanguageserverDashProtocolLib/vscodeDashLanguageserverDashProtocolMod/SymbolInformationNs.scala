package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "SymbolInformation")
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
  def create(
    name: java.lang.String,
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
  def create(
    name: java.lang.String,
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    uri: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
  def create(
    name: java.lang.String,
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolKind,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    uri: java.lang.String,
    containerName: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation = js.native
}

