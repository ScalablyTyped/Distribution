package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def minify(files: java.lang.String): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: java.lang.String, options: terserLib.terserMod.MinifyOptions): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String]): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String], options: terserLib.terserMod.MinifyOptions): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: org.scalablytyped.runtime.StringDictionary[java.lang.String]): terserLib.terserMod.MinifyOutput = js.native
  def minify(
    files: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    options: terserLib.terserMod.MinifyOptions
  ): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: terserLib.terserMod.AST_Node): terserLib.terserMod.MinifyOutput = js.native
  def minify(files: terserLib.terserMod.AST_Node, options: terserLib.terserMod.MinifyOptions): terserLib.terserMod.MinifyOutput = js.native
  def push_uniq[T](array: js.Array[T], el: T): scala.Unit = js.native
}

