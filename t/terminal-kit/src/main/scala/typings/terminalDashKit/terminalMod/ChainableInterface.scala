package typings.terminalDashKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableInterface[T] extends js.Object {
  def apply(args: js.Any*): T = js.native
  def apply(str: String, args: js.Any*): T = js.native
}

