package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerMountData extends js.Object {
  var Destination: java.lang.String
  var Mode: java.lang.String
  var Propagation: java.lang.String
  var RW: scala.Boolean
  var Source: java.lang.String
  var Type: java.lang.String
}

object DockerContainerMountData {
  @scala.inline
  def apply(
    Destination: java.lang.String,
    Mode: java.lang.String,
    Propagation: java.lang.String,
    RW: scala.Boolean,
    Source: java.lang.String,
    Type: java.lang.String
  ): DockerContainerMountData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Destination")(Destination)
    __obj.updateDynamic("Mode")(Mode)
    __obj.updateDynamic("Propagation")(Propagation)
    __obj.updateDynamic("RW")(RW)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[DockerContainerMountData]
  }
}

