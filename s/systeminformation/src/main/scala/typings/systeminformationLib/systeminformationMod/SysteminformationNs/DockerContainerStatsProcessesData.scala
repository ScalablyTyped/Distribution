package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerStatsProcessesData extends js.Object {
  var command: java.lang.String
  var elapsed: java.lang.String
  var group: java.lang.String
  var nice: java.lang.String
  var pgid: java.lang.String
  var pid_host: java.lang.String
  var ppid: java.lang.String
  var rgroup: java.lang.String
  var rss: java.lang.String
  var ruser: java.lang.String
  var stat: java.lang.String
  var time: java.lang.String
  var user: java.lang.String
  var vsz: java.lang.String
}

object DockerContainerStatsProcessesData {
  @scala.inline
  def apply(
    command: java.lang.String,
    elapsed: java.lang.String,
    group: java.lang.String,
    nice: java.lang.String,
    pgid: java.lang.String,
    pid_host: java.lang.String,
    ppid: java.lang.String,
    rgroup: java.lang.String,
    rss: java.lang.String,
    ruser: java.lang.String,
    stat: java.lang.String,
    time: java.lang.String,
    user: java.lang.String,
    vsz: java.lang.String
  ): DockerContainerStatsProcessesData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("elapsed")(elapsed)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("nice")(nice)
    __obj.updateDynamic("pgid")(pgid)
    __obj.updateDynamic("pid_host")(pid_host)
    __obj.updateDynamic("ppid")(ppid)
    __obj.updateDynamic("rgroup")(rgroup)
    __obj.updateDynamic("rss")(rss)
    __obj.updateDynamic("ruser")(ruser)
    __obj.updateDynamic("stat")(stat)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("user")(user)
    __obj.updateDynamic("vsz")(vsz)
    __obj.asInstanceOf[DockerContainerStatsProcessesData]
  }
}

