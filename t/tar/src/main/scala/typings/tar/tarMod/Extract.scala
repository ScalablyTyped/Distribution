package typings.tar.tarMod

import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "Extract")
@js.native
object Extract extends js.Object {
  def apply(opts: String): ParseStream = js.native
  def apply(opts: ExtractOptions): ParseStream = js.native
}

@JSImport("tar", "extract")
@js.native
object extract extends js.Object {
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(options: ExtractOptions): Writable = js.native
  def apply(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
  def apply(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
}

