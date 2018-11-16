package typings
package upathLib.upathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upath", JSImport.Namespace)
@js.native
object upathModMembers extends js.Object {
  var VERSION: java.lang.String = js.native
  var delimiter: java.lang.String = js.native
  var sep: java.lang.String = js.native
  def addExt(file: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def basename(p: java.lang.String): java.lang.String = js.native
  def basename(p: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def changeExt(filename: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def changeExt(filename: java.lang.String, ext: java.lang.String, ignoreExts: js.Array[java.lang.String]): java.lang.String = js.native
  def changeExt(
    filename: java.lang.String,
    ext: java.lang.String,
    ignoreExts: js.Array[java.lang.String],
    maxSize: scala.Double
  ): java.lang.String = js.native
  def defaultExt(filename: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def defaultExt(filename: java.lang.String, ext: java.lang.String, ignoreExts: js.Array[java.lang.String]): java.lang.String = js.native
  def defaultExt(
    filename: java.lang.String,
    ext: java.lang.String,
    ignoreExts: js.Array[java.lang.String],
    maxSize: scala.Double
  ): java.lang.String = js.native
  def dirname(p: java.lang.String): java.lang.String = js.native
  def extname(p: java.lang.String): java.lang.String = js.native
  def format(pathObject: ParsedPath): java.lang.String = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def join(paths: (java.lang.String | js.Any)*): java.lang.String = js.native
  def joinSafe(p: js.Any*): java.lang.String = js.native
  def normalize(p: java.lang.String): java.lang.String = js.native
  def normalizeSafe(p: java.lang.String): java.lang.String = js.native
  def normalizeTrim(p: java.lang.String): java.lang.String = js.native
  def parse(pathString: java.lang.String): ParsedPath = js.native
  def relative(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def removeExt(filename: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def resolve(pathSegments: js.Any*): java.lang.String = js.native
  def toUnix(p: java.lang.String): java.lang.String = js.native
  def trimExt(filename: java.lang.String): java.lang.String = js.native
  def trimExt(filename: java.lang.String, ignoreExts: js.Array[java.lang.String]): java.lang.String = js.native
  def trimExt(filename: java.lang.String, ignoreExts: js.Array[java.lang.String], maxSize: scala.Double): java.lang.String = js.native
}

