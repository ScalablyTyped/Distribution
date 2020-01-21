package typings.write

import typings.node.AnonAutoCloseEmitClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: String): WriteStream = js.native
  def apply(path: PathLike, options: AnonAutoCloseEmitClose): WriteStream = js.native
}

