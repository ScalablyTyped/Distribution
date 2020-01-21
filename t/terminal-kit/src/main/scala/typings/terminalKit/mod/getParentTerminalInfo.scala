package typings.terminalKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "getParentTerminalInfo")
@js.native
object getParentTerminalInfo extends js.Object {
  def apply(
    callback: js.Function4[
      /* error */ js.Any, 
      /* codename */ js.UndefOr[String], 
      /* name */ js.UndefOr[String], 
      /* pid */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
}

