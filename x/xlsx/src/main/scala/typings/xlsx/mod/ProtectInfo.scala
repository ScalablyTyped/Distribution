package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectInfo extends _WSKeys {
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[Boolean] = js.undefined
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[Boolean] = js.undefined
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[Boolean] = js.undefined
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[Boolean] = js.undefined
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[Boolean] = js.undefined
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[Boolean] = js.undefined
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[Boolean] = js.undefined
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[Boolean] = js.undefined
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[Boolean] = js.undefined
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[Boolean] = js.undefined
}

object ProtectInfo {
  @scala.inline
  def apply(
    autoFilter: js.UndefOr[Boolean] = js.undefined,
    deleteColumns: js.UndefOr[Boolean] = js.undefined,
    deleteRows: js.UndefOr[Boolean] = js.undefined,
    formatCells: js.UndefOr[Boolean] = js.undefined,
    formatColumns: js.UndefOr[Boolean] = js.undefined,
    formatRows: js.UndefOr[Boolean] = js.undefined,
    insertColumns: js.UndefOr[Boolean] = js.undefined,
    insertHyperlinks: js.UndefOr[Boolean] = js.undefined,
    insertRows: js.UndefOr[Boolean] = js.undefined,
    objects: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pivotTables: js.UndefOr[Boolean] = js.undefined,
    scenarios: js.UndefOr[Boolean] = js.undefined,
    selectLockedCells: js.UndefOr[Boolean] = js.undefined,
    selectUnlockedCells: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFilter)) __obj.updateDynamic("autoFilter")(autoFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteColumns)) __obj.updateDynamic("deleteColumns")(deleteColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRows)) __obj.updateDynamic("deleteRows")(deleteRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatCells)) __obj.updateDynamic("formatCells")(formatCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatColumns)) __obj.updateDynamic("formatColumns")(formatColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatRows)) __obj.updateDynamic("formatRows")(formatRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertColumns)) __obj.updateDynamic("insertColumns")(insertColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertHyperlinks)) __obj.updateDynamic("insertHyperlinks")(insertHyperlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRows)) __obj.updateDynamic("insertRows")(insertRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotTables)) __obj.updateDynamic("pivotTables")(pivotTables.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scenarios)) __obj.updateDynamic("scenarios")(scenarios.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectLockedCells)) __obj.updateDynamic("selectLockedCells")(selectLockedCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectUnlockedCells)) __obj.updateDynamic("selectUnlockedCells")(selectUnlockedCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectInfo]
  }
}

