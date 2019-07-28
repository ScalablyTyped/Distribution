package typings.terser.terserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: AST_Node): MinifyOutput = js.native
  def minify(files: AST_Node, options: MinifyOptions): MinifyOutput = js.native
  def push_uniq[T](array: js.Array[T], el: T): Unit = js.native
}

