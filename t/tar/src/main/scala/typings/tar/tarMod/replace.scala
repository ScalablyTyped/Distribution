package typings.tar.tarMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "replace")
@js.native
object replace extends js.Object {
  def apply(options: ReplaceOptions): js.Promise[Unit] = js.native
  def apply(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
  def apply(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def apply(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): js.Promise[Unit] = js.native
}

