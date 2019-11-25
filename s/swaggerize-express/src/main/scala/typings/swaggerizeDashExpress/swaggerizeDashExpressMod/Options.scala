package typings.swaggerizeDashExpress.swaggerizeDashExpressMod

import typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger.ApiDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var api: ApiDefinition
  var docspath: String
  var handlers: String | RouteSegment
}

object Options {
  @scala.inline
  def apply(api: ApiDefinition, docspath: String, handlers: String | RouteSegment): Options = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], docspath = docspath.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

