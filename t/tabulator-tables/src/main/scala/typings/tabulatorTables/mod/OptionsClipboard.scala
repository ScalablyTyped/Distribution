package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.copy
import typings.tabulatorTables.tabulatorTablesStrings.html
import typings.tabulatorTables.tabulatorTablesStrings.insert
import typings.tabulatorTables.tabulatorTablesStrings.paste
import typings.tabulatorTables.tabulatorTablesStrings.plain
import typings.tabulatorTables.tabulatorTablesStrings.replace
import typings.tabulatorTables.tabulatorTablesStrings.table
import typings.tabulatorTables.tabulatorTablesStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsClipboard extends StObject {
  
  /**
    * You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
    *     true - enable clipboard copy and paste
    *     "copy" - enable only copy functionality
    *     "paste" - enable only paste functionality
    *     false - disable all clipboard functionality (default)
    */
  var clipboard: js.UndefOr[Boolean | copy | paste] = js.undefined
  
  /** The clipboardCopied event is triggered whenever data is copied to the clipboard. */
  var clipboardCopied: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * By default Tabulator includes column headers, row groups and column calculations in the clipboard output.
    *
    * You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the clipboardCopyConfig option in the table definition:
    */
  var clipboardCopyConfig: js.UndefOr[AdditionalExportOptions | Boolean] = js.undefined
  
  /** You can alter the finished output to the clipboard using the clipboardCopyFormatter callback. The callback function receives two arguments, the first is a string representing the type of content to be formatted (either "plain" or "html" depending on the type of data entering the clipboard). The second argument is the string that is about to be inserted into the clipboard. The function and should return a string that will be inserted into the clipboard. */
  var clipboardCopyFormatter: js.UndefOr[table | (js.Function2[/* type */ plain | html, /* output */ String, String])] = js.undefined
  
  /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
  var clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined
  
  /** The clipboardCopyRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the clipboard output: */
  var clipboardCopyRowRange: js.UndefOr[RowRangeLookup] = js.undefined
  
  /**
    * By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
    *
    * If you want to only copy the un-styled data then you should set the clipboardCopyStyled option to false in the table options object:
    */
  var clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
    *
    * insert - Inserts data into the table using the addRows function (default)
    * update - Updates data in the table using the updateOrAddData function
    * replace - replaces all data in the table using the setData function
    */
  var clipboardPasteAction: js.UndefOr[insert | update | replace] = js.undefined
  
  /** The clipboardPasteError event is triggered whenever an attempt to paste data into the table has failed because it was rejected by the paste parser. */
  var clipboardPasteError: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the data into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
    * It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
    *
    * The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
    *
    * If you extend the clipboard module to add your own parser, you can set it to be used as default with the clipboardPasteParser property.
    */
  var clipboardPasteParser: js.UndefOr[String | (js.Function1[/* clipboard */ Any, js.Array[Any]])] = js.undefined
  
  /** The clipboardPasted event is triggered whenever data is successfully pasted into the table. */
  var clipboardPasted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** When copying to clipboard you may want to apply a different group header from the one usually used in the table. You can now do this using the groupHeaderClipboard table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderClipboard: js.UndefOr[
    (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
  ] = js.undefined
  
  /** When the getHtml function is called you may want to apply a different group header from the one usually used in the table. You can now do this using the groupHeaderHtmlOutput table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderHtmlOutput: js.UndefOr[
    (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
  ] = js.undefined
}
object OptionsClipboard {
  
  inline def apply(): OptionsClipboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsClipboard]
  }
  
  extension [Self <: OptionsClipboard](x: Self) {
    
    inline def setClipboard(value: Boolean | copy | paste): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopied(value: () => Unit): Self = StObject.set(x, "clipboardCopied", js.Any.fromFunction0(value))
    
    inline def setClipboardCopiedUndefined: Self = StObject.set(x, "clipboardCopied", js.undefined)
    
    inline def setClipboardCopyConfig(value: AdditionalExportOptions | Boolean): Self = StObject.set(x, "clipboardCopyConfig", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopyConfigUndefined: Self = StObject.set(x, "clipboardCopyConfig", js.undefined)
    
    inline def setClipboardCopyFormatter(value: table | (js.Function2[/* type */ plain | html, /* output */ String, String])): Self = StObject.set(x, "clipboardCopyFormatter", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopyFormatterFunction2(value: (/* type */ plain | html, /* output */ String) => String): Self = StObject.set(x, "clipboardCopyFormatter", js.Any.fromFunction2(value))
    
    inline def setClipboardCopyFormatterUndefined: Self = StObject.set(x, "clipboardCopyFormatter", js.undefined)
    
    inline def setClipboardCopyHeader(value: Boolean): Self = StObject.set(x, "clipboardCopyHeader", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopyHeaderUndefined: Self = StObject.set(x, "clipboardCopyHeader", js.undefined)
    
    inline def setClipboardCopyRowRange(value: RowRangeLookup): Self = StObject.set(x, "clipboardCopyRowRange", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopyRowRangeUndefined: Self = StObject.set(x, "clipboardCopyRowRange", js.undefined)
    
    inline def setClipboardCopyStyled(value: Boolean): Self = StObject.set(x, "clipboardCopyStyled", value.asInstanceOf[js.Any])
    
    inline def setClipboardCopyStyledUndefined: Self = StObject.set(x, "clipboardCopyStyled", js.undefined)
    
    inline def setClipboardPasteAction(value: insert | update | replace): Self = StObject.set(x, "clipboardPasteAction", value.asInstanceOf[js.Any])
    
    inline def setClipboardPasteActionUndefined: Self = StObject.set(x, "clipboardPasteAction", js.undefined)
    
    inline def setClipboardPasteError(value: () => Unit): Self = StObject.set(x, "clipboardPasteError", js.Any.fromFunction0(value))
    
    inline def setClipboardPasteErrorUndefined: Self = StObject.set(x, "clipboardPasteError", js.undefined)
    
    inline def setClipboardPasteParser(value: String | (js.Function1[/* clipboard */ Any, js.Array[Any]])): Self = StObject.set(x, "clipboardPasteParser", value.asInstanceOf[js.Any])
    
    inline def setClipboardPasteParserFunction1(value: /* clipboard */ Any => js.Array[Any]): Self = StObject.set(x, "clipboardPasteParser", js.Any.fromFunction1(value))
    
    inline def setClipboardPasteParserUndefined: Self = StObject.set(x, "clipboardPasteParser", js.undefined)
    
    inline def setClipboardPasted(value: () => Unit): Self = StObject.set(x, "clipboardPasted", js.Any.fromFunction0(value))
    
    inline def setClipboardPastedUndefined: Self = StObject.set(x, "clipboardPasted", js.undefined)
    
    inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
    
    inline def setGroupHeaderClipboard(
      value: (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
    ): Self = StObject.set(x, "groupHeaderClipboard", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderClipboardFunction4(value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => String): Self = StObject.set(x, "groupHeaderClipboard", js.Any.fromFunction4(value))
    
    inline def setGroupHeaderClipboardUndefined: Self = StObject.set(x, "groupHeaderClipboard", js.undefined)
    
    inline def setGroupHeaderClipboardVarargs(value: (js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String])*): Self = StObject.set(x, "groupHeaderClipboard", js.Array(value*))
    
    inline def setGroupHeaderHtmlOutput(
      value: (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
    ): Self = StObject.set(x, "groupHeaderHtmlOutput", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderHtmlOutputFunction4(value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => String): Self = StObject.set(x, "groupHeaderHtmlOutput", js.Any.fromFunction4(value))
    
    inline def setGroupHeaderHtmlOutputUndefined: Self = StObject.set(x, "groupHeaderHtmlOutput", js.undefined)
    
    inline def setGroupHeaderHtmlOutputVarargs(value: (js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String])*): Self = StObject.set(x, "groupHeaderHtmlOutput", js.Array(value*))
  }
}
