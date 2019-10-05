package typings.swaggerizeDashExpress.swaggerizeDashExpressMod

import typings.express.expressMod.IRoute
import typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger.ApiDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var api: ApiDefinition
  var routes: js.Array[IRoute]
}

object IConfig {
  @scala.inline
  def apply(api: ApiDefinition, routes: js.Array[IRoute]): IConfig = {
    val __obj = js.Dynamic.literal(api = api, routes = routes)
  
    __obj.asInstanceOf[IConfig]
  }
}

