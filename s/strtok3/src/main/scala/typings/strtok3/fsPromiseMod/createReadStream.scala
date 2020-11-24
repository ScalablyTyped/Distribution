package typings.strtok3.fsPromiseMod

import typings.node.anon.AutoClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strtok3/lib/FsPromise", "createReadStream")
@js.native
object createReadStream extends js.Object {
  
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): ReadStream = js.native
}
