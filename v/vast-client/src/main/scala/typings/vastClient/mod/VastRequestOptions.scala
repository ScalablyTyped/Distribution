package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastRequestOptions extends js.Object {
  
  /**
    * Allows you to parse all the ads contained in the VAST or to parse them ad by ad or adPod by adPod (default true)
    */
  var resolveAll: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom timeout for the requests (default 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Custom urlhandler to be used instead of the default ones urlhandlers
    */
  var urlHandler: js.UndefOr[VASTClientUrlHandler] = js.native
  
  /**
    * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers (default false)
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  /**
    * A number of Wrapper responses that can be received with no InLine response (default 0)
    */
  var wrapperLimit: js.UndefOr[Double] = js.native
}
object VastRequestOptions {
  
  @scala.inline
  def apply(): VastRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VastRequestOptions]
  }
  
  @scala.inline
  implicit class VastRequestOptionsOps[Self <: VastRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setResolveAll(value: Boolean): Self = this.set("resolveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveAll: Self = this.set("resolveAll", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrlHandler(value: VASTClientUrlHandler): Self = this.set("urlHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlHandler: Self = this.set("urlHandler", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setWrapperLimit(value: Double): Self = this.set("wrapperLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperLimit: Self = this.set("wrapperLimit", js.undefined)
  }
}
