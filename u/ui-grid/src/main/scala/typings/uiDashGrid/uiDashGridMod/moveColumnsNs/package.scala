package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moveColumnsNs {
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typings.uiDashGrid.uiDashGridMod.moveColumnsNs.IColumnDef, 
    /* originalPosition */ Double, 
    /* finalPosition */ Double, 
    Unit
  ]
}
