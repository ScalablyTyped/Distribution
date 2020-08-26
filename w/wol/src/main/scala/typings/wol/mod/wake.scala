package typings.wol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wol", "wake")
@js.native
object wake extends js.Object {
  def apply(mac: String): js.Promise[Boolean] = js.native
  def apply(mac: String, callback: WakeCallback): js.Promise[Boolean] = js.native
  def apply(mac: String, options: js.UndefOr[scala.Nothing], callback: WakeCallback): js.Promise[Boolean] = js.native
  def apply(mac: String, options: WakeOptions): js.Promise[Boolean] = js.native
  def apply(mac: String, options: WakeOptions, callback: WakeCallback): js.Promise[Boolean] = js.native
}

