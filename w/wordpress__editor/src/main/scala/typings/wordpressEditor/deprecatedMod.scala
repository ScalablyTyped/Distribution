package typings.wordpressEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import typings.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressEditor.anon.Typeof
import typings.wordpressEditor.anon.TypeofApply
import typings.wordpressEditor.anon.TypeofApplySlot
import typings.wordpressEditor.anon.TypeofButtonBlockerAppender
import typings.wordpressEditor.anon.TypeofContent
import typings.wordpressEditor.anon.TypeofSlot
import typings.wordpressEditor.wordpressEditorStrings.colors
import typings.wordpressEditor.wordpressEditorStrings.disableCustomColors
import typings.wordpressEditor.wordpressEditorStrings.hasColorsToChoose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@wordpress/editor/components/deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  @scala.inline
  def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockControls")
  @js.native
  val BlockControls: Typeof = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typings.wordpressBlockEditor.blockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typings.wordpressBlockEditor.blockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockFormatControls")
  @js.native
  val BlockFormatControls: TypeofApply = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typings.wordpressBlockEditor.blockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[typings.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockList")
  @js.native
  val BlockList: ComponentType[typings.wordpressBlockEditor.blockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typings.wordpressBlockEditor.blockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[typings.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typings.wordpressBlockEditor.blockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[typings.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typings.wordpressBlockEditor.blockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[typings.wordpressBlockEditor.blockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typings.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typings.wordpressBlockEditor.copyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typings.wordpressBlockEditor.fontSizesMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InnerBlocks")
  @js.native
  val InnerBlocks: TypeofButtonBlockerAppender = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "Inserter")
  @js.native
  val Inserter: ComponentType[typings.wordpressBlockEditor.inserterMod.Inserter.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InspectorAdvancedControls")
  @js.native
  val InspectorAdvancedControls: TypeofSlot = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InspectorControls")
  @js.native
  val InspectorControls: TypeofApplySlot = js.native
  
  @scala.inline
  def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[typings.wordpressBlockEditor.checkMod.MediaUploadCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[typings.wordpressBlockEditor.multiBlocksSwitcherMod.MultiBlocksSwitcher.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typings.wordpressBlockEditor.multiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[typings.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[typings.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PlainText")
  @js.native
  val PlainText: ComponentType[typings.wordpressBlockEditor.plainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typings.wordpressBlockEditor.preserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichText")
  @js.native
  val RichText: TypeofContent = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[typings.wordpressBlockEditor.skipToSelectedBlockMod.SkipToSelectedBlock.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLInput")
  @js.native
  val URLInput: ComponentType[typings.wordpressBlockEditor.urlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[typings.wordpressBlockEditor.buttonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typings.wordpressBlockEditor.urlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "Warning")
  @js.native
  val Warning: ComponentType[typings.wordpressBlockEditor.warningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typings.wordpressBlockEditor.writingFlowMod.WritingFlow.Props] = js.native
  
  @scala.inline
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomColorsHOC")(colorsArray.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ]]
  
  @scala.inline
  def getColorClassName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def getColorClassName(colorContextName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def getColorClassName(colorContextName: String, colorSlug: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getColorClassName(colorContextName: Unit, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  @scala.inline
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: Unit, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  
  @scala.inline
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EditorColor]]
  @scala.inline
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any], colorValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EditorColor]]
  
  @scala.inline
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  @scala.inline
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: Unit, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  
  @JSImport("@wordpress/editor/components/deprecated", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  // prettier-ignore
  @scala.inline
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  @scala.inline
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps & OwnProps]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  
  @JSImport("@wordpress/editor/components/deprecated", "withColors")
  @js.native
  val withColors: js.Function1[
    /* repeated */ String | (Record[String, String]), 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "withFontSizes")
  @js.native
  val withFontSizes: js.Function1[
    /* repeated */ String, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = js.native
}
