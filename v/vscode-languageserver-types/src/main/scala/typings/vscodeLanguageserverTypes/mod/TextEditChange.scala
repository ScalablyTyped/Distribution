package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditChange extends js.Object {
  /**
    * Adds a text edit.
    * @param edit the text edit to add.
    */
  def add(edit: TextEdit): Unit = js.native
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    */
  def all(): js.Array[TextEdit] = js.native
  /**
    * Clears the edits for this change.
    */
  def clear(): Unit = js.native
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    */
  def delete(range: Range): Unit = js.native
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    */
  def insert(position: Position, newText: String): Unit = js.native
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    */
  def replace(range: Range, newText: String): Unit = js.native
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
  implicit class TextEditChangeOps[Self <: TextEditChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: TextEdit => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAll(value: () => js.Array[TextEdit]): Self = this.set("all", js.Any.fromFunction0(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: Range => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: (Position, String) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setReplace(value: (Range, String) => Unit): Self = this.set("replace", js.Any.fromFunction2(value))
  }
  
}

