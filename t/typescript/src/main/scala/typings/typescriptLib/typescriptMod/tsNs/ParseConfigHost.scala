package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfigHost extends js.Object {
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.native
  var useCaseSensitiveFileNames: scala.Boolean = js.native
  /**
    * Gets a value indicating whether the specified path exists and is a file.
    * @param path The path to test.
    */
  def fileExists(path: java.lang.String): scala.Boolean = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.Array[java.lang.String],
    includes: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.Array[java.lang.String],
    includes: js.Array[java.lang.String],
    depth: scala.Double
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.UndefOr[scala.Nothing],
    includes: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.UndefOr[scala.Nothing],
    includes: js.Array[java.lang.String],
    depth: scala.Double
  ): js.Array[java.lang.String] = js.native
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

