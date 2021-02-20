package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  /**
    * Create a new Range liternal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  @JSImport("vscode-languageclient/lib/client", "Range.create")
  @js.native
  def create(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double): typings.vscodeLanguageserverTypes.mod.Range = js.native
  /**
    * Create a new Range liternal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  @JSImport("vscode-languageclient/lib/client", "Range.create")
  @js.native
  def create(
    start: typings.vscodeLanguageserverTypes.mod.Position,
    end: typings.vscodeLanguageserverTypes.mod.Position
  ): typings.vscodeLanguageserverTypes.mod.Range = js.native
  
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  @JSImport("vscode-languageclient/lib/client", "Range.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean = js.native
}
