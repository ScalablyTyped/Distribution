package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.columns
import typings.tabulatorTables.tabulatorTablesStrings.cookie
import typings.tabulatorTables.tabulatorTablesStrings.filter
import typings.tabulatorTables.tabulatorTablesStrings.group
import typings.tabulatorTables.tabulatorTablesStrings.local
import typings.tabulatorTables.tabulatorTablesStrings.page
import typings.tabulatorTables.tabulatorTablesStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPersistentConfiguration extends js.Object {
  /**By setting the persistence property to true the table will persist the sort, filter, group (groupBy, groupStartOpen, groupHeader), pagination (paginationSize), and column (title, width, visibility, order) configuration of the table */
  var persistence: js.UndefOr[`true` | PersistenceOptions] = js.undefined
  /** ID tag used to identify persistent storage information	 */
  var persistenceID: js.UndefOr[String] = js.undefined
  /**  Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
    local - (string) Store the persistence information in the localStorage object
    cookie - (string) Store the persistence information in a cookie
    true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)	*/
  var persistenceMode: js.UndefOr[local | cookie | `true`] = js.undefined
  /**The persistenceReaderFunc function will receive two arguments, the persistance id of the table, and the type of data to be written. This function must synchronously return the data in the format in which it was passed to the persistenceWriterFunc function. It should return a value of false if no data was present */
  var persistenceReaderFunc: js.UndefOr[
    js.Function2[/* id */ String, /* type */ sort | filter | group | page | columns, _]
  ] = js.undefined
  /**The persistenceWriterFunc function will receive three arguments, the persistance id of the table, the type of data to be written and an object or array representing the data */
  var persistenceWriterFunc: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* type */ sort | filter | group | page | columns, 
      /* data */ js.Any, 
      _
    ]
  ] = js.undefined
  /**  You can ensure the data filtering is stored for the next page load by setting the persistentFilter option to true*/
  var persistentFilter: js.UndefOr[Boolean] = js.undefined
  /** Enable persistsnt storage of column layout information	 */
  var persistentLayout: js.UndefOr[Boolean] = js.undefined
  /** You can ensure the data sorting is stored for the next page load by setting the persistentSort option to true */
  var persistentSort: js.UndefOr[Boolean] = js.undefined
}

object OptionsPersistentConfiguration {
  @scala.inline
  def apply(
    persistence: `true` | PersistenceOptions = null,
    persistenceID: String = null,
    persistenceMode: local | cookie | `true` = null,
    persistenceReaderFunc: (/* id */ String, /* type */ sort | filter | group | page | columns) => _ = null,
    persistenceWriterFunc: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => _ = null,
    persistentFilter: js.UndefOr[Boolean] = js.undefined,
    persistentLayout: js.UndefOr[Boolean] = js.undefined,
    persistentSort: js.UndefOr[Boolean] = js.undefined
  ): OptionsPersistentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistenceID != null) __obj.updateDynamic("persistenceID")(persistenceID.asInstanceOf[js.Any])
    if (persistenceMode != null) __obj.updateDynamic("persistenceMode")(persistenceMode.asInstanceOf[js.Any])
    if (persistenceReaderFunc != null) __obj.updateDynamic("persistenceReaderFunc")(js.Any.fromFunction2(persistenceReaderFunc))
    if (persistenceWriterFunc != null) __obj.updateDynamic("persistenceWriterFunc")(js.Any.fromFunction3(persistenceWriterFunc))
    if (!js.isUndefined(persistentFilter)) __obj.updateDynamic("persistentFilter")(persistentFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentLayout)) __obj.updateDynamic("persistentLayout")(persistentLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentSort)) __obj.updateDynamic("persistentSort")(persistentSort.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPersistentConfiguration]
  }
}

