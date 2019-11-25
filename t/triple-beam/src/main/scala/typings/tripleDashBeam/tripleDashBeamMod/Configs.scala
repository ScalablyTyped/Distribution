package typings.tripleDashBeam.tripleDashBeamMod

import org.scalablytyped.runtime.TopLevel
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
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configs]
  }
}

@JSImport("triple-beam", "configs")
@js.native
object configs extends TopLevel[Configs]

