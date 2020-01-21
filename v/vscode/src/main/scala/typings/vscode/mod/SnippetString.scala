package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SnippetString")
@js.native
class SnippetString () extends js.Object {
  def this(value: String) = this()
  /**
  		 * The snippet string.
  		 */
  var value: String = js.native
  /**
  		 * Builder-function that appends a choice (`${1|a,b,c}`) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param values The values for choices - the array of strings
  		 * @param number The number of this tabstop, defaults to an auto-increment
  		 * value starting at 1.
  		 * @return This snippet string.
  		 */
  def appendChoice(values: js.Array[String]): SnippetString = js.native
  def appendChoice(values: js.Array[String], number: Double): SnippetString = js.native
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
  def appendPlaceholder(value: String): SnippetString = js.native
  def appendPlaceholder(value: String, number: Double): SnippetString = js.native
  def appendPlaceholder(value: js.Function1[/* snippet */ this.type, _]): SnippetString = js.native
  def appendPlaceholder(value: js.Function1[/* snippet */ this.type, _], number: Double): SnippetString = js.native
  /**
  		 * Builder-function that appends a tabstop (`$1`, `$2` etc) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param number The number of this tabstop, defaults to an auto-increment
  		 * value starting at 1.
  		 * @return This snippet string.
  		 */
  def appendTabstop(): SnippetString = js.native
  def appendTabstop(number: Double): SnippetString = js.native
  /**
  		 * Builder-function that appends the given string to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param string A value to append 'as given'. The string will be escaped.
  		 * @return This snippet string.
  		 */
  def appendText(string: String): SnippetString = js.native
  /**
  		 * Builder-function that appends a variable (`${VAR}`) to
  		 * the [`value`](#SnippetString.value) of this snippet string.
  		 *
  		 * @param name The name of the variable - excluding the `$`.
  		 * @param defaultValue The default value which is used when the variable name cannot
  		 * be resolved - either a string or a function with which a nested snippet can be created.
  		 * @return This snippet string.
  		 */
  def appendVariable(name: String, defaultValue: String): SnippetString = js.native
  def appendVariable(name: String, defaultValue: js.Function1[/* snippet */ this.type, _]): SnippetString = js.native
}

