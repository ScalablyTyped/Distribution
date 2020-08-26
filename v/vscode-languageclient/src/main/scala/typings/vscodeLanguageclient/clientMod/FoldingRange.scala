package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "FoldingRange")
@js.native
object FoldingRange extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: Double, endLine: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double,
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: Double,
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}

