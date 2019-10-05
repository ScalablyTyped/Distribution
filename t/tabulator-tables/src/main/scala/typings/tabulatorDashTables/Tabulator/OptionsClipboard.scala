package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.Anon_ColumnCalcs
import typings.tabulatorDashTables.tabulatorDashTablesStrings.active
import typings.tabulatorDashTables.tabulatorDashTablesStrings.copy
import typings.tabulatorDashTables.tabulatorDashTablesStrings.insert
import typings.tabulatorDashTables.tabulatorDashTablesStrings.paste
import typings.tabulatorDashTables.tabulatorDashTablesStrings.replace
import typings.tabulatorDashTables.tabulatorDashTablesStrings.selected
import typings.tabulatorDashTables.tabulatorDashTablesStrings.table
import typings.tabulatorDashTables.tabulatorDashTablesStrings.update
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
  var clipboardCopyConfig: js.UndefOr[Anon_ColumnCalcs | Boolean] = js.undefined
  /**  The copy formatter is used to take the row data provided by the selector and turn it into a text string for the clipboard.
    There is one built in copy formatter called table, if you have extended the clipboard module and want to change the default you can use the clipboardCopyFormatter property. you can also pass in a formatting function directly into this property.*/
  var clipboardCopyFormatter: js.UndefOr[table | (js.Function1[/* rowData */ js.Array[_], String])] = js.undefined
  /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
  var clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined
  /** * The copy selector is a function that is used to choose which data is copied into the clipboard. Tabulator comes with a few different selectors built in:
    active - Copy all table data currently displayed in the table to the clipboard (default)
    table - Copy all table data to the clipboard, including data that is currently filtered out
    selected - Copy the currently selected rows to the clipboard, including data that is currently filtered out
    Tabulator will try to use the best selector to match your table setup. If any text is selected on the table, then it will be that text which is copied. If the table has selectable rows enabled, the it will be the currently selected rows copied to the clipboard in the order in which they were selected. Otherwise the currently visible data in the table will be copied.
    These selectors can also be used when programatically triggering a copy event. in this case if the selector is not specified it will default to the value set in the clipboardCopySelector property (which is active by default).
    */
  var clipboardCopySelector: js.UndefOr[active | table | selected] = js.undefined
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
}

object OptionsClipboard {
  @scala.inline
  def apply(
    clipboard: Boolean | copy | paste = null,
    clipboardCopied: () => Unit = null,
    clipboardCopyConfig: Anon_ColumnCalcs | Boolean = null,
    clipboardCopyFormatter: table | (js.Function1[/* rowData */ js.Array[_], String]) = null,
    clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined,
    clipboardCopySelector: active | table | selected = null,
    clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined,
    clipboardPasteAction: insert | update | replace = null,
    clipboardPasteError: () => Unit = null,
    clipboardPasteParser: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]]) = null,
    clipboardPasted: () => Unit = null
  ): OptionsClipboard = {
    val __obj = js.Dynamic.literal()
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (clipboardCopied != null) __obj.updateDynamic("clipboardCopied")(js.Any.fromFunction0(clipboardCopied))
    if (clipboardCopyConfig != null) __obj.updateDynamic("clipboardCopyConfig")(clipboardCopyConfig.asInstanceOf[js.Any])
    if (clipboardCopyFormatter != null) __obj.updateDynamic("clipboardCopyFormatter")(clipboardCopyFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyHeader)) __obj.updateDynamic("clipboardCopyHeader")(clipboardCopyHeader)
    if (clipboardCopySelector != null) __obj.updateDynamic("clipboardCopySelector")(clipboardCopySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyStyled)) __obj.updateDynamic("clipboardCopyStyled")(clipboardCopyStyled)
    if (clipboardPasteAction != null) __obj.updateDynamic("clipboardPasteAction")(clipboardPasteAction.asInstanceOf[js.Any])
    if (clipboardPasteError != null) __obj.updateDynamic("clipboardPasteError")(js.Any.fromFunction0(clipboardPasteError))
    if (clipboardPasteParser != null) __obj.updateDynamic("clipboardPasteParser")(clipboardPasteParser.asInstanceOf[js.Any])
    if (clipboardPasted != null) __obj.updateDynamic("clipboardPasted")(js.Any.fromFunction0(clipboardPasted))
    __obj.asInstanceOf[OptionsClipboard]
  }
}

