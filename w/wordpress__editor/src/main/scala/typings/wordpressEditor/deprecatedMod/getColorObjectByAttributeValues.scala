package typings.wordpressEditor.deprecatedMod

import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor/components/deprecated", "getColorObjectByAttributeValues")
@js.native
object getColorObjectByAttributeValues extends js.Object {
  def apply(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  def apply(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
}

