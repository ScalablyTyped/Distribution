package typings.xlsx.xlsxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet
  extends /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ StringDictionary[CellObject | SheetKeys | js.Any] {
  /** Page Margins */
  var `!margins`: js.UndefOr[MarginInfo] = js.undefined
  /** Sheet Range */
  var `!ref`: js.UndefOr[String] = js.undefined
  /** Sheet type */
  var `!type`: js.UndefOr[SheetType] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    `!margins`: MarginInfo = null,
    `!ref`: String = null,
    `!type`: SheetType = null,
    StringDictionary: /**
    * Indexing with a cell address string maps to a cell object
    * Special keys start with '!'
    */
  /* cell */ StringDictionary[CellObject | SheetKeys | js.Any] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (`!margins` != null) __obj.updateDynamic("!margins")(`!margins`.asInstanceOf[js.Any])
    if (`!ref` != null) __obj.updateDynamic("!ref")(`!ref`.asInstanceOf[js.Any])
    if (`!type` != null) __obj.updateDynamic("!type")(`!type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Sheet]
  }
}

