package typings.workboxPrecaching.cleanupResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanupResult extends js.Object {
  
  var deletedCacheRequests: js.Array[String] = js.native
}
object CleanupResult {
  
  @scala.inline
  def apply(deletedCacheRequests: js.Array[String]): CleanupResult = {
    val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupResult]
  }
  
  @scala.inline
  implicit class CleanupResultOps[Self <: CleanupResult] (val x: Self) extends AnyVal {
    
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
    def setDeletedCacheRequestsVarargs(value: String*): Self = this.set("deletedCacheRequests", js.Array(value :_*))
    
    @scala.inline
    def setDeletedCacheRequests(value: js.Array[String]): Self = this.set("deletedCacheRequests", value.asInstanceOf[js.Any])
  }
}
