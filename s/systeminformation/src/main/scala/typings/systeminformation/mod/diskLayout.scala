package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.DiskLayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "diskLayout")
@js.native
object diskLayout extends js.Object {
  def apply(): js.Promise[js.Array[DiskLayoutData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[DiskLayoutData], _]): js.Promise[js.Array[DiskLayoutData]] = js.native
}

