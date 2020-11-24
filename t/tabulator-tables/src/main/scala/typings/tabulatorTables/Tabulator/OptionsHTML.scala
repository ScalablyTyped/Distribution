package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsHTML extends js.Object {
  
  var groupHeaderDownload: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
  
  var htmlOutputConfig: js.UndefOr[AddditionalExportOptions] = js.native
  
  /**By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn. While this ise useful in most cases, some users prefer tohave more controll over the print output, for example showing all rows of the table, instead of just those visible with the current position of the scroll bar.
    Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor. 
    
    This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
    It also has the benifit that because it is an HTML table, if it corsses a page break your browser will uatomatically add the column headers in at the top of the next page.
    */
  var printAsHtml: js.UndefOr[Boolean] = js.native
  
  /**The HTML table will contain column header groups, row groups, and column calculations.
    You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition */
  var printConfig: js.UndefOr[AddditionalExportOptions] = js.native
  
  /**You can use the printFooter table setup option to define a footer to be displayed when the table is printed. */
  var printFooter: js.UndefOr[StandardStringParam] = js.native
  
  /**The printFormatter table setup option allows you to carry out any manipulation of the print output before it is displayed to the user for printing*/
  var printFormatter: js.UndefOr[js.Function2[/* tableHolderElement */ js.Any, /* tableElement */ js.Any, _]] = js.native
  
  /**You can use the printHeader table setup option to define a header to be displayed when the table is printed. */
  var printHeader: js.UndefOr[StandardStringParam] = js.native
  
  /**By default, only the rows currently visible in the Tabulator will be added to the HTML table. For custom row ranges it is also possible to pass a function into the printRowRange option that should return an array of Row Components */
  var printRowRange: js.UndefOr[RowRangeLookup | js.Function0[js.Array[RowComponent]]] = js.native
  
  /**If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table */
  var printStyled: js.UndefOr[Boolean] = js.native
}
object OptionsHTML {
  
  @scala.inline
  def apply(): OptionsHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHTML]
  }
  
  @scala.inline
  implicit class OptionsHTMLOps[Self <: OptionsHTML] (val x: Self) extends AnyVal {
    
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
    def setGroupHeaderDownloadVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = this.set("groupHeaderDownload", js.Array(value :_*))
    
    @scala.inline
    def setGroupHeaderDownloadFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = this.set("groupHeaderDownload", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupHeaderDownload(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = this.set("groupHeaderDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderDownload: Self = this.set("groupHeaderDownload", js.undefined)
    
    @scala.inline
    def setHtmlOutputConfig(value: AddditionalExportOptions): Self = this.set("htmlOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlOutputConfig: Self = this.set("htmlOutputConfig", js.undefined)
    
    @scala.inline
    def setPrintAsHtml(value: Boolean): Self = this.set("printAsHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintAsHtml: Self = this.set("printAsHtml", js.undefined)
    
    @scala.inline
    def setPrintConfig(value: AddditionalExportOptions): Self = this.set("printConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintConfig: Self = this.set("printConfig", js.undefined)
    
    @scala.inline
    def setPrintFooterFunction0(value: () => String | HTMLElement): Self = this.set("printFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintFooter(value: StandardStringParam): Self = this.set("printFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintFooter: Self = this.set("printFooter", js.undefined)
    
    @scala.inline
    def setPrintFormatter(value: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => _): Self = this.set("printFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrintFormatter: Self = this.set("printFormatter", js.undefined)
    
    @scala.inline
    def setPrintHeaderFunction0(value: () => String | HTMLElement): Self = this.set("printHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintHeader(value: StandardStringParam): Self = this.set("printHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintHeader: Self = this.set("printHeader", js.undefined)
    
    @scala.inline
    def setPrintRowRangeFunction0(value: () => js.Array[RowComponent]): Self = this.set("printRowRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintRowRange(value: RowRangeLookup | js.Function0[js.Array[RowComponent]]): Self = this.set("printRowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintRowRange: Self = this.set("printRowRange", js.undefined)
    
    @scala.inline
    def setPrintStyled(value: Boolean): Self = this.set("printStyled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintStyled: Self = this.set("printStyled", js.undefined)
  }
}
