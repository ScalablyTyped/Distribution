package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditChange extends js.Object {
  /**
    * Adds a text edit.
    * @param edit the text edit to add.
    */
  def add(edit: TextEdit): scala.Unit
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    */
  def all(): js.Array[TextEdit]
  /**
    * Clears the edits for this change.
    */
  def clear(): scala.Unit
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    */
  def delete(range: Range): scala.Unit
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    */
  def insert(position: Position, newText: java.lang.String): scala.Unit
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    */
  def replace(range: Range, newText: java.lang.String): scala.Unit
}

object TextEditChange {
  @scala.inline
  def apply(
    add: js.Function1[TextEdit, scala.Unit],
    all: js.Function0[js.Array[TextEdit]],
    clear: js.Function0[scala.Unit],
    delete: js.Function1[Range, scala.Unit],
    insert: js.Function2[Position, java.lang.String, scala.Unit],
    replace: js.Function2[Range, java.lang.String, scala.Unit]
  ): TextEditChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[TextEditChange]
  }
}

