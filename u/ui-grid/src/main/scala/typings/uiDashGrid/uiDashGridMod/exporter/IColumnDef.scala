package typings.uiDashGrid.uiDashGridMod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * the alignment you'd like for this specific column when exported into a pdf.
    * Can be 'left', 'right', 'center' or any other valid pdfMake alignment option.
    */
  var exporterPdfAlign: js.UndefOr[String] = js.undefined
  /**
    * Suppresses export for this column. Used by selection and expandable.
    */
  var exporterSuppressExport: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(exporterPdfAlign: String = null, exporterSuppressExport: js.UndefOr[Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (exporterPdfAlign != null) __obj.updateDynamic("exporterPdfAlign")(exporterPdfAlign)
    if (!js.isUndefined(exporterSuppressExport)) __obj.updateDynamic("exporterSuppressExport")(exporterSuppressExport)
    __obj.asInstanceOf[IColumnDef]
  }
}

