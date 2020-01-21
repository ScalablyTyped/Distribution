package typings.xlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NumberFormat = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xlsx.mod.MarginInfo
    - typings.xlsx.mod.SheetType
  */
  type SheetKeys = typings.xlsx.mod._SheetKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.xlsx.mod.SheetKeys
    - js.Array[typings.xlsx.mod.ColInfo | typings.xlsx.mod.Range | typings.xlsx.mod.RowInfo]
    - typings.xlsx.mod.ProtectInfo
    - typings.xlsx.mod.AutoFilterInfo
  */
  type WSKeys = typings.xlsx.mod._WSKeys | (js.Array[typings.xlsx.mod.ColInfo | typings.xlsx.mod.Range | typings.xlsx.mod.RowInfo]) | java.lang.String
}
