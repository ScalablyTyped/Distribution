package typings.yauzl.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "fromRandomAccessReader")
@js.native
object fromRandomAccessReader extends js.Object {
  def apply(
    reader: RandomAccessReader,
    totalSize: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def apply(
    reader: RandomAccessReader,
    totalSize: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
}

