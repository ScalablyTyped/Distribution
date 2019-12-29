package typings.tar.tarMod

import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "create")
@js.native
object create extends js.Object {
  def apply(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
  def apply(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Readable = js.native
}

