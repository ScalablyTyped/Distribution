package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], mounts = mounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerData]
  }
}

