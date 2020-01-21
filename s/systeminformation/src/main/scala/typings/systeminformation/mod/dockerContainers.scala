package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.DockerContainerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "dockerContainers")
@js.native
object dockerContainers extends js.Object {
  def apply(): js.Promise[js.Array[DockerContainerData]] = js.native
  def apply(all: Boolean): js.Promise[js.Array[DockerContainerData]] = js.native
  def apply(all: Boolean, cb: js.Function1[/* data */ js.Array[DockerContainerData], _]): js.Promise[js.Array[DockerContainerData]] = js.native
}

