package typings.upath.upathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upath", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VERSION: String = js.native
  var delimiter: String = js.native
  var sep: String = js.native
  def addExt(file: String, ext: String): String = js.native
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  def changeExt(filename: String, ext: String): String = js.native
  def changeExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = js.native
  def changeExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
  def defaultExt(filename: String, ext: String): String = js.native
  def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = js.native
  def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
  def dirname(p: String): String = js.native
  def extname(p: String): String = js.native
  def format(pathObject: ParsedPath): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def join(paths: (js.Any | String)*): String = js.native
  def joinSafe(p: js.Any*): String = js.native
  def normalize(p: String): String = js.native
  def normalizeSafe(p: String): String = js.native
  def normalizeTrim(p: String): String = js.native
  def parse(pathString: String): ParsedPath = js.native
  def relative(from: String, to: String): String = js.native
  def removeExt(filename: String, ext: String): String = js.native
  def resolve(pathSegments: js.Any*): String = js.native
  def toUnix(p: String): String = js.native
  def trimExt(filename: String): String = js.native
  def trimExt(filename: String, ignoreExts: js.Array[String]): String = js.native
  def trimExt(filename: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
}

