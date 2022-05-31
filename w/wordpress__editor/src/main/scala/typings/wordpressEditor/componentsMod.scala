package typings.wordpressEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typings.wordpressEditor.anon.Typeof
import typings.wordpressEditor.anon.TypeofApply
import typings.wordpressEditor.anon.TypeofApplySlot
import typings.wordpressEditor.anon.TypeofButtonBlockerAppender
import typings.wordpressEditor.anon.TypeofContent
import typings.wordpressEditor.anon.TypeofSlot
import typings.wordpressEditor.wordpressEditorStrings.colors
import typings.wordpressEditor.wordpressEditorStrings.disableCustomColors
import typings.wordpressEditor.wordpressEditorStrings.hasColorsToChoose
import typings.wordpressEditor.wordpressEditorStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@wordpress/editor/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/editor/components", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components", "AutosaveMonitor")
  @js.native
  val AutosaveMonitor: ComponentType[typings.wordpressEditor.autosaveMonitorMod.AutosaveMonitor.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockControls")
  @js.native
  val BlockControls: Typeof = js.native
  
  @JSImport("@wordpress/editor/components", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typings.wordpressBlockEditor.blockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typings.wordpressBlockEditor.blockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockFormatControls")
  @js.native
  val BlockFormatControls: TypeofApply = js.native
  
  @JSImport("@wordpress/editor/components", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typings.wordpressBlockEditor.blockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[typings.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockList")
  @js.native
  val BlockList: ComponentType[typings.wordpressBlockEditor.blockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typings.wordpressBlockEditor.blockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[typings.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typings.wordpressBlockEditor.blockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[typings.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typings.wordpressBlockEditor.blockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[typings.wordpressBlockEditor.blockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typings.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typings.wordpressBlockEditor.copyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "DocumentOutline")
  @js.native
  val DocumentOutline: ComponentType[typings.wordpressEditor.documentOutlineMod.DocumentOutline.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "DocumentOutlineCheck")
  @js.native
  val DocumentOutlineCheck: ComponentType[typings.wordpressEditor.checkMod.DocumentOutlineCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorGlobalKeyboardShortcuts")
  @js.native
  val EditorGlobalKeyboardShortcuts: ComponentType[
    typings.wordpressEditor.visualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorHistoryRedo")
  @js.native
  val EditorHistoryRedo: ComponentType[typings.wordpressEditor.redoMod.EditorHistoryRedo.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorHistoryUndo")
  @js.native
  val EditorHistoryUndo: ComponentType[typings.wordpressEditor.undoMod.EditorHistoryUndo.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorNotices")
  @js.native
  val EditorNotices: ComponentType[typings.wordpressEditor.editorNoticesMod.EditorNotices.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorProvider")
  @js.native
  val EditorProvider: ComponentType[typings.wordpressEditor.providerMod.EditorProvider.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ErrorBoundary")
  @js.native
  val ErrorBoundary: ComponentType[typings.wordpressEditor.errorBoundaryMod.ErrorBoundary.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typings.wordpressBlockEditor.fontSizesMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "InnerBlocks")
  @js.native
  val InnerBlocks: TypeofButtonBlockerAppender = js.native
  
  @JSImport("@wordpress/editor/components", "Inserter")
  @js.native
  val Inserter: ComponentType[typings.wordpressBlockEditor.inserterMod.Inserter.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "InspectorAdvancedControls")
  @js.native
  val InspectorAdvancedControls: TypeofSlot = js.native
  
  @JSImport("@wordpress/editor/components", "InspectorControls")
  @js.native
  val InspectorControls: TypeofApplySlot = js.native
  
  inline def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[typings.wordpressBlockEditor.checkMod.MediaUploadCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[typings.wordpressBlockEditor.multiBlocksSwitcherMod.MultiBlocksSwitcher.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typings.wordpressBlockEditor.multiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[typings.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[typings.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesCheck")
  @js.native
  val PageAttributesCheck: ComponentType[typings.wordpressEditor.pageAttributesCheckMod.PageAttributesCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesOrder")
  @js.native
  val PageAttributesOrder: ComponentType[typings.wordpressEditor.orderMod.PageAttributesOrder.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesParent")
  @js.native
  val PageAttributesParent: ComponentType[typings.wordpressEditor.parentMod.PageAttributesParent.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PageTemplate")
  @js.native
  val PageTemplate: ComponentType[typings.wordpressEditor.templateMod.PageTemplate.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PlainText")
  @js.native
  val PlainText: ComponentType[typings.wordpressBlockEditor.plainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostAuthor")
  @js.native
  val PostAuthor: ComponentType[typings.wordpressEditor.postAuthorMod.PostAuthor.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostAuthorCheck")
  @js.native
  val PostAuthorCheck: ComponentType[typings.wordpressEditor.postAuthorCheckMod.PostAuthorCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostComments")
  @js.native
  val PostComments: ComponentType[typings.wordpressEditor.postCommentsMod.PostComments.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostExcerpt")
  @js.native
  val PostExcerpt: ComponentType[typings.wordpressEditor.postExcerptMod.PostExcerpt.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostExcerptCheck")
  @js.native
  val PostExcerptCheck: ComponentType[typings.wordpressEditor.postExcerptCheckMod.PostExcerptCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFeaturedImage")
  @js.native
  val PostFeaturedImage: ComponentType[typings.wordpressEditor.postFeaturedImageMod.PostFeaturedImage.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFeaturedImageCheck")
  @js.native
  val PostFeaturedImageCheck: ComponentType[typings.wordpressEditor.postFeaturedImageCheckMod.PostFeaturedImageCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFormat")
  @js.native
  val PostFormat: ComponentType[typings.wordpressEditor.postFormatMod.PostFormat.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFormatCheck")
  @js.native
  val PostFormatCheck: ComponentType[typings.wordpressEditor.postFormatCheckMod.PostFormatCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLastRevision")
  @js.native
  val PostLastRevision: ComponentType[typings.wordpressEditor.postLastRevisionMod.PostLastRevision.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLastRevisionCheck")
  @js.native
  val PostLastRevisionCheck: ComponentType[typings.wordpressEditor.postLastRevisionCheckMod.PostLastRevisionCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLockedModal")
  @js.native
  val PostLockedModal: ComponentType[typings.wordpressEditor.postLockedModalMod.PostLockedModal.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPendingStatus")
  @js.native
  val PostPendingStatus: ComponentType[typings.wordpressEditor.postPendingStatusMod.PostPendingStatus.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPendingStatusCheck")
  @js.native
  val PostPendingStatusCheck: ComponentType[typings.wordpressEditor.postPendingStatusCheckMod.PostPendingStatusCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPingbacks")
  @js.native
  val PostPingbacks: ComponentType[typings.wordpressEditor.postPingbacksMod.PostPingbacks.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPreviewButton")
  @js.native
  val PostPreviewButton: ComponentType[typings.wordpressEditor.postPreviewButtonMod.PostPreviewButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishButton")
  @js.native
  val PostPublishButton: ComponentType[typings.wordpressEditor.postPublishButtonMod.PostPublishButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishButtonLabel")
  @js.native
  val PostPublishButtonLabel: ComponentType[typings.wordpressEditor.labelMod.PostPublishButtonLabel.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishPanel")
  @js.native
  val PostPublishPanel: ComponentType[typings.wordpressEditor.postPublishPanelMod.PostPublishPanel.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSavedState")
  @js.native
  val PostSavedState: ComponentType[typings.wordpressEditor.postSavedStateMod.PostSavedState.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSchedule")
  @js.native
  val PostSchedule: ComponentType[typings.wordpressEditor.postScheduleMod.PostSchedule.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostScheduleCheck")
  @js.native
  val PostScheduleCheck: ComponentType[typings.wordpressEditor.postScheduleCheckMod.PostScheduleCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostScheduleLabel")
  @js.native
  val PostScheduleLabel: ComponentType[typings.wordpressEditor.postScheduleLabelMod.PostScheduleLabel.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSticky")
  @js.native
  val PostSticky: ComponentType[typings.wordpressEditor.postStickyMod.PostSticky.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostStickyCheck")
  @js.native
  val PostStickyCheck: ComponentType[typings.wordpressEditor.postStickyCheckMod.PostStickyCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSwitchToDraftButton")
  @js.native
  val PostSwitchToDraftButton: ComponentType[typings.wordpressEditor.postSwitchToDraftButtonMod.PostSwitchToDraftButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTaxonomies")
  @js.native
  val PostTaxonomies: ComponentType[typings.wordpressEditor.postTaxonomiesMod.PostTaxonomies.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTaxonomiesCheck")
  @js.native
  val PostTaxonomiesCheck: ComponentType[typings.wordpressEditor.postTaxonomiesCheckMod.PostTaxonomiesCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTextEditor")
  @js.native
  val PostTextEditor: ComponentType[typings.wordpressEditor.postTextEditorMod.PostTextEditor.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTitle")
  @js.native
  val PostTitle: ComponentType[typings.wordpressEditor.postTitleMod.PostTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTrash")
  @js.native
  val PostTrash: ComponentType[typings.wordpressEditor.postTrashMod.PostTrash.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTrashCheck")
  @js.native
  val PostTrashCheck: ComponentType[typings.wordpressEditor.postTrashCheckMod.PostTrashCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTypeSupportCheck")
  @js.native
  val PostTypeSupportCheck: ComponentType[typings.wordpressEditor.postTypeSupportCheckMod.PostTypeSupportCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibility")
  @js.native
  val PostVisibility: ComponentType[typings.wordpressEditor.postVisibilityMod.PostVisibility.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibilityCheck")
  @js.native
  val PostVisibilityCheck: ComponentType[typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibilityLabel")
  @js.native
  val PostVisibilityLabel: ComponentType[typings.wordpressEditor.postVisibilityLabelMod.PostVisibilityLabel.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typings.wordpressBlockEditor.preserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "RichText")
  @js.native
  val RichText: TypeofContent = js.native
  
  @JSImport("@wordpress/editor/components", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[typings.wordpressBlockEditor.skipToSelectedBlockMod.SkipToSelectedBlock.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "TableOfContents")
  @js.native
  val TableOfContents: ComponentType[typings.wordpressEditor.tableOfContentsMod.TableOfContents.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "TextEditorGlobalKeyboardShortcuts")
  @js.native
  val TextEditorGlobalKeyboardShortcuts: ComponentType[
    typings.wordpressEditor.textEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "URLInput")
  @js.native
  val URLInput: ComponentType[typings.wordpressBlockEditor.urlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[typings.wordpressBlockEditor.buttonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typings.wordpressBlockEditor.urlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "UnsavedChangesWarning")
  @js.native
  val UnsavedChangesWarning: ComponentType[typings.wordpressEditor.unsavedChangesWarningMod.UnsavedChangesWarning.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "VisualEditorGlobalKeyboardShortcuts")
  @js.native
  val VisualEditorGlobalKeyboardShortcuts: ComponentType[
    typings.wordpressEditor.visualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "Warning")
  @js.native
  val Warning: ComponentType[typings.wordpressBlockEditor.warningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "WordCount")
  @js.native
  val WordCount: ComponentType[typings.wordpressEditor.wordCountMod.WordCount.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typings.wordpressBlockEditor.writingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  inline def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomColorsHOC")(colorsArray.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ]]
  
  inline def getColorClassName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")().asInstanceOf[js.UndefOr[String]]
  inline def getColorClassName(colorContextName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getColorClassName(colorContextName: String, colorSlug: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getColorClassName(colorContextName: Unit, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  inline def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: Unit, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  
  inline def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EditorColor]]
  inline def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any], colorValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EditorColor]]
  
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: Unit, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  
  @JSImport("@wordpress/editor/components", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  @JSImport("@wordpress/editor/components", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps & OwnProps]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  
  @JSImport("@wordpress/editor/components", "withColors")
  @js.native
  val withColors: js.Function1[
    /* repeated */ String | (Record[String, String]), 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "withFontSizes")
  @js.native
  val withFontSizes: js.Function1[
    /* repeated */ String, 
    js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]
  ] = js.native
}
