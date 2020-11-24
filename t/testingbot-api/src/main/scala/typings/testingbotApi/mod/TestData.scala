package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestData extends js.Object {
  
  var build: js.UndefOr[String] = js.native
  
  var groups: js.UndefOr[String] = js.native
  
  var `test[extra]`: js.UndefOr[String] = js.native
  
  var `test[name]`: js.UndefOr[String] = js.native
  
  var `test[status_message]`: js.UndefOr[String] = js.native
  
  var `test[success]`: js.UndefOr[TestSuccess] = js.native
}
object TestData {
  
  @scala.inline
  def apply(): TestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestData]
  }
  
  @scala.inline
  implicit class TestDataOps[Self <: TestData] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setGroups(value: String): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def `setTest[extra]`(value: String): Self = this.set("test[extra]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTest[extra]`: Self = this.set("test[extra]", js.undefined)
    
    @scala.inline
    def `setTest[name]`(value: String): Self = this.set("test[name]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTest[name]`: Self = this.set("test[name]", js.undefined)
    
    @scala.inline
    def `setTest[status_message]`(value: String): Self = this.set("test[status_message]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTest[status_message]`: Self = this.set("test[status_message]", js.undefined)
    
    @scala.inline
    def `setTest[success]`(value: TestSuccess): Self = this.set("test[success]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTest[success]`: Self = this.set("test[success]", js.undefined)
  }
}
