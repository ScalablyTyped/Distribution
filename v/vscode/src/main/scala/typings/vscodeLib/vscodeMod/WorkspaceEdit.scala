package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "WorkspaceEdit")
@js.native
class WorkspaceEdit () extends js.Object {
  /**
  		 * The number of affected resources.
  		 */
  val size: scala.Double = js.native
  /**
  		 * Delete the text at the given range.
  		 *
  		 * @param uri A resource identifier.
  		 * @param range A range.
  		 */
  def delete(uri: Uri, range: Range): scala.Unit = js.native
  /**
  		 * Get all text edits grouped by resource.
  		 *
  		 * @return A shallow copy of `[Uri, TextEdit[]]`-tuples.
  		 */
  def entries(): js.Array[js.Tuple2[Uri, js.Array[TextEdit]]] = js.native
  /**
  		 * Get the text edits for a resource.
  		 *
  		 * @param uri A resource identifier.
  		 * @return An array of text edits.
  		 */
  def get(uri: Uri): js.Array[TextEdit] = js.native
  /**
  		 * Check if this edit affects the given resource.
  		 * @param uri A resource identifier.
  		 * @return `true` if the given resource will be touched by this edit.
  		 */
  def has(uri: Uri): scala.Boolean = js.native
  /**
  		 * Insert the given text at the given position.
  		 *
  		 * @param uri A resource identifier.
  		 * @param position A position.
  		 * @param newText A string.
  		 */
  def insert(uri: Uri, position: Position, newText: java.lang.String): scala.Unit = js.native
  /**
  		 * Replace the given range with given text for the given resource.
  		 *
  		 * @param uri A resource identifier.
  		 * @param range A range.
  		 * @param newText A string.
  		 */
  def replace(uri: Uri, range: Range, newText: java.lang.String): scala.Unit = js.native
  /**
  		 * Set (and replace) text edits for a resource.
  		 *
  		 * @param uri A resource identifier.
  		 * @param edits An array of text edits.
  		 */
  def set(uri: Uri, edits: js.Array[TextEdit]): scala.Unit = js.native
}

