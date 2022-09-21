package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorEdit extends StObject {
  
  /**
    * Delete a certain text region.
    *
    * @param location The range this operation should remove.
    */
  def delete(location: Range): Unit = js.native
  def delete(location: Selection): Unit = js.native
  
  /**
    * Insert text at a location.
    * You can use \r\n or \n in `value` and they will be normalized to the current {@link TextDocument document}.
    * Although the equivalent text edit can be made with {@link TextEditorEdit.replace replace}, `insert` will produce a different resulting selection (it will get moved).
    *
    * @param location The position where the new text should be inserted.
    * @param value The new text this operation should insert.
    */
  def insert(location: Position, value: String): Unit = js.native
  
  /**
    * Replace a certain text region with a new value.
    * You can use \r\n or \n in `value` and they will be normalized to the current {@link TextDocument document}.
    *
    * @param location The range this operation should remove.
    * @param value The new text this operation should insert after removing `location`.
    */
  def replace(location: Position, value: String): Unit = js.native
  def replace(location: Range, value: String): Unit = js.native
  def replace(location: Selection, value: String): Unit = js.native
  
  /**
    * Set the end of line sequence.
    *
    * @param endOfLine The new end of line for the {@link TextDocument document}.
    */
  def setEndOfLine(endOfLine: EndOfLine): Unit = js.native
}
