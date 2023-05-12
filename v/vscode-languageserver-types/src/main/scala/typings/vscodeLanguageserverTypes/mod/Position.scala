package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /**
    * Character offset on a line in a document (zero-based).
    *
    * The meaning of this offset is determined by the negotiated
    * `PositionEncodingKind`.
    *
    * If the character value is greater than the line length it defaults back to the
    * line length.
    */
  var character: uinteger
  
  /**
    * Line position in a document (zero-based).
    *
    * If a line number is greater than the number of lines in a document, it defaults back to the number of lines in the document.
    * If a line number is negative, it defaults to 0.
    */
  var line: uinteger
}
object Position {
  
  inline def apply(character: uinteger, line: uinteger): Position = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @JSImport("vscode-languageserver-types", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  inline def create(line: uinteger, character: uinteger): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  /**
    * Checks whether the given literal conforms to the {@link Position} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setCharacter(value: uinteger): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setLine(value: uinteger): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
