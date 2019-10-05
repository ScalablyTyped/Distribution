package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinning {
  type columnPinHandler = js.Function2[
    /* colDef */ typings.uiDashGrid.uiDashGridMod.pinning.IColumnDef, 
    /* container */ String, 
    Unit
  ]
}
