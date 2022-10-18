package typings.tabulatorTables

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.UIEvent
import typings.tabulatorTables.mod.CellComponent
import typings.tabulatorTables.mod.CellEditEventCallback
import typings.tabulatorTables.mod.CellEventCallback
import typings.tabulatorTables.mod.ColumnCalc
import typings.tabulatorTables.mod.ColumnCalcParams
import typings.tabulatorTables.mod.ColumnComponent
import typings.tabulatorTables.mod.ColumnDefinition
import typings.tabulatorTables.mod.ColumnDefinitionAlign
import typings.tabulatorTables.mod.ColumnDefinitionSorterParams
import typings.tabulatorTables.mod.ColumnEventCallback
import typings.tabulatorTables.mod.ColumnSorterParamLookupFunction
import typings.tabulatorTables.mod.CustomAccessor
import typings.tabulatorTables.mod.CustomAccessorParams
import typings.tabulatorTables.mod.CustomMutator
import typings.tabulatorTables.mod.CustomMutatorParams
import typings.tabulatorTables.mod.Editor
import typings.tabulatorTables.mod.EditorParams
import typings.tabulatorTables.mod.EmptyCallback
import typings.tabulatorTables.mod.FilterType
import typings.tabulatorTables.mod.Formatter
import typings.tabulatorTables.mod.FormatterParams
import typings.tabulatorTables.mod.GlobalTooltipOption
import typings.tabulatorTables.mod.MenuObject
import typings.tabulatorTables.mod.MenuSeparator
import typings.tabulatorTables.mod.RowComponent
import typings.tabulatorTables.mod.SortDirection
import typings.tabulatorTables.mod.StandardValidatorType
import typings.tabulatorTables.mod.Validator
import typings.tabulatorTables.mod.ValueBooleanCallback
import typings.tabulatorTables.mod.ValueVoidCallback
import typings.tabulatorTables.mod.VerticalAlign
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.cell
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.header
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tabulator-tables.tabulator-tables.ColumnDefinition> */
  trait PartialColumnDefinition extends StObject {
    
    var accessor: js.UndefOr[CustomAccessor] = js.undefined
    
    var accessorClipboard: js.UndefOr[CustomAccessor] = js.undefined
    
    var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.undefined
    
    var accessorDownload: js.UndefOr[CustomAccessor] = js.undefined
    
    var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.undefined
    
    var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.undefined
    
    var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.undefined
    
    var accessorParams: js.UndefOr[CustomAccessorParams] = js.undefined
    
    var accessorPrint: js.UndefOr[CustomAccessor] = js.undefined
    
    var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.undefined
    
    var bottomCalc: js.UndefOr[ColumnCalc] = js.undefined
    
    var bottomCalcFormatter: js.UndefOr[Formatter] = js.undefined
    
    var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
    
    var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
    
    var cellClick: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellContext: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
    
    var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
    
    var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
    
    var cellMouseDown: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellMouseUp: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellPopup: js.UndefOr[
        String | (js.Function3[
          /* e */ MouseEvent, 
          /* component */ RowComponent | CellComponent | ColumnComponent, 
          /* onRendered */ js.Function0[Any], 
          Any
        ])
      ] = js.undefined
    
    var cellTap: js.UndefOr[CellEventCallback] = js.undefined
    
    var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
    
    var clickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
    
    var clipboard: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
    
    var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
    
    var contextMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
    
    var cssClass: js.UndefOr[String] = js.undefined
    
    var dblClickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
    
    var dblClickPopup: js.UndefOr[String] = js.undefined
    
    var download: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
    
    var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.undefined
    
    var editableTitle: js.UndefOr[Boolean] = js.undefined
    
    var editor: js.UndefOr[Editor] = js.undefined
    
    var editorParams: js.UndefOr[EditorParams] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[Formatter] = js.undefined
    
    var formatterClipboard: js.UndefOr[Formatter | `false`] = js.undefined
    
    var formatterClipboardParams: js.UndefOr[FormatterParams] = js.undefined
    
    var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.undefined
    
    var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.undefined
    
    var formatterParams: js.UndefOr[FormatterParams] = js.undefined
    
    var formatterPrint: js.UndefOr[Formatter | `false`] = js.undefined
    
    var formatterPrintParams: js.UndefOr[FormatterParams] = js.undefined
    
    var frozen: js.UndefOr[Boolean] = js.undefined
    
    var headerClick: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerContext: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerContextMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
    
    var headerDblClick: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerDblClickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
    
    var headerDblClickPopup: js.UndefOr[String] = js.undefined
    
    var headerDblTap: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerFilter: js.UndefOr[Editor] = js.undefined
    
    var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.undefined
    
    var headerFilterFunc: js.UndefOr[
        FilterType | (js.Function4[
          /* headerValue */ Any, 
          /* rowValue */ Any, 
          /* rowdata */ Any, 
          /* filterparams */ Any, 
          Boolean
        ])
      ] = js.undefined
    
    var headerFilterFuncParams: js.UndefOr[Any] = js.undefined
    
    var headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined
    
    var headerFilterParams: js.UndefOr[EditorParams] = js.undefined
    
    var headerFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    var headerHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
    
    var headerMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
    
    var headerMenuIcon: js.UndefOr[
        String | HTMLElement | (js.Function1[/* component */ ColumnComponent, HTMLElement | String])
      ] = js.undefined
    
    var headerMouseDown: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerMouseUp: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerSort: js.UndefOr[Boolean] = js.undefined
    
    var headerSortStartingDir: js.UndefOr[SortDirection] = js.undefined
    
    var headerSortTristate: js.UndefOr[Boolean] = js.undefined
    
    var headerTap: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerTapHold: js.UndefOr[ColumnEventCallback] = js.undefined
    
    var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.undefined
    
    var headerVertical: js.UndefOr[Boolean | flip] = js.undefined
    
    var headerWordWrap: js.UndefOr[Boolean] = js.undefined
    
    var hideInHtml: js.UndefOr[Boolean] = js.undefined
    
    var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
    
    var htmlOutput: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
    
    var maxWidth: js.UndefOr[Double | `false`] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var mutator: js.UndefOr[CustomMutator] = js.undefined
    
    var mutatorClipboard: js.UndefOr[CustomMutator] = js.undefined
    
    var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.undefined
    
    var mutatorData: js.UndefOr[CustomMutator] = js.undefined
    
    var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.undefined
    
    var mutatorEdit: js.UndefOr[CustomMutator] = js.undefined
    
    var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.undefined
    
    var mutatorParams: js.UndefOr[CustomMutatorParams] = js.undefined
    
    var print: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
    
    var resizable: js.UndefOr[`true` | `false` | header | cell] = js.undefined
    
    var responsive: js.UndefOr[Double] = js.undefined
    
    var rowHandle: js.UndefOr[Boolean] = js.undefined
    
    var sorter: js.UndefOr[
        string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
          /* a */ Any, 
          /* b */ Any, 
          /* aRow */ RowComponent, 
          /* bRow */ RowComponent, 
          /* column */ ColumnComponent, 
          /* dir */ SortDirection, 
          /* sorterParams */ js.Object, 
          Double
        ])
      ] = js.undefined
    
    var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleClipboard: js.UndefOr[String] = js.undefined
    
    var titleDownload: js.UndefOr[String] = js.undefined
    
    var titleFormatter: js.UndefOr[Formatter] = js.undefined
    
    var titleFormatterParams: js.UndefOr[FormatterParams] = js.undefined
    
    var titleHtmlOutput: js.UndefOr[String] = js.undefined
    
    var titlePrint: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.undefined
    
    var topCalc: js.UndefOr[ColumnCalc] = js.undefined
    
    var topCalcFormatter: js.UndefOr[Formatter] = js.undefined
    
    var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
    
    var topCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
    
    var validator: js.UndefOr[
        StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String
      ] = js.undefined
    
    var variableHeight: js.UndefOr[Boolean] = js.undefined
    
    var vertAlign: js.UndefOr[VerticalAlign] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var widthGrow: js.UndefOr[Double] = js.undefined
    
    var widthShrink: js.UndefOr[Double] = js.undefined
  }
  object PartialColumnDefinition {
    
    inline def apply(): PartialColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialColumnDefinition]
    }
    
    extension [Self <: PartialColumnDefinition](x: Self) {
      
      inline def setAccessor(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessor", js.Any.fromFunction6(value))
      
      inline def setAccessorClipboard(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorClipboard", js.Any.fromFunction6(value))
      
      inline def setAccessorClipboardParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorClipboardParams", value.asInstanceOf[js.Any])
      
      inline def setAccessorClipboardParamsFunction5(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorClipboardParams", js.Any.fromFunction5(value))
      
      inline def setAccessorClipboardParamsUndefined: Self = StObject.set(x, "accessorClipboardParams", js.undefined)
      
      inline def setAccessorClipboardUndefined: Self = StObject.set(x, "accessorClipboard", js.undefined)
      
      inline def setAccessorDownload(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorDownload", js.Any.fromFunction6(value))
      
      inline def setAccessorDownloadParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorDownloadParams", value.asInstanceOf[js.Any])
      
      inline def setAccessorDownloadParamsFunction5(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorDownloadParams", js.Any.fromFunction5(value))
      
      inline def setAccessorDownloadParamsUndefined: Self = StObject.set(x, "accessorDownloadParams", js.undefined)
      
      inline def setAccessorDownloadUndefined: Self = StObject.set(x, "accessorDownload", js.undefined)
      
      inline def setAccessorHtmlOutput(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorHtmlOutput", js.Any.fromFunction6(value))
      
      inline def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorHtmlOutputParams", value.asInstanceOf[js.Any])
      
      inline def setAccessorHtmlOutputParamsFunction5(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorHtmlOutputParams", js.Any.fromFunction5(value))
      
      inline def setAccessorHtmlOutputParamsUndefined: Self = StObject.set(x, "accessorHtmlOutputParams", js.undefined)
      
      inline def setAccessorHtmlOutputUndefined: Self = StObject.set(x, "accessorHtmlOutput", js.undefined)
      
      inline def setAccessorParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorParams", value.asInstanceOf[js.Any])
      
      inline def setAccessorParamsFunction5(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorParams", js.Any.fromFunction5(value))
      
      inline def setAccessorParamsUndefined: Self = StObject.set(x, "accessorParams", js.undefined)
      
      inline def setAccessorPrint(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorPrint", js.Any.fromFunction6(value))
      
      inline def setAccessorPrintParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorPrintParams", value.asInstanceOf[js.Any])
      
      inline def setAccessorPrintParamsFunction5(
        value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
      ): Self = StObject.set(x, "accessorPrintParams", js.Any.fromFunction5(value))
      
      inline def setAccessorPrintParamsUndefined: Self = StObject.set(x, "accessorPrintParams", js.undefined)
      
      inline def setAccessorPrintUndefined: Self = StObject.set(x, "accessorPrint", js.undefined)
      
      inline def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      inline def setBottomCalc(value: ColumnCalc): Self = StObject.set(x, "bottomCalc", value.asInstanceOf[js.Any])
      
      inline def setBottomCalcFormatter(value: Formatter): Self = StObject.set(x, "bottomCalcFormatter", value.asInstanceOf[js.Any])
      
      inline def setBottomCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "bottomCalcFormatter", js.Any.fromFunction3(value))
      
      inline def setBottomCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "bottomCalcFormatterParams", value.asInstanceOf[js.Any])
      
      inline def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "bottomCalcFormatterParams", js.Any.fromFunction1(value))
      
      inline def setBottomCalcFormatterParamsUndefined: Self = StObject.set(x, "bottomCalcFormatterParams", js.undefined)
      
      inline def setBottomCalcFormatterUndefined: Self = StObject.set(x, "bottomCalcFormatter", js.undefined)
      
      inline def setBottomCalcFunction3(value: (/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object) => Any): Self = StObject.set(x, "bottomCalc", js.Any.fromFunction3(value))
      
      inline def setBottomCalcParams(value: (/* values */ Any, /* data */ Any) => Any): Self = StObject.set(x, "bottomCalcParams", js.Any.fromFunction2(value))
      
      inline def setBottomCalcParamsUndefined: Self = StObject.set(x, "bottomCalcParams", js.undefined)
      
      inline def setBottomCalcUndefined: Self = StObject.set(x, "bottomCalc", js.undefined)
      
      inline def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
      
      inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      inline def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
      
      inline def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
      
      inline def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
      
      inline def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
      
      inline def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
      
      inline def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
      
      inline def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
      
      inline def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
      
      inline def setCellEdited(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
      
      inline def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
      
      inline def setCellEditing(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
      
      inline def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
      
      inline def setCellMouseDown(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2(value))
      
      inline def setCellMouseDownUndefined: Self = StObject.set(x, "cellMouseDown", js.undefined)
      
      inline def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
      
      inline def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      inline def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
      
      inline def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      inline def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
      
      inline def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
      
      inline def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
      
      inline def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
      
      inline def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
      
      inline def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      inline def setCellMouseUp(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2(value))
      
      inline def setCellMouseUpUndefined: Self = StObject.set(x, "cellMouseUp", js.undefined)
      
      inline def setCellPopup(
        value: String | (js.Function3[
              /* e */ MouseEvent, 
              /* component */ RowComponent | CellComponent | ColumnComponent, 
              /* onRendered */ js.Function0[Any], 
              Any
            ])
      ): Self = StObject.set(x, "cellPopup", value.asInstanceOf[js.Any])
      
      inline def setCellPopupFunction3(
        value: (/* e */ MouseEvent, /* component */ RowComponent | CellComponent | ColumnComponent, /* onRendered */ js.Function0[Any]) => Any
      ): Self = StObject.set(x, "cellPopup", js.Any.fromFunction3(value))
      
      inline def setCellPopupUndefined: Self = StObject.set(x, "cellPopup", js.undefined)
      
      inline def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
      
      inline def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
      
      inline def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
      
      inline def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
      
      inline def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "clickMenu", value.asInstanceOf[js.Any])
      
      inline def setClickMenuUndefined: Self = StObject.set(x, "clickMenu", js.undefined)
      
      inline def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "clickMenu", js.Array(value*))
      
      inline def setClipboard(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setClipboardFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "clipboard", js.Any.fromFunction1(value))
      
      inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "contextMenu", js.Array(value*))
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDblClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "dblClickMenu", value.asInstanceOf[js.Any])
      
      inline def setDblClickMenuUndefined: Self = StObject.set(x, "dblClickMenu", js.undefined)
      
      inline def setDblClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "dblClickMenu", js.Array(value*))
      
      inline def setDblClickPopup(value: String): Self = StObject.set(x, "dblClickPopup", value.asInstanceOf[js.Any])
      
      inline def setDblClickPopupUndefined: Self = StObject.set(x, "dblClickPopup", js.undefined)
      
      inline def setDownload(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
      
      inline def setEditableTitle(value: Boolean): Self = StObject.set(x, "editableTitle", value.asInstanceOf[js.Any])
      
      inline def setEditableTitleUndefined: Self = StObject.set(x, "editableTitle", js.undefined)
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "editor", js.Any.fromFunction5(value))
      
      inline def setEditorParams(value: EditorParams): Self = StObject.set(x, "editorParams", value.asInstanceOf[js.Any])
      
      inline def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "editorParams", js.Any.fromFunction1(value))
      
      inline def setEditorParamsUndefined: Self = StObject.set(x, "editorParams", js.undefined)
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterClipboard(value: Formatter | `false`): Self = StObject.set(x, "formatterClipboard", value.asInstanceOf[js.Any])
      
      inline def setFormatterClipboardFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterClipboard", js.Any.fromFunction3(value))
      
      inline def setFormatterClipboardParams(value: FormatterParams): Self = StObject.set(x, "formatterClipboardParams", value.asInstanceOf[js.Any])
      
      inline def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterClipboardParams", js.Any.fromFunction1(value))
      
      inline def setFormatterClipboardParamsUndefined: Self = StObject.set(x, "formatterClipboardParams", js.undefined)
      
      inline def setFormatterClipboardUndefined: Self = StObject.set(x, "formatterClipboard", js.undefined)
      
      inline def setFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      inline def setFormatterHtmlOutput(value: Formatter | `false`): Self = StObject.set(x, "formatterHtmlOutput", value.asInstanceOf[js.Any])
      
      inline def setFormatterHtmlOutputFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterHtmlOutput", js.Any.fromFunction3(value))
      
      inline def setFormatterHtmlOutputParams(value: FormatterParams): Self = StObject.set(x, "formatterHtmlOutputParams", value.asInstanceOf[js.Any])
      
      inline def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterHtmlOutputParams", js.Any.fromFunction1(value))
      
      inline def setFormatterHtmlOutputParamsUndefined: Self = StObject.set(x, "formatterHtmlOutputParams", js.undefined)
      
      inline def setFormatterHtmlOutputUndefined: Self = StObject.set(x, "formatterHtmlOutput", js.undefined)
      
      inline def setFormatterParams(value: FormatterParams): Self = StObject.set(x, "formatterParams", value.asInstanceOf[js.Any])
      
      inline def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterParams", js.Any.fromFunction1(value))
      
      inline def setFormatterParamsUndefined: Self = StObject.set(x, "formatterParams", js.undefined)
      
      inline def setFormatterPrint(value: Formatter | `false`): Self = StObject.set(x, "formatterPrint", value.asInstanceOf[js.Any])
      
      inline def setFormatterPrintFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterPrint", js.Any.fromFunction3(value))
      
      inline def setFormatterPrintParams(value: FormatterParams): Self = StObject.set(x, "formatterPrintParams", value.asInstanceOf[js.Any])
      
      inline def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterPrintParams", js.Any.fromFunction1(value))
      
      inline def setFormatterPrintParamsUndefined: Self = StObject.set(x, "formatterPrintParams", js.undefined)
      
      inline def setFormatterPrintUndefined: Self = StObject.set(x, "formatterPrint", js.undefined)
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      inline def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction2(value))
      
      inline def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
      
      inline def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerContext", js.Any.fromFunction2(value))
      
      inline def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerContextMenu", value.asInstanceOf[js.Any])
      
      inline def setHeaderContextMenuUndefined: Self = StObject.set(x, "headerContextMenu", js.undefined)
      
      inline def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerContextMenu", js.Array(value*))
      
      inline def setHeaderContextUndefined: Self = StObject.set(x, "headerContext", js.undefined)
      
      inline def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2(value))
      
      inline def setHeaderDblClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "headerDblClickMenu", value.asInstanceOf[js.Any])
      
      inline def setHeaderDblClickMenuUndefined: Self = StObject.set(x, "headerDblClickMenu", js.undefined)
      
      inline def setHeaderDblClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "headerDblClickMenu", js.Array(value*))
      
      inline def setHeaderDblClickPopup(value: String): Self = StObject.set(x, "headerDblClickPopup", value.asInstanceOf[js.Any])
      
      inline def setHeaderDblClickPopupUndefined: Self = StObject.set(x, "headerDblClickPopup", js.undefined)
      
      inline def setHeaderDblClickUndefined: Self = StObject.set(x, "headerDblClick", js.undefined)
      
      inline def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2(value))
      
      inline def setHeaderDblTapUndefined: Self = StObject.set(x, "headerDblTap", js.undefined)
      
      inline def setHeaderFilter(value: Editor): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterEmptyCheck(value: /* value */ Any => Boolean): Self = StObject.set(x, "headerFilterEmptyCheck", js.Any.fromFunction1(value))
      
      inline def setHeaderFilterEmptyCheckUndefined: Self = StObject.set(x, "headerFilterEmptyCheck", js.undefined)
      
      inline def setHeaderFilterFunc(
        value: FilterType | (js.Function4[
              /* headerValue */ Any, 
              /* rowValue */ Any, 
              /* rowdata */ Any, 
              /* filterparams */ Any, 
              Boolean
            ])
      ): Self = StObject.set(x, "headerFilterFunc", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterFuncFunction4(
        value: (/* headerValue */ Any, /* rowValue */ Any, /* rowdata */ Any, /* filterparams */ Any) => Boolean
      ): Self = StObject.set(x, "headerFilterFunc", js.Any.fromFunction4(value))
      
      inline def setHeaderFilterFuncParams(value: Any): Self = StObject.set(x, "headerFilterFuncParams", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterFuncParamsUndefined: Self = StObject.set(x, "headerFilterFuncParams", js.undefined)
      
      inline def setHeaderFilterFuncUndefined: Self = StObject.set(x, "headerFilterFunc", js.undefined)
      
      inline def setHeaderFilterFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "headerFilter", js.Any.fromFunction5(value))
      
      inline def setHeaderFilterLiveFilter(value: Boolean): Self = StObject.set(x, "headerFilterLiveFilter", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterLiveFilterUndefined: Self = StObject.set(x, "headerFilterLiveFilter", js.undefined)
      
      inline def setHeaderFilterParams(value: EditorParams): Self = StObject.set(x, "headerFilterParams", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "headerFilterParams", js.Any.fromFunction1(value))
      
      inline def setHeaderFilterParamsUndefined: Self = StObject.set(x, "headerFilterParams", js.undefined)
      
      inline def setHeaderFilterPlaceholder(value: String): Self = StObject.set(x, "headerFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterPlaceholderUndefined: Self = StObject.set(x, "headerFilterPlaceholder", js.undefined)
      
      inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
      
      inline def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "headerHozAlign", value.asInstanceOf[js.Any])
      
      inline def setHeaderHozAlignUndefined: Self = StObject.set(x, "headerHozAlign", js.undefined)
      
      inline def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
      
      inline def setHeaderMenuIcon(
        value: String | HTMLElement | (js.Function1[/* component */ ColumnComponent, HTMLElement | String])
      ): Self = StObject.set(x, "headerMenuIcon", value.asInstanceOf[js.Any])
      
      inline def setHeaderMenuIconFunction1(value: /* component */ ColumnComponent => HTMLElement | String): Self = StObject.set(x, "headerMenuIcon", js.Any.fromFunction1(value))
      
      inline def setHeaderMenuIconUndefined: Self = StObject.set(x, "headerMenuIcon", js.undefined)
      
      inline def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
      
      inline def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerMenu", js.Array(value*))
      
      inline def setHeaderMouseDown(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseDown", js.Any.fromFunction2(value))
      
      inline def setHeaderMouseDownUndefined: Self = StObject.set(x, "headerMouseDown", js.undefined)
      
      inline def setHeaderMouseUp(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseUp", js.Any.fromFunction2(value))
      
      inline def setHeaderMouseUpUndefined: Self = StObject.set(x, "headerMouseUp", js.undefined)
      
      inline def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
      
      inline def setHeaderSortStartingDir(value: SortDirection): Self = StObject.set(x, "headerSortStartingDir", value.asInstanceOf[js.Any])
      
      inline def setHeaderSortStartingDirUndefined: Self = StObject.set(x, "headerSortStartingDir", js.undefined)
      
      inline def setHeaderSortTristate(value: Boolean): Self = StObject.set(x, "headerSortTristate", value.asInstanceOf[js.Any])
      
      inline def setHeaderSortTristateUndefined: Self = StObject.set(x, "headerSortTristate", js.undefined)
      
      inline def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
      
      inline def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTap", js.Any.fromFunction2(value))
      
      inline def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2(value))
      
      inline def setHeaderTapHoldUndefined: Self = StObject.set(x, "headerTapHold", js.undefined)
      
      inline def setHeaderTapUndefined: Self = StObject.set(x, "headerTap", js.undefined)
      
      inline def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      inline def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = StObject.set(x, "headerTooltip", js.Any.fromFunction1(value))
      
      inline def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      inline def setHeaderVertical(value: Boolean | flip): Self = StObject.set(x, "headerVertical", value.asInstanceOf[js.Any])
      
      inline def setHeaderVerticalUndefined: Self = StObject.set(x, "headerVertical", js.undefined)
      
      inline def setHeaderWordWrap(value: Boolean): Self = StObject.set(x, "headerWordWrap", value.asInstanceOf[js.Any])
      
      inline def setHeaderWordWrapUndefined: Self = StObject.set(x, "headerWordWrap", js.undefined)
      
      inline def setHideInHtml(value: Boolean): Self = StObject.set(x, "hideInHtml", value.asInstanceOf[js.Any])
      
      inline def setHideInHtmlUndefined: Self = StObject.set(x, "hideInHtml", js.undefined)
      
      inline def setHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "hozAlign", value.asInstanceOf[js.Any])
      
      inline def setHozAlignUndefined: Self = StObject.set(x, "hozAlign", js.undefined)
      
      inline def setHtmlOutput(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "htmlOutput", value.asInstanceOf[js.Any])
      
      inline def setHtmlOutputFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "htmlOutput", js.Any.fromFunction1(value))
      
      inline def setHtmlOutputUndefined: Self = StObject.set(x, "htmlOutput", js.undefined)
      
      inline def setMaxWidth(value: Double | `false`): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMutator(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutator", js.Any.fromFunction5(value))
      
      inline def setMutatorClipboard(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorClipboard", js.Any.fromFunction5(value))
      
      inline def setMutatorClipboardParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorClipboardParams", value.asInstanceOf[js.Any])
      
      inline def setMutatorClipboardParamsFunction4(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorClipboardParams", js.Any.fromFunction4(value))
      
      inline def setMutatorClipboardParamsUndefined: Self = StObject.set(x, "mutatorClipboardParams", js.undefined)
      
      inline def setMutatorClipboardUndefined: Self = StObject.set(x, "mutatorClipboard", js.undefined)
      
      inline def setMutatorData(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorData", js.Any.fromFunction5(value))
      
      inline def setMutatorDataParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorDataParams", value.asInstanceOf[js.Any])
      
      inline def setMutatorDataParamsFunction4(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorDataParams", js.Any.fromFunction4(value))
      
      inline def setMutatorDataParamsUndefined: Self = StObject.set(x, "mutatorDataParams", js.undefined)
      
      inline def setMutatorDataUndefined: Self = StObject.set(x, "mutatorData", js.undefined)
      
      inline def setMutatorEdit(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorEdit", js.Any.fromFunction5(value))
      
      inline def setMutatorEditParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorEditParams", value.asInstanceOf[js.Any])
      
      inline def setMutatorEditParamsFunction4(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorEditParams", js.Any.fromFunction4(value))
      
      inline def setMutatorEditParamsUndefined: Self = StObject.set(x, "mutatorEditParams", js.undefined)
      
      inline def setMutatorEditUndefined: Self = StObject.set(x, "mutatorEdit", js.undefined)
      
      inline def setMutatorParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorParams", value.asInstanceOf[js.Any])
      
      inline def setMutatorParamsFunction4(
        value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
      ): Self = StObject.set(x, "mutatorParams", js.Any.fromFunction4(value))
      
      inline def setMutatorParamsUndefined: Self = StObject.set(x, "mutatorParams", js.undefined)
      
      inline def setMutatorUndefined: Self = StObject.set(x, "mutator", js.undefined)
      
      inline def setPrint(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setResizable(value: `true` | `false` | header | cell): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setResponsive(value: Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRowHandle(value: Boolean): Self = StObject.set(x, "rowHandle", value.asInstanceOf[js.Any])
      
      inline def setRowHandleUndefined: Self = StObject.set(x, "rowHandle", js.undefined)
      
      inline def setSorter(
        value: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
              /* a */ Any, 
              /* b */ Any, 
              /* aRow */ RowComponent, 
              /* bRow */ RowComponent, 
              /* column */ ColumnComponent, 
              /* dir */ SortDirection, 
              /* sorterParams */ js.Object, 
              Double
            ])
      ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      inline def setSorterFunction7(
        value: (/* a */ Any, /* b */ Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
      ): Self = StObject.set(x, "sorter", js.Any.fromFunction7(value))
      
      inline def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = StObject.set(x, "sorterParams", value.asInstanceOf[js.Any])
      
      inline def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = StObject.set(x, "sorterParams", js.Any.fromFunction2(value))
      
      inline def setSorterParamsUndefined: Self = StObject.set(x, "sorterParams", js.undefined)
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleClipboard(value: String): Self = StObject.set(x, "titleClipboard", value.asInstanceOf[js.Any])
      
      inline def setTitleClipboardUndefined: Self = StObject.set(x, "titleClipboard", js.undefined)
      
      inline def setTitleDownload(value: String): Self = StObject.set(x, "titleDownload", value.asInstanceOf[js.Any])
      
      inline def setTitleDownloadUndefined: Self = StObject.set(x, "titleDownload", js.undefined)
      
      inline def setTitleFormatter(value: Formatter): Self = StObject.set(x, "titleFormatter", value.asInstanceOf[js.Any])
      
      inline def setTitleFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
      
      inline def setTitleFormatterParams(value: FormatterParams): Self = StObject.set(x, "titleFormatterParams", value.asInstanceOf[js.Any])
      
      inline def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "titleFormatterParams", js.Any.fromFunction1(value))
      
      inline def setTitleFormatterParamsUndefined: Self = StObject.set(x, "titleFormatterParams", js.undefined)
      
      inline def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
      
      inline def setTitleHtmlOutput(value: String): Self = StObject.set(x, "titleHtmlOutput", value.asInstanceOf[js.Any])
      
      inline def setTitleHtmlOutputUndefined: Self = StObject.set(x, "titleHtmlOutput", js.undefined)
      
      inline def setTitlePrint(value: String): Self = StObject.set(x, "titlePrint", value.asInstanceOf[js.Any])
      
      inline def setTitlePrintUndefined: Self = StObject.set(x, "titlePrint", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: String | GlobalTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFunction3(
        value: (/* event */ MouseEvent, /* cell */ CellComponent, /* onRender */ js.Function0[Unit]) => String
      ): Self = StObject.set(x, "tooltip", js.Any.fromFunction3(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTopCalc(value: ColumnCalc): Self = StObject.set(x, "topCalc", value.asInstanceOf[js.Any])
      
      inline def setTopCalcFormatter(value: Formatter): Self = StObject.set(x, "topCalcFormatter", value.asInstanceOf[js.Any])
      
      inline def setTopCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "topCalcFormatter", js.Any.fromFunction3(value))
      
      inline def setTopCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "topCalcFormatterParams", value.asInstanceOf[js.Any])
      
      inline def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "topCalcFormatterParams", js.Any.fromFunction1(value))
      
      inline def setTopCalcFormatterParamsUndefined: Self = StObject.set(x, "topCalcFormatterParams", js.undefined)
      
      inline def setTopCalcFormatterUndefined: Self = StObject.set(x, "topCalcFormatter", js.undefined)
      
      inline def setTopCalcFunction3(value: (/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object) => Any): Self = StObject.set(x, "topCalc", js.Any.fromFunction3(value))
      
      inline def setTopCalcParams(value: (/* values */ Any, /* data */ Any) => Any): Self = StObject.set(x, "topCalcParams", js.Any.fromFunction2(value))
      
      inline def setTopCalcParamsUndefined: Self = StObject.set(x, "topCalcParams", js.undefined)
      
      inline def setTopCalcUndefined: Self = StObject.set(x, "topCalc", js.undefined)
      
      inline def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = StObject.set(x, "validator", js.Array(value*))
      
      inline def setVariableHeight(value: Boolean): Self = StObject.set(x, "variableHeight", value.asInstanceOf[js.Any])
      
      inline def setVariableHeightUndefined: Self = StObject.set(x, "variableHeight", js.undefined)
      
      inline def setVertAlign(value: VerticalAlign): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
      
      inline def setVertAlignUndefined: Self = StObject.set(x, "vertAlign", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthGrow(value: Double): Self = StObject.set(x, "widthGrow", value.asInstanceOf[js.Any])
      
      inline def setWidthGrowUndefined: Self = StObject.set(x, "widthGrow", js.undefined)
      
      inline def setWidthShrink(value: Double): Self = StObject.set(x, "widthShrink", value.asInstanceOf[js.Any])
      
      inline def setWidthShrinkUndefined: Self = StObject.set(x, "widthShrink", js.undefined)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Pick<tabulator-tables.tabulator-tables.Filter, 'field' | 'value'> */
  trait PickFilterfieldvalue extends StObject {
    
    var field: String
    
    var value: Any
  }
  object PickFilterfieldvalue {
    
    inline def apply(field: String, value: Any): PickFilterfieldvalue = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickFilterfieldvalue]
    }
    
    extension [Self <: PickFilterfieldvalue](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
