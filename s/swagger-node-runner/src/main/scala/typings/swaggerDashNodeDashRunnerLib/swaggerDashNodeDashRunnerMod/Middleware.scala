package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /** Back-reference to `swagger-node-runner`s `Runner` that has created this middleware */
  var runner: Runner
}

object Middleware {
  @scala.inline
  def apply(runner: Runner): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runner")(runner)
    __obj.asInstanceOf[Middleware]
  }
}

