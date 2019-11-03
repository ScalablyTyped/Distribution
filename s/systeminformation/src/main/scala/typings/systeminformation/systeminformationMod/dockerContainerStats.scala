package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.DockerContainerStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "dockerContainerStats")
@js.native
object dockerContainerStats extends js.Object {
  def apply(): js.Promise[js.Array[DockerContainerStatsData]] = js.native
  def apply(id: String): js.Promise[js.Array[DockerContainerStatsData]] = js.native
  def apply(id: String, cb: js.Function1[/* data */ js.Array[DockerContainerStatsData], _]): js.Promise[js.Array[DockerContainerStatsData]] = js.native
}

