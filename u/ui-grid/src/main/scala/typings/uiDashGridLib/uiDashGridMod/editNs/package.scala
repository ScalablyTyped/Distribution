package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object editNs {
  type afterCellEditHandler[TEntity] = js.Function4[
    /* rowEntity */ TEntity, 
    /* colDef */ uiDashGridLib.uiDashGridMod.IColumnDefOf[TEntity], 
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    scala.Unit
  ]
  type beginCellEditHandler[TEntity] = js.Function3[
    /* rowEntity */ TEntity, 
    /* colDef */ uiDashGridLib.uiDashGridMod.IColumnDefOf[TEntity], 
    /* triggerEvent */ angularLib.JQueryEventObject, 
    scala.Unit
  ]
  type cancelCellEditHandler[TEntity] = js.Function2[
    /* rowEntity */ TEntity, 
    /* colDef */ uiDashGridLib.uiDashGridMod.IColumnDefOf[TEntity], 
    scala.Unit
  ]
}
