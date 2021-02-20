package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRange {
  
  /**
    * Creates a new FoldingRange literal.
    */
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double,
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: Double,
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  @JSImport("vscode-languageclient", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = js.native
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  @JSImport("vscode-languageclient", "FoldingRange.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
}
