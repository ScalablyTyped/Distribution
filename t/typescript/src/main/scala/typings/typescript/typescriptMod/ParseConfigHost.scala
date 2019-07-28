package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfigHost extends js.Object {
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  var useCaseSensitiveFileNames: Boolean = js.native
  /**
    * Gets a value indicating whether the specified path exists and is a file.
    * @param path The path to test.
    */
  def fileExists(path: String): Boolean = js.native
  def readDirectory(
    rootDir: String,
    extensions: js.Array[String],
    excludes: js.UndefOr[scala.Nothing],
    includes: js.Array[String]
  ): js.Array[String] = js.native
  def readDirectory(
    rootDir: String,
    extensions: js.Array[String],
    excludes: js.UndefOr[scala.Nothing],
    includes: js.Array[String],
    depth: Double
  ): js.Array[String] = js.native
  def readDirectory(
    rootDir: String,
    extensions: js.Array[String],
    excludes: js.Array[String],
    includes: js.Array[String]
  ): js.Array[String] = js.native
  def readDirectory(
    rootDir: String,
    extensions: js.Array[String],
    excludes: js.Array[String],
    includes: js.Array[String],
    depth: Double
  ): js.Array[String] = js.native
  def readFile(path: String): js.UndefOr[String] = js.native
}

