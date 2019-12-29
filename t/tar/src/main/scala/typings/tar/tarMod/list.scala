package typings.tar.tarMod

import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "list")
@js.native
object list extends js.Object {
  def apply(): Writable = js.native
  def apply(options: ListOptions): Writable = js.native
  def apply(options: ListOptions, fileList: js.Array[String]): Writable = js.native
  def apply(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
}

