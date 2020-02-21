package typings.workboxBuild.typesMod

import typings.std.RegExp
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCachingEntry extends js.Object {
  /**
    * * Either the name of one of the [built-in strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies)
    * or custom handler callback to use when the generated route matches.
    */
  var handler: String | RouteHandlerCallback
  /**
    * The [HTTP method](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) that
    * will match the generated route.
    *
    * @default 'GET'
    */
  var method: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[RuntimeCachingEntryOptions] = js.undefined
  /**
    * The value that will be passed to [`registerRoute()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-routing#.registerRoute),
    * used to determine whether the generated route will match a given request.
    */
  var urlPattern: String | RegExp | RouteMatchCallback[_]
}

object RuntimeCachingEntry {
  @scala.inline
  def apply(
    handler: String | RouteHandlerCallback,
    urlPattern: String | RegExp | RouteMatchCallback[_],
    method: String = null,
    options: RuntimeCachingEntryOptions = null
  ): RuntimeCachingEntry = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCachingEntry]
  }
}

