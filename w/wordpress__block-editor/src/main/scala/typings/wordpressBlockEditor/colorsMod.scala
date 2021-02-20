package typings.wordpressBlockEditor

import typings.react.mod.ComponentType
import typings.std.Record
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.mod.EditorColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("@wordpress/block-editor/components/colors", "createCustomColorsHOC")
  @js.native
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components/colors", "getColorClassName")
  @js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorClassName")
  @js.native
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor/components/colors", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  
  @JSImport("@wordpress/block-editor/components/colors", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  @JSImport("@wordpress/block-editor/components/colors", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  
  @JSImport("@wordpress/block-editor/components/colors", "withColors")
  @js.native
  def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}
