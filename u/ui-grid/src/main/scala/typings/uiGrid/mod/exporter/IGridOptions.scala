package typings.uiGrid.mod.exporter

import typings.angular.mod.IPromise
import typings.uiGrid.mod.IGridColumnOf
import typings.uiGrid.mod.IGridInstanceOf
import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions[TEntity] extends js.Object {
  /**
    * This promise is needed when exporting all rows, and the data need to be provided by server side.
    * Default is null
    * @default null
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataFn: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.native
  /**
    * @deprecated
    * DEPRECATED - exporterAllDataFn used to be called this, but it wasn't a promise,
    * it was a function that returned a promise. Deprecated, but supported for backward compatibility,
    * use exporterAllDataFn instead.
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataPromise: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.native
  /**
    * The character to use as column separator link
    * Defaults to ','
    * @default ','
    */
  var exporterCsvColumnSeparator: js.UndefOr[String] = js.native
  /**
    * The default filename to use when saving the downloaded csv. This will only work in some browsers.
    * Defaults to 'download.csv'
    * @default 'download.csv'
    */
  var exporterCsvFilename: js.UndefOr[String] = js.native
  /**
    * A function to call for each field before exporting it.
    * Allows massaging of raw data into a display format, for example if you have applied filters to convert
    * codes into decodes, or you require a specific date format in the exported content.
    * The method is called once for each field exported, and provides the grid,
    * the gridCol, and the GridRow for you to use as context in massaging the data.
    *
    * @param {IGridInstance} grid The grid
    * @param {IGridRow} row Current row
    * @param {IGridColumn} col Current column
    * @param {any} value The cell value
    * @returns {any} Formatted value
    */
  var exporterFieldCallback: js.UndefOr[
    js.Function4[
      /* grid */ IGridInstanceOf[TEntity], 
      /* row */ IGridRowOf[TEntity], 
      /* col */ IGridColumnOf[TEntity], 
      /* value */ js.Any, 
      _
    ]
  ] = js.native
  /**
    * A function to apply to the header displayNames before exporting. Useful for internationalisation,
    * for example if you were using angular-translate you'd set this to $translate.instant.
    * Note that this call must be synchronous, it cannot be a call that returns a promise.
    *
    * Behaviour can be changed to pass in name instead of displayName through use
    * of exporterHeaderFilterUseName: true.
    * @param {string} displayName
    * @returns {string} The filtered header
    */
  var exporterHeaderFilter: js.UndefOr[js.Function1[/* displayName */ String, String]] = js.native
  /**
    * Defaults to false, which leads to displayName being passed into the headerFilter.
    * If set to true, then will pass name instead.
    * @default false
    */
  var exporterHeaderFilterUseName: js.UndefOr[Boolean] = js.native
  /**
    * Add csv export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuCsv: js.UndefOr[Boolean] = js.native
  /**
    * Add excel export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuExcel: js.UndefOr[Boolean] = js.native
  /**
    * An option to determine the starting point for the menu items created by the exporter
    * @default 200
    */
  var exporterMenuItemOrder: js.UndefOr[Double] = js.native
  /**
    * The text to show on the exporter menu button link
    * Defaults to 'Export'
    * @default 'Export'
    */
  var exporterMenuLabel: js.UndefOr[String] = js.native
  /**
    * Add pdf export menu items to the ui-grid grid menu, if it's present.
    * Defaults to true.
    * @default true
    */
  var exporterMenuPdf: js.UndefOr[Boolean] = js.native
  /**
    * Some versions of excel don't like the utf-16 BOM on the front,
    * and it comes through as ï»¿ in the first column header.
    * Setting this option to false will suppress this,
    * at the expense of proper utf-16 handling in applications that do recognise the BOM
    * Defaults to false
    * @default false
    */
  var exporterOlderExcelCompatibility: js.UndefOr[Boolean] = js.native
  /**
    * A custom callback routine that changes the pdf document,
    * adding any custom styling or content that is supported by pdfMake.
    * Takes in the complete docDefinition, and must return an updated docDefinition ready for pdfMake.
    * Example
    * In this example we add a style to the style array, so that we can use it in our footer definition.
    * @param {any} docDefinition Document definition in pdfMake format
    */
  var exporterPdfCustomFormatter: js.UndefOr[js.Function1[/* docDefinition */ js.Any, _]] = js.native
  /**
    * The default style in pdfMake format
    * @todo replace with pdfmake format
    */
  var exporterPdfDefaultStyle: js.UndefOr[js.Any] = js.native
  /**
    * The default filename to use when saving the downloaded pdf,
    * only used in IE (other browsers open pdfs in a new window)
    * Defaults to 'download.pdf'
    * @default 'download.pdf'
    */
  var exporterPdfFilename: js.UndefOr[String] = js.native
  /**
    * The footer section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfFooter: js.UndefOr[
    String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
  ] = js.native
  /**
    * The header section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfHeader: js.UndefOr[
    String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
  ] = js.native
  /**
    * The maxium grid width - the current grid width will be scaled to match this,
    * with any fixed width columns being adjusted accordingly.
    * Defaults to 720 (for A4 landscape), use 670 for LETTER
    * @default 720
    */
  var exporterPdfMaxGridWidth: js.UndefOr[Double] = js.native
  /**
    * The orientation, should be a valid pdfMake value, 'landscape' or 'portrait'
    * Defaults to landscape
    * @default 'landscape'
    */
  var exporterPdfOrientation: js.UndefOr[String] = js.native
  /**
    * The orientation, should be a valid pdfMake paper size, usually 'A4' or 'LETTER' pdfMake page sizes
    * Defaults to A4
    * @default 'A4'
    */
  var exporterPdfPageSize: js.UndefOr[String] = js.native
  /**
    * exporterPdfTableHeaderStyle
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableHeaderStyle: js.UndefOr[js.Any] = js.native
  /**
    * A tableLayout in pdfMake format, controls gridlines and the like. We use the default layout usually.
    * Defaults to null, which means no layout
    * @default null
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableLayout: js.UndefOr[js.Any] = js.native
  /**
    * The tableStyle in pdfMake format
    * Defaults to ```{ margin: [0, 5, 0, 15] }```
    * @default { margin: [0, 5, 0, 15] }
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableStyle: js.UndefOr[js.Any] = js.native
  /**
    * Columns that should not be exported.
    *
    * The selectionRowHeader is already automatically suppressed,
    * but if you had a button column or some other "system" column that shouldn't be shown in the output,
    * then add it in this list.
    *
    * You should provide an array of column names.
    * Defaults to: []
    * @default []
    */
  var exporterSuppressColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Don't show the export menu button, implying the user will roll their own UI for calling the exporter
    * Defaults to false
    * @default false
    */
  var exporterSuppressMenu: js.UndefOr[Boolean] = js.native
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions[_], TEntity] (val x: Self with IGridOptions[TEntity]) extends AnyVal {
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
    def setExporterAllDataFn(value: () => IPromise[js.Array[TEntity]]): Self = this.set("exporterAllDataFn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExporterAllDataFn: Self = this.set("exporterAllDataFn", js.undefined)
    @scala.inline
    def setExporterAllDataPromise(value: () => IPromise[js.Array[TEntity]]): Self = this.set("exporterAllDataPromise", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExporterAllDataPromise: Self = this.set("exporterAllDataPromise", js.undefined)
    @scala.inline
    def setExporterCsvColumnSeparator(value: String): Self = this.set("exporterCsvColumnSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterCsvColumnSeparator: Self = this.set("exporterCsvColumnSeparator", js.undefined)
    @scala.inline
    def setExporterCsvFilename(value: String): Self = this.set("exporterCsvFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterCsvFilename: Self = this.set("exporterCsvFilename", js.undefined)
    @scala.inline
    def setExporterFieldCallback(
      value: (/* grid */ IGridInstanceOf[TEntity], /* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], /* value */ js.Any) => _
    ): Self = this.set("exporterFieldCallback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteExporterFieldCallback: Self = this.set("exporterFieldCallback", js.undefined)
    @scala.inline
    def setExporterHeaderFilter(value: /* displayName */ String => String): Self = this.set("exporterHeaderFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExporterHeaderFilter: Self = this.set("exporterHeaderFilter", js.undefined)
    @scala.inline
    def setExporterHeaderFilterUseName(value: Boolean): Self = this.set("exporterHeaderFilterUseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterHeaderFilterUseName: Self = this.set("exporterHeaderFilterUseName", js.undefined)
    @scala.inline
    def setExporterMenuCsv(value: Boolean): Self = this.set("exporterMenuCsv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterMenuCsv: Self = this.set("exporterMenuCsv", js.undefined)
    @scala.inline
    def setExporterMenuExcel(value: Boolean): Self = this.set("exporterMenuExcel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterMenuExcel: Self = this.set("exporterMenuExcel", js.undefined)
    @scala.inline
    def setExporterMenuItemOrder(value: Double): Self = this.set("exporterMenuItemOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterMenuItemOrder: Self = this.set("exporterMenuItemOrder", js.undefined)
    @scala.inline
    def setExporterMenuLabel(value: String): Self = this.set("exporterMenuLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterMenuLabel: Self = this.set("exporterMenuLabel", js.undefined)
    @scala.inline
    def setExporterMenuPdf(value: Boolean): Self = this.set("exporterMenuPdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterMenuPdf: Self = this.set("exporterMenuPdf", js.undefined)
    @scala.inline
    def setExporterOlderExcelCompatibility(value: Boolean): Self = this.set("exporterOlderExcelCompatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterOlderExcelCompatibility: Self = this.set("exporterOlderExcelCompatibility", js.undefined)
    @scala.inline
    def setExporterPdfCustomFormatter(value: /* docDefinition */ js.Any => _): Self = this.set("exporterPdfCustomFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExporterPdfCustomFormatter: Self = this.set("exporterPdfCustomFormatter", js.undefined)
    @scala.inline
    def setExporterPdfDefaultStyle(value: js.Any): Self = this.set("exporterPdfDefaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfDefaultStyle: Self = this.set("exporterPdfDefaultStyle", js.undefined)
    @scala.inline
    def setExporterPdfFilename(value: String): Self = this.set("exporterPdfFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfFilename: Self = this.set("exporterPdfFilename", js.undefined)
    @scala.inline
    def setExporterPdfFooterFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self = this.set("exporterPdfFooter", js.Any.fromFunction2(value))
    @scala.inline
    def setExporterPdfFooter(value: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self = this.set("exporterPdfFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfFooter: Self = this.set("exporterPdfFooter", js.undefined)
    @scala.inline
    def setExporterPdfHeaderFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self = this.set("exporterPdfHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setExporterPdfHeader(value: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self = this.set("exporterPdfHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfHeader: Self = this.set("exporterPdfHeader", js.undefined)
    @scala.inline
    def setExporterPdfMaxGridWidth(value: Double): Self = this.set("exporterPdfMaxGridWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfMaxGridWidth: Self = this.set("exporterPdfMaxGridWidth", js.undefined)
    @scala.inline
    def setExporterPdfOrientation(value: String): Self = this.set("exporterPdfOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfOrientation: Self = this.set("exporterPdfOrientation", js.undefined)
    @scala.inline
    def setExporterPdfPageSize(value: String): Self = this.set("exporterPdfPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfPageSize: Self = this.set("exporterPdfPageSize", js.undefined)
    @scala.inline
    def setExporterPdfTableHeaderStyle(value: js.Any): Self = this.set("exporterPdfTableHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfTableHeaderStyle: Self = this.set("exporterPdfTableHeaderStyle", js.undefined)
    @scala.inline
    def setExporterPdfTableLayout(value: js.Any): Self = this.set("exporterPdfTableLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfTableLayout: Self = this.set("exporterPdfTableLayout", js.undefined)
    @scala.inline
    def setExporterPdfTableStyle(value: js.Any): Self = this.set("exporterPdfTableStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterPdfTableStyle: Self = this.set("exporterPdfTableStyle", js.undefined)
    @scala.inline
    def setExporterSuppressColumnsVarargs(value: String*): Self = this.set("exporterSuppressColumns", js.Array(value :_*))
    @scala.inline
    def setExporterSuppressColumns(value: js.Array[String]): Self = this.set("exporterSuppressColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterSuppressColumns: Self = this.set("exporterSuppressColumns", js.undefined)
    @scala.inline
    def setExporterSuppressMenu(value: Boolean): Self = this.set("exporterSuppressMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporterSuppressMenu: Self = this.set("exporterSuppressMenu", js.undefined)
  }
  
}

