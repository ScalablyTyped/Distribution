package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticCollection extends js.Object {
  /**
  		 * The name of this diagnostic collection, for instance `typescript`. Every diagnostic
  		 * from this collection will be associated with this name. Also, the task framework uses this
  		 * name when defining [problem matchers](https://code.visualstudio.com/docs/editor/tasks#_defining-a-problem-matcher).
  		 */
  val name: java.lang.String = js.native
  /**
  		 * Remove all diagnostics from this collection. The same
  		 * as calling `#set(undefined)`;
  		 */
  def clear(): scala.Unit = js.native
  /**
  		 * Remove all diagnostics from this collection that belong
  		 * to the provided `uri`. The same as `#set(uri, undefined)`.
  		 *
  		 * @param uri A resource identifier.
  		 */
  def delete(uri: Uri): scala.Unit = js.native
  /**
  		 * Dispose and free associated resources. Calls
  		 * [clear](#DiagnosticCollection.clear).
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * Iterate over each entry in this collection.
  		 *
  		 * @param callback Function to execute for each entry.
  		 * @param thisArg The `this` context used when invoking the handler function.
  		 */
  def forEach(
    callback: js.Function3[/* uri */ Uri, /* diagnostics */ js.Array[Diagnostic], /* collection */ this.type, _]
  ): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* uri */ Uri, /* diagnostics */ js.Array[Diagnostic], /* collection */ this.type, _],
    thisArg: js.Any
  ): scala.Unit = js.native
  /**
  		 * Get the diagnostics for a given resource. *Note* that you cannot
  		 * modify the diagnostics-array returned from this call.
  		 *
  		 * @param uri A resource identifier.
  		 * @returns An immutable array of [diagnostics](#Diagnostic) or `undefined`.
  		 */
  def get(uri: Uri): js.UndefOr[js.Array[Diagnostic]] = js.native
  /**
  		 * Check if this collection contains diagnostics for a
  		 * given resource.
  		 *
  		 * @param uri A resource identifier.
  		 * @returns `true` if this collection has diagnostic for the given resource.
  		 */
  def has(uri: Uri): scala.Boolean = js.native
  /**
  		 * Replace all entries in this collection.
  		 *
  		 * Diagnostics of multiple tuples of the same uri will be merged, e.g
  		 * `[[file1, [d1]], [file1, [d2]]]` is equivalent to `[[file1, [d1, d2]]]`.
  		 * If a diagnostics item is `undefined` as in `[file1, undefined]`
  		 * all previous but not subsequent diagnostics are removed.
  		 *
  		 * @param entries An array of tuples, like `[[file1, [d1, d2]], [file2, [d3, d4, d5]]]`, or `undefined`.
  		 */
  def set(entries: js.Array[js.Tuple2[Uri, js.UndefOr[js.Array[Diagnostic]]]]): scala.Unit = js.native
  def set(uri: Uri): scala.Unit = js.native
  /**
  		 * Assign diagnostics for given resource. Will replace
  		 * existing diagnostics for that resource.
  		 *
  		 * @param uri A resource identifier.
  		 * @param diagnostics Array of diagnostics or `undefined`
  		 */
  def set(uri: Uri, diagnostics: js.Array[Diagnostic]): scala.Unit = js.native
}

