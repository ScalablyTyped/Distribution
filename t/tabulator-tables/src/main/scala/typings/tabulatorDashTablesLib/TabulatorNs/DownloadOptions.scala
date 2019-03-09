package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions
  extends DownloadCSV
     with DownloadXLXS
     with DownloadPDF {
  var downloadType: DownloadType
  var fileName: java.lang.String
}

object DownloadOptions {
  @scala.inline
  def apply(
    downloadType: DownloadType,
    fileName: java.lang.String,
    autoTable: js.Object | (js.Function1[/* doc */ js.Any, _]) = null,
    bom: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.string = null,
    jsPDF: js.Any = null,
    orientation: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.portrait | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.landscape = null,
    rowCalcStyles: js.Any = null,
    rowGroupStyles: js.Any = null,
    sheetName: java.lang.String = null,
    title: java.lang.String = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(downloadType = downloadType, fileName = fileName)
    if (autoTable != null) __obj.updateDynamic("autoTable")(autoTable.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (jsPDF != null) __obj.updateDynamic("jsPDF")(jsPDF)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rowCalcStyles != null) __obj.updateDynamic("rowCalcStyles")(rowCalcStyles)
    if (rowGroupStyles != null) __obj.updateDynamic("rowGroupStyles")(rowGroupStyles)
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DownloadOptions]
  }
}

