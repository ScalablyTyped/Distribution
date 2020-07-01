package typings.vuex.loggerMod

import typings.vuex.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types/logger", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S](): Plugin[S] = js.native
  def apply[S](option: LoggerOption[S]): Plugin[S] = js.native
}

