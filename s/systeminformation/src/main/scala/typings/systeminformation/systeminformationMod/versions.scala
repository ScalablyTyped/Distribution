package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.VersionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "versions")
@js.native
object versions extends js.Object {
  def apply(): js.Promise[VersionData] = js.native
  def apply(cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
}

