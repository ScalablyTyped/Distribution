package typings.tabulatorTables.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsHTML extends StObject {
  
  var groupHeaderDownload: js.UndefOr[
    (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
  ] = js.undefined
  
  var htmlOutputConfig: js.UndefOr[AdditionalExportOptions] = js.undefined
  
  /**
    * By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn. While this ise useful in most cases, some users prefer to have more control over the print output, for example showing all rows of the table, instead of just those visible with the current position of the scroll bar.
    *
    * Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor.
    *
    * This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
    *
    * It also has the benefit that because it is an HTML table, if it causes a page break your browser will automatically add the column headers in at the top of the next page.
    */
  var printAsHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The HTML table will contain column header groups, row groups, and column calculations.
    *
    * You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition
    */
  var printConfig: js.UndefOr[AdditionalExportOptions] = js.undefined
  
  /** You can use the printFooter table setup option to define a footer to be displayed when the table is printed. */
  var printFooter: js.UndefOr[StandardStringParam] = js.undefined
  
  /** The printFormatter table setup option allows you to carry out any manipulation of the print output before it is displayed to the user for printing. */
  var printFormatter: js.UndefOr[js.Function2[/* tableHolderElement */ Any, /* tableElement */ Any, Any]] = js.undefined
  
  /** You can use the printHeader table setup option to define a header to be displayed when the table is printed. */
  var printHeader: js.UndefOr[StandardStringParam] = js.undefined
  
  /** By default, only the rows currently visible in the Tabulator will be added to the HTML table. For custom row ranges it is also possible to pass a function into the printRowRange option that should return an array of Row Components */
  var printRowRange: js.UndefOr[RowRangeLookup | js.Function0[js.Array[RowComponent]]] = js.undefined
  
  /** If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table. */
  var printStyled: js.UndefOr[Boolean] = js.undefined
}
object OptionsHTML {
  
  inline def apply(): OptionsHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHTML]
  }
  
  extension [Self <: OptionsHTML](x: Self) {
    
    inline def setGroupHeaderDownload(
      value: (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
    ): Self = StObject.set(x, "groupHeaderDownload", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderDownloadFunction4(value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => String): Self = StObject.set(x, "groupHeaderDownload", js.Any.fromFunction4(value))
    
    inline def setGroupHeaderDownloadUndefined: Self = StObject.set(x, "groupHeaderDownload", js.undefined)
    
    inline def setGroupHeaderDownloadVarargs(value: (js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String])*): Self = StObject.set(x, "groupHeaderDownload", js.Array(value*))
    
    inline def setHtmlOutputConfig(value: AdditionalExportOptions): Self = StObject.set(x, "htmlOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setHtmlOutputConfigUndefined: Self = StObject.set(x, "htmlOutputConfig", js.undefined)
    
    inline def setPrintAsHtml(value: Boolean): Self = StObject.set(x, "printAsHtml", value.asInstanceOf[js.Any])
    
    inline def setPrintAsHtmlUndefined: Self = StObject.set(x, "printAsHtml", js.undefined)
    
    inline def setPrintConfig(value: AdditionalExportOptions): Self = StObject.set(x, "printConfig", value.asInstanceOf[js.Any])
    
    inline def setPrintConfigUndefined: Self = StObject.set(x, "printConfig", js.undefined)
    
    inline def setPrintFooter(value: StandardStringParam): Self = StObject.set(x, "printFooter", value.asInstanceOf[js.Any])
    
    inline def setPrintFooterFunction0(value: () => String | HTMLElement): Self = StObject.set(x, "printFooter", js.Any.fromFunction0(value))
    
    inline def setPrintFooterUndefined: Self = StObject.set(x, "printFooter", js.undefined)
    
    inline def setPrintFormatter(value: (/* tableHolderElement */ Any, /* tableElement */ Any) => Any): Self = StObject.set(x, "printFormatter", js.Any.fromFunction2(value))
    
    inline def setPrintFormatterUndefined: Self = StObject.set(x, "printFormatter", js.undefined)
    
    inline def setPrintHeader(value: StandardStringParam): Self = StObject.set(x, "printHeader", value.asInstanceOf[js.Any])
    
    inline def setPrintHeaderFunction0(value: () => String | HTMLElement): Self = StObject.set(x, "printHeader", js.Any.fromFunction0(value))
    
    inline def setPrintHeaderUndefined: Self = StObject.set(x, "printHeader", js.undefined)
    
    inline def setPrintRowRange(value: RowRangeLookup | js.Function0[js.Array[RowComponent]]): Self = StObject.set(x, "printRowRange", value.asInstanceOf[js.Any])
    
    inline def setPrintRowRangeFunction0(value: () => js.Array[RowComponent]): Self = StObject.set(x, "printRowRange", js.Any.fromFunction0(value))
    
    inline def setPrintRowRangeUndefined: Self = StObject.set(x, "printRowRange", js.undefined)
    
    inline def setPrintStyled(value: Boolean): Self = StObject.set(x, "printStyled", value.asInstanceOf[js.Any])
    
    inline def setPrintStyledUndefined: Self = StObject.set(x, "printStyled", js.undefined)
  }
}
