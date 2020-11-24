package typings.workboxBuild.typesMod

import typings.std.RegExp
import typings.std.Response
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeCachingEntry extends js.Object {
  
  /**
    * * Either the name of one of the [built-in strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies)
    * or custom handler callback to use when the generated route matches.
    */
  var handler: String | RouteHandlerCallback = js.native
  
  /**
    * The [HTTP method](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) that
    * will match the generated route.
    *
    * @default 'GET'
    */
  var method: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[RuntimeCachingEntryOptions] = js.native
  
  /**
    * The value that will be passed to [`registerRoute()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-routing#.registerRoute),
    * used to determine whether the generated route will match a given request.
    */
  var urlPattern: String | RegExp | RouteMatchCallback[_] = js.native
}
object RuntimeCachingEntry {
  
  @scala.inline
  def apply(handler: String | RouteHandlerCallback, urlPattern: String | RegExp | RouteMatchCallback[_]): RuntimeCachingEntry = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCachingEntry]
  }
  
  @scala.inline
  implicit class RuntimeCachingEntryOps[Self <: RuntimeCachingEntry] (val x: Self) extends AnyVal {
    
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
    def setHandlerFunction1(value: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandler(value: String | RouteHandlerCallback): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternFunction1(value: /* options */ RouteMatchCallbackOptions => _): Self = this.set("urlPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrlPattern(value: String | RegExp | RouteMatchCallback[_]): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOptions(value: RuntimeCachingEntryOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
