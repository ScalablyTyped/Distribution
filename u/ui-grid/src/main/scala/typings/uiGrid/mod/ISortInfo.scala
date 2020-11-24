package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISortInfo extends js.Object {
  
  var direction: js.UndefOr[String] = js.native
  
  var ignoreSort: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
}
object ISortInfo {
  
  @scala.inline
  def apply(): ISortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortInfo]
  }
  
  @scala.inline
  implicit class ISortInfoOps[Self <: ISortInfo] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setIgnoreSort(value: Boolean): Self = this.set("ignoreSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSort: Self = this.set("ignoreSort", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
