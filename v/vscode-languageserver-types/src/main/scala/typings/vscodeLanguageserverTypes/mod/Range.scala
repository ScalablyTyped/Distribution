package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  /**
    * The range's end position.
    */
  var end: Position = js.native
  
  /**
    * The range's start position
    */
  var start: Position = js.native
}
object Range {
  
  @scala.inline
  def apply(end: Position, start: Position): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  /**
    * Create a new Range liternal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  @JSImport("vscode-languageserver-types", "Range.create")
  @js.native
  def create(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double): Range = js.native
  /**
    * Create a new Range liternal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  @JSImport("vscode-languageserver-types", "Range.create")
  @js.native
  def create(start: Position, end: Position): Range = js.native
  
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  @JSImport("vscode-languageserver-types", "Range.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean = js.native
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
