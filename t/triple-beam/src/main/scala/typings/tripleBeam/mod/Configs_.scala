package typings.tripleBeam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configs_ extends js.Object {
  val cli: Config
  val npm: Config
  val syslog: Config
}

object Configs_ {
  @scala.inline
  def apply(cli: Config, npm: Config, syslog: Config): Configs_ = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configs_]
  }
}

