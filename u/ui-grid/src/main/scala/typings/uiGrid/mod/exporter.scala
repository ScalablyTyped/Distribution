package typings.uiGrid.mod

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  trait IColumnDef extends StObject {
    
    /**
      * the alignment you'd like for this specific column when exported into a pdf.
      * Can be 'left', 'right', 'center' or any other valid pdfMake alignment option.
      */
    var exporterPdfAlign: js.UndefOr[String] = js.undefined
    
    /**
      * Suppresses export for this column. Used by selection and expandable.
      */
    var exporterSuppressExport: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typings.uiGrid.mod.exporter.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.exporter.IColumnDef]
    }
    
    extension [Self <: typings.uiGrid.mod.exporter.IColumnDef](x: Self) {
      
      inline def setExporterPdfAlign(value: String): Self = StObject.set(x, "exporterPdfAlign", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfAlignUndefined: Self = StObject.set(x, "exporterPdfAlign", js.undefined)
      
      inline def setExporterSuppressExport(value: Boolean): Self = StObject.set(x, "exporterSuppressExport", value.asInstanceOf[js.Any])
      
      inline def setExporterSuppressExportUndefined: Self = StObject.set(x, "exporterSuppressExport", js.undefined)
    }
  }
  
  trait IGridExporterApi extends StObject {
    
    /**
      * Exports rows from the grid in csv format, the data exported is selected based on the provided options
      * @param rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
      * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
      * @param colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
      * uiGridExporterConstants.VISIBLE
      */
    def csvExport(rowTypes: String, colTypes: String): Unit
    
    /**
      * Exports rows from the grid in pdf format, the data exported is selected based on the provided options
      * Note that this function has a dependency on pdfMake, all going well this has been installed for you. The
      * resulting pdf opens in a new browser window.
      * @param rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
      * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
      * @param colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
      * uiGridExporterConstants.VISIBLE
      */
    def pdfExport(rowTypes: String, colTypes: String): Unit
  }
  object IGridExporterApi {
    
    inline def apply(csvExport: (String, String) => Unit, pdfExport: (String, String) => Unit): IGridExporterApi = {
      val __obj = js.Dynamic.literal(csvExport = js.Any.fromFunction2(csvExport), pdfExport = js.Any.fromFunction2(pdfExport))
      __obj.asInstanceOf[IGridExporterApi]
    }
    
    extension [Self <: IGridExporterApi](x: Self) {
      
      inline def setCsvExport(value: (String, String) => Unit): Self = StObject.set(x, "csvExport", js.Any.fromFunction2(value))
      
      inline def setPdfExport(value: (String, String) => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction2(value))
    }
  }
  
  trait IGridOptions[TEntity] extends StObject {
    
    /**
      * This promise is needed when exporting all rows, and the data need to be provided by server side.
      * Default is null
      * @default null
      * @returns A promise to load all data from server
      */
    var exporterAllDataFn: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.undefined
    
    /**
      * @deprecated
      * DEPRECATED - exporterAllDataFn used to be called this, but it wasn't a promise,
      * it was a function that returned a promise. Deprecated, but supported for backward compatibility,
      * use exporterAllDataFn instead.
      * @returns A promise to load all data from server
      */
    var exporterAllDataPromise: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.undefined
    
    /**
      * The character to use as column separator link
      * Defaults to ','
      * @default ','
      */
    var exporterCsvColumnSeparator: js.UndefOr[String] = js.undefined
    
    /**
      * The default filename to use when saving the downloaded csv. This will only work in some browsers.
      * Defaults to 'download.csv'
      * @default 'download.csv'
      */
    var exporterCsvFilename: js.UndefOr[String] = js.undefined
    
    /**
      * A function to call for each field before exporting it.
      * Allows massaging of raw data into a display format, for example if you have applied filters to convert
      * codes into decodes, or you require a specific date format in the exported content.
      * The method is called once for each field exported, and provides the grid,
      * the gridCol, and the GridRow for you to use as context in massaging the data.
      *
      * @param grid The grid
      * @param row Current row
      * @param col Current column
      * @param value The cell value
      * @returns Formatted value
      */
    var exporterFieldCallback: js.UndefOr[
        js.Function4[
          /* grid */ IGridInstanceOf[TEntity], 
          /* row */ IGridRowOf[TEntity], 
          /* col */ IGridColumnOf[TEntity], 
          /* value */ Any, 
          Any
        ]
      ] = js.undefined
    
    /**
      * A function to apply to the header displayNames before exporting. Useful for internationalisation,
      * for example if you were using angular-translate you'd set this to $translate.instant.
      * Note that this call must be synchronous, it cannot be a call that returns a promise.
      *
      * Behaviour can be changed to pass in name instead of displayName through use
      * of exporterHeaderFilterUseName: true.
      * @param displayName
      * @returns The filtered header
      */
    var exporterHeaderFilter: js.UndefOr[js.Function1[/* displayName */ String, String]] = js.undefined
    
    /**
      * Defaults to false, which leads to displayName being passed into the headerFilter.
      * If set to true, then will pass name instead.
      * @default false
      */
    var exporterHeaderFilterUseName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add csv export menu items to the ui-grid grid menu, if it's present. Defaults to true.
      * @default true
      */
    var exporterMenuCsv: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add excel export menu items to the ui-grid grid menu, if it's present. Defaults to true.
      * @default true
      */
    var exporterMenuExcel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An option to determine the starting point for the menu items created by the exporter
      * @default 200
      */
    var exporterMenuItemOrder: js.UndefOr[Double] = js.undefined
    
    /**
      * The text to show on the exporter menu button link
      * Defaults to 'Export'
      * @default 'Export'
      */
    var exporterMenuLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Add pdf export menu items to the ui-grid grid menu, if it's present.
      * Defaults to true.
      * @default true
      */
    var exporterMenuPdf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Some versions of excel don't like the utf-16 BOM on the front,
      * and it comes through as ï»¿ in the first column header.
      * Setting this option to false will suppress this,
      * at the expense of proper utf-16 handling in applications that do recognise the BOM
      * Defaults to false
      * @default false
      */
    var exporterOlderExcelCompatibility: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A custom callback routine that changes the pdf document,
      * adding any custom styling or content that is supported by pdfMake.
      * Takes in the complete docDefinition, and must return an updated docDefinition ready for pdfMake.
      * Example
      * In this example we add a style to the style array, so that we can use it in our footer definition.
      * @param docDefinition Document definition in pdfMake format
      */
    var exporterPdfCustomFormatter: js.UndefOr[js.Function1[/* docDefinition */ Any, Any]] = js.undefined
    
    /**
      * The default style in pdfMake format
      * @todo replace with pdfmake format
      */
    var exporterPdfDefaultStyle: js.UndefOr[Any] = js.undefined
    
    /**
      * The default filename to use when saving the downloaded pdf,
      * only used in IE (other browsers open pdfs in a new window)
      * Defaults to 'download.pdf'
      * @default 'download.pdf'
      */
    var exporterPdfFilename: js.UndefOr[String] = js.undefined
    
    /**
      * The footer section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
      * can be a function, allowing page numbers and the like
      * @todo replace any with pdfmake format
      */
    var exporterPdfFooter: js.UndefOr[
        String | Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
      ] = js.undefined
    
    /**
      * The header section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
      * can be a function, allowing page numbers and the like
      * @todo replace any with pdfmake format
      */
    var exporterPdfHeader: js.UndefOr[
        String | Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
      ] = js.undefined
    
    /**
      * The maxium grid width - the current grid width will be scaled to match this,
      * with any fixed width columns being adjusted accordingly.
      * Defaults to 720 (for A4 landscape), use 670 for LETTER
      * @default 720
      */
    var exporterPdfMaxGridWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The orientation, should be a valid pdfMake value, 'landscape' or 'portrait'
      * Defaults to landscape
      * @default 'landscape'
      */
    var exporterPdfOrientation: js.UndefOr[String] = js.undefined
    
    /**
      * The orientation, should be a valid pdfMake paper size, usually 'A4' or 'LETTER' pdfMake page sizes
      * Defaults to A4
      * @default 'A4'
      */
    var exporterPdfPageSize: js.UndefOr[String] = js.undefined
    
    /**
      * exporterPdfTableHeaderStyle
      * @todo replace any with pdfmake format
      */
    var exporterPdfTableHeaderStyle: js.UndefOr[Any] = js.undefined
    
    /**
      * A tableLayout in pdfMake format, controls gridlines and the like. We use the default layout usually.
      * Defaults to null, which means no layout
      * @default null
      * @todo replace any with pdfmake format
      */
    var exporterPdfTableLayout: js.UndefOr[Any] = js.undefined
    
    /**
      * The tableStyle in pdfMake format
      * Defaults to ```{ margin: [0, 5, 0, 15] }```
      * @default { margin: [0, 5, 0, 15] }
      * @todo replace any with pdfmake format
      */
    var exporterPdfTableStyle: js.UndefOr[Any] = js.undefined
    
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
    var exporterSuppressColumns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Don't show the export menu button, implying the user will roll their own UI for calling the exporter
      * Defaults to false
      * @default false
      */
    var exporterSuppressMenu: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply[TEntity](): typings.uiGrid.mod.exporter.IGridOptions[TEntity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.exporter.IGridOptions[TEntity]]
    }
    
    extension [Self <: typings.uiGrid.mod.exporter.IGridOptions[?], TEntity](x: Self & typings.uiGrid.mod.exporter.IGridOptions[TEntity]) {
      
      inline def setExporterAllDataFn(value: () => IPromise[js.Array[TEntity]]): Self = StObject.set(x, "exporterAllDataFn", js.Any.fromFunction0(value))
      
      inline def setExporterAllDataFnUndefined: Self = StObject.set(x, "exporterAllDataFn", js.undefined)
      
      inline def setExporterAllDataPromise(value: () => IPromise[js.Array[TEntity]]): Self = StObject.set(x, "exporterAllDataPromise", js.Any.fromFunction0(value))
      
      inline def setExporterAllDataPromiseUndefined: Self = StObject.set(x, "exporterAllDataPromise", js.undefined)
      
      inline def setExporterCsvColumnSeparator(value: String): Self = StObject.set(x, "exporterCsvColumnSeparator", value.asInstanceOf[js.Any])
      
      inline def setExporterCsvColumnSeparatorUndefined: Self = StObject.set(x, "exporterCsvColumnSeparator", js.undefined)
      
      inline def setExporterCsvFilename(value: String): Self = StObject.set(x, "exporterCsvFilename", value.asInstanceOf[js.Any])
      
      inline def setExporterCsvFilenameUndefined: Self = StObject.set(x, "exporterCsvFilename", js.undefined)
      
      inline def setExporterFieldCallback(
        value: (/* grid */ IGridInstanceOf[TEntity], /* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], /* value */ Any) => Any
      ): Self = StObject.set(x, "exporterFieldCallback", js.Any.fromFunction4(value))
      
      inline def setExporterFieldCallbackUndefined: Self = StObject.set(x, "exporterFieldCallback", js.undefined)
      
      inline def setExporterHeaderFilter(value: /* displayName */ String => String): Self = StObject.set(x, "exporterHeaderFilter", js.Any.fromFunction1(value))
      
      inline def setExporterHeaderFilterUndefined: Self = StObject.set(x, "exporterHeaderFilter", js.undefined)
      
      inline def setExporterHeaderFilterUseName(value: Boolean): Self = StObject.set(x, "exporterHeaderFilterUseName", value.asInstanceOf[js.Any])
      
      inline def setExporterHeaderFilterUseNameUndefined: Self = StObject.set(x, "exporterHeaderFilterUseName", js.undefined)
      
      inline def setExporterMenuCsv(value: Boolean): Self = StObject.set(x, "exporterMenuCsv", value.asInstanceOf[js.Any])
      
      inline def setExporterMenuCsvUndefined: Self = StObject.set(x, "exporterMenuCsv", js.undefined)
      
      inline def setExporterMenuExcel(value: Boolean): Self = StObject.set(x, "exporterMenuExcel", value.asInstanceOf[js.Any])
      
      inline def setExporterMenuExcelUndefined: Self = StObject.set(x, "exporterMenuExcel", js.undefined)
      
      inline def setExporterMenuItemOrder(value: Double): Self = StObject.set(x, "exporterMenuItemOrder", value.asInstanceOf[js.Any])
      
      inline def setExporterMenuItemOrderUndefined: Self = StObject.set(x, "exporterMenuItemOrder", js.undefined)
      
      inline def setExporterMenuLabel(value: String): Self = StObject.set(x, "exporterMenuLabel", value.asInstanceOf[js.Any])
      
      inline def setExporterMenuLabelUndefined: Self = StObject.set(x, "exporterMenuLabel", js.undefined)
      
      inline def setExporterMenuPdf(value: Boolean): Self = StObject.set(x, "exporterMenuPdf", value.asInstanceOf[js.Any])
      
      inline def setExporterMenuPdfUndefined: Self = StObject.set(x, "exporterMenuPdf", js.undefined)
      
      inline def setExporterOlderExcelCompatibility(value: Boolean): Self = StObject.set(x, "exporterOlderExcelCompatibility", value.asInstanceOf[js.Any])
      
      inline def setExporterOlderExcelCompatibilityUndefined: Self = StObject.set(x, "exporterOlderExcelCompatibility", js.undefined)
      
      inline def setExporterPdfCustomFormatter(value: /* docDefinition */ Any => Any): Self = StObject.set(x, "exporterPdfCustomFormatter", js.Any.fromFunction1(value))
      
      inline def setExporterPdfCustomFormatterUndefined: Self = StObject.set(x, "exporterPdfCustomFormatter", js.undefined)
      
      inline def setExporterPdfDefaultStyle(value: Any): Self = StObject.set(x, "exporterPdfDefaultStyle", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfDefaultStyleUndefined: Self = StObject.set(x, "exporterPdfDefaultStyle", js.undefined)
      
      inline def setExporterPdfFilename(value: String): Self = StObject.set(x, "exporterPdfFilename", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfFilenameUndefined: Self = StObject.set(x, "exporterPdfFilename", js.undefined)
      
      inline def setExporterPdfFooter(value: String | Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self = StObject.set(x, "exporterPdfFooter", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfFooterFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self = StObject.set(x, "exporterPdfFooter", js.Any.fromFunction2(value))
      
      inline def setExporterPdfFooterUndefined: Self = StObject.set(x, "exporterPdfFooter", js.undefined)
      
      inline def setExporterPdfHeader(value: String | Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self = StObject.set(x, "exporterPdfHeader", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfHeaderFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self = StObject.set(x, "exporterPdfHeader", js.Any.fromFunction2(value))
      
      inline def setExporterPdfHeaderUndefined: Self = StObject.set(x, "exporterPdfHeader", js.undefined)
      
      inline def setExporterPdfMaxGridWidth(value: Double): Self = StObject.set(x, "exporterPdfMaxGridWidth", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfMaxGridWidthUndefined: Self = StObject.set(x, "exporterPdfMaxGridWidth", js.undefined)
      
      inline def setExporterPdfOrientation(value: String): Self = StObject.set(x, "exporterPdfOrientation", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfOrientationUndefined: Self = StObject.set(x, "exporterPdfOrientation", js.undefined)
      
      inline def setExporterPdfPageSize(value: String): Self = StObject.set(x, "exporterPdfPageSize", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfPageSizeUndefined: Self = StObject.set(x, "exporterPdfPageSize", js.undefined)
      
      inline def setExporterPdfTableHeaderStyle(value: Any): Self = StObject.set(x, "exporterPdfTableHeaderStyle", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfTableHeaderStyleUndefined: Self = StObject.set(x, "exporterPdfTableHeaderStyle", js.undefined)
      
      inline def setExporterPdfTableLayout(value: Any): Self = StObject.set(x, "exporterPdfTableLayout", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfTableLayoutUndefined: Self = StObject.set(x, "exporterPdfTableLayout", js.undefined)
      
      inline def setExporterPdfTableStyle(value: Any): Self = StObject.set(x, "exporterPdfTableStyle", value.asInstanceOf[js.Any])
      
      inline def setExporterPdfTableStyleUndefined: Self = StObject.set(x, "exporterPdfTableStyle", js.undefined)
      
      inline def setExporterSuppressColumns(value: js.Array[String]): Self = StObject.set(x, "exporterSuppressColumns", value.asInstanceOf[js.Any])
      
      inline def setExporterSuppressColumnsUndefined: Self = StObject.set(x, "exporterSuppressColumns", js.undefined)
      
      inline def setExporterSuppressColumnsVarargs(value: String*): Self = StObject.set(x, "exporterSuppressColumns", js.Array(value*))
      
      inline def setExporterSuppressMenu(value: Boolean): Self = StObject.set(x, "exporterSuppressMenu", value.asInstanceOf[js.Any])
      
      inline def setExporterSuppressMenuUndefined: Self = StObject.set(x, "exporterSuppressMenu", js.undefined)
    }
  }
  
  trait IGridRow extends StObject {
    
    /**
      * If set to false, then don't export this row, notwithstanding visible or other settings.
      * Defaults to true
      * @default true
      */
    var exporterEnableExporting: js.UndefOr[Boolean] = js.undefined
  }
  object IGridRow {
    
    inline def apply(): typings.uiGrid.mod.exporter.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.exporter.IGridRow]
    }
    
    extension [Self <: typings.uiGrid.mod.exporter.IGridRow](x: Self) {
      
      inline def setExporterEnableExporting(value: Boolean): Self = StObject.set(x, "exporterEnableExporting", value.asInstanceOf[js.Any])
      
      inline def setExporterEnableExportingUndefined: Self = StObject.set(x, "exporterEnableExporting", js.undefined)
    }
  }
  
  trait IUiGridExporterConstants extends StObject {
    
    /** export all data, including data not visible.  Can be set for either rowTypes or colTypes */
    var ALL: String
    
    var BUTTON_LABEL: String
    
    var CSV_CONTENT: String
    
    var FILE_NAME: String
    
    /**
      * Export all data, including data not visible.
      * Can be set only for rowTypes, selection of only some columns is not supported
      */
    var SELECTED: String
    
    /** export only visible data, including data not visible.  Can be set for either rowTypes or colTypes */
    var VISIBLE: String
    
    var featureName: String
  }
  object IUiGridExporterConstants {
    
    inline def apply(
      ALL: String,
      BUTTON_LABEL: String,
      CSV_CONTENT: String,
      FILE_NAME: String,
      SELECTED: String,
      VISIBLE: String,
      featureName: String
    ): IUiGridExporterConstants = {
      val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], BUTTON_LABEL = BUTTON_LABEL.asInstanceOf[js.Any], CSV_CONTENT = CSV_CONTENT.asInstanceOf[js.Any], FILE_NAME = FILE_NAME.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], VISIBLE = VISIBLE.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridExporterConstants]
    }
    
    extension [Self <: IUiGridExporterConstants](x: Self) {
      
      inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setBUTTON_LABEL(value: String): Self = StObject.set(x, "BUTTON_LABEL", value.asInstanceOf[js.Any])
      
      inline def setCSV_CONTENT(value: String): Self = StObject.set(x, "CSV_CONTENT", value.asInstanceOf[js.Any])
      
      inline def setFILE_NAME(value: String): Self = StObject.set(x, "FILE_NAME", value.asInstanceOf[js.Any])
      
      inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      inline def setSELECTED(value: String): Self = StObject.set(x, "SELECTED", value.asInstanceOf[js.Any])
      
      inline def setVISIBLE(value: String): Self = StObject.set(x, "VISIBLE", value.asInstanceOf[js.Any])
    }
  }
}
