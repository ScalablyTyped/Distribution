package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookProperties extends js.Object {
  
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.native
  
  /** Worksheet Epoch (1904 if true, 1900 if false) */
  var date1904: js.UndefOr[Boolean] = js.native
  
  /** Warn or strip personally identifying info on save */
  var filterPrivacy: js.UndefOr[Boolean] = js.native
}
object WorkbookProperties {
  
  @scala.inline
  def apply(): WorkbookProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProperties]
  }
  
  @scala.inline
  implicit class WorkbookPropertiesOps[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    
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
    def setCodeName(value: String): Self = this.set("CodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeName: Self = this.set("CodeName", js.undefined)
    
    @scala.inline
    def setDate1904(value: Boolean): Self = this.set("date1904", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate1904: Self = this.set("date1904", js.undefined)
    
    @scala.inline
    def setFilterPrivacy(value: Boolean): Self = this.set("filterPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPrivacy: Self = this.set("filterPrivacy", js.undefined)
  }
}
