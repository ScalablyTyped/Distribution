package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnDef extends js.Object {
  /**
               * the alignment you'd like for this specific column when exported into a pdf.
               * Can be 'left', 'right', 'center' or any other valid pdfMake alignment option.
               */
  var exporterPdfAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Suppresses export for this column. Used by selection and expandable.
               */
  var exporterSuppressExport: js.UndefOr[scala.Boolean] = js.undefined
}

