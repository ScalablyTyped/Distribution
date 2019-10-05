package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "FoldingRange")
@js.native
object FoldingRange extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: Double, endLine: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}

