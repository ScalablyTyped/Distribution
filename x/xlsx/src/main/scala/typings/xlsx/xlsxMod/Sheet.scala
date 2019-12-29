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
  @JSName("!margins")
  var Exclamationmarkmargins: js.UndefOr[MarginInfo] = js.undefined
  /** Sheet Range */
  @JSName("!ref")
  var Exclamationmarkref: js.UndefOr[String] = js.undefined
  /** Sheet type */
  @JSName("!type")
  var Exclamationmarktype: js.UndefOr[SheetType] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    Exclamationmarkmargins: MarginInfo = null,
    Exclamationmarkref: String = null,
    Exclamationmarktype: SheetType = null,
    StringDictionary: /**
    * Indexing with a cell address string maps to a cell object
    * Special keys start with '!'
    */
  /* cell */ StringDictionary[CellObject | SheetKeys | js.Any] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (Exclamationmarkmargins != null) __obj.updateDynamic("!margins")(Exclamationmarkmargins.asInstanceOf[js.Any])
    if (Exclamationmarkref != null) __obj.updateDynamic("!ref")(Exclamationmarkref.asInstanceOf[js.Any])
    if (Exclamationmarktype != null) __obj.updateDynamic("!type")(Exclamationmarktype.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Sheet]
  }
}

