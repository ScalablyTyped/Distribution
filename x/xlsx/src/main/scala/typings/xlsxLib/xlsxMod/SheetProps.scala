package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProps extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[java.lang.String] = js.undefined
  /** Sheet Visibility (0=Visible 1=Hidden 2=VeryHidden) */
  var Hidden: js.UndefOr[
    xlsxLib.xlsxLibNumbers.`0` | xlsxLib.xlsxLibNumbers.`1` | xlsxLib.xlsxLibNumbers.`2`
  ] = js.undefined
}

object SheetProps {
  @scala.inline
  def apply(
    CodeName: java.lang.String = null,
    Hidden: xlsxLib.xlsxLibNumbers.`0` | xlsxLib.xlsxLibNumbers.`1` | xlsxLib.xlsxLibNumbers.`2` = null
  ): SheetProps = {
    val __obj = js.Dynamic.literal()
    if (CodeName != null) __obj.updateDynamic("CodeName")(CodeName)
    if (Hidden != null) __obj.updateDynamic("Hidden")(Hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
}

