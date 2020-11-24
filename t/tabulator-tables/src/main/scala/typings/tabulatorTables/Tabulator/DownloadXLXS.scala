package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadXLXS extends js.Object {
  
  var documentProcessing: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  
  /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :,  */
  var sheetName: js.UndefOr[String] = js.native
}
object DownloadXLXS {
  
  @scala.inline
  def apply(): DownloadXLXS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadXLXS]
  }
  
  @scala.inline
  implicit class DownloadXLXSOps[Self <: DownloadXLXS] (val x: Self) extends AnyVal {
    
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
    def setDocumentProcessing(value: /* input */ js.Any => _): Self = this.set("documentProcessing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDocumentProcessing: Self = this.set("documentProcessing", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
  }
}
