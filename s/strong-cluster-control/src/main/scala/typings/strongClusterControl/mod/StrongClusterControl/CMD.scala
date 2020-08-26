package typings.strongClusterControl.mod.StrongClusterControl

import typings.strongClusterControl.strongClusterControlStrings.CLUSTER_CONTROL_shutdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMD extends js.Object {
  var SHUTDOWN: CLUSTER_CONTROL_shutdown = js.native
}

object CMD {
  @scala.inline
  def apply(SHUTDOWN: CLUSTER_CONTROL_shutdown): CMD = {
    val __obj = js.Dynamic.literal(SHUTDOWN = SHUTDOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMD]
  }
  @scala.inline
  implicit class CMDOps[Self <: CMD] (val x: Self) extends AnyVal {
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
    def setSHUTDOWN(value: CLUSTER_CONTROL_shutdown): Self = this.set("SHUTDOWN", value.asInstanceOf[js.Any])
  }
  
}

