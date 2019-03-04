package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerData extends js.Object {
  var command: java.lang.String
  var created: scala.Double
  var id: java.lang.String
  var image: java.lang.String
  var imageID: java.lang.String
  var mounts: js.Array[DockerContainerMountData]
  var name: java.lang.String
  var ports: js.Array[scala.Double]
  var state: java.lang.String
}

object DockerContainerData {
  @scala.inline
  def apply(
    command: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    image: java.lang.String,
    imageID: java.lang.String,
    mounts: js.Array[DockerContainerMountData],
    name: java.lang.String,
    ports: js.Array[scala.Double],
    state: java.lang.String
  ): DockerContainerData = {
    val __obj = js.Dynamic.literal(command = command, created = created, id = id, image = image, imageID = imageID, mounts = mounts, name = name, ports = ports, state = state)
  
    __obj.asInstanceOf[DockerContainerData]
  }
}

