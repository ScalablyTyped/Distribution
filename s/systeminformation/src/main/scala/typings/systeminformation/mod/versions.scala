package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.VersionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "versions")
@js.native
object versions extends js.Object {
  def apply(): js.Promise[VersionData] = js.native
  def apply(apps: js.UndefOr[scala.Nothing], cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
  def apply(apps: String): js.Promise[VersionData] = js.native
  def apply(apps: String, cb: js.Function1[/* data */ VersionData, _]): js.Promise[VersionData] = js.native
}

