package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod.swaggerizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.swaggerizeNs.SwaggerNs.ApiDefinition
  var routes: js.Array[expressLib.expressMod.eNs.IRoute]
}

object IConfig {
  @scala.inline
  def apply(
    api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.swaggerizeNs.SwaggerNs.ApiDefinition,
    routes: js.Array[expressLib.expressMod.eNs.IRoute]
  ): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api")(api)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[IConfig]
  }
}

