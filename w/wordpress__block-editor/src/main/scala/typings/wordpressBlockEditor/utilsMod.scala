package typings.wordpressBlockEditor

import typings.wordpressBlockEditor.mod.EditorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = js.native
  def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = js.native
}

