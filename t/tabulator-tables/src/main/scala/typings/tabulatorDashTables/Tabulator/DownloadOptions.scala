package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.tabulatorDashTablesStrings.landscape
import typings.tabulatorDashTables.tabulatorDashTablesStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions
  extends DownloadCSV
     with DownloadXLXS
     with DownloadPDF

object DownloadOptions {
  @scala.inline
  def apply(
    autoTable: js.Object | (js.Function1[/* doc */ js.Any, _]) = null,
    bom: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    documentProcessing: /* doc */ js.Any => _ = null,
    jsPDF: js.Any = null,
    orientation: portrait | landscape = null,
    rowCalcStyles: js.Any = null,
    rowGroupStyles: js.Any = null,
    sheetName: String = null,
    title: String = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (autoTable != null) __obj.updateDynamic("autoTable")(autoTable.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (documentProcessing != null) __obj.updateDynamic("documentProcessing")(js.Any.fromFunction1(documentProcessing))
    if (jsPDF != null) __obj.updateDynamic("jsPDF")(jsPDF)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rowCalcStyles != null) __obj.updateDynamic("rowCalcStyles")(rowCalcStyles)
    if (rowGroupStyles != null) __obj.updateDynamic("rowGroupStyles")(rowGroupStyles)
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DownloadOptions]
  }
}

