package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.landscape
import typings.tabulatorTables.tabulatorTablesStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tabulatorTables.Tabulator.DownloadPDF because var conflicts: documentProcessing. Inlined orientation, title, rowGroupStyles, rowCalcStyles, jsPDF, autoTable */ trait DownloadOptions
  extends DownloadCSV
     with DownloadXLXS
     with DownloadHTML {
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.undefined
  var jsPDF: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var rowCalcStyles: js.UndefOr[js.Any] = js.undefined
  var rowGroupStyles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    autoTable: js.Object | (js.Function1[/* doc */ js.Any, _]) = null,
    bom: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    documentProcessing: /* input */ js.Any => _ = null,
    jsPDF: js.Any = null,
    orientation: portrait | landscape = null,
    rowCalcStyles: js.Any = null,
    rowGroupStyles: js.Any = null,
    sheetName: String = null,
    style: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (autoTable != null) __obj.updateDynamic("autoTable")(autoTable.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (documentProcessing != null) __obj.updateDynamic("documentProcessing")(js.Any.fromFunction1(documentProcessing))
    if (jsPDF != null) __obj.updateDynamic("jsPDF")(jsPDF.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rowCalcStyles != null) __obj.updateDynamic("rowCalcStyles")(rowCalcStyles.asInstanceOf[js.Any])
    if (rowGroupStyles != null) __obj.updateDynamic("rowGroupStyles")(rowGroupStyles.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

