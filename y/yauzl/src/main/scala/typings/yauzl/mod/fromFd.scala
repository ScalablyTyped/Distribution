package typings.yauzl.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "fromFd")
@js.native
object fromFd extends js.Object {
  def apply(fd: Double): Unit = js.native
  def apply(
    fd: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def apply(fd: Double, options: Options): Unit = js.native
  def apply(
    fd: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
}

