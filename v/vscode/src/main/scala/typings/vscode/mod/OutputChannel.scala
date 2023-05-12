package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputChannel extends StObject {
  
  /**
  		 * Append the given value to the channel.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: String): Unit = js.native
  
  /**
  		 * Append the given value and a line feed character
  		 * to the channel.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: String): Unit = js.native
  
  /**
  		 * Removes all output from the channel.
  		 */
  def clear(): Unit = js.native
  
  /**
  		 * Dispose and free associated resources.
  		 */
  def dispose(): Unit = js.native
  
  /**
  		 * Hide this channel from the UI.
  		 */
  def hide(): Unit = js.native
  
  /**
  		 * The human-readable name of this output channel.
  		 */
  val name: String = js.native
  
  /**
  		 * Replaces all output from the channel with the given value.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def replace(value: String): Unit = js.native
  
  /**
  		 * Reveal this channel in the UI.
  		 *
  		 * @param preserveFocus When `true` the channel will not take focus.
  		 */
  def show(): Unit = js.native
  def show(column: Unit, preserveFocus: Boolean): Unit = js.native
  def show(column: ViewColumn): Unit = js.native
  def show(column: ViewColumn, preserveFocus: Boolean): Unit = js.native
  def show(preserveFocus: Boolean): Unit = js.native
}
