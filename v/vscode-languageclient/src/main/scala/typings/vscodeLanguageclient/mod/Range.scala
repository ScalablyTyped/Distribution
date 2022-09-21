package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("vscode-languageclient", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new Range literal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  inline def create(
    startLine: typings.vscodeLanguageserverTypes.mod.uinteger,
    startCharacter: typings.vscodeLanguageserverTypes.mod.uinteger,
    endLine: typings.vscodeLanguageserverTypes.mod.uinteger,
    endCharacter: typings.vscodeLanguageserverTypes.mod.uinteger
  ): typings.vscodeLanguageserverTypes.mod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Range]
  /**
    * Create a new Range literal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  inline def create(
    start: typings.vscodeLanguageserverTypes.mod.Position,
    end: typings.vscodeLanguageserverTypes.mod.Position
  ): typings.vscodeLanguageserverTypes.mod.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Range]
  
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean]
}
