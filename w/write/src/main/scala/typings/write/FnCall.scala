package typings.write

import typings.node.AnonEmitClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: String): WriteStream = js.native
  def apply(path: PathLike, options: AnonEmitClose): WriteStream = js.native
}

