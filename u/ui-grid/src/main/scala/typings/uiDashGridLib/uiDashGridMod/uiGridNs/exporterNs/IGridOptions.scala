package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions[TEntity] extends js.Object {
  /**
    * This promise is needed when exporting all rows, and the data need to be provided by server side.
    * Default is null
    * @default null
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataFn: js.UndefOr[js.Function0[angularLib.angularMod.angularNs.IPromise[js.Array[TEntity]]]] = js.undefined
  /**
    * @deprecated
    * DEPRECATED - exporterAllDataFn used to be called this, but it wasn't a promise,
    * it was a function that returned a promise. Deprecated, but supported for backward compatibility,
    * use exporterAllDataFn instead.
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataPromise: js.UndefOr[js.Function0[angularLib.angularMod.angularNs.IPromise[js.Array[TEntity]]]] = js.undefined
  /**
    * The character to use as column separator link
    * Defaults to ','
    * @default ','
    */
  var exporterCsvColumnSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default filename to use when saving the downloaded csv. This will only work in some browsers.
    * Defaults to 'download.csv'
    * @default 'download.csv'
    */
  var exporterCsvFilename: js.UndefOr[java.lang.String] = js.undefined
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
      /* grid */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridInstanceOf[TEntity], 
      /* row */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity], 
      /* col */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity], 
      /* value */ js.Any, 
      _
    ]
  ] = js.undefined
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
  var exporterHeaderFilter: js.UndefOr[js.Function1[/* displayName */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Defaults to false, which leads to displayName being passed into the headerFilter.
    * If set to true, then will pass name instead.
    * @default false
    */
  var exporterHeaderFilterUseName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add csv export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuCsv: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add excel export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuExcel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An option to determine the starting point for the menu items created by the exporter
    * @default 200
    */
  var exporterMenuItemOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text to show on the exporter menu button link
    * Defaults to 'Export'
    * @default 'Export'
    */
  var exporterMenuLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add pdf export menu items to the ui-grid grid menu, if it's present.
    * Defaults to true.
    * @default true
    */
  var exporterMenuPdf: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Some versions of excel don't like the utf-16 BOM on the front,
    * and it comes through as ï»¿ in the first column header.
    * Setting this option to false will suppress this,
    * at the expense of proper utf-16 handling in applications that do recognise the BOM
    * Defaults to false
    * @default false
    */
  var exporterOlderExcelCompatibility: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom callback routine that changes the pdf document,
    * adding any custom styling or content that is supported by pdfMake.
    * Takes in the complete docDefinition, and must return an updated docDefinition ready for pdfMake.
    * Example
    * In this example we add a style to the style array, so that we can use it in our footer definition.
    * @param {any} docDefinition Document definition in pdfMake format
    */
  var exporterPdfCustomFormatter: js.UndefOr[js.Function1[/* docDefinition */ js.Any, _]] = js.undefined
  /**
    * The default style in pdfMake format
    * @todo replace with pdfmake format
    */
  var exporterPdfDefaultStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * The default filename to use when saving the downloaded pdf,
    * only used in IE (other browsers open pdfs in a new window)
    * Defaults to 'download.pdf'
    * @default 'download.pdf'
    */
  var exporterPdfFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The footer section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfFooter: js.UndefOr[java.lang.String | js.Any | uiDashGridLib.Anon_CurrentPage] = js.undefined
  /**
    * The header section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfHeader: js.UndefOr[java.lang.String | js.Any | uiDashGridLib.Anon_CurrentPage] = js.undefined
  /**
    * The maxium grid width - the current grid width will be scaled to match this,
    * with any fixed width columns being adjusted accordingly.
    * Defaults to 720 (for A4 landscape), use 670 for LETTER
    * @default 720
    */
  var exporterPdfMaxGridWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation, should be a valid pdfMake value, 'landscape' or 'portrait'
    * Defaults to landscape
    * @default 'landscape'
    */
  var exporterPdfOrientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The orientation, should be a valid pdfMake paper size, usually 'A4' or 'LETTER' pdfMake page sizes
    * Defaults to A4
    * @default 'A4'
    */
  var exporterPdfPageSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * exporterPdfTableHeaderStyle
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableHeaderStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * A tableLayout in pdfMake format, controls gridlines and the like. We use the default layout usually.
    * Defaults to null, which means no layout
    * @default null
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableLayout: js.UndefOr[js.Any] = js.undefined
  /**
    * The tableStyle in pdfMake format
    * Defaults to ```{ margin: [0, 5, 0, 15] }```
    * @default { margin: [0, 5, 0, 15] }
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableStyle: js.UndefOr[js.Any] = js.undefined
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
  var exporterSuppressColumns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Don't show the export menu button, implying the user will roll their own UI for calling the exporter
    * Defaults to false
    * @default false
    */
  var exporterSuppressMenu: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](
    exporterAllDataFn: () => angularLib.angularMod.angularNs.IPromise[js.Array[TEntity]] = null,
    exporterAllDataPromise: () => angularLib.angularMod.angularNs.IPromise[js.Array[TEntity]] = null,
    exporterCsvColumnSeparator: java.lang.String = null,
    exporterCsvFilename: java.lang.String = null,
    exporterFieldCallback: (/* grid */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridInstanceOf[TEntity], /* row */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity], /* col */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity], /* value */ js.Any) => _ = null,
    exporterHeaderFilter: /* displayName */ java.lang.String => java.lang.String = null,
    exporterHeaderFilterUseName: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuCsv: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuExcel: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuItemOrder: scala.Int | scala.Double = null,
    exporterMenuLabel: java.lang.String = null,
    exporterMenuPdf: js.UndefOr[scala.Boolean] = js.undefined,
    exporterOlderExcelCompatibility: js.UndefOr[scala.Boolean] = js.undefined,
    exporterPdfCustomFormatter: /* docDefinition */ js.Any => _ = null,
    exporterPdfDefaultStyle: js.Any = null,
    exporterPdfFilename: java.lang.String = null,
    exporterPdfFooter: java.lang.String | js.Any | uiDashGridLib.Anon_CurrentPage = null,
    exporterPdfHeader: java.lang.String | js.Any | uiDashGridLib.Anon_CurrentPage = null,
    exporterPdfMaxGridWidth: scala.Int | scala.Double = null,
    exporterPdfOrientation: java.lang.String = null,
    exporterPdfPageSize: java.lang.String = null,
    exporterPdfTableHeaderStyle: js.Any = null,
    exporterPdfTableLayout: js.Any = null,
    exporterPdfTableStyle: js.Any = null,
    exporterSuppressColumns: js.Array[java.lang.String] = null,
    exporterSuppressMenu: js.UndefOr[scala.Boolean] = js.undefined
  ): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (exporterAllDataFn != null) __obj.updateDynamic("exporterAllDataFn")(js.Any.fromFunction0(exporterAllDataFn))
    if (exporterAllDataPromise != null) __obj.updateDynamic("exporterAllDataPromise")(js.Any.fromFunction0(exporterAllDataPromise))
    if (exporterCsvColumnSeparator != null) __obj.updateDynamic("exporterCsvColumnSeparator")(exporterCsvColumnSeparator)
    if (exporterCsvFilename != null) __obj.updateDynamic("exporterCsvFilename")(exporterCsvFilename)
    if (exporterFieldCallback != null) __obj.updateDynamic("exporterFieldCallback")(js.Any.fromFunction4(exporterFieldCallback))
    if (exporterHeaderFilter != null) __obj.updateDynamic("exporterHeaderFilter")(js.Any.fromFunction1(exporterHeaderFilter))
    if (!js.isUndefined(exporterHeaderFilterUseName)) __obj.updateDynamic("exporterHeaderFilterUseName")(exporterHeaderFilterUseName)
    if (!js.isUndefined(exporterMenuCsv)) __obj.updateDynamic("exporterMenuCsv")(exporterMenuCsv)
    if (!js.isUndefined(exporterMenuExcel)) __obj.updateDynamic("exporterMenuExcel")(exporterMenuExcel)
    if (exporterMenuItemOrder != null) __obj.updateDynamic("exporterMenuItemOrder")(exporterMenuItemOrder.asInstanceOf[js.Any])
    if (exporterMenuLabel != null) __obj.updateDynamic("exporterMenuLabel")(exporterMenuLabel)
    if (!js.isUndefined(exporterMenuPdf)) __obj.updateDynamic("exporterMenuPdf")(exporterMenuPdf)
    if (!js.isUndefined(exporterOlderExcelCompatibility)) __obj.updateDynamic("exporterOlderExcelCompatibility")(exporterOlderExcelCompatibility)
    if (exporterPdfCustomFormatter != null) __obj.updateDynamic("exporterPdfCustomFormatter")(js.Any.fromFunction1(exporterPdfCustomFormatter))
    if (exporterPdfDefaultStyle != null) __obj.updateDynamic("exporterPdfDefaultStyle")(exporterPdfDefaultStyle)
    if (exporterPdfFilename != null) __obj.updateDynamic("exporterPdfFilename")(exporterPdfFilename)
    if (exporterPdfFooter != null) __obj.updateDynamic("exporterPdfFooter")(exporterPdfFooter.asInstanceOf[js.Any])
    if (exporterPdfHeader != null) __obj.updateDynamic("exporterPdfHeader")(exporterPdfHeader.asInstanceOf[js.Any])
    if (exporterPdfMaxGridWidth != null) __obj.updateDynamic("exporterPdfMaxGridWidth")(exporterPdfMaxGridWidth.asInstanceOf[js.Any])
    if (exporterPdfOrientation != null) __obj.updateDynamic("exporterPdfOrientation")(exporterPdfOrientation)
    if (exporterPdfPageSize != null) __obj.updateDynamic("exporterPdfPageSize")(exporterPdfPageSize)
    if (exporterPdfTableHeaderStyle != null) __obj.updateDynamic("exporterPdfTableHeaderStyle")(exporterPdfTableHeaderStyle)
    if (exporterPdfTableLayout != null) __obj.updateDynamic("exporterPdfTableLayout")(exporterPdfTableLayout)
    if (exporterPdfTableStyle != null) __obj.updateDynamic("exporterPdfTableStyle")(exporterPdfTableStyle)
    if (exporterSuppressColumns != null) __obj.updateDynamic("exporterSuppressColumns")(exporterSuppressColumns)
    if (!js.isUndefined(exporterSuppressMenu)) __obj.updateDynamic("exporterSuppressMenu")(exporterSuppressMenu)
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
}

