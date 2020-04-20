package typings.swaggerizeExpress.mod

import typings.express.mod.IRoute
import typings.swaggerizeExpress.mod.Swagger.ApiDefinition
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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

