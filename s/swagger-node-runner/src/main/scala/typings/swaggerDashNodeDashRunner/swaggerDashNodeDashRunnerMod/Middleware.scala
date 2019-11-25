package typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

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
    val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Middleware]
  }
}

