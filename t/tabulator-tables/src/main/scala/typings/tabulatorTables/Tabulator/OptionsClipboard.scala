package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.copy
import typings.tabulatorTables.tabulatorTablesStrings.html
import typings.tabulatorTables.tabulatorTablesStrings.insert
import typings.tabulatorTables.tabulatorTablesStrings.paste
import typings.tabulatorTables.tabulatorTablesStrings.plain
import typings.tabulatorTables.tabulatorTablesStrings.replace
import typings.tabulatorTables.tabulatorTablesStrings.table
import typings.tabulatorTables.tabulatorTablesStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsClipboard extends js.Object {
  
  /** You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
    true - enable clipboard copy and paste
    "copy" - enable only copy functionality
    "paste" - enable only paste functionality
    false - disable all clipboard functionality (default) */
  var clipboard: js.UndefOr[Boolean | copy | paste] = js.native
  
  /** The clipboardCopied event is triggered whenever data is copied to the clipboard. */
  var clipboardCopied: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** By default Tabulator includes column headers, row groups and column calculations in the clipboard output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the clipboardCopyConfig option in the table definition: */
  var clipboardCopyConfig: js.UndefOr[AddditionalExportOptions | Boolean] = js.native
  
  /**You can alter the finished output to the clipboard using the clipboardCopyFormatter callback. The callback function receives two arguments, the first is a string representing the type of content to be formatted (either "plain" or "html" depending on the type of data entering the clipboard). The second argument is the string that is about to be insered into the clipboard. The function and should return a string that will be inserted into the clipboard */
  var clipboardCopyFormatter: js.UndefOr[table | (js.Function2[/* type */ plain | html, /* output */ String, String])] = js.native
  
  /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
  var clipboardCopyHeader: js.UndefOr[Boolean] = js.native
  
  /**The clipboardCopyRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the clipboard output: */
  var clipboardCopyRowRange: js.UndefOr[RowRangeLookup] = js.native
  
  /** By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
    If you want to only copy the unstyled data then you should set the clipboardCopyStyled option to false in the table options object:  */
  var clipboardCopyStyled: js.UndefOr[Boolean] = js.native
  
  /** Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
    insert - Inserts data into the table using the addRows function (default)
    update - Updates data in the table using the updateOrAddData function
    replace - replaces all data in the table using the setData function */
  var clipboardPasteAction: js.UndefOr[insert | update | replace] = js.native
  
  /** The clipboardPasteError event is triggered whenever an atempt to paste data into the table has failed because it was rejected by the paste parser. */
  var clipboardPasteError: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**  Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the tada into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
    It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
    The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
    If you extend the clipboard module to add your own parser, you can set it to be used as default with the clipboardPasteParser property.*/
  var clipboardPasteParser: js.UndefOr[String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])] = js.native
  
  /** The clipboardPasted event is triggered whenever data is successfuly pasted into the table. */
  var clipboardPasted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**When copying to clipboard you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderClipboard table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderClipboard: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
  
  /**When the getHtml function is called you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderHtmlOutput table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderHtmlOutput: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
}
object OptionsClipboard {
  
  @scala.inline
  def apply(): OptionsClipboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsClipboard]
  }
  
  @scala.inline
  implicit class OptionsClipboardOps[Self <: OptionsClipboard] (val x: Self) extends AnyVal {
    
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
    def setClipboard(value: Boolean | copy | paste): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setClipboardCopied(value: () => Unit): Self = this.set("clipboardCopied", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClipboardCopied: Self = this.set("clipboardCopied", js.undefined)
    
    @scala.inline
    def setClipboardCopyConfig(value: AddditionalExportOptions | Boolean): Self = this.set("clipboardCopyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardCopyConfig: Self = this.set("clipboardCopyConfig", js.undefined)
    
    @scala.inline
    def setClipboardCopyFormatterFunction2(value: (/* type */ plain | html, /* output */ String) => String): Self = this.set("clipboardCopyFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClipboardCopyFormatter(value: table | (js.Function2[/* type */ plain | html, /* output */ String, String])): Self = this.set("clipboardCopyFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardCopyFormatter: Self = this.set("clipboardCopyFormatter", js.undefined)
    
    @scala.inline
    def setClipboardCopyHeader(value: Boolean): Self = this.set("clipboardCopyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardCopyHeader: Self = this.set("clipboardCopyHeader", js.undefined)
    
    @scala.inline
    def setClipboardCopyRowRange(value: RowRangeLookup): Self = this.set("clipboardCopyRowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardCopyRowRange: Self = this.set("clipboardCopyRowRange", js.undefined)
    
    @scala.inline
    def setClipboardCopyStyled(value: Boolean): Self = this.set("clipboardCopyStyled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardCopyStyled: Self = this.set("clipboardCopyStyled", js.undefined)
    
    @scala.inline
    def setClipboardPasteAction(value: insert | update | replace): Self = this.set("clipboardPasteAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardPasteAction: Self = this.set("clipboardPasteAction", js.undefined)
    
    @scala.inline
    def setClipboardPasteError(value: () => Unit): Self = this.set("clipboardPasteError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClipboardPasteError: Self = this.set("clipboardPasteError", js.undefined)
    
    @scala.inline
    def setClipboardPasteParserFunction1(value: /* clipboard */ js.Any => js.Array[_]): Self = this.set("clipboardPasteParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClipboardPasteParser(value: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])): Self = this.set("clipboardPasteParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboardPasteParser: Self = this.set("clipboardPasteParser", js.undefined)
    
    @scala.inline
    def setClipboardPasted(value: () => Unit): Self = this.set("clipboardPasted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClipboardPasted: Self = this.set("clipboardPasted", js.undefined)
    
    @scala.inline
    def setGroupHeaderClipboardVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = this.set("groupHeaderClipboard", js.Array(value :_*))
    
    @scala.inline
    def setGroupHeaderClipboardFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = this.set("groupHeaderClipboard", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupHeaderClipboard(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = this.set("groupHeaderClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderClipboard: Self = this.set("groupHeaderClipboard", js.undefined)
    
    @scala.inline
    def setGroupHeaderHtmlOutputVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = this.set("groupHeaderHtmlOutput", js.Array(value :_*))
    
    @scala.inline
    def setGroupHeaderHtmlOutputFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = this.set("groupHeaderHtmlOutput", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupHeaderHtmlOutput(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = this.set("groupHeaderHtmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderHtmlOutput: Self = this.set("groupHeaderHtmlOutput", js.undefined)
  }
}
