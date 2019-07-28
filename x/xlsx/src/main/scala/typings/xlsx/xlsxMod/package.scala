package typings.xlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xlsxMod {
  type NumberFormat = String | Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xlsx.xlsxMod.MarginInfo
    - typings.xlsx.xlsxMod.SheetType
  */
  type SheetKeys = _SheetKeys | String
  /* Rewritten from type alias, can be one of: 
    - typings.xlsx.xlsxMod.SheetKeys
    - js.Array[
  typings.xlsx.xlsxMod.ColInfo | typings.xlsx.xlsxMod.Range | typings.xlsx.xlsxMod.RowInfo]
    - typings.xlsx.xlsxMod.ProtectInfo
    - typings.xlsx.xlsxMod.AutoFilterInfo
  */
  type WSKeys = _WSKeys | (js.Array[ColInfo | Range | RowInfo]) | String
}
