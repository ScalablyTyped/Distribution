package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
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
import scala.scalajs.js.annotation._

trait _ColumnLookup extends js.Object

object _ColumnLookup {
  @scala.inline
  def ColumnComponent(
    delete: () => js.Promise[Unit],
    getCells: () => js.Array[CellComponent],
    getDefinition: () => ColumnDefinition,
    getElement: () => HTMLElement,
    getField: () => String,
    getNextColumn: () => typings.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getParentColumn: () => typings.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getPrevColumn: () => typings.tabulatorTables.Tabulator.ColumnComponent | `false`,
    getSubColumns: () => js.Array[typings.tabulatorTables.Tabulator.ColumnComponent],
    getTable: () => typings.tabulatorTables.Tabulator,
    getVisibility: () => Boolean,
    headerFilterFocus: () => Unit,
    hide: () => Unit,
    move: (ColumnLookup, Boolean) => Unit,
    reloadHeaderFilter: () => Unit,
    scrollTo: () => js.Promise[Unit],
    setHeaderFilterValue: js.Any => Unit,
    show: () => Unit,
    toggle: () => Unit,
    updateDefinition: ColumnDefinition => js.Promise[Unit]
  ): _ColumnLookup = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getCells = js.Any.fromFunction0(getCells), getDefinition = js.Any.fromFunction0(getDefinition), getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getNextColumn = js.Any.fromFunction0(getNextColumn), getParentColumn = js.Any.fromFunction0(getParentColumn), getPrevColumn = js.Any.fromFunction0(getPrevColumn), getSubColumns = js.Any.fromFunction0(getSubColumns), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), headerFilterFocus = js.Any.fromFunction0(headerFilterFocus), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction2(move), reloadHeaderFilter = js.Any.fromFunction0(reloadHeaderFilter), scrollTo = js.Any.fromFunction0(scrollTo), setHeaderFilterValue = js.Any.fromFunction1(setHeaderFilterValue), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), updateDefinition = js.Any.fromFunction1(updateDefinition))
  
    __obj.asInstanceOf[_ColumnLookup]
  }
  @scala.inline
  def ColumnDefinition(
    title: String,
    accessor: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorClipboardParams: CustomAccessorParams = null,
    accessorDownload: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorDownloadParams: CustomAccessorParams = null,
    accessorParams: CustomAccessorParams = null,
    align: ColumnDefinitionAlign = null,
    bottomCalc: ColumnCalc = null,
    bottomCalcFormatter: Formatter = null,
    bottomCalcFormatterParams: FormatterParams = null,
    bottomCalcParams: (/* values */ js.Any, /* data */ js.Any) => js.Any = null,
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellEditCancelled: /* cell */ CellComponent => Unit = null,
    cellEdited: /* cell */ CellComponent => Unit = null,
    cellEditing: /* cell */ CellComponent => Unit = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[typings.tabulatorTables.Tabulator.ColumnDefinition] = null,
    cssClass: String = null,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadTitle: String = null,
    editable: Boolean | (js.Function1[/* cell */ CellComponent, Boolean]) = null,
    editableTitle: js.UndefOr[Boolean] = js.undefined,
    editor: Editor = null,
    editorParams: EditorParams = null,
    field: String = null,
    formatter: Formatter = null,
    formatterParams: FormatterParams = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    headerClick: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerContext: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerDblClick: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerDblTap: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerFilter: Editor = null,
    headerFilterEmptyCheck: /* value */ js.Any => Boolean = null,
    headerFilterFunc: FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ]) = null,
    headerFilterFuncParams: js.Any = null,
    headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined,
    headerFilterParams: EditorParams = null,
    headerFilterPlaceholder: String = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortStartingDir: SortDirection = null,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerTap: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerTapHold: (/* e */ js.Any, /* column */ ColumnComponent) => Unit = null,
    headerTooltip: Boolean | String | (js.Function1[/* column */ ColumnComponent, String]) = null,
    headerVertical: Boolean | flip = null,
    hideInHtml: js.UndefOr[Boolean] = js.undefined,
    htmlOutput: js.UndefOr[Boolean] = js.undefined,
    minWidth: Int | Double = null,
    mutator: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorClipboardParams: CustomMutatorParams = null,
    mutatorData: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorDataParams: CustomMutatorParams = null,
    mutatorEdit: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorEditParams: CustomMutatorParams = null,
    mutatorParams: CustomMutatorParams = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    responsive: Int | Double = null,
    rowHandle: js.UndefOr[Boolean] = js.undefined,
    sorter: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ]) = null,
    sorterParams: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction = null,
    titleFormatter: Formatter = null,
    titleFormatterParams: FormatterParams = null,
    tooltip: String | GlobalTooltipOption = null,
    topCalc: ColumnCalc = null,
    topCalcFormatter: Formatter = null,
    topCalcFormatterParams: FormatterParams = null,
    topCalcParams: (/* values */ js.Any, /* data */ js.Any) => js.Any = null,
    validator: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator = null,
    variableHeight: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    widthGrow: Int | Double = null,
    widthShrink: Int | Double = null
  ): _ColumnLookup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction5(accessor))
    if (accessorClipboard != null) __obj.updateDynamic("accessorClipboard")(js.Any.fromFunction5(accessorClipboard))
    if (accessorClipboardParams != null) __obj.updateDynamic("accessorClipboardParams")(accessorClipboardParams.asInstanceOf[js.Any])
    if (accessorDownload != null) __obj.updateDynamic("accessorDownload")(js.Any.fromFunction5(accessorDownload))
    if (accessorDownloadParams != null) __obj.updateDynamic("accessorDownloadParams")(accessorDownloadParams.asInstanceOf[js.Any])
    if (accessorParams != null) __obj.updateDynamic("accessorParams")(accessorParams.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bottomCalc != null) __obj.updateDynamic("bottomCalc")(bottomCalc.asInstanceOf[js.Any])
    if (bottomCalcFormatter != null) __obj.updateDynamic("bottomCalcFormatter")(bottomCalcFormatter.asInstanceOf[js.Any])
    if (bottomCalcFormatterParams != null) __obj.updateDynamic("bottomCalcFormatterParams")(bottomCalcFormatterParams.asInstanceOf[js.Any])
    if (bottomCalcParams != null) __obj.updateDynamic("bottomCalcParams")(js.Any.fromFunction2(bottomCalcParams))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2(cellClick))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2(cellContext))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2(cellDblClick))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2(cellDblTap))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1(cellEditCancelled))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1(cellEdited))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1(cellEditing))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2(cellMouseLeave))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2(cellMouseMove))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2(cellMouseOut))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2(cellMouseOver))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2(cellTap))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2(cellTapHold))
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(editableTitle)) __obj.updateDynamic("editableTitle")(editableTitle.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (editorParams != null) __obj.updateDynamic("editorParams")(editorParams.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formatterParams != null) __obj.updateDynamic("formatterParams")(formatterParams.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (headerClick != null) __obj.updateDynamic("headerClick")(js.Any.fromFunction2(headerClick))
    if (headerContext != null) __obj.updateDynamic("headerContext")(js.Any.fromFunction2(headerContext))
    if (headerDblClick != null) __obj.updateDynamic("headerDblClick")(js.Any.fromFunction2(headerDblClick))
    if (headerDblTap != null) __obj.updateDynamic("headerDblTap")(js.Any.fromFunction2(headerDblTap))
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (headerFilterEmptyCheck != null) __obj.updateDynamic("headerFilterEmptyCheck")(js.Any.fromFunction1(headerFilterEmptyCheck))
    if (headerFilterFunc != null) __obj.updateDynamic("headerFilterFunc")(headerFilterFunc.asInstanceOf[js.Any])
    if (headerFilterFuncParams != null) __obj.updateDynamic("headerFilterFuncParams")(headerFilterFuncParams.asInstanceOf[js.Any])
    if (!js.isUndefined(headerFilterLiveFilter)) __obj.updateDynamic("headerFilterLiveFilter")(headerFilterLiveFilter.asInstanceOf[js.Any])
    if (headerFilterParams != null) __obj.updateDynamic("headerFilterParams")(headerFilterParams.asInstanceOf[js.Any])
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.asInstanceOf[js.Any])
    if (headerSortStartingDir != null) __obj.updateDynamic("headerSortStartingDir")(headerSortStartingDir.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.asInstanceOf[js.Any])
    if (headerTap != null) __obj.updateDynamic("headerTap")(js.Any.fromFunction2(headerTap))
    if (headerTapHold != null) __obj.updateDynamic("headerTapHold")(js.Any.fromFunction2(headerTapHold))
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (headerVertical != null) __obj.updateDynamic("headerVertical")(headerVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInHtml)) __obj.updateDynamic("hideInHtml")(hideInHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlOutput)) __obj.updateDynamic("htmlOutput")(htmlOutput.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mutator != null) __obj.updateDynamic("mutator")(js.Any.fromFunction5(mutator))
    if (mutatorClipboard != null) __obj.updateDynamic("mutatorClipboard")(js.Any.fromFunction5(mutatorClipboard))
    if (mutatorClipboardParams != null) __obj.updateDynamic("mutatorClipboardParams")(mutatorClipboardParams.asInstanceOf[js.Any])
    if (mutatorData != null) __obj.updateDynamic("mutatorData")(js.Any.fromFunction5(mutatorData))
    if (mutatorDataParams != null) __obj.updateDynamic("mutatorDataParams")(mutatorDataParams.asInstanceOf[js.Any])
    if (mutatorEdit != null) __obj.updateDynamic("mutatorEdit")(js.Any.fromFunction5(mutatorEdit))
    if (mutatorEditParams != null) __obj.updateDynamic("mutatorEditParams")(mutatorEditParams.asInstanceOf[js.Any])
    if (mutatorParams != null) __obj.updateDynamic("mutatorParams")(mutatorParams.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHandle)) __obj.updateDynamic("rowHandle")(rowHandle.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (sorterParams != null) __obj.updateDynamic("sorterParams")(sorterParams.asInstanceOf[js.Any])
    if (titleFormatter != null) __obj.updateDynamic("titleFormatter")(titleFormatter.asInstanceOf[js.Any])
    if (titleFormatterParams != null) __obj.updateDynamic("titleFormatterParams")(titleFormatterParams.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (topCalc != null) __obj.updateDynamic("topCalc")(topCalc.asInstanceOf[js.Any])
    if (topCalcFormatter != null) __obj.updateDynamic("topCalcFormatter")(topCalcFormatter.asInstanceOf[js.Any])
    if (topCalcFormatterParams != null) __obj.updateDynamic("topCalcFormatterParams")(topCalcFormatterParams.asInstanceOf[js.Any])
    if (topCalcParams != null) __obj.updateDynamic("topCalcParams")(js.Any.fromFunction2(topCalcParams))
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (!js.isUndefined(variableHeight)) __obj.updateDynamic("variableHeight")(variableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthGrow != null) __obj.updateDynamic("widthGrow")(widthGrow.asInstanceOf[js.Any])
    if (widthShrink != null) __obj.updateDynamic("widthShrink")(widthShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColumnLookup]
  }
}

