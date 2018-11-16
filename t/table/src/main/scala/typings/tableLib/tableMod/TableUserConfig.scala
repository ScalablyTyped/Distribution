package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableUserConfig extends js.Object {
  var border: js.UndefOr[JoinStruct] = js.undefined
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  var columnDefault: js.UndefOr[ColumnConfig] = js.undefined
  var columns: js.UndefOr[ScalablyTyped.runtime.NumberDictionary[ColumnConfig]] = js.undefined
  var drawHorizontalLine: js.UndefOr[js.Function2[/* index */ scala.Double, /* size */ scala.Double, scala.Boolean]] = js.undefined
}

