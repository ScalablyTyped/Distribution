package typings.winrtUwp.Windows.Web.Http.Filters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
@js.native
trait HttpCacheControl extends js.Object {
  
  /** Get or set the read behavior to use for cache control on the HttpCacheControl object. */
  var readBehavior: HttpCacheReadBehavior = js.native
  
  /** Get or set the write behavior to use for cache control on the HttpCacheControl object. */
  var writeBehavior: HttpCacheWriteBehavior = js.native
}
object HttpCacheControl {
  
  @scala.inline
  def apply(readBehavior: HttpCacheReadBehavior, writeBehavior: HttpCacheWriteBehavior): HttpCacheControl = {
    val __obj = js.Dynamic.literal(readBehavior = readBehavior.asInstanceOf[js.Any], writeBehavior = writeBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCacheControl]
  }
  
  @scala.inline
  implicit class HttpCacheControlOps[Self <: HttpCacheControl] (val x: Self) extends AnyVal {
    
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
    def setReadBehavior(value: HttpCacheReadBehavior): Self = this.set("readBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteBehavior(value: HttpCacheWriteBehavior): Self = this.set("writeBehavior", value.asInstanceOf[js.Any])
  }
}
