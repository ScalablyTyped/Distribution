package typings.tabulatorDashTables.TabulatorNs

import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.cookie
import typings.tabulatorDashTables.tabulatorDashTablesStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPersistentConfiguration extends js.Object {
  /** ID tag used to identify persistent storage information	 */
  var persistenceID: js.UndefOr[String] = js.undefined
  /**  Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
    local - (string) Store the persistence information in the localStorage object
    cookie - (string) Store the persistence information in a cookie
    true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)	*/
  var persistenceMode: js.UndefOr[local | cookie | `true`] = js.undefined
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
    persistenceID: String = null,
    persistenceMode: local | cookie | `true` = null,
    persistentFilter: js.UndefOr[Boolean] = js.undefined,
    persistentLayout: js.UndefOr[Boolean] = js.undefined,
    persistentSort: js.UndefOr[Boolean] = js.undefined
  ): OptionsPersistentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (persistenceID != null) __obj.updateDynamic("persistenceID")(persistenceID)
    if (persistenceMode != null) __obj.updateDynamic("persistenceMode")(persistenceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentFilter)) __obj.updateDynamic("persistentFilter")(persistentFilter)
    if (!js.isUndefined(persistentLayout)) __obj.updateDynamic("persistentLayout")(persistentLayout)
    if (!js.isUndefined(persistentSort)) __obj.updateDynamic("persistentSort")(persistentSort)
    __obj.asInstanceOf[OptionsPersistentConfiguration]
  }
}

