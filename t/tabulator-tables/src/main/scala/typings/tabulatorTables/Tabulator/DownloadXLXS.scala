package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadXLXS extends js.Object {
  var documentProcessing: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.undefined
  /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :,  */
  var sheetName: js.UndefOr[String] = js.undefined
}

object DownloadXLXS {
  @scala.inline
  def apply(documentProcessing: /* input */ js.Any => _ = null, sheetName: String = null): DownloadXLXS = {
    val __obj = js.Dynamic.literal()
    if (documentProcessing != null) __obj.updateDynamic("documentProcessing")(js.Any.fromFunction1(documentProcessing))
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadXLXS]
  }
}

