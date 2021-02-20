package typings.tabulatorTables

import typings.std.HTMLElement
import typings.std.UIEvent
import typings.tabulatorTables.Tabulator.CellComponent
import typings.tabulatorTables.Tabulator.CellEditEventCallback
import typings.tabulatorTables.Tabulator.CellEventCallback
import typings.tabulatorTables.Tabulator.ColumnCalc
import typings.tabulatorTables.Tabulator.ColumnCalcParams
import typings.tabulatorTables.Tabulator.ColumnComponent
import typings.tabulatorTables.Tabulator.ColumnDefinition
import typings.tabulatorTables.Tabulator.ColumnDefinitionAlign
import typings.tabulatorTables.Tabulator.ColumnDefinitionSorterParams
import typings.tabulatorTables.Tabulator.ColumnEventCallback
import typings.tabulatorTables.Tabulator.ColumnSorterParamLookupFunction
import typings.tabulatorTables.Tabulator.CustomAccessor
import typings.tabulatorTables.Tabulator.CustomAccessorParams
import typings.tabulatorTables.Tabulator.CustomMutator
import typings.tabulatorTables.Tabulator.CustomMutatorParams
import typings.tabulatorTables.Tabulator.Editor
import typings.tabulatorTables.Tabulator.EditorParams
import typings.tabulatorTables.Tabulator.EmptyCallback
import typings.tabulatorTables.Tabulator.FilterType
import typings.tabulatorTables.Tabulator.Formatter
import typings.tabulatorTables.Tabulator.FormatterParams
import typings.tabulatorTables.Tabulator.GlobalTooltipOption
import typings.tabulatorTables.Tabulator.MenuObject
import typings.tabulatorTables.Tabulator.MenuSeparator
import typings.tabulatorTables.Tabulator.RowComponent
import typings.tabulatorTables.Tabulator.SortDirection
import typings.tabulatorTables.Tabulator.StandardValidatorType
import typings.tabulatorTables.Tabulator.Validator
import typings.tabulatorTables.Tabulator.ValueBooleanCallback
import typings.tabulatorTables.Tabulator.ValueVoidCallback
import typings.tabulatorTables.Tabulator.VerticalAlign
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tabulator-tables.Tabulator.ColumnDefinition> */
  @js.native
  trait PartialColumnDefinition extends StObject {
    
    var accessor: js.UndefOr[CustomAccessor] = js.native
    
    var accessorClipboard: js.UndefOr[CustomAccessor] = js.native
    
    var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.native
    
    var accessorDownload: js.UndefOr[CustomAccessor] = js.native
    
    var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.native
    
    var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.native
    
    var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.native
    
    var accessorParams: js.UndefOr[CustomAccessorParams] = js.native
    
    var accessorPrint: js.UndefOr[CustomAccessor] = js.native
    
    var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.native
    
    var bottomCalc: js.UndefOr[ColumnCalc] = js.native
    
    var bottomCalcFormatter: js.UndefOr[Formatter] = js.native
    
    var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
    
    var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.native
    
    var cellClick: js.UndefOr[CellEventCallback] = js.native
    
    var cellContext: js.UndefOr[CellEventCallback] = js.native
    
    var cellDblClick: js.UndefOr[CellEventCallback] = js.native
    
    var cellDblTap: js.UndefOr[CellEventCallback] = js.native
    
    var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
    
    var cellTap: js.UndefOr[CellEventCallback] = js.native
    
    var cellTapHold: js.UndefOr[CellEventCallback] = js.native
    
    var clickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.native
    
    var clipboard: js.UndefOr[Boolean] = js.native
    
    var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
    
    var contextMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.native
    
    var cssClass: js.UndefOr[String] = js.native
    
    var download: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.native
    
    var editableTitle: js.UndefOr[Boolean] = js.native
    
    var editor: js.UndefOr[Editor] = js.native
    
    var editorParams: js.UndefOr[EditorParams] = js.native
    
    var field: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[Formatter] = js.native
    
    var formatterClipboard: js.UndefOr[Formatter | `false`] = js.native
    
    var formatterClipboardParams: js.UndefOr[FormatterParams] = js.native
    
    var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.native
    
    var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.native
    
    var formatterParams: js.UndefOr[FormatterParams] = js.native
    
    var formatterPrint: js.UndefOr[Formatter | `false`] = js.native
    
    var formatterPrintParams: js.UndefOr[FormatterParams] = js.native
    
    var frozen: js.UndefOr[Boolean] = js.native
    
    var headerClick: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerContext: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerContextMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.native
    
    var headerDblClick: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerDblTap: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerFilter: js.UndefOr[Editor] = js.native
    
    var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.native
    
    var headerFilterFunc: js.UndefOr[
        FilterType | (js.Function4[
          /* headerValue */ js.Any, 
          /* rowValue */ js.Any, 
          /* rowdata */ js.Any, 
          /* filterparams */ js.Any, 
          Boolean
        ])
      ] = js.native
    
    var headerFilterFuncParams: js.UndefOr[js.Any] = js.native
    
    var headerFilterLiveFilter: js.UndefOr[Boolean] = js.native
    
    var headerFilterParams: js.UndefOr[EditorParams] = js.native
    
    var headerFilterPlaceholder: js.UndefOr[String] = js.native
    
    var headerHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
    
    var headerMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.native
    
    var headerSort: js.UndefOr[Boolean] = js.native
    
    var headerSortStartingDir: js.UndefOr[SortDirection] = js.native
    
    var headerSortTristate: js.UndefOr[Boolean] = js.native
    
    var headerTap: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerTapHold: js.UndefOr[ColumnEventCallback] = js.native
    
    var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.native
    
    var headerVertical: js.UndefOr[Boolean | flip] = js.native
    
    var hideInHtml: js.UndefOr[Boolean] = js.native
    
    var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
    
    var htmlOutput: js.UndefOr[Boolean] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var mutator: js.UndefOr[CustomMutator] = js.native
    
    var mutatorClipboard: js.UndefOr[CustomMutator] = js.native
    
    var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.native
    
    var mutatorData: js.UndefOr[CustomMutator] = js.native
    
    var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.native
    
    var mutatorEdit: js.UndefOr[CustomMutator] = js.native
    
    var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.native
    
    var mutatorParams: js.UndefOr[CustomMutatorParams] = js.native
    
    var resizable: js.UndefOr[Boolean] = js.native
    
    var responsive: js.UndefOr[Double] = js.native
    
    var rowHandle: js.UndefOr[Boolean] = js.native
    
    var sorter: js.UndefOr[
        string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
          /* a */ js.Any, 
          /* b */ js.Any, 
          /* aRow */ RowComponent, 
          /* bRow */ RowComponent, 
          /* column */ ColumnComponent, 
          /* dir */ SortDirection, 
          /* sorterParams */ js.Object, 
          Double
        ])
      ] = js.native
    
    var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleClipboard: js.UndefOr[String] = js.native
    
    var titleDownload: js.UndefOr[String] = js.native
    
    var titleFormatter: js.UndefOr[Formatter] = js.native
    
    var titleFormatterParams: js.UndefOr[FormatterParams] = js.native
    
    var titleHtmlOutput: js.UndefOr[String] = js.native
    
    var titlePrint: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.native
    
    var topCalc: js.UndefOr[ColumnCalc] = js.native
    
    var topCalcFormatter: js.UndefOr[Formatter] = js.native
    
    var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
    
    var topCalcParams: js.UndefOr[ColumnCalcParams] = js.native
    
    var validator: js.UndefOr[
        StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String
      ] = js.native
    
    var variableHeight: js.UndefOr[Boolean] = js.native
    
    var vertAlign: js.UndefOr[VerticalAlign] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var widthGrow: js.UndefOr[Double] = js.native
    
    var widthShrink: js.UndefOr[Double] = js.native
  }
  object PartialColumnDefinition {
    
    @scala.inline
    def apply(): PartialColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialColumnDefinition]
    }
    
    @scala.inline
    implicit class PartialColumnDefinitionMutableBuilder[Self <: PartialColumnDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessor", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorClipboard(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorClipboard", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorClipboardParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorClipboardParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorClipboardParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorClipboardParamsUndefined: Self = StObject.set(x, "accessorClipboardParams", js.undefined)
      
      @scala.inline
      def setAccessorClipboardUndefined: Self = StObject.set(x, "accessorClipboard", js.undefined)
      
      @scala.inline
      def setAccessorDownload(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorDownload", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorDownloadParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorDownloadParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorDownloadParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorDownloadParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorDownloadParamsUndefined: Self = StObject.set(x, "accessorDownloadParams", js.undefined)
      
      @scala.inline
      def setAccessorDownloadUndefined: Self = StObject.set(x, "accessorDownload", js.undefined)
      
      @scala.inline
      def setAccessorHtmlOutput(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorHtmlOutput", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorHtmlOutputParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorHtmlOutputParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorHtmlOutputParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorHtmlOutputParamsUndefined: Self = StObject.set(x, "accessorHtmlOutputParams", js.undefined)
      
      @scala.inline
      def setAccessorHtmlOutputUndefined: Self = StObject.set(x, "accessorHtmlOutput", js.undefined)
      
      @scala.inline
      def setAccessorParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorParamsUndefined: Self = StObject.set(x, "accessorParams", js.undefined)
      
      @scala.inline
      def setAccessorPrint(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorPrint", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorPrintParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorPrintParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorPrintParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorPrintParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorPrintParamsUndefined: Self = StObject.set(x, "accessorPrintParams", js.undefined)
      
      @scala.inline
      def setAccessorPrintUndefined: Self = StObject.set(x, "accessorPrint", js.undefined)
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setBottomCalc(value: ColumnCalc): Self = StObject.set(x, "bottomCalc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatter(value: Formatter): Self = StObject.set(x, "bottomCalcFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "bottomCalcFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBottomCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "bottomCalcFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "bottomCalcFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBottomCalcFormatterParamsUndefined: Self = StObject.set(x, "bottomCalcFormatterParams", js.undefined)
      
      @scala.inline
      def setBottomCalcFormatterUndefined: Self = StObject.set(x, "bottomCalcFormatter", js.undefined)
      
      @scala.inline
      def setBottomCalcFunction3(
        value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
      ): Self = StObject.set(x, "bottomCalc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBottomCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = StObject.set(x, "bottomCalcParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBottomCalcParamsUndefined: Self = StObject.set(x, "bottomCalcParams", js.undefined)
      
      @scala.inline
      def setBottomCalcUndefined: Self = StObject.set(x, "bottomCalc", js.undefined)
      
      @scala.inline
      def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
      
      @scala.inline
      def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
      
      @scala.inline
      def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
      
      @scala.inline
      def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
      
      @scala.inline
      def setCellEdited(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
      
      @scala.inline
      def setCellEditing(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
      
      @scala.inline
      def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      @scala.inline
      def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      @scala.inline
      def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
      
      @scala.inline
      def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
      
      @scala.inline
      def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      @scala.inline
      def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
      
      @scala.inline
      def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
      
      @scala.inline
      def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "clickMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickMenuUndefined: Self = StObject.set(x, "clickMenu", js.undefined)
      
      @scala.inline
      def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "clickMenu", js.Array(value :_*))
      
      @scala.inline
      def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "contextMenu", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditableTitle(value: Boolean): Self = StObject.set(x, "editableTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableTitleUndefined: Self = StObject.set(x, "editableTitle", js.undefined)
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "editor", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEditorParams(value: EditorParams): Self = StObject.set(x, "editorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "editorParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorParamsUndefined: Self = StObject.set(x, "editorParams", js.undefined)
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboard(value: Formatter | `false`): Self = StObject.set(x, "formatterClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboardFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterClipboard", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterClipboardParams(value: FormatterParams): Self = StObject.set(x, "formatterClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterClipboardParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterClipboardParamsUndefined: Self = StObject.set(x, "formatterClipboardParams", js.undefined)
      
      @scala.inline
      def setFormatterClipboardUndefined: Self = StObject.set(x, "formatterClipboard", js.undefined)
      
      @scala.inline
      def setFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterHtmlOutput(value: Formatter | `false`): Self = StObject.set(x, "formatterHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterHtmlOutputFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterHtmlOutput", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterHtmlOutputParams(value: FormatterParams): Self = StObject.set(x, "formatterHtmlOutputParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterHtmlOutputParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterHtmlOutputParamsUndefined: Self = StObject.set(x, "formatterHtmlOutputParams", js.undefined)
      
      @scala.inline
      def setFormatterHtmlOutputUndefined: Self = StObject.set(x, "formatterHtmlOutput", js.undefined)
      
      @scala.inline
      def setFormatterParams(value: FormatterParams): Self = StObject.set(x, "formatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterParamsUndefined: Self = StObject.set(x, "formatterParams", js.undefined)
      
      @scala.inline
      def setFormatterPrint(value: Formatter | `false`): Self = StObject.set(x, "formatterPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPrintFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterPrint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterPrintParams(value: FormatterParams): Self = StObject.set(x, "formatterPrintParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterPrintParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterPrintParamsUndefined: Self = StObject.set(x, "formatterPrintParams", js.undefined)
      
      @scala.inline
      def setFormatterPrintUndefined: Self = StObject.set(x, "formatterPrint", js.undefined)
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
      
      @scala.inline
      def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContextMenuUndefined: Self = StObject.set(x, "headerContextMenu", js.undefined)
      
      @scala.inline
      def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerContextMenu", js.Array(value :_*))
      
      @scala.inline
      def setHeaderContextUndefined: Self = StObject.set(x, "headerContext", js.undefined)
      
      @scala.inline
      def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderDblClickUndefined: Self = StObject.set(x, "headerDblClick", js.undefined)
      
      @scala.inline
      def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderDblTapUndefined: Self = StObject.set(x, "headerDblTap", js.undefined)
      
      @scala.inline
      def setHeaderFilter(value: Editor): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterEmptyCheck(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "headerFilterEmptyCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderFilterEmptyCheckUndefined: Self = StObject.set(x, "headerFilterEmptyCheck", js.undefined)
      
      @scala.inline
      def setHeaderFilterFunc(
        value: FilterType | (js.Function4[
              /* headerValue */ js.Any, 
              /* rowValue */ js.Any, 
              /* rowdata */ js.Any, 
              /* filterparams */ js.Any, 
              Boolean
            ])
      ): Self = StObject.set(x, "headerFilterFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterFuncFunction4(
        value: (/* headerValue */ js.Any, /* rowValue */ js.Any, /* rowdata */ js.Any, /* filterparams */ js.Any) => Boolean
      ): Self = StObject.set(x, "headerFilterFunc", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHeaderFilterFuncParams(value: js.Any): Self = StObject.set(x, "headerFilterFuncParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterFuncParamsUndefined: Self = StObject.set(x, "headerFilterFuncParams", js.undefined)
      
      @scala.inline
      def setHeaderFilterFuncUndefined: Self = StObject.set(x, "headerFilterFunc", js.undefined)
      
      @scala.inline
      def setHeaderFilterFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "headerFilter", js.Any.fromFunction5(value))
      
      @scala.inline
      def setHeaderFilterLiveFilter(value: Boolean): Self = StObject.set(x, "headerFilterLiveFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterLiveFilterUndefined: Self = StObject.set(x, "headerFilterLiveFilter", js.undefined)
      
      @scala.inline
      def setHeaderFilterParams(value: EditorParams): Self = StObject.set(x, "headerFilterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "headerFilterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderFilterParamsUndefined: Self = StObject.set(x, "headerFilterParams", js.undefined)
      
      @scala.inline
      def setHeaderFilterPlaceholder(value: String): Self = StObject.set(x, "headerFilterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterPlaceholderUndefined: Self = StObject.set(x, "headerFilterPlaceholder", js.undefined)
      
      @scala.inline
      def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
      
      @scala.inline
      def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "headerHozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHozAlignUndefined: Self = StObject.set(x, "headerHozAlign", js.undefined)
      
      @scala.inline
      def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
      
      @scala.inline
      def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerMenu", js.Array(value :_*))
      
      @scala.inline
      def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortStartingDir(value: SortDirection): Self = StObject.set(x, "headerSortStartingDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortStartingDirUndefined: Self = StObject.set(x, "headerSortStartingDir", js.undefined)
      
      @scala.inline
      def setHeaderSortTristate(value: Boolean): Self = StObject.set(x, "headerSortTristate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortTristateUndefined: Self = StObject.set(x, "headerSortTristate", js.undefined)
      
      @scala.inline
      def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
      
      @scala.inline
      def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTapHoldUndefined: Self = StObject.set(x, "headerTapHold", js.undefined)
      
      @scala.inline
      def setHeaderTapUndefined: Self = StObject.set(x, "headerTap", js.undefined)
      
      @scala.inline
      def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = StObject.set(x, "headerTooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      @scala.inline
      def setHeaderVertical(value: Boolean | flip): Self = StObject.set(x, "headerVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVerticalUndefined: Self = StObject.set(x, "headerVertical", js.undefined)
      
      @scala.inline
      def setHideInHtml(value: Boolean): Self = StObject.set(x, "hideInHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInHtmlUndefined: Self = StObject.set(x, "hideInHtml", js.undefined)
      
      @scala.inline
      def setHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "hozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHozAlignUndefined: Self = StObject.set(x, "hozAlign", js.undefined)
      
      @scala.inline
      def setHtmlOutput(value: Boolean): Self = StObject.set(x, "htmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlOutputUndefined: Self = StObject.set(x, "htmlOutput", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMutator(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorClipboard(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorClipboard", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorClipboardParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorClipboardParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorClipboardParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorClipboardParamsUndefined: Self = StObject.set(x, "mutatorClipboardParams", js.undefined)
      
      @scala.inline
      def setMutatorClipboardUndefined: Self = StObject.set(x, "mutatorClipboard", js.undefined)
      
      @scala.inline
      def setMutatorData(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorData", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorDataParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorDataParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorDataParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorDataParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorDataParamsUndefined: Self = StObject.set(x, "mutatorDataParams", js.undefined)
      
      @scala.inline
      def setMutatorDataUndefined: Self = StObject.set(x, "mutatorData", js.undefined)
      
      @scala.inline
      def setMutatorEdit(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorEdit", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorEditParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorEditParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorEditParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorEditParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorEditParamsUndefined: Self = StObject.set(x, "mutatorEditParams", js.undefined)
      
      @scala.inline
      def setMutatorEditUndefined: Self = StObject.set(x, "mutatorEdit", js.undefined)
      
      @scala.inline
      def setMutatorParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorParamsUndefined: Self = StObject.set(x, "mutatorParams", js.undefined)
      
      @scala.inline
      def setMutatorUndefined: Self = StObject.set(x, "mutator", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResponsive(value: Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRowHandle(value: Boolean): Self = StObject.set(x, "rowHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHandleUndefined: Self = StObject.set(x, "rowHandle", js.undefined)
      
      @scala.inline
      def setSorter(
        value: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
              /* a */ js.Any, 
              /* b */ js.Any, 
              /* aRow */ RowComponent, 
              /* bRow */ RowComponent, 
              /* column */ ColumnComponent, 
              /* dir */ SortDirection, 
              /* sorterParams */ js.Object, 
              Double
            ])
      ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterFunction7(
        value: (/* a */ js.Any, /* b */ js.Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
      ): Self = StObject.set(x, "sorter", js.Any.fromFunction7(value))
      
      @scala.inline
      def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = StObject.set(x, "sorterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = StObject.set(x, "sorterParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSorterParamsUndefined: Self = StObject.set(x, "sorterParams", js.undefined)
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleClipboard(value: String): Self = StObject.set(x, "titleClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleClipboardUndefined: Self = StObject.set(x, "titleClipboard", js.undefined)
      
      @scala.inline
      def setTitleDownload(value: String): Self = StObject.set(x, "titleDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleDownloadUndefined: Self = StObject.set(x, "titleDownload", js.undefined)
      
      @scala.inline
      def setTitleFormatter(value: Formatter): Self = StObject.set(x, "titleFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleFormatterParams(value: FormatterParams): Self = StObject.set(x, "titleFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "titleFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleFormatterParamsUndefined: Self = StObject.set(x, "titleFormatterParams", js.undefined)
      
      @scala.inline
      def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
      
      @scala.inline
      def setTitleHtmlOutput(value: String): Self = StObject.set(x, "titleHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleHtmlOutputUndefined: Self = StObject.set(x, "titleHtmlOutput", js.undefined)
      
      @scala.inline
      def setTitlePrint(value: String): Self = StObject.set(x, "titlePrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrintUndefined: Self = StObject.set(x, "titlePrint", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: String | GlobalTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTopCalc(value: ColumnCalc): Self = StObject.set(x, "topCalc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatter(value: Formatter): Self = StObject.set(x, "topCalcFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "topCalcFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "topCalcFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "topCalcFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTopCalcFormatterParamsUndefined: Self = StObject.set(x, "topCalcFormatterParams", js.undefined)
      
      @scala.inline
      def setTopCalcFormatterUndefined: Self = StObject.set(x, "topCalcFormatter", js.undefined)
      
      @scala.inline
      def setTopCalcFunction3(
        value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
      ): Self = StObject.set(x, "topCalc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = StObject.set(x, "topCalcParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTopCalcParamsUndefined: Self = StObject.set(x, "topCalcParams", js.undefined)
      
      @scala.inline
      def setTopCalcUndefined: Self = StObject.set(x, "topCalc", js.undefined)
      
      @scala.inline
      def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = StObject.set(x, "validator", js.Array(value :_*))
      
      @scala.inline
      def setVariableHeight(value: Boolean): Self = StObject.set(x, "variableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableHeightUndefined: Self = StObject.set(x, "variableHeight", js.undefined)
      
      @scala.inline
      def setVertAlign(value: VerticalAlign): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAlignUndefined: Self = StObject.set(x, "vertAlign", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthGrow(value: Double): Self = StObject.set(x, "widthGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthGrowUndefined: Self = StObject.set(x, "widthGrow", js.undefined)
      
      @scala.inline
      def setWidthShrink(value: Double): Self = StObject.set(x, "widthShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthShrinkUndefined: Self = StObject.set(x, "widthShrink", js.undefined)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Pick<tabulator-tables.Tabulator.Filter, 'field' | 'value'> */
  @js.native
  trait PickFilterfieldvalue extends StObject {
    
    var field: String = js.native
    
    var value: js.Any = js.native
  }
  object PickFilterfieldvalue {
    
    @scala.inline
    def apply(field: String, value: js.Any): PickFilterfieldvalue = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickFilterfieldvalue]
    }
    
    @scala.inline
    implicit class PickFilterfieldvalueMutableBuilder[Self <: PickFilterfieldvalue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
