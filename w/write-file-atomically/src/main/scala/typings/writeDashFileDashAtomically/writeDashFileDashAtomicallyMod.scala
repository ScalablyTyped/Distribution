package typings.writeDashFileDashAtomically

import typings.node.Buffer
import typings.std.Uint8Array
import typings.writeDashFileDashAtomic.writeDashFileDashAtomicMod.Options
import typings.writeDashFileDashAtomically.writeDashFileDashAtomicallyMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-file-atomically", JSImport.Namespace)
@js.native
object writeDashFileDashAtomicallyMod extends js.Object {
  def apply(path: String, data: Data): js.Promise[Unit] = js.native
  def apply(path: String, data: Data, options: Options): js.Promise[Unit] = js.native
  type Data = String | Buffer | Uint8Array
}

