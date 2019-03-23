package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SnippetString")
@js.native
class SnippetString () extends js.Object {
  def this(value: java.lang.String) = this()
  /**
  		 * The snippet string.
  		 */
  var value: java.lang.String = js.native
  /**
  		 * Builder-function that appends a placeholder (`${1:value}`) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param value The value of this placeholder - either a string or a function
  		 * with which a nested snippet can be created.
  		 * @param number The number of this tabstop, defaults to an auto-increment
  		 * value starting at 1.
  		 * @return This snippet string.
  		 */
  def appendPlaceholder(value: java.lang.String): SnippetString = js.native
  def appendPlaceholder(value: java.lang.String, number: scala.Double): SnippetString = js.native
  def appendPlaceholder(value: js.Function1[/* snippet */ this.type, _]): SnippetString = js.native
  def appendPlaceholder(value: js.Function1[/* snippet */ this.type, _], number: scala.Double): SnippetString = js.native
  /**
  		 * Builder-function that appends a tabstop (`$1`, `$2` etc) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param number The number of this tabstop, defaults to an auto-increment
  		 * value starting at 1.
  		 * @return This snippet string.
  		 */
  def appendTabstop(): SnippetString = js.native
  def appendTabstop(number: scala.Double): SnippetString = js.native
  /**
  		 * Builder-function that appends the given string to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param string A value to append 'as given'. The string will be escaped.
  		 * @return This snippet string.
  		 */
  def appendText(string: java.lang.String): SnippetString = js.native
  /**
  		 * Builder-function that appends a variable (`${VAR}`) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param name The name of the variable - excluding the `$`.
  		 * @param defaultValue The default value which is used when the variable name cannot
  		 * be resolved - either a string or a function with which a nested snippet can be created.
  		 * @return This snippet string.
  		 */
  def appendVariable(name: java.lang.String, defaultValue: java.lang.String): SnippetString = js.native
  def appendVariable(name: java.lang.String, defaultValue: js.Function1[/* snippet */ this.type, _]): SnippetString = js.native
}

