package typings.vinylDashFs.vinylDashFsMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", "src")
@js.native
object src extends js.Object {
  def apply(globs: String): ReadWriteStream = js.native
  def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def apply(globs: js.Array[String]): ReadWriteStream = js.native
  def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
}

