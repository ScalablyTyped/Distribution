package typings
package tripleDashBeamLib.tripleDashBeamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configs extends js.Object {
  val cli: Config
  val npm: Config
  val syslog: Config
}

object Configs {
  @scala.inline
  def apply(cli: Config, npm: Config, syslog: Config): Configs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cli")(cli)
    __obj.updateDynamic("npm")(npm)
    __obj.updateDynamic("syslog")(syslog)
    __obj.asInstanceOf[Configs]
  }
}

