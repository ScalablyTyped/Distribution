package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "MarkdownString")
@js.native
/**
		 * Creates a new markdown string with the given value.
		 *
		 * @param value Optional, initial value.
		 */
class MarkdownString () extends _MarkedString {
  def this(value: java.lang.String) = this()
  /**
  		 * Indicates that this markdown string is from a trusted source. Only *trusted*
  		 * markdown supports links that execute commands, e.g. `[Run it](command:myCommandId)`.
  		 */
  var isTrusted: js.UndefOr[scala.Boolean] = js.native
  /**
  		 * The markdown string.
  		 */
  var value: java.lang.String = js.native
  /**
  		 * Appends the given string 'as is' to this markdown string.
  		 * @param value Markdown string.
  		 */
  def appendMarkdown(value: java.lang.String): MarkdownString = js.native
  /**
  		 * Appends and escapes the given string to this markdown string.
  		 * @param value Plain text.
  		 */
  def appendText(value: java.lang.String): MarkdownString = js.native
}

