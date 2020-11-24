package typings.tsLoader.servicesHostMod

import typings.typescript.mod.LanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceHostWhichMayBeCacheable extends js.Object {
  
  var clearCache: Action | Null = js.native
  
  var servicesHost: LanguageServiceHost = js.native
}
object ServiceHostWhichMayBeCacheable {
  
  @scala.inline
  def apply(servicesHost: LanguageServiceHost): ServiceHostWhichMayBeCacheable = {
    val __obj = js.Dynamic.literal(servicesHost = servicesHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHostWhichMayBeCacheable]
  }
  
  @scala.inline
  implicit class ServiceHostWhichMayBeCacheableOps[Self <: ServiceHostWhichMayBeCacheable] (val x: Self) extends AnyVal {
    
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
    def setServicesHost(value: LanguageServiceHost): Self = this.set("servicesHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearCache(value: () => Unit): Self = this.set("clearCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearCacheNull: Self = this.set("clearCache", null)
  }
}
