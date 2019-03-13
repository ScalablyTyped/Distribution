package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputChannel extends js.Object {
  /**
  		 * The human-readable name of this output channel.
  		 */
  val name: java.lang.String = js.native
  /**
  		 * Append the given value to the channel.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: java.lang.String): scala.Unit = js.native
  /**
  		 * Append the given value and a line feed character
  		 * to the channel.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: java.lang.String): scala.Unit = js.native
  /**
  		 * Removes all output from the channel.
  		 */
  def clear(): scala.Unit = js.native
  /**
  		 * Dispose and free associated resources.
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * Hide this channel from the UI.
  		 */
  def hide(): scala.Unit = js.native
  /**
  		 * Reveal this channel in the UI.
  		 *
  		 * @param preserveFocus When `true` the channel will not take focus.
  		 */
  def show(): scala.Unit = js.native
  def show(column: ViewColumn): scala.Unit = js.native
  def show(column: ViewColumn, preserveFocus: scala.Boolean): scala.Unit = js.native
  def show(preserveFocus: scala.Boolean): scala.Unit = js.native
}

