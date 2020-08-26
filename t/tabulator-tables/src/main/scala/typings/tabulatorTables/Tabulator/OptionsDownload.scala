package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsDownload extends js.Object {
  /** The downloadComplete callback is triggered when the user has been prompted to download the file. */
  var downloadComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /** By default Tabulator includes column headers, row groups and column calculations in the download output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition: */
  var downloadConfig: js.UndefOr[AddditionalExportOptions] = js.native
  /** The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
    In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
    If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file. */
  var downloadReady: js.UndefOr[js.Function2[/* fileContents */ js.Any, /* blob */ js.Any, _]] = js.native
  /**By deafault, only the active rows (rows that have passed filtering) will be included in the download the downloadRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the download output */
  var downloadRowRange: js.UndefOr[RowRangeLookup] = js.native
}

object OptionsDownload {
  @scala.inline
  def apply(): OptionsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDownload]
  }
  @scala.inline
  implicit class OptionsDownloadOps[Self <: OptionsDownload] (val x: Self) extends AnyVal {
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
    def setDownloadComplete(value: () => Unit): Self = this.set("downloadComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDownloadComplete: Self = this.set("downloadComplete", js.undefined)
    @scala.inline
    def setDownloadConfig(value: AddditionalExportOptions): Self = this.set("downloadConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadConfig: Self = this.set("downloadConfig", js.undefined)
    @scala.inline
    def setDownloadReady(value: (/* fileContents */ js.Any, /* blob */ js.Any) => _): Self = this.set("downloadReady", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDownloadReady: Self = this.set("downloadReady", js.undefined)
    @scala.inline
    def setDownloadRowRange(value: RowRangeLookup): Self = this.set("downloadRowRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadRowRange: Self = this.set("downloadRowRange", js.undefined)
  }
  
}

