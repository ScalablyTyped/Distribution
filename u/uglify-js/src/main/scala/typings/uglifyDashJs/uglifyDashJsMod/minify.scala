package typings.uglifyDashJs.uglifyDashJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglify-js", "minify")
@js.native
object minify extends js.Object {
  def apply(files: String): MinifyOutput = js.native
  def apply(files: String, options: MinifyOptions): MinifyOutput = js.native
  def apply(files: js.Array[String]): MinifyOutput = js.native
  def apply(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def apply(files: StringDictionary[String]): MinifyOutput = js.native
  def apply(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
}

