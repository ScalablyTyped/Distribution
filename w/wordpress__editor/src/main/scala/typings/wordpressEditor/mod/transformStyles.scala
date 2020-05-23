package typings.wordpressEditor.mod

import typings.wordpressBlockEditor.mod.EditorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor", "transformStyles")
@js.native
object transformStyles extends js.Object {
  def apply(styles: js.Array[EditorStyle]): js.Array[String] = js.native
  def apply(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = js.native
}

