package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerContainerData extends js.Object {
  var command: String
  var created: Double
  var createdAt: String
  var driver: String
  var finished: Double
  var finishedAt: String
  var id: String
  var image: String
  var imageID: String
  var mounts: js.Array[DockerContainerMountData]
  var name: String
  var platform: String
  var ports: js.Array[Double]
  var restartCount: Double
  var started: Double
  var startedAt: String
  var state: String
}

object DockerContainerData {
  @scala.inline
  def apply(
    command: String,
    created: Double,
    createdAt: String,
    driver: String,
    finished: Double,
    finishedAt: String,
    id: String,
    image: String,
    imageID: String,
    mounts: js.Array[DockerContainerMountData],
    name: String,
    platform: String,
    ports: js.Array[Double],
    restartCount: Double,
    started: Double,
    startedAt: String,
    state: String
  ): DockerContainerData = {
    val __obj = js.Dynamic.literal(command = command, created = created, createdAt = createdAt, driver = driver, finished = finished, finishedAt = finishedAt, id = id, image = image, imageID = imageID, mounts = mounts, name = name, platform = platform, ports = ports, restartCount = restartCount, started = started, startedAt = startedAt, state = state)
  
    __obj.asInstanceOf[DockerContainerData]
  }
}

