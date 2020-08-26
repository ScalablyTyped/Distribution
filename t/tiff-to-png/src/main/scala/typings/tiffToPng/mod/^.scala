package typings.tiffToPng.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tiffToPng.tiffToPngBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tiff-to-png", JSImport.Namespace)
@js.native
class ^ () extends TiffConverter {
  def this(options: Options) = this()
}

@JSImport("tiff-to-png", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def call(command: String): js.Promise[`true`] = js.native
  def count(converted: js.Array[StringDictionary[_]], key: String, value: js.Any): Double = js.native
  def count(converted: StringDictionary[js.Any], key: String, value: js.Any): Double = js.native
  def createDir(target: String, filename: String): js.Promise[Unit] = js.native
}

