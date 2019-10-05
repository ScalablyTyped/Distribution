package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object edit {
  import typings.angular.JQueryEventObject
  import typings.uiDashGrid.uiDashGridMod.IColumnDefOf

  type afterCellEditHandler[TEntity] = js.Function4[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    Unit
  ]
  type beginCellEditHandler[TEntity] = js.Function3[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* triggerEvent */ JQueryEventObject, 
    Unit
  ]
  type cancelCellEditHandler[TEntity] = js.Function2[/* rowEntity */ TEntity, /* colDef */ IColumnDefOf[TEntity], Unit]
}
