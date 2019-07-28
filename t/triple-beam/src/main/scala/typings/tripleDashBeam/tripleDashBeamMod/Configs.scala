package typings.tripleDashBeam.tripleDashBeamMod

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
    val __obj = js.Dynamic.literal(cli = cli, npm = npm, syslog = syslog)
  
    __obj.asInstanceOf[Configs]
  }
}

