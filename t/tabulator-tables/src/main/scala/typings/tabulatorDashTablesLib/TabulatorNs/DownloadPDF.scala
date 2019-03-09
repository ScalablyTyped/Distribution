package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPDF extends js.Object {
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.undefined
  var jsPDF: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.portrait | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.landscape
  ] = js.undefined
  var rowCalcStyles: js.UndefOr[js.Any] = js.undefined
  var rowGroupStyles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadPDF {
  @scala.inline
  def apply(
    autoTable: js.Object | (js.Function1[/* doc */ js.Any, _]) = null,
    jsPDF: js.Any = null,
    orientation: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.portrait | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.landscape = null,
    rowCalcStyles: js.Any = null,
    rowGroupStyles: js.Any = null,
    title: java.lang.String = null
  ): DownloadPDF = {
    val __obj = js.Dynamic.literal()
    if (autoTable != null) __obj.updateDynamic("autoTable")(autoTable.asInstanceOf[js.Any])
    if (jsPDF != null) __obj.updateDynamic("jsPDF")(jsPDF)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rowCalcStyles != null) __obj.updateDynamic("rowCalcStyles")(rowCalcStyles)
    if (rowGroupStyles != null) __obj.updateDynamic("rowGroupStyles")(rowGroupStyles)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DownloadPDF]
  }
}

