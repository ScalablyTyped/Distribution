package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  /**
    * Insert a newline character at the end of the file if one does not exist.
    *
    * @since 3.15.0
    */
  var insertFinalNewline: js.UndefOr[Boolean] = js.native
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean = js.native
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double = js.native
  /**
    * Trim all newlines after the final newline at the end of the file.
    *
    * @since 3.15.0
    */
  var trimFinalNewlines: js.UndefOr[Boolean] = js.native
  /**
    * Trim trailing whitespaces on a line.
    *
    * @since 3.15.0
    */
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.native
}

@JSImport("vscode-languageserver-types", "FormattingOptions")
@js.native
object FormattingOptions extends js.Object {
  /**
    * Creates a new FormattingOptions literal.
    */
  def create(tabSize: Double, insertSpaces: Boolean): FormattingOptions = js.native
  /**
    * Checks whether the given literal conforms to the [FormattingOptions](#FormattingOptions) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = js.native
}

