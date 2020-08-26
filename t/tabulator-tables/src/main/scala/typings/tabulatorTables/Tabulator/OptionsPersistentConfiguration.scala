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

@js.native
trait OptionsPersistentConfiguration extends js.Object {
  /**By setting the persistence property to true the table will persist the sort, filter, group (groupBy, groupStartOpen, groupHeader), pagination (paginationSize), and column (title, width, visibility, order) configuration of the table */
  var persistence: js.UndefOr[`true` | PersistenceOptions] = js.native
  /** ID tag used to identify persistent storage information     */
  var persistenceID: js.UndefOr[String] = js.native
  /**  Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
    local - (string) Store the persistence information in the localStorage object
    cookie - (string) Store the persistence information in a cookie
    true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)    */
  var persistenceMode: js.UndefOr[local | cookie | `true`] = js.native
  /**The persistenceReaderFunc function will receive two arguments, the persistance id of the table, and the type of data to be written. This function must synchronously return the data in the format in which it was passed to the persistenceWriterFunc function. It should return a value of false if no data was present */
  var persistenceReaderFunc: js.UndefOr[
    js.Function2[/* id */ String, /* type */ sort | filter | group | page | columns, _]
  ] = js.native
  /**The persistenceWriterFunc function will receive three arguments, the persistance id of the table, the type of data to be written and an object or array representing the data */
  var persistenceWriterFunc: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* type */ sort | filter | group | page | columns, 
      /* data */ js.Any, 
      _
    ]
  ] = js.native
  /**  You can ensure the data filtering is stored for the next page load by setting the persistentFilter option to true*/
  var persistentFilter: js.UndefOr[Boolean] = js.native
  /** Enable persistsnt storage of column layout information     */
  var persistentLayout: js.UndefOr[Boolean] = js.native
  /** You can ensure the data sorting is stored for the next page load by setting the persistentSort option to true */
  var persistentSort: js.UndefOr[Boolean] = js.native
}

object OptionsPersistentConfiguration {
  @scala.inline
  def apply(): OptionsPersistentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPersistentConfiguration]
  }
  @scala.inline
  implicit class OptionsPersistentConfigurationOps[Self <: OptionsPersistentConfiguration] (val x: Self) extends AnyVal {
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
    def setPersistence(value: `true` | PersistenceOptions): Self = this.set("persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    @scala.inline
    def setPersistenceID(value: String): Self = this.set("persistenceID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistenceID: Self = this.set("persistenceID", js.undefined)
    @scala.inline
    def setPersistenceMode(value: local | cookie | `true`): Self = this.set("persistenceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistenceMode: Self = this.set("persistenceMode", js.undefined)
    @scala.inline
    def setPersistenceReaderFunc(value: (/* id */ String, /* type */ sort | filter | group | page | columns) => _): Self = this.set("persistenceReaderFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deletePersistenceReaderFunc: Self = this.set("persistenceReaderFunc", js.undefined)
    @scala.inline
    def setPersistenceWriterFunc(
      value: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => _
    ): Self = this.set("persistenceWriterFunc", js.Any.fromFunction3(value))
    @scala.inline
    def deletePersistenceWriterFunc: Self = this.set("persistenceWriterFunc", js.undefined)
    @scala.inline
    def setPersistentFilter(value: Boolean): Self = this.set("persistentFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentFilter: Self = this.set("persistentFilter", js.undefined)
    @scala.inline
    def setPersistentLayout(value: Boolean): Self = this.set("persistentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentLayout: Self = this.set("persistentLayout", js.undefined)
    @scala.inline
    def setPersistentSort(value: Boolean): Self = this.set("persistentSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentSort: Self = this.set("persistentSort", js.undefined)
  }
  
}

