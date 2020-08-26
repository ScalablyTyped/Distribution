package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerContainerMountData extends js.Object {
  var Destination: String = js.native
  var Mode: String = js.native
  var Propagation: String = js.native
  var RW: Boolean = js.native
  var Source: String = js.native
  var Type: String = js.native
}

object DockerContainerMountData {
  @scala.inline
  def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String, Type: String): DockerContainerMountData = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerMountData]
  }
  @scala.inline
  implicit class DockerContainerMountDataOps[Self <: DockerContainerMountData] (val x: Self) extends AnyVal {
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
    def setDestination(value: String): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagation(value: String): Self = this.set("Propagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRW(value: Boolean): Self = this.set("RW", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

