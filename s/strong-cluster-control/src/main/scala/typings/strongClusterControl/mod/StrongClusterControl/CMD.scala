package typings.strongClusterControl.mod.StrongClusterControl

import typings.strongClusterControl.strongClusterControlStrings.CLUSTER_CONTROL_shutdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMD extends js.Object {
  var SHUTDOWN: CLUSTER_CONTROL_shutdown
}

object CMD {
  @scala.inline
  def apply(SHUTDOWN: CLUSTER_CONTROL_shutdown): CMD = {
    val __obj = js.Dynamic.literal(SHUTDOWN = SHUTDOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CMD]
  }
}

