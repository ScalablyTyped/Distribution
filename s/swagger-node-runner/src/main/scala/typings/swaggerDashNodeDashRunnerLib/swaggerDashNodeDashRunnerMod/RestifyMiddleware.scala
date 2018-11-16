package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RestifyMiddleware extends Middleware {
  /** Register this Middleware with `app`  */
  def register(app: restifyLib.restifyMod.Server): scala.Unit
}

