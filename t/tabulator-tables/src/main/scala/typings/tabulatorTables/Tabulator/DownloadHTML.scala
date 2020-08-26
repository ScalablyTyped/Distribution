package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadHTML extends js.Object {
  /** By default the HTML output is a simple unstyled table. if you would like to match the current table styling you can set the style property to true  */
  var style: js.UndefOr[Boolean] = js.native
}

object DownloadHTML {
  @scala.inline
  def apply(): DownloadHTML = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadHTML]
  }
  @scala.inline
  implicit class DownloadHTMLOps[Self <: DownloadHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

