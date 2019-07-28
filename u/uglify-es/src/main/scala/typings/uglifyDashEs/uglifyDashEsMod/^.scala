package typings.uglifyDashEs.uglifyDashEsMod

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyDashJs.uglifyDashJsMod.MinifyOptions
import typings.uglifyDashJs.uglifyDashJsMod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglify-es", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
}

