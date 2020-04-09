package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedEditorParams extends js.Object {
  var elementAttributes: js.UndefOr[JSONRecord] = js.undefined
  /**Built in editors based on input elements such as the input, number, textarea and autocomplete editors have the ability to mask the users input to restrict it to match a given pattern.
    This can be set by passing a string to the the mask option in the columns editorParams 
    Each character in the string passed to the mask option defines what type of character can be entered in that position in the editor.
    A - Only a letter is valid in this position
    9 - Only a number is valid in this position
    * - Any character is valid in this position
    Any other character - The character in this position must be the same as the mask
    For example, a mask string of "AAA-999" would require the user to enter three letters followed by a hyphen followed by three numbers
    
    f you want to use the characters A, 9 or * as fixed characters then it is possible to change the characters looked for in the mask by using the maskLetterChar, maskNumberChar and maskWildcardChar options in the editorParams*/
  var mask: js.UndefOr[String] = js.undefined
  /** you are using fixed characters in your mask (any character other that A, 9 or *), then you can get the mask to automatically fill in these characters for you as you type by setting the maskAutoFill option in the editorParams to true */
  var maskAutoFill: js.UndefOr[Boolean] = js.undefined
  var maskLetterChar: js.UndefOr[String] = js.undefined
  var maskNumberChar: js.UndefOr[String] = js.undefined
  var maskWildcardChar: js.UndefOr[String] = js.undefined
}

object SharedEditorParams {
  @scala.inline
  def apply(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null
  ): SharedEditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedEditorParams]
  }
}

