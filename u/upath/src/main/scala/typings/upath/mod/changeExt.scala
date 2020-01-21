package typings.upath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upath", "changeExt")
@js.native
object changeExt extends js.Object {
  def apply(filename: String, ext: String): String = js.native
  def apply(filename: String, ext: String, ignoreExts: js.Array[String]): String = js.native
  def apply(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
}

