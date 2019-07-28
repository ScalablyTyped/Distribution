package typings.strongDashClusterDashControl.strongDashClusterDashControlMod.StrongClusterControlNs

import typings.strongDashClusterDashControl.strongDashClusterDashControlStrings.CLUSTER_CONTROL_shutdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMD extends js.Object {
  var SHUTDOWN: CLUSTER_CONTROL_shutdown
}

object CMD {
  @scala.inline
  def apply(SHUTDOWN: CLUSTER_CONTROL_shutdown): CMD = {
    val __obj = js.Dynamic.literal(SHUTDOWN = SHUTDOWN)
  
    __obj.asInstanceOf[CMD]
  }
}

