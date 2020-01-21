package typings.terser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "minify")
@js.native
object minify extends js.Object {
  def apply(files: String): MinifyOutput = js.native
  def apply(files: String, options: MinifyOptions): MinifyOutput = js.native
  def apply(files: js.Array[String]): MinifyOutput = js.native
  def apply(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def apply(files: StringDictionary[String]): MinifyOutput = js.native
  def apply(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  def apply(files: ASTNode): MinifyOutput = js.native
  def apply(files: ASTNode, options: MinifyOptions): MinifyOutput = js.native
}

