package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectInfo extends js.Object {
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

