package typings.terser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("terser", "minify")
@js.native
object minify extends js.Object {
  
  def apply(files: String): js.Promise[MinifyOutput] = js.native
  def apply(files: String, options: MinifyOptions): js.Promise[MinifyOutput] = js.native
  def apply(files: js.Array[String]): js.Promise[MinifyOutput] = js.native
  def apply(files: js.Array[String], options: MinifyOptions): js.Promise[MinifyOutput] = js.native
  def apply(files: StringDictionary[String]): js.Promise[MinifyOutput] = js.native
  def apply(files: StringDictionary[String], options: MinifyOptions): js.Promise[MinifyOutput] = js.native
}
