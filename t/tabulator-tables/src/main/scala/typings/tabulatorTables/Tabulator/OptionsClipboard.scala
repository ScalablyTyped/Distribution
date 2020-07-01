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
import scala.scalajs.js.annotation._

trait OptionsClipboard extends js.Object {
  /** You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
    true - enable clipboard copy and paste
    "copy" - enable only copy functionality
    "paste" - enable only paste functionality
    false - disable all clipboard functionality (default) */
  var clipboard: js.UndefOr[Boolean | copy | paste] = js.undefined
  /** The clipboardCopied event is triggered whenever data is copied to the clipboard. */
  var clipboardCopied: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** By default Tabulator includes column headers, row groups and column calculations in the clipboard output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the clipboardCopyConfig option in the table definition: */
  var clipboardCopyConfig: js.UndefOr[AddditionalExportOptions | Boolean] = js.undefined
  /**You can alter the finished output to the clipboard using the clipboardCopyFormatter callback. The callback function receives two arguments, the first is a string representing the type of content to be formatted (either "plain" or "html" depending on the type of data entering the clipboard). The second argument is the string that is about to be insered into the clipboard. The function and should return a string that will be inserted into the clipboard */
  var clipboardCopyFormatter: js.UndefOr[table | (js.Function2[/* type */ plain | html, /* output */ String, String])] = js.undefined
  /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
  var clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined
  /**The clipboardCopyRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the clipboard output: */
  var clipboardCopyRowRange: js.UndefOr[RowRangeLookup] = js.undefined
  /** By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
    If you want to only copy the unstyled data then you should set the clipboardCopyStyled option to false in the table options object:  */
  var clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined
  /** Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
    insert - Inserts data into the table using the addRows function (default)
    update - Updates data in the table using the updateOrAddData function
    replace - replaces all data in the table using the setData function */
  var clipboardPasteAction: js.UndefOr[insert | update | replace] = js.undefined
  /** The clipboardPasteError event is triggered whenever an atempt to paste data into the table has failed because it was rejected by the paste parser. */
  var clipboardPasteError: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**  Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the tada into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
    It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
    The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
    If you extend the clipboard module to add your own parser, you can set it to be used as default with the clipboardPasteParser property.*/
  var clipboardPasteParser: js.UndefOr[String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])] = js.undefined
  /** The clipboardPasted event is triggered whenever data is successfuly pasted into the table. */
  var clipboardPasted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**When copying to clipboard you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderClipboard table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderClipboard: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.undefined
  /**When the getHtml function is called you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderHtmlOutput table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderHtmlOutput: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.undefined
}

object OptionsClipboard {
  @scala.inline
  def apply(
    clipboard: Boolean | copy | paste = null,
    clipboardCopied: () => Unit = null,
    clipboardCopyConfig: AddditionalExportOptions | Boolean = null,
    clipboardCopyFormatter: table | (js.Function2[/* type */ plain | html, /* output */ String, String]) = null,
    clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined,
    clipboardCopyRowRange: RowRangeLookup = null,
    clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined,
    clipboardPasteAction: insert | update | replace = null,
    clipboardPasteError: () => Unit = null,
    clipboardPasteParser: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]]) = null,
    clipboardPasted: () => Unit = null,
    groupHeaderClipboard: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null,
    groupHeaderHtmlOutput: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null
  ): OptionsClipboard = {
    val __obj = js.Dynamic.literal()
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (clipboardCopied != null) __obj.updateDynamic("clipboardCopied")(js.Any.fromFunction0(clipboardCopied))
    if (clipboardCopyConfig != null) __obj.updateDynamic("clipboardCopyConfig")(clipboardCopyConfig.asInstanceOf[js.Any])
    if (clipboardCopyFormatter != null) __obj.updateDynamic("clipboardCopyFormatter")(clipboardCopyFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyHeader)) __obj.updateDynamic("clipboardCopyHeader")(clipboardCopyHeader.get.asInstanceOf[js.Any])
    if (clipboardCopyRowRange != null) __obj.updateDynamic("clipboardCopyRowRange")(clipboardCopyRowRange.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyStyled)) __obj.updateDynamic("clipboardCopyStyled")(clipboardCopyStyled.get.asInstanceOf[js.Any])
    if (clipboardPasteAction != null) __obj.updateDynamic("clipboardPasteAction")(clipboardPasteAction.asInstanceOf[js.Any])
    if (clipboardPasteError != null) __obj.updateDynamic("clipboardPasteError")(js.Any.fromFunction0(clipboardPasteError))
    if (clipboardPasteParser != null) __obj.updateDynamic("clipboardPasteParser")(clipboardPasteParser.asInstanceOf[js.Any])
    if (clipboardPasted != null) __obj.updateDynamic("clipboardPasted")(js.Any.fromFunction0(clipboardPasted))
    if (groupHeaderClipboard != null) __obj.updateDynamic("groupHeaderClipboard")(groupHeaderClipboard.asInstanceOf[js.Any])
    if (groupHeaderHtmlOutput != null) __obj.updateDynamic("groupHeaderHtmlOutput")(groupHeaderHtmlOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsClipboard]
  }
}

