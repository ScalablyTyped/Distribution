package typings.uglifycss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglifycss", "processString")
@js.native
object processString extends js.Object {
  /**
    * Uglify a string
    */
  def apply(content: String): String = js.native
  def apply(content: String, options: UglifyCSSOptions): String = js.native
}

