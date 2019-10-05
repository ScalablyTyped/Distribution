package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "users")
@js.native
object users extends js.Object {
  def apply(): js.Promise[js.Array[UserData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[UserData], _]): js.Promise[js.Array[UserData]] = js.native
}

