package typings.workboxWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeCacheRule extends js.Object {
  
  /**
    * The `handler` values are strings, corresponding to names of the strategies supported by
    * [`workbox.strategies`](https://developers.google.com/web/tools/workbox/reference-docs/latest/workbox.strategies#methods).
    */
  var handler: CacheStrategy = js.native
  
  /**
    * The `options` properties can be used to configure instances of the cache expiration, cacheable response, and broadcast cache update plugins to apply to a given route.
    */
  var options: js.UndefOr[RuntimeCacheOptions] = js.native
  
  /**
    * Cache any same-origin request that matches the pattern.
    */
  var urlPattern: String | RegExp = js.native
}
object RuntimeCacheRule {
  
  @scala.inline
  def apply(handler: CacheStrategy, urlPattern: String | RegExp): RuntimeCacheRule = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCacheRule]
  }
  
  @scala.inline
  implicit class RuntimeCacheRuleOps[Self <: RuntimeCacheRule] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: CacheStrategy): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPattern(value: String | RegExp): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RuntimeCacheOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
