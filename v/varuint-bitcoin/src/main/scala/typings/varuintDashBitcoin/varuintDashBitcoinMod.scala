package typings.varuintDashBitcoin

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("varuint-bitcoin", JSImport.Namespace)
@js.native
object varuintDashBitcoinMod extends js.Object {
  @js.native
  trait Decode extends js.Object {
    var bytes: Double = js.native
    def apply(buffer: Buffer): Double = js.native
    def apply(buffer: Buffer, offset: Double): Double = js.native
  }
  
  @js.native
  trait Encode extends js.Object {
    var bytes: Double = js.native
    def apply(num: Double): Buffer = js.native
    def apply(num: Double, buffer: Buffer): Buffer = js.native
    def apply(num: Double, buffer: Buffer, offset: Double): Buffer = js.native
  }
  
  val decode: Decode = js.native
  val encode: Encode = js.native
  def encodingLength(num: Double): Double = js.native
}

