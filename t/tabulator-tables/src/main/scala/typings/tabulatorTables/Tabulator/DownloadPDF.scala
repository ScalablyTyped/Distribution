package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.landscape
import typings.tabulatorTables.tabulatorTablesStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPDF extends js.Object {
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.undefined
  /**An optional callback documentProcessing can be set on the download config object, that is passed the jsPDF document object after the auto-table creation to allow full customisation of the PDF */
  var documentProcessing: js.UndefOr[js.Function1[/* doc */ js.Any, _]] = js.undefined
  var jsPDF: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var rowCalcStyles: js.UndefOr[js.Any] = js.undefined
  var rowGroupStyles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DownloadPDF {
  @scala.inline
  def apply(
    autoTable: js.Object | (js.Function1[/* doc */ js.Any, _]) = null,
    documentProcessing: /* doc */ js.Any => _ = null,
    jsPDF: js.Any = null,
    orientation: portrait | landscape = null,
    rowCalcStyles: js.Any = null,
    rowGroupStyles: js.Any = null,
    title: String = null
  ): DownloadPDF = {
    val __obj = js.Dynamic.literal()
    if (autoTable != null) __obj.updateDynamic("autoTable")(autoTable.asInstanceOf[js.Any])
    if (documentProcessing != null) __obj.updateDynamic("documentProcessing")(js.Any.fromFunction1(documentProcessing))
    if (jsPDF != null) __obj.updateDynamic("jsPDF")(jsPDF.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rowCalcStyles != null) __obj.updateDynamic("rowCalcStyles")(rowCalcStyles.asInstanceOf[js.Any])
    if (rowGroupStyles != null) __obj.updateDynamic("rowGroupStyles")(rowGroupStyles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPDF]
  }
}

