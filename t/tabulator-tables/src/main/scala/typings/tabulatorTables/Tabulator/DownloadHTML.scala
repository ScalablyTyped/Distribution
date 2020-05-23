package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadHTML extends js.Object {
  /** By default the HTML output is a simple unstyled table. if you would like to match the current table styling you can set the style property to true  */
  var style: js.UndefOr[Boolean] = js.undefined
}

object DownloadHTML {
  @scala.inline
  def apply(style: js.UndefOr[Boolean] = js.undefined): DownloadHTML = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadHTML]
  }
}

