package typings.tslint.runnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/runner", "run")
@js.native
object run extends js.Object {
  def apply(options: Options, logger: Logger): js.Promise[Status] = js.native
}

