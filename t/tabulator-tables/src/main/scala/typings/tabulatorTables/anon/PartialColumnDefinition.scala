package typings.tabulatorTables.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabulator-tables.Tabulator.ColumnDefinition> */
@js.native
trait PartialColumnDefinition extends js.Object {
  
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
  implicit class PartialColumnDefinitionOps[Self <: PartialColumnDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessor(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessor", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessor: Self = this.set("accessor", js.undefined)
    
    @scala.inline
    def setAccessorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorClipboard", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorClipboard: Self = this.set("accessorClipboard", js.undefined)
    
    @scala.inline
    def setAccessorClipboardParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorClipboardParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorClipboardParams(value: CustomAccessorParams): Self = this.set("accessorClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorClipboardParams: Self = this.set("accessorClipboardParams", js.undefined)
    
    @scala.inline
    def setAccessorDownload(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorDownload", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorDownload: Self = this.set("accessorDownload", js.undefined)
    
    @scala.inline
    def setAccessorDownloadParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorDownloadParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorDownloadParams(value: CustomAccessorParams): Self = this.set("accessorDownloadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorDownloadParams: Self = this.set("accessorDownloadParams", js.undefined)
    
    @scala.inline
    def setAccessorHtmlOutput(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorHtmlOutput", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorHtmlOutput: Self = this.set("accessorHtmlOutput", js.undefined)
    
    @scala.inline
    def setAccessorHtmlOutputParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorHtmlOutputParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = this.set("accessorHtmlOutputParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorHtmlOutputParams: Self = this.set("accessorHtmlOutputParams", js.undefined)
    
    @scala.inline
    def setAccessorParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorParams(value: CustomAccessorParams): Self = this.set("accessorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorParams: Self = this.set("accessorParams", js.undefined)
    
    @scala.inline
    def setAccessorPrint(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorPrint", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorPrint: Self = this.set("accessorPrint", js.undefined)
    
    @scala.inline
    def setAccessorPrintParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorPrintParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorPrintParams(value: CustomAccessorParams): Self = this.set("accessorPrintParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorPrintParams: Self = this.set("accessorPrintParams", js.undefined)
    
    @scala.inline
    def setBottomCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
    ): Self = this.set("bottomCalc", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBottomCalc(value: ColumnCalc): Self = this.set("bottomCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalc: Self = this.set("bottomCalc", js.undefined)
    
    @scala.inline
    def setBottomCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("bottomCalcFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBottomCalcFormatter(value: Formatter): Self = this.set("bottomCalcFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalcFormatter: Self = this.set("bottomCalcFormatter", js.undefined)
    
    @scala.inline
    def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("bottomCalcFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomCalcFormatterParams(value: FormatterParams): Self = this.set("bottomCalcFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalcFormatterParams: Self = this.set("bottomCalcFormatterParams", js.undefined)
    
    @scala.inline
    def setBottomCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = this.set("bottomCalcParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBottomCalcParams: Self = this.set("bottomCalcParams", js.undefined)
    
    @scala.inline
    def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    
    @scala.inline
    def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellContext: Self = this.set("cellContext", js.undefined)
    
    @scala.inline
    def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellDblClick: Self = this.set("cellDblClick", js.undefined)
    
    @scala.inline
    def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellDblTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellDblTap: Self = this.set("cellDblTap", js.undefined)
    
    @scala.inline
    def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = this.set("cellEditCancelled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEditCancelled: Self = this.set("cellEditCancelled", js.undefined)
    
    @scala.inline
    def setCellEdited(value: /* cell */ CellComponent => Unit): Self = this.set("cellEdited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEdited: Self = this.set("cellEdited", js.undefined)
    
    @scala.inline
    def setCellEditing(value: /* cell */ CellComponent => Unit): Self = this.set("cellEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEditing: Self = this.set("cellEditing", js.undefined)
    
    @scala.inline
    def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellMouseEnter: Self = this.set("cellMouseEnter", js.undefined)
    
    @scala.inline
    def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellMouseLeave: Self = this.set("cellMouseLeave", js.undefined)
    
    @scala.inline
    def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellMouseMove: Self = this.set("cellMouseMove", js.undefined)
    
    @scala.inline
    def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellMouseOut: Self = this.set("cellMouseOut", js.undefined)
    
    @scala.inline
    def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellMouseOver: Self = this.set("cellMouseOver", js.undefined)
    
    @scala.inline
    def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellTap: Self = this.set("cellTap", js.undefined)
    
    @scala.inline
    def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellTapHold", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellTapHold: Self = this.set("cellTapHold", js.undefined)
    
    @scala.inline
    def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = this.set("clickMenu", js.Array(value :_*))
    
    @scala.inline
    def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = this.set("clickMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickMenu: Self = this.set("clickMenu", js.undefined)
    
    @scala.inline
    def setClipboard(value: Boolean): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = this.set("contextMenu", js.Array(value :_*))
    
    @scala.inline
    def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = this.set("editable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditableTitle(value: Boolean): Self = this.set("editableTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditableTitle: Self = this.set("editableTitle", js.undefined)
    
    @scala.inline
    def setEditorFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = this.set("editor", js.Any.fromFunction5(value))
    
    @scala.inline
    def setEditor(value: Editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("editorParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditorParams(value: EditorParams): Self = this.set("editorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorParams: Self = this.set("editorParams", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setFormatterClipboardFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterClipboard", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterClipboard(value: Formatter | `false`): Self = this.set("formatterClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterClipboard: Self = this.set("formatterClipboard", js.undefined)
    
    @scala.inline
    def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterClipboardParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterClipboardParams(value: FormatterParams): Self = this.set("formatterClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterClipboardParams: Self = this.set("formatterClipboardParams", js.undefined)
    
    @scala.inline
    def setFormatterHtmlOutputFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterHtmlOutput", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterHtmlOutput(value: Formatter | `false`): Self = this.set("formatterHtmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterHtmlOutput: Self = this.set("formatterHtmlOutput", js.undefined)
    
    @scala.inline
    def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterHtmlOutputParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterHtmlOutputParams(value: FormatterParams): Self = this.set("formatterHtmlOutputParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterHtmlOutputParams: Self = this.set("formatterHtmlOutputParams", js.undefined)
    
    @scala.inline
    def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterParams(value: FormatterParams): Self = this.set("formatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterParams: Self = this.set("formatterParams", js.undefined)
    
    @scala.inline
    def setFormatterPrintFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterPrint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterPrint(value: Formatter | `false`): Self = this.set("formatterPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterPrint: Self = this.set("formatterPrint", js.undefined)
    
    @scala.inline
    def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterPrintParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterPrintParams(value: FormatterParams): Self = this.set("formatterPrintParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterPrintParams: Self = this.set("formatterPrintParams", js.undefined)
    
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    
    @scala.inline
    def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderClick: Self = this.set("headerClick", js.undefined)
    
    @scala.inline
    def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderContext: Self = this.set("headerContext", js.undefined)
    
    @scala.inline
    def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = this.set("headerContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = this.set("headerContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderContextMenu: Self = this.set("headerContextMenu", js.undefined)
    
    @scala.inline
    def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderDblClick: Self = this.set("headerDblClick", js.undefined)
    
    @scala.inline
    def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerDblTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderDblTap: Self = this.set("headerDblTap", js.undefined)
    
    @scala.inline
    def setHeaderFilterFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = this.set("headerFilter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHeaderFilter(value: Editor): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    
    @scala.inline
    def setHeaderFilterEmptyCheck(value: /* value */ js.Any => Boolean): Self = this.set("headerFilterEmptyCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderFilterEmptyCheck: Self = this.set("headerFilterEmptyCheck", js.undefined)
    
    @scala.inline
    def setHeaderFilterFuncFunction4(
      value: (/* headerValue */ js.Any, /* rowValue */ js.Any, /* rowdata */ js.Any, /* filterparams */ js.Any) => Boolean
    ): Self = this.set("headerFilterFunc", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHeaderFilterFunc(
      value: FilterType | (js.Function4[
          /* headerValue */ js.Any, 
          /* rowValue */ js.Any, 
          /* rowdata */ js.Any, 
          /* filterparams */ js.Any, 
          Boolean
        ])
    ): Self = this.set("headerFilterFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterFunc: Self = this.set("headerFilterFunc", js.undefined)
    
    @scala.inline
    def setHeaderFilterFuncParams(value: js.Any): Self = this.set("headerFilterFuncParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterFuncParams: Self = this.set("headerFilterFuncParams", js.undefined)
    
    @scala.inline
    def setHeaderFilterLiveFilter(value: Boolean): Self = this.set("headerFilterLiveFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterLiveFilter: Self = this.set("headerFilterLiveFilter", js.undefined)
    
    @scala.inline
    def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("headerFilterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderFilterParams(value: EditorParams): Self = this.set("headerFilterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterParams: Self = this.set("headerFilterParams", js.undefined)
    
    @scala.inline
    def setHeaderFilterPlaceholder(value: String): Self = this.set("headerFilterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterPlaceholder: Self = this.set("headerFilterPlaceholder", js.undefined)
    
    @scala.inline
    def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = this.set("headerHozAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHozAlign: Self = this.set("headerHozAlign", js.undefined)
    
    @scala.inline
    def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = this.set("headerMenu", js.Array(value :_*))
    
    @scala.inline
    def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = this.set("headerMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMenu: Self = this.set("headerMenu", js.undefined)
    
    @scala.inline
    def setHeaderSort(value: Boolean): Self = this.set("headerSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSort: Self = this.set("headerSort", js.undefined)
    
    @scala.inline
    def setHeaderSortStartingDir(value: SortDirection): Self = this.set("headerSortStartingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSortStartingDir: Self = this.set("headerSortStartingDir", js.undefined)
    
    @scala.inline
    def setHeaderSortTristate(value: Boolean): Self = this.set("headerSortTristate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSortTristate: Self = this.set("headerSortTristate", js.undefined)
    
    @scala.inline
    def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderTap: Self = this.set("headerTap", js.undefined)
    
    @scala.inline
    def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerTapHold", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderTapHold: Self = this.set("headerTapHold", js.undefined)
    
    @scala.inline
    def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = this.set("headerTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = this.set("headerTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTooltip: Self = this.set("headerTooltip", js.undefined)
    
    @scala.inline
    def setHeaderVertical(value: Boolean | flip): Self = this.set("headerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderVertical: Self = this.set("headerVertical", js.undefined)
    
    @scala.inline
    def setHideInHtml(value: Boolean): Self = this.set("hideInHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInHtml: Self = this.set("hideInHtml", js.undefined)
    
    @scala.inline
    def setHozAlign(value: ColumnDefinitionAlign): Self = this.set("hozAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHozAlign: Self = this.set("hozAlign", js.undefined)
    
    @scala.inline
    def setHtmlOutput(value: Boolean): Self = this.set("htmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlOutput: Self = this.set("htmlOutput", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMutator(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutator", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutator: Self = this.set("mutator", js.undefined)
    
    @scala.inline
    def setMutatorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorClipboard", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorClipboard: Self = this.set("mutatorClipboard", js.undefined)
    
    @scala.inline
    def setMutatorClipboardParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorClipboardParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorClipboardParams(value: CustomMutatorParams): Self = this.set("mutatorClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorClipboardParams: Self = this.set("mutatorClipboardParams", js.undefined)
    
    @scala.inline
    def setMutatorData(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorData", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorData: Self = this.set("mutatorData", js.undefined)
    
    @scala.inline
    def setMutatorDataParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorDataParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorDataParams(value: CustomMutatorParams): Self = this.set("mutatorDataParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorDataParams: Self = this.set("mutatorDataParams", js.undefined)
    
    @scala.inline
    def setMutatorEdit(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorEdit", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorEdit: Self = this.set("mutatorEdit", js.undefined)
    
    @scala.inline
    def setMutatorEditParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorEditParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorEditParams(value: CustomMutatorParams): Self = this.set("mutatorEditParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorEditParams: Self = this.set("mutatorEditParams", js.undefined)
    
    @scala.inline
    def setMutatorParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorParams(value: CustomMutatorParams): Self = this.set("mutatorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorParams: Self = this.set("mutatorParams", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResponsive(value: Double): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRowHandle(value: Boolean): Self = this.set("rowHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHandle: Self = this.set("rowHandle", js.undefined)
    
    @scala.inline
    def setSorterFunction7(
      value: (/* a */ js.Any, /* b */ js.Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
    ): Self = this.set("sorter", js.Any.fromFunction7(value))
    
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
    ): Self = this.set("sorter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    
    @scala.inline
    def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = this.set("sorterParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = this.set("sorterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorterParams: Self = this.set("sorterParams", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleClipboard(value: String): Self = this.set("titleClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleClipboard: Self = this.set("titleClipboard", js.undefined)
    
    @scala.inline
    def setTitleDownload(value: String): Self = this.set("titleDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleDownload: Self = this.set("titleDownload", js.undefined)
    
    @scala.inline
    def setTitleFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("titleFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitleFormatter(value: Formatter): Self = this.set("titleFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFormatter: Self = this.set("titleFormatter", js.undefined)
    
    @scala.inline
    def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("titleFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleFormatterParams(value: FormatterParams): Self = this.set("titleFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFormatterParams: Self = this.set("titleFormatterParams", js.undefined)
    
    @scala.inline
    def setTitleHtmlOutput(value: String): Self = this.set("titleHtmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleHtmlOutput: Self = this.set("titleHtmlOutput", js.undefined)
    
    @scala.inline
    def setTitlePrint(value: String): Self = this.set("titlePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePrint: Self = this.set("titlePrint", js.undefined)
    
    @scala.inline
    def setTooltipFunction1(value: /* cell */ CellComponent => String): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltip(value: String | GlobalTooltipOption): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTopCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
    ): Self = this.set("topCalc", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTopCalc(value: ColumnCalc): Self = this.set("topCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalc: Self = this.set("topCalc", js.undefined)
    
    @scala.inline
    def setTopCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("topCalcFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTopCalcFormatter(value: Formatter): Self = this.set("topCalcFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalcFormatter: Self = this.set("topCalcFormatter", js.undefined)
    
    @scala.inline
    def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("topCalcFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopCalcFormatterParams(value: FormatterParams): Self = this.set("topCalcFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalcFormatterParams: Self = this.set("topCalcFormatterParams", js.undefined)
    
    @scala.inline
    def setTopCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = this.set("topCalcParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTopCalcParams: Self = this.set("topCalcParams", js.undefined)
    
    @scala.inline
    def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = this.set("validator", js.Array(value :_*))
    
    @scala.inline
    def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setVariableHeight(value: Boolean): Self = this.set("variableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableHeight: Self = this.set("variableHeight", js.undefined)
    
    @scala.inline
    def setVertAlign(value: VerticalAlign): Self = this.set("vertAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAlign: Self = this.set("vertAlign", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthGrow(value: Double): Self = this.set("widthGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthGrow: Self = this.set("widthGrow", js.undefined)
    
    @scala.inline
    def setWidthShrink(value: Double): Self = this.set("widthShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthShrink: Self = this.set("widthShrink", js.undefined)
  }
}
