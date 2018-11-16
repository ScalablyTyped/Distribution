package typings
package xlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xlsxMod {
  type BookType = xlsxLib.xlsxLibStrings.xlsx | xlsxLib.xlsxLibStrings.xlsm | xlsxLib.xlsxLibStrings.xlsb | xlsxLib.xlsxLibStrings.xls | xlsxLib.xlsxLibStrings.xla | xlsxLib.xlsxLibStrings.biff8 | xlsxLib.xlsxLibStrings.biff5 | xlsxLib.xlsxLibStrings.biff2 | xlsxLib.xlsxLibStrings.xlml | xlsxLib.xlsxLibStrings.ods | xlsxLib.xlsxLibStrings.fods | xlsxLib.xlsxLibStrings.csv | xlsxLib.xlsxLibStrings.txt | xlsxLib.xlsxLibStrings.sylk | xlsxLib.xlsxLibStrings.html | xlsxLib.xlsxLibStrings.dif | xlsxLib.xlsxLibStrings.rtf | xlsxLib.xlsxLibStrings.prn | xlsxLib.xlsxLibStrings.eth
  type ExcelDataType = xlsxLib.xlsxLibStrings.b | xlsxLib.xlsxLibStrings.n | xlsxLib.xlsxLibStrings.e | xlsxLib.xlsxLibStrings.s | xlsxLib.xlsxLibStrings.d | xlsxLib.xlsxLibStrings.z
  type NumberFormat = java.lang.String | scala.Double
  type SheetKeys = java.lang.String | MarginInfo | SheetType
  type SheetType = xlsxLib.xlsxLibStrings.sheet | xlsxLib.xlsxLibStrings.chart
  type WSKeys = SheetKeys | js.Array[ColInfo] | js.Array[RowInfo] | js.Array[Range] | ProtectInfo | AutoFilterInfo
}
