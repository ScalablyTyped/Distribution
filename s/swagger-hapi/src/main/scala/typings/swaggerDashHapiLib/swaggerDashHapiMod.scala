package typings
package swaggerDashHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-hapi", JSImport.Namespace)
@js.native
object swaggerDashHapiMod extends js.Object {
  def create(
    config: swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.Config,
    cb: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* middleware */ swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.HapiMiddleware, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

