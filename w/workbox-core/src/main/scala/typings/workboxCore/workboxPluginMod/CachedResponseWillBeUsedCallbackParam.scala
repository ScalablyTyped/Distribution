package typings.workboxCore.workboxPluginMod

import typings.std.CacheQueryOptions
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedResponseWillBeUsedCallbackParam extends js.Object {
  
  var cacheName: String = js.native
  
  var cachedResponse: js.UndefOr[Response] = js.native
  
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.native
  
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
  
  var request: Request = js.native
}
object CachedResponseWillBeUsedCallbackParam {
  
  @scala.inline
  def apply(cacheName: String, request: Request): CachedResponseWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
  }
  
  @scala.inline
  implicit class CachedResponseWillBeUsedCallbackParamOps[Self <: CachedResponseWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
    
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
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedResponse(value: Response): Self = this.set("cachedResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedResponse: Self = this.set("cachedResponse", js.undefined)
    
    @scala.inline
    def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: CacheQueryOptions): Self = this.set("matchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOptions: Self = this.set("matchOptions", js.undefined)
  }
}
