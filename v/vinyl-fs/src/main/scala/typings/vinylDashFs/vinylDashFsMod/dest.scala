package typings.vinylDashFs.vinylDashFsMod

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", "dest")
@js.native
object dest extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
}

