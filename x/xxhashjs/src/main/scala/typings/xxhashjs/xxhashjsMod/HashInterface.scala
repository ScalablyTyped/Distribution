package typings.xxhashjs.xxhashjsMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashInterface extends js.Object {
  def apply(): HashObject = js.native
  def apply(data: String, seed: Double): UINT = js.native
  def apply(data: Buffer, seed: Double): UINT = js.native
  def apply(data: ArrayBuffer, seed: Double): UINT = js.native
  def apply(seed: Double): HashObject = js.native
}

