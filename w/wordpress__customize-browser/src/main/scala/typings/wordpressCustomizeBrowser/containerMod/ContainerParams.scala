package typings.wordpressCustomizeBrowser.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerParams extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String | Null] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var instanceNumber: js.UndefOr[Double | Null] = js.native
  
  var params: js.UndefOr[ContainerParams] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ContainerParams {
  
  @scala.inline
  def apply(title: String): ContainerParams = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerParams]
  }
  
  @scala.inline
  implicit class ContainerParamsOps[Self <: ContainerParams] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInstanceNumber(value: Double): Self = this.set("instanceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceNumber: Self = this.set("instanceNumber", js.undefined)
    
    @scala.inline
    def setInstanceNumberNull: Self = this.set("instanceNumber", null)
    
    @scala.inline
    def setParams(value: ContainerParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
