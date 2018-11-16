package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiGridNs {
  type ICellClassGetter[TEntity] = js.Function5[
    /* grid */ js.UndefOr[IGridInstanceOf[TEntity]], 
    /* gridRow */ js.UndefOr[IGridRowOf[TEntity]], 
    /* gridCol */ js.UndefOr[IGridColumnOf[TEntity]], 
    /* rowRenderIndex */ js.UndefOr[scala.Double], 
    /* colRenderIndex */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type ICellTooltipGetter[TEntity] = js.Function2[
    /* gridRow */ IGridRowOf[TEntity], 
    /* gridCol */ IGridColumnOf[TEntity], 
    java.lang.String
  ]
  type IColumnBuilder[TEntity] = js.Function3[
    /* colDef */ IColumnDefOf[TEntity], 
    /* col */ IGridColumnOf[TEntity], 
    /* gridOptions */ IGridOptionsOf[TEntity], 
    scala.Unit
  ]
  type IColumnDef = IColumnDefOf[js.Any]
  type IColumnProcessor[TEntity] = js.Function2[
    /* renderedColumnsToProcess */ js.Array[IGridColumnOf[TEntity]], 
    /* rows */ js.Array[IGridRowOf[TEntity]], 
    js.Array[IGridColumnOf[TEntity]]
  ]
  type IGridApi = IGridApiOf[js.Any]
  type IGridColumn = IGridColumnOf[js.Any]
  type IGridInstance = IGridInstanceOf[js.Any]
  type IGridOptions = IGridOptionsOf[js.Any]
  type IGridRow = IGridRowOf[js.Any]
  type IHeaderFooterCellClassGetter[TEntity] = js.Function5[
    /* grid */ IGridInstanceOf[TEntity], 
    /* gridRow */ IGridRowOf[TEntity], 
    /* gridCol */ IGridColumnOf[TEntity], 
    /* rowRenderIndex */ scala.Double, 
    /* colRenderIndex */ scala.Double, 
    java.lang.String
  ]
  type IHeaderTooltipGetter[TEntity] = js.Function1[/* gridCol */ IGridColumnOf[TEntity], java.lang.String]
  type IRowBuilder[TEntity] = js.Function2[/* row */ IGridRowOf[TEntity], /* gridOptions */ IGridOptionsOf[TEntity], scala.Unit]
  type IRowProcessor[TEntity] = js.Function2[
    /* renderedRowsToProcess */ js.Array[IGridRowOf[TEntity]], 
    /* columns */ js.Array[IGridColumnOf[TEntity]], 
    js.Array[IGridRowOf[TEntity]]
  ]
  type IStyleComputation = js.Function1[/* $scope */ angularLib.angularMod.angularNs.IScope, java.lang.String]
  type canvasHeightChangedHandler = js.Function2[/* oldHeight */ scala.Double, /* newHeight */ scala.Double, scala.Unit]
  type columnVisibilityChangedHandler[TEntity] = js.Function1[/* column */ IGridColumnOf[TEntity], scala.Unit]
  type filterChangedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], scala.Unit]
  type rowsRenderedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], scala.Unit]
  type rowsVisibleChangedHandler[TEntity] = js.Function1[/* gridApi */ IGridApiOf[TEntity], scala.Unit]
  type scrollBeginHandler = js.Function1[/* scrollEvent */ angularLib.JQueryMouseEventObject, scala.Unit]
  type scrollEndHandler = js.Function1[/* scrollEvent */ angularLib.JQueryMouseEventObject, scala.Unit]
  type sortChangedHandler[TEntity] = js.Function2[
    /* grid */ IGridInstanceOf[TEntity], 
    /* columns */ js.Array[IGridColumnOf[TEntity]], 
    scala.Unit
  ]
}
