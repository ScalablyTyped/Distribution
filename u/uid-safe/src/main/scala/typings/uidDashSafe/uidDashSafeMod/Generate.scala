package typings.uidDashSafe.uidDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generate extends js.Object {
  def apply(byteLength: Double): js.Promise[String] = js.native
  def apply(byteLength: Double, callback: js.Function2[/* err */ js.Any, /* str */ String, _]): Unit = js.native
  def sync(byteLength: Double): String = js.native
}

