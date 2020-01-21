package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkSheet extends Sheet {
  /** AutoFilter info */
  @JSName("!autofilter")
  var Exclamationmarkautofilter: js.UndefOr[AutoFilterInfo] = js.undefined
  /** Column Info */
  @JSName("!cols")
  var Exclamationmarkcols: js.UndefOr[js.Array[ColInfo]] = js.undefined
  /** Merge Ranges */
  @JSName("!merges")
  var Exclamationmarkmerges: js.UndefOr[js.Array[Range]] = js.undefined
  /** Worksheet Protection info */
  @JSName("!protect")
  var Exclamationmarkprotect: js.UndefOr[ProtectInfo] = js.undefined
  /** Row Info */
  @JSName("!rows")
  var Exclamationmarkrows: js.UndefOr[js.Array[RowInfo]] = js.undefined
}

object WorkSheet {
  @scala.inline
  def apply(
    Exclamationmarkautofilter: AutoFilterInfo = null,
    Exclamationmarkcols: js.Array[ColInfo] = null,
    Exclamationmarkmargins: MarginInfo = null,
    Exclamationmarkmerges: js.Array[Range] = null,
    Exclamationmarkprotect: ProtectInfo = null,
    Exclamationmarkref: String = null,
    Exclamationmarkrows: js.Array[RowInfo] = null,
    Exclamationmarktype: SheetType = null
  ): WorkSheet = {
    val __obj = js.Dynamic.literal()
    if (Exclamationmarkautofilter != null) __obj.updateDynamic("!autofilter")(Exclamationmarkautofilter.asInstanceOf[js.Any])
    if (Exclamationmarkcols != null) __obj.updateDynamic("!cols")(Exclamationmarkcols.asInstanceOf[js.Any])
    if (Exclamationmarkmargins != null) __obj.updateDynamic("!margins")(Exclamationmarkmargins.asInstanceOf[js.Any])
    if (Exclamationmarkmerges != null) __obj.updateDynamic("!merges")(Exclamationmarkmerges.asInstanceOf[js.Any])
    if (Exclamationmarkprotect != null) __obj.updateDynamic("!protect")(Exclamationmarkprotect.asInstanceOf[js.Any])
    if (Exclamationmarkref != null) __obj.updateDynamic("!ref")(Exclamationmarkref.asInstanceOf[js.Any])
    if (Exclamationmarkrows != null) __obj.updateDynamic("!rows")(Exclamationmarkrows.asInstanceOf[js.Any])
    if (Exclamationmarktype != null) __obj.updateDynamic("!type")(Exclamationmarktype.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkSheet]
  }
}

