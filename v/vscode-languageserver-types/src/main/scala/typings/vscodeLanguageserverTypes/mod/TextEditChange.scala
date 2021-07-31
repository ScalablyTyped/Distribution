package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditChange extends StObject {
  
  /**
    * Adds a text edit.
    * @param edit the text edit to add.
    */
  def add(edit: TextEdit): Unit
  
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    */
  def all(): js.Array[TextEdit]
  
  /**
    * Clears the edits for this change.
    */
  def clear(): Unit
  
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    */
  def delete(range: Range): Unit
  
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    */
  def insert(position: Position, newText: String): Unit
  
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    */
  def replace(range: Range, newText: String): Unit
}
object TextEditChange {
  
  @scala.inline
  def apply(
    add: TextEdit => Unit,
    all: () => js.Array[TextEdit],
    clear: () => Unit,
    delete: Range => Unit,
    insert: (Position, String) => Unit,
    replace: (Range, String) => Unit
  ): TextEditChange = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), all = js.Any.fromFunction0(all), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditChange]
  }
  
  @scala.inline
  implicit class TextEditChangeMutableBuilder[Self <: TextEditChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: TextEdit => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAll(value: () => js.Array[TextEdit]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: Range => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (Position, String) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace(value: (Range, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
  }
}
