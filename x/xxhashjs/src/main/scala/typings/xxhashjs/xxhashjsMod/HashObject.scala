package typings.xxhashjs.xxhashjsMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashObject extends js.Object {
  def digest(): UINT = js.native
  def init(seed: Double): this.type = js.native
  def update(data: String): this.type = js.native
  def update(data: Buffer): this.type = js.native
  def update(data: ArrayBuffer): this.type = js.native
}

