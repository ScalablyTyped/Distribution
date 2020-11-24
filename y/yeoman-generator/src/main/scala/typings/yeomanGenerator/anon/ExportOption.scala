package typings.yeomanGenerator.anon

import typings.yeomanGenerator.storageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportOption extends js.Object {
  
  /**
    * A value indicating whether an option should be exported for this question.
    */
  var exportOption: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * The storage to store the answers.
    */
  var storage: js.UndefOr[^] = js.native
}
object ExportOption {
  
  @scala.inline
  def apply(): ExportOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOption]
  }
  
  @scala.inline
  implicit class ExportOptionOps[Self <: ExportOption] (val x: Self) extends AnyVal {
    
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
    def setExportOption(value: Boolean | js.Object): Self = this.set("exportOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportOption: Self = this.set("exportOption", js.undefined)
    
    @scala.inline
    def setStorage(value: ^): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
