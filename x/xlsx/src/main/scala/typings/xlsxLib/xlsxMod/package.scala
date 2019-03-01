package typings
package xlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xlsxMod {
  type NumberFormat = java.lang.String | scala.Double
  type SheetKeys = _SheetKeys | java.lang.String
  type WSKeys = _WSKeys | js.Array[ColInfo] | js.Array[RowInfo] | js.Array[Range]
}
