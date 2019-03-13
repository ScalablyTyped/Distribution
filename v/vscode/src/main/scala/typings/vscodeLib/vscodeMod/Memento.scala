package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memento extends js.Object {
  /**
  		 * Return a value.
  		 *
  		 * @param key A string.
  		 * @return The stored value or `undefined`.
  		 */
  def get[T](key: java.lang.String): js.UndefOr[T] = js.native
  /**
  		 * Return a value.
  		 *
  		 * @param key A string.
  		 * @param defaultValue A value that should be returned when there is no
  		 * value (`undefined`) with the given key.
  		 * @return The stored value or the defaultValue.
  		 */
  def get[T](key: java.lang.String, defaultValue: T): T = js.native
  /**
  		 * Store a value. The value must be JSON-stringifyable.
  		 *
  		 * @param key A string.
  		 * @param value A value. MUST not contain cyclic references.
  		 */
  def update(key: java.lang.String, value: js.Any): vscodeLib.Thenable[scala.Unit] = js.native
}

