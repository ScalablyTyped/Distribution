package typings.writeFileAtomic.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-file-atomic", "sync")
@js.native
object sync extends js.Object {
  def apply(filename: String, data: String): Unit = js.native
  def apply(filename: String, data: String, options: BufferEncoding): Unit = js.native
  def apply(filename: String, data: String, options: Options): Unit = js.native
  def apply(filename: String, data: Buffer): Unit = js.native
  def apply(filename: String, data: Buffer, options: BufferEncoding): Unit = js.native
  def apply(filename: String, data: Buffer, options: Options): Unit = js.native
}

