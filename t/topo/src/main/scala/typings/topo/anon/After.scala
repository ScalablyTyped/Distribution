package typings.topo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After[TGroup] extends js.Object {
  
  var after: js.UndefOr[TGroup | js.Array[TGroup]] = js.native
  
  var before: js.UndefOr[TGroup | js.Array[TGroup]] = js.native
  
  var group: js.UndefOr[TGroup] = js.native
  
  var sort: js.UndefOr[Double] = js.native
}
object After {
  
  @scala.inline
  def apply[TGroup](): After[TGroup] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After[TGroup]]
  }
  
  @scala.inline
  implicit class AfterOps[Self <: After[_], TGroup] (val x: Self with After[TGroup]) extends AnyVal {
    
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
    def setAfterVarargs(value: TGroup*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: TGroup | js.Array[TGroup]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: TGroup*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: TGroup | js.Array[TGroup]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setGroup(value: TGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setSort(value: Double): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
