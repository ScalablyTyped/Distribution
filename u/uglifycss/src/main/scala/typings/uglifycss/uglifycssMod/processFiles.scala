package typings.uglifycss.uglifycssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglifycss", "processFiles")
@js.native
object processFiles extends js.Object {
  /**
    * Uglify one or more files
    */
  def apply(filenames: js.Array[String]): String = js.native
  def apply(filenames: js.Array[String], options: UglifyCSSOptions): String = js.native
}

