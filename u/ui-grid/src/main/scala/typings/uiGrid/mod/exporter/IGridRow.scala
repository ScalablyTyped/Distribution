package typings.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridRow extends js.Object {
  /**
    * If set to false, then don't export this row, notwithstanding visible or other settings.
    * Defaults to true
    * @default true
    */
  var exporterEnableExporting: js.UndefOr[Boolean] = js.undefined
}

object IGridRow {
  @scala.inline
  def apply(exporterEnableExporting: js.UndefOr[Boolean] = js.undefined): IGridRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exporterEnableExporting)) __obj.updateDynamic("exporterEnableExporting")(exporterEnableExporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridRow]
  }
}

