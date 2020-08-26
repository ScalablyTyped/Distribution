package typings.wordpressBlockEditor.mod

import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor", "getColorObjectByAttributeValues")
@js.native
object getColorObjectByAttributeValues extends js.Object {
  def apply(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  def apply(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
}

