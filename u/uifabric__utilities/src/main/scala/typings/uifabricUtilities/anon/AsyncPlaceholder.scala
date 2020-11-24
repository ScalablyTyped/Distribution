package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncPlaceholder extends js.Object {
  
  var asyncPlaceholder: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
}
object AsyncPlaceholder {
  
  @scala.inline
  def apply(): AsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncPlaceholder]
  }
  
  @scala.inline
  implicit class AsyncPlaceholderOps[Self <: AsyncPlaceholder] (val x: Self) extends AnyVal {
    
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
    def setAsyncPlaceholder(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = this.set("asyncPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncPlaceholder: Self = this.set("asyncPlaceholder", js.undefined)
  }
}
