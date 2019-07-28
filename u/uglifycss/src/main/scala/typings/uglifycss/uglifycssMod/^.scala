package typings.uglifycss.uglifycssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglifycss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Uglify one or more files
    */
  def processFiles(filenames: js.Array[String]): String = js.native
  def processFiles(filenames: js.Array[String], options: UglifyCSSOptions): String = js.native
  /**
    * Uglify a string
    */
  def processString(content: String): String = js.native
  def processString(content: String, options: UglifyCSSOptions): String = js.native
}

