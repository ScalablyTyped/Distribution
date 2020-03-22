package typings.strtok3.fsPromiseMod

import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/FsPromise", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: PathLike, data: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, data: Buffer): js.Promise[Unit] = js.native
}

