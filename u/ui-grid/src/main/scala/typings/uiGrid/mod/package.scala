package typings.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ICellClassGetter[TEntity] = js.Function5[
    /* grid */ js.UndefOr[typings.uiGrid.mod.IGridInstanceOf[TEntity]], 
    /* gridRow */ js.UndefOr[typings.uiGrid.mod.IGridRowOf[TEntity]], 
    /* gridCol */ js.UndefOr[typings.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rowRenderIndex */ js.UndefOr[scala.Double], 
    /* colRenderIndex */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  
  type ICellTooltipGetter[TEntity] = js.Function2[
    /* gridRow */ typings.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typings.uiGrid.mod.IGridColumnOf[TEntity], 
    java.lang.String
  ]
  
  type IColumnBuilder[TEntity] = js.Function3[
    /* colDef */ typings.uiGrid.mod.IColumnDefOf[TEntity], 
    /* col */ typings.uiGrid.mod.IGridColumnOf[TEntity], 
    /* gridOptions */ typings.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  
  type IColumnDef = typings.uiGrid.mod.IColumnDefOf[js.Any]
  
  type IColumnProcessor[TEntity] = js.Function2[
    /* renderedColumnsToProcess */ js.Array[typings.uiGrid.mod.IGridColumnOf[TEntity]], 
    /* rows */ js.Array[typings.uiGrid.mod.IGridRowOf[TEntity]], 
    js.Array[typings.uiGrid.mod.IGridColumnOf[TEntity]]
  ]
  
  type IGridApi = typings.uiGrid.mod.IGridApiOf[js.Any]
  
  type IGridColumn = typings.uiGrid.mod.IGridColumnOf[js.Any]
  
  type IGridInstance = typings.uiGrid.mod.IGridInstanceOf[js.Any]
  
  type IGridOptions = typings.uiGrid.mod.IGridOptionsOf[js.Any]
  
  type IGridRow = typings.uiGrid.mod.IGridRowOf[js.Any]
  
  type IHeaderFooterCellClassGetter[TEntity] = js.Function5[
    /* grid */ typings.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* gridRow */ typings.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridCol */ typings.uiGrid.mod.IGridColumnOf[TEntity], 
    /* rowRenderIndex */ scala.Double, 
    /* colRenderIndex */ scala.Double, 
    java.lang.String
  ]
  
  type IHeaderTooltipGetter[TEntity] = js.Function1[/* gridCol */ typings.uiGrid.mod.IGridColumnOf[TEntity], java.lang.String]
  
  type IRowBuilder[TEntity] = js.Function2[
    /* row */ typings.uiGrid.mod.IGridRowOf[TEntity], 
    /* gridOptions */ typings.uiGrid.mod.IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  
  type IRowProcessor[TEntity] = js.Function2[
    /* renderedRowsToProcess */ js.Array[typings.uiGrid.mod.IGridRowOf[TEntity]], 
    /* columns */ js.Array[typings.uiGrid.mod.IGridColumnOf[TEntity]], 
    js.Array[typings.uiGrid.mod.IGridRowOf[TEntity]]
  ]
  
  type IStyleComputation = js.Function1[/* $scope */ typings.angular.mod.IScope, java.lang.String]
  
  type canvasHeightChangedHandler = js.Function2[/* oldHeight */ scala.Double, /* newHeight */ scala.Double, scala.Unit]
  
  type columnVisibilityChangedHandler[TEntity] = js.Function1[/* column */ typings.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
  
  type filterChangedHandler[TEntity] = js.Function1[/* gridApi */ typings.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type rowsRenderedHandler[TEntity] = js.Function1[/* gridApi */ typings.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type rowsVisibleChangedHandler[TEntity] = js.Function1[/* gridApi */ typings.uiGrid.mod.IGridApiOf[TEntity], scala.Unit]
  
  type scrollBeginHandler = js.Function1[/* scrollEvent */ typings.angular.JQueryMouseEventObject, scala.Unit]
  
  type scrollEndHandler = js.Function1[/* scrollEvent */ typings.angular.JQueryMouseEventObject, scala.Unit]
  
  type sortChangedHandler[TEntity] = js.Function2[
    /* grid */ typings.uiGrid.mod.IGridInstanceOf[TEntity], 
    /* columns */ js.Array[typings.uiGrid.mod.IGridColumnOf[TEntity]], 
    scala.Unit
  ]
}
