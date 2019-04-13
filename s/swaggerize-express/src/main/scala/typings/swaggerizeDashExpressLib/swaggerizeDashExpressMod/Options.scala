package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs.ApiDefinition
  var docspath: java.lang.String
  var handlers: java.lang.String | RouteSegment
}

object Options {
  @scala.inline
  def apply(
    api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs.ApiDefinition,
    docspath: java.lang.String,
    handlers: java.lang.String | RouteSegment
  ): Options = {
    val __obj = js.Dynamic.literal(api = api, docspath = docspath, handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

