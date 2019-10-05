package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerStatsProcessesData extends js.Object {
  var command: String
  var elapsed: String
  var group: String
  var nice: String
  var pgid: String
  var pid_host: String
  var ppid: String
  var rgroup: String
  var rss: String
  var ruser: String
  var stat: String
  var time: String
  var user: String
  var vsz: String
}

object DockerContainerStatsProcessesData {
  @scala.inline
  def apply(
    command: String,
    elapsed: String,
    group: String,
    nice: String,
    pgid: String,
    pid_host: String,
    ppid: String,
    rgroup: String,
    rss: String,
    ruser: String,
    stat: String,
    time: String,
    user: String,
    vsz: String
  ): DockerContainerStatsProcessesData = {
    val __obj = js.Dynamic.literal(command = command, elapsed = elapsed, group = group, nice = nice, pgid = pgid, pid_host = pid_host, ppid = ppid, rgroup = rgroup, rss = rss, ruser = ruser, stat = stat, time = time, user = user, vsz = vsz)
  
    __obj.asInstanceOf[DockerContainerStatsProcessesData]
  }
}

