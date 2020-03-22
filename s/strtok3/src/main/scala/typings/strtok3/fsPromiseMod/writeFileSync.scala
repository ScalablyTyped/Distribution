package typings.strtok3.fsPromiseMod

import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/FsPromise", "writeFileSync")
@js.native
object writeFileSync extends js.Object {
  def apply(path: PathLike, data: String): Unit = js.native
  def apply(path: PathLike, data: Buffer): Unit = js.native
}

