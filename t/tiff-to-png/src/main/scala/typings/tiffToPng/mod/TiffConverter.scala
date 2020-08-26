package typings.tiffToPng.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiffConverter extends js.Object {
  @JSName("complete")
  var complete_Original: CompleteCallback = js.native
  /** @default '' */
  var location: String = js.native
  /** @default {} */
  var options: Options = js.native
  @JSName("progress")
  var progress_Original: ProgressCallback = js.native
  def complete(errors: js.Array[String]): Unit = js.native
  def complete(errors: js.Array[String], total: Double): Unit = js.native
  def convert(tiff: String, isArray: Boolean, location: String): js.Promise[SingleConvertResult] = js.native
  def convertArray(tiffs: js.Array[String], location: String): js.Promise[ConvertResult] = js.native
  def convertOne(tiff: String, location: String): js.Promise[ConvertResult] = js.native
  def onComplete(error: js.Array[Error], converted: js.Array[Converted], total: Double): js.Promise[Unit] = js.native
  def onComplete(error: js.Array[Error], converted: Converted, total: Double): js.Promise[Unit] = js.native
  def progress(converted: js.Array[Converted], total: Double): Unit = js.native
  def removePaths(): js.Promise[Unit] = js.native
  def unlink(file: String): js.Promise[Unit] = js.native
}

