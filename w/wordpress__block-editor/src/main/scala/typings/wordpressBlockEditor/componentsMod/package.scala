package typings.wordpressBlockEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object componentsMod {
  
  @scala.inline
  def createCustomColorsHOC[T /* <: js.Array[java.lang.String] */](colorsArray: js.Array[typings.wordpressBlockEditor.mod.EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[
      /* component */ typings.react.mod.ComponentType[_], 
      typings.react.mod.ComponentType[_]
    ]
  ] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCustomColorsHOC")(colorsArray.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* colorNames */ T, 
    js.Function1[
      /* component */ typings.react.mod.ComponentType[_], 
      typings.react.mod.ComponentType[_]
    ]
  ]]
  
  @scala.inline
  def getColorClassName(): js.UndefOr[java.lang.String] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")().asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: java.lang.String): js.UndefOr[java.lang.String] = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def getColorClassName(colorContextName: java.lang.String): js.UndefOr[java.lang.String] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def getColorClassName(colorContextName: java.lang.String, colorSlug: java.lang.String): java.lang.String = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getColorClassName_Union(colorContextName: java.lang.String, colorSlug: java.lang.String): js.UndefOr[java.lang.String] = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def getColorObjectByAttributeValues(
    colors: js.Array[typings.wordpressBlockEditor.mod.EditorColor],
    definedColor: js.UndefOr[scala.Nothing],
    customColor: java.lang.String
  ): typings.wordpressBlockEditor.mod.EditorColor | typings.wordpressBlockEditor.anon.PickEditorColorcolor = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlockEditor.mod.EditorColor | typings.wordpressBlockEditor.anon.PickEditorColorcolor]
  @scala.inline
  def getColorObjectByAttributeValues(
    colors: js.Array[typings.wordpressBlockEditor.mod.EditorColor],
    definedColor: java.lang.String,
    customColor: java.lang.String
  ): typings.wordpressBlockEditor.mod.EditorColor | typings.wordpressBlockEditor.anon.PickEditorColorcolor = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlockEditor.mod.EditorColor | typings.wordpressBlockEditor.anon.PickEditorColorcolor]
  
  @scala.inline
  def getColorObjectByColorValue(colors: js.Array[typings.wordpressBlockEditor.mod.EditorColor]): js.UndefOr[typings.wordpressBlockEditor.mod.EditorColor] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.wordpressBlockEditor.mod.EditorColor]]
  @scala.inline
  def getColorObjectByColorValue(colors: js.Array[typings.wordpressBlockEditor.mod.EditorColor], colorValue: java.lang.String): js.UndefOr[typings.wordpressBlockEditor.mod.EditorColor] = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any], colorValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.wordpressBlockEditor.mod.EditorColor]]
  
  @scala.inline
  def getFontSize(
    fontSizes: js.Array[typings.wordpressBlockEditor.mod.EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: scala.Double
  ): typings.wordpressBlockEditor.anon.PartialEditorFontSizePick = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlockEditor.anon.PartialEditorFontSizePick]
  @scala.inline
  def getFontSize(
    fontSizes: js.Array[typings.wordpressBlockEditor.mod.EditorFontSize],
    fontSizeAttribute: java.lang.String,
    customFontSizeAttribute: scala.Double
  ): typings.wordpressBlockEditor.anon.PartialEditorFontSizePick = (typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlockEditor.anon.PartialEditorFontSizePick]
  
  @scala.inline
  def getFontSizeClass(fontSizeSlug: java.lang.String): java.lang.String = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeClass")(fontSizeSlug.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def withColors(colorTypes: (java.lang.String | (typings.std.Record[java.lang.String, java.lang.String]))*): js.Function1[
    /* component */ typings.react.mod.ComponentType[_], 
    typings.react.mod.ComponentType[_]
  ] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("withColors")(colorTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ typings.react.mod.ComponentType[_], 
    typings.react.mod.ComponentType[_]
  ]]
  
  @scala.inline
  def withFontSizes(attributeNames: java.lang.String*): js.Function1[
    /* component */ typings.react.mod.ComponentType[_], 
    typings.react.mod.ComponentType[_]
  ] = typings.wordpressBlockEditor.componentsMod.^.asInstanceOf[js.Dynamic].applyDynamic("withFontSizes")(attributeNames.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ typings.react.mod.ComponentType[_], 
    typings.react.mod.ComponentType[_]
  ]]
}
