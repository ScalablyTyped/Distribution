package typings.vuex.mod

import typings.vuex.loggerMod.LoggerOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply[S](): Plugin[S] = js.native
  def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
}

