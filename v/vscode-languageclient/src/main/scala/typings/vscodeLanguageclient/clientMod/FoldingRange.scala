package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRange {
  
  @JSImport("vscode-languageclient/lib/client", "FoldingRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FoldingRange literal.
    */
  @scala.inline
  def create(startLine: Double, endLine: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Unit, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Double): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Double, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  @scala.inline
  def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Unit, kind: String): typings.vscodeLanguageserverTypes.mod.FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FoldingRange]
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean]
}
