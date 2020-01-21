package typings.tar.mod

import typings.std.Error
import typings.tar.AnonSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "extract")
@js.native
object extract extends js.Object {
  def apply(options: ExtractOptions with FileOptions with AnonSync): Unit = js.native
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(options: ExtractOptions with FileOptions with AnonSync, fileList: js.Array[String]): Unit = js.native
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}

