package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * The range's end position.
    */
  var end: Position
  
  /**
    * The range's start position.
    */
  var start: Position
}
object Range {
  
  inline def apply(end: Position, start: Position): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @JSImport("vscode-languageserver-types", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new Range literal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  inline def create(startLine: uinteger, startCharacter: uinteger, endLine: uinteger, endCharacter: uinteger): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[Range]
  /**
    * Create a new Range literal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  inline def create(start: Position, end: Position): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Range]
  
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean]
  
  extension [Self <: Range](x: Self) {
    
    inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
