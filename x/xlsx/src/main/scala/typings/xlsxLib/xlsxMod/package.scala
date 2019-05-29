package typings
package xlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xlsxMod {
  type NumberFormat = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - MarginInfo
    - SheetType
  */
  type SheetKeys = _SheetKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - SheetKeys
    - js.Array[ColInfo | Range | RowInfo]
    - ProtectInfo
    - AutoFilterInfo
  */
  type WSKeys = _WSKeys | (js.Array[ColInfo | Range | RowInfo]) | java.lang.String
}
