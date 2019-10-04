package typings.varuintDashBitcoin.varuintDashBitcoinMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encode extends js.Object {
  var bytes: Double = js.native
  def apply(num: Double): Buffer = js.native
  def apply(num: Double, buffer: Buffer): Buffer = js.native
  def apply(num: Double, buffer: Buffer, offset: Double): Buffer = js.native
}

