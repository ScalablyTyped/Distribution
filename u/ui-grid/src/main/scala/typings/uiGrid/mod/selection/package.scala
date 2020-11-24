package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selection {
  
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[
    /* row */ js.Array[typings.uiGrid.mod.IGridRowOf[TEntity]], 
    /* event */ js.UndefOr[typings.angular.mod.IAngularEvent], 
    scala.Unit
  ]
  
  type rowSelectionChangedHandler[TEntity] = js.Function2[
    /* row */ typings.uiGrid.mod.IGridRowOf[TEntity], 
    /* event */ js.UndefOr[typings.angular.mod.IAngularEvent], 
    scala.Unit
  ]
}
