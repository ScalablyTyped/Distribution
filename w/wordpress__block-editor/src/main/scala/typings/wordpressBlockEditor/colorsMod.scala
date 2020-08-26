package typings.wordpressBlockEditor

import typings.react.mod.ComponentType
import typings.std.Record
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSName("getColorClassName")
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}

