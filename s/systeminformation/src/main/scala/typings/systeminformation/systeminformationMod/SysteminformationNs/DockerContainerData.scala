package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerData extends js.Object {
  var command: String
  var created: Double
  var id: String
  var image: String
  var imageID: String
  var mounts: js.Array[DockerContainerMountData]
  var name: String
  var ports: js.Array[Double]
  var state: String
}

object DockerContainerData {
  @scala.inline
  def apply(
    command: String,
    created: Double,
    id: String,
    image: String,
    imageID: String,
    mounts: js.Array[DockerContainerMountData],
    name: String,
    ports: js.Array[Double],
    state: String
  ): DockerContainerData = {
    val __obj = js.Dynamic.literal(command = command, created = created, id = id, image = image, imageID = imageID, mounts = mounts, name = name, ports = ports, state = state)
  
    __obj.asInstanceOf[DockerContainerData]
  }
}

