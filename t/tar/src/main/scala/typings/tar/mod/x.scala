package typings.tar.mod

import typings.node.streamMod.Writable
import typings.std.Error
import typings.tar.anon.ExtractOptionsFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "x")
@js.native
object x extends js.Object {
  def apply(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
  def apply(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[js.Array[String]],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def apply(options: ExtractOptionsFileOptions): Unit = js.native
  def apply(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
  def apply(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
}

