package typings.tripleBeam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configs_ extends js.Object {
  val cli: Config = js.native
  val npm: Config = js.native
  val syslog: Config = js.native
}

object Configs_ {
  @scala.inline
  def apply(cli: Config, npm: Config, syslog: Config): Configs_ = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configs_]
  }
  @scala.inline
  implicit class Configs_Ops[Self <: Configs_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCli(value: Config): Self = this.set("cli", value.asInstanceOf[js.Any])
    @scala.inline
    def setNpm(value: Config): Self = this.set("npm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyslog(value: Config): Self = this.set("syslog", value.asInstanceOf[js.Any])
  }
  
}

