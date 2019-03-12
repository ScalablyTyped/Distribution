package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def minify(files: java.lang.String): MinifyOutput = js.native
  def minify(files: java.lang.String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String]): MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: org.scalablytyped.runtime.StringDictionary[java.lang.String]): MinifyOutput = js.native
  def minify(files: org.scalablytyped.runtime.StringDictionary[java.lang.String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: AST_Node): MinifyOutput = js.native
  def minify(files: AST_Node, options: MinifyOptions): MinifyOutput = js.native
  def push_uniq[T](array: js.Array[T], el: T): scala.Unit = js.native
}

