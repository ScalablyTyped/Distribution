package typings.writeDashFileDashAtomic.writeDashFileDashAtomicMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-file-atomic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    filename: String,
    data: String | Buffer,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    data: String | Buffer,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def sync(filename: String, data: String): Unit = js.native
  def sync(filename: String, data: String, options: Options): Unit = js.native
  def sync(filename: String, data: Buffer): Unit = js.native
  def sync(filename: String, data: Buffer, options: Options): Unit = js.native
}

