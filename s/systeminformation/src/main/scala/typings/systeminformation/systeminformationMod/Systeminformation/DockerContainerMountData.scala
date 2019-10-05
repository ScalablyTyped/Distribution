package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerMountData extends js.Object {
  var Destination: String
  var Mode: String
  var Propagation: String
  var RW: Boolean
  var Source: String
  var Type: String
}

object DockerContainerMountData {
  @scala.inline
  def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String, Type: String): DockerContainerMountData = {
    val __obj = js.Dynamic.literal(Destination = Destination, Mode = Mode, Propagation = Propagation, RW = RW, Source = Source, Type = Type)
  
    __obj.asInstanceOf[DockerContainerMountData]
  }
}

