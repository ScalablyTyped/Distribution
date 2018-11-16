package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(systeminformationLib.systeminformationMod.SysteminformationNs.DockerContainerStatsData because Would inherit conflicting mutable fields List(id))*/

trait DockerContainerAllData extends DockerContainerData {
  var pids: scala.Double
  var processes: js.Array[DockerContainerStatsProcessesData]
}

