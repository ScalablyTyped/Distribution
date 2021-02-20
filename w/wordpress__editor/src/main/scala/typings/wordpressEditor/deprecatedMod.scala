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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@wordpress/editor/components/deprecated", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("@wordpress/editor/components/deprecated", "Autocomplete")
  @js.native
  def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = js.native
  
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
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaPlaceholder")
  @js.native
  def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaUpload")
  @js.native
  def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): Element = js.native
  
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
  
  @JSImport("@wordpress/editor/components/deprecated", "createCustomColorsHOC")
  @js.native
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getFontSize")
  @js.native
  def getFontSize(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getFontSize")
  @js.native
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/editor/components/deprecated", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, ComponentState]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  
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
