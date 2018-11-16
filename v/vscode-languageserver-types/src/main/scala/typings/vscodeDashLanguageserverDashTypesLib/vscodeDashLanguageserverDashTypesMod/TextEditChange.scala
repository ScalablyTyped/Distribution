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

