package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.MemLayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "memLayout")
@js.native
object memLayout extends js.Object {
  def apply(): js.Promise[js.Array[MemLayoutData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[MemLayoutData], _]): js.Promise[js.Array[MemLayoutData]] = js.native
}

