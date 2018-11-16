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

