package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.DockerInfoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "dockerInfo")
@js.native
object dockerInfo extends js.Object {
  def apply(): js.Promise[DockerInfoData] = js.native
  def apply(cb: js.Function1[/* data */ DockerInfoData, _]): js.Promise[DockerInfoData] = js.native
}

