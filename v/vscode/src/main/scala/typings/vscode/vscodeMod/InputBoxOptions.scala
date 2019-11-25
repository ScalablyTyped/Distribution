package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBoxOptions extends js.Object {
  /**
  		 * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Set to `true` to show a password prompt that will not show the typed value.
  		 */
  var password: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional string to show as place holder in the input box to guide the user what to type.
  		 */
  var placeHolder: js.UndefOr[String] = js.undefined
  /**
  		 * The text to display underneath the input box.
  		 */
  var prompt: js.UndefOr[String] = js.undefined
  /**
  		 * An optional function that will be called to validate input and to give a hint
  		 * to the user.
  		 *
  		 * @param value The current value of the input box.
  		 * @return A human readable string which is presented as diagnostic message.
  		 * Return `undefined`, `null`, or the empty string when 'value' is valid.
  		 */
  var validateInput: js.UndefOr[
    js.Function1[
      /* value */ String, 
      js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]
    ]
  ] = js.undefined
  /**
  		 * The value to prefill in the input box.
  		 */
  var value: js.UndefOr[String] = js.undefined
  /**
  		 * Selection of the prefilled [`value`](#InputBoxOptions.value). Defined as tuple of two number where the
  		 * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
  		 * word will be selected, when empty (start equals end) only the cursor will be set,
  		 * otherwise the defined range will be selected.
  		 */
  var valueSelection: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object InputBoxOptions {
  @scala.inline
  def apply(
    ignoreFocusOut: js.UndefOr[Boolean] = js.undefined,
    password: js.UndefOr[Boolean] = js.undefined,
    placeHolder: String = null,
    prompt: String = null,
    validateInput: /* value */ String => js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])] = null,
    value: String = null,
    valueSelection: js.Tuple2[Double, Double] = null
  ): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreFocusOut)) __obj.updateDynamic("ignoreFocusOut")(ignoreFocusOut.asInstanceOf[js.Any])
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (validateInput != null) __obj.updateDynamic("validateInput")(js.Any.fromFunction1(validateInput))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueSelection != null) __obj.updateDynamic("valueSelection")(valueSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBoxOptions]
  }
}

