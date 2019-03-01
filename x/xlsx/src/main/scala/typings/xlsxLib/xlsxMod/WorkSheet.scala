package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkSheet extends Sheet {
  /** AutoFilter info */
  var `!autofilter`: js.UndefOr[AutoFilterInfo] = js.undefined
  /** Column Info */
  var `!cols`: js.UndefOr[js.Array[ColInfo]] = js.undefined
  /** Merge Ranges */
  var `!merges`: js.UndefOr[js.Array[Range]] = js.undefined
  /** Worksheet Protection info */
  var `!protect`: js.UndefOr[ProtectInfo] = js.undefined
  /** Row Info */
  var `!rows`: js.UndefOr[js.Array[RowInfo]] = js.undefined
}

object WorkSheet {
  @scala.inline
  def apply(
    `!autofilter`: AutoFilterInfo = null,
    `!cols`: js.Array[ColInfo] = null,
    `!margins`: MarginInfo = null,
    `!merges`: js.Array[Range] = null,
    `!protect`: ProtectInfo = null,
    `!ref`: java.lang.String = null,
    `!rows`: js.Array[RowInfo] = null,
    `!type`: SheetType = null
  ): WorkSheet = {
    val __obj = js.Dynamic.literal()
    if (`!autofilter` != null) __obj.updateDynamic("!autofilter")(`!autofilter`)
    if (`!cols` != null) __obj.updateDynamic("!cols")(`!cols`)
    if (`!margins` != null) __obj.updateDynamic("!margins")(`!margins`)
    if (`!merges` != null) __obj.updateDynamic("!merges")(`!merges`)
    if (`!protect` != null) __obj.updateDynamic("!protect")(`!protect`)
    if (`!ref` != null) __obj.updateDynamic("!ref")(`!ref`)
    if (`!rows` != null) __obj.updateDynamic("!rows")(`!rows`)
    if (`!type` != null) __obj.updateDynamic("!type")(`!type`)
    __obj.asInstanceOf[WorkSheet]
  }
}

