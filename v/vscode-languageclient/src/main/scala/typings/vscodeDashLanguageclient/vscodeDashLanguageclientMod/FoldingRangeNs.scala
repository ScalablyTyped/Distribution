package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "FoldingRange")
@js.native
object FoldingRangeNs extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: Double, endLine: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}

