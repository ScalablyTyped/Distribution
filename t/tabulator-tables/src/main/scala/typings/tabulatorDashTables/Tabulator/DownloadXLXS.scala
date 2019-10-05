package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadXLXS extends js.Object {
  /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :,  */
  var sheetName: js.UndefOr[String] = js.undefined
}

object DownloadXLXS {
  @scala.inline
  def apply(sheetName: String = null): DownloadXLXS = {
    val __obj = js.Dynamic.literal()
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName)
    __obj.asInstanceOf[DownloadXLXS]
  }
}

