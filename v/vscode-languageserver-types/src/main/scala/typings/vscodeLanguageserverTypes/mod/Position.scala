package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /**
    * Character offset on a line in a document (zero-based). Assuming that the line is
    * represented as a string, the `character` value represents the gap between the
    * `character` and `character + 1`.
    *
    * If the character value is greater than the line length it defaults back to the
    * line length.
    * If a line number is negative, it defaults to 0.
    */
  var character: Double
  
  /**
    * Line position in a document (zero-based).
    * If a line number is greater than the number of lines in a document, it defaults back to the number of lines in the document.
    * If a line number is negative, it defaults to 0.
    */
  var line: Double
}
object Position {
  
  @scala.inline
  def apply(character: Double, line: Double): Position = {
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
  @scala.inline
  def create(line: Double, character: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  /**
    * Checks whether the given liternal conforms to the [Position](#Position) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean]
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
