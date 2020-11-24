package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfigure extends js.Object {
  
   // please note, filter could be also a function. This case is not represented here
  var container: js.UndefOr[js.Any] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  
  var showButton: js.UndefOr[Boolean] = js.native
}
object NetworkConfigure {
  
  @scala.inline
  def apply(): NetworkConfigure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigure]
  }
  
  @scala.inline
  implicit class NetworkConfigureOps[Self <: NetworkConfigure] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String | js.Array[String] | Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setShowButton(value: Boolean): Self = this.set("showButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButton: Self = this.set("showButton", js.undefined)
  }
}
