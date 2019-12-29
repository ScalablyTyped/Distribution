package typings.xxhashjs

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xxhashjs", JSImport.Namespace)
@js.native
object xxhashjsMod extends js.Object {
  @js.native
  trait HashInterface extends js.Object {
    def apply(): HashObject = js.native
    def apply(data: String, seed: Double): UINT = js.native
    def apply(data: Buffer, seed: Double): UINT = js.native
    def apply(data: ArrayBuffer, seed: Double): UINT = js.native
    def apply(seed: Double): HashObject = js.native
  }
  
  @js.native
  trait HashObject extends js.Object {
    def digest(): UINT = js.native
    def init(seed: Double): this.type = js.native
    def update(data: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: ArrayBuffer): this.type = js.native
  }
  
  @js.native
  trait UINT extends js.Object {
    def toNumber(): Double = js.native
    def toString(radix: Double): String = js.native
  }
  
  val h32: HashInterface = js.native
  val h64: HashInterface = js.native
}

