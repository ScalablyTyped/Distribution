package typings.wordpressBlockEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import typings.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.anon.AjaxUrl
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.anon.Description
import typings.wordpressBlockEditor.anon.IsLocked
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.anon.TypeofimportedActions
import typings.wordpressBlockEditor.anon.TypeofimportedSelectors
import typings.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`coreSlashblock-editor`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.applet
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.base
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.basefont
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.bdi
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.bdo
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.blockquote
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.body
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.br
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.button
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.canvas
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.caption
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.cite
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.code
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.col
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dir
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.font
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.frame
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.frameset
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h6
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.head
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.header
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.html
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.i
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.iframe
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.img
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.input
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ins
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.kbd
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.label
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.legend
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.main
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.map
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.mark
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.marquee
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.meta
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.nav
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.noscript
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ol
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.optgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.option
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.output
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.p
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.param
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.picture
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.pre
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.progress
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.q
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.rp
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.rt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ruby
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.s
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.samp
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.script
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.section
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.select
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.slot
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.small
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.source
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.span
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.strong
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.style
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.sub
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.summary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.sup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.table
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tbody
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.td
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.template
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.textarea
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tfoot
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.th
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.thead
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.title
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.track
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.u
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ul
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.video
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.wbr
import typings.wordpressBlocks.mod.BlockIconNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-editor", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("@wordpress/block-editor", "Autocomplete")
  @js.native
  def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = js.native
  
  @JSImport("@wordpress/block-editor", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  object BlockControls {
    
    @JSImport("@wordpress/block-editor", "BlockControls")
    @js.native
    def apply(props: typings.wordpressBlockEditor.blockControlsMod.BlockControls.Props): Element = js.native
    @JSImport("@wordpress/block-editor", "BlockControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typings.wordpressBlockEditor.blockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typings.wordpressBlockEditor.blockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  val BlockEditorProvider: ComponentType[typings.wordpressBlockEditor.providerMod.BlockEditorProvider.Props] = js.native
  
  object BlockFormatControls {
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls")
    @js.native
    def apply(props: typings.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props): Element = js.native
    @JSImport("@wordpress/block-editor", "BlockFormatControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typings.wordpressBlockEditor.blockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[typings.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockList")
  @js.native
  val BlockList: ComponentType[typings.wordpressBlockEditor.blockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typings.wordpressBlockEditor.blockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[typings.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typings.wordpressBlockEditor.blockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[typings.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typings.wordpressBlockEditor.blockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[typings.wordpressBlockEditor.blockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockVerticalAlignmentToolbar")
  @js.native
  val BlockVerticalAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ButtonBlockerAppender")
  @js.native
  val ButtonBlockerAppender: ComponentType[typings.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typings.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typings.wordpressBlockEditor.copyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typings.wordpressBlockEditor.fontSizesMod.FontSizePicker.Props] = js.native
  
  object InnerBlocks {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks")
    @js.native
    def apply(props: typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props): Element = js.native
    @JSImport("@wordpress/block-editor", "InnerBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.ButtonBlockerAppender")
    @js.native
    def ButtonBlockerAppender: ComponentType[Children] = js.native
    @scala.inline
    def ButtonBlockerAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockerAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.Content")
    @js.native
    def Content: ComponentType[Children] = js.native
    @scala.inline
    def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ComponentType[Children] = js.native
    @scala.inline
    def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "Inserter")
  @js.native
  val Inserter: ComponentType[typings.wordpressBlockEditor.inserterMod.Inserter.Props] = js.native
  
  object InspectorAdvancedControls {
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
    @js.native
    def apply(props: typings.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props): Element = js.native
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object InspectorControls {
    
    @JSImport("@wordpress/block-editor", "InspectorControls")
    @js.native
    def apply(props: typings.wordpressBlockEditor.inspectorControlsMod.InspectorControls.Props): Element = js.native
    @JSImport("@wordpress/block-editor", "InspectorControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "MediaPlaceholder")
  @js.native
  def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = js.native
  
  @JSImport("@wordpress/block-editor", "MediaUpload")
  @js.native
  def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): Element = js.native
  
  @JSImport("@wordpress/block-editor", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[typings.wordpressBlockEditor.checkMod.MediaUploadCheck.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[typings.wordpressBlockEditor.multiBlocksSwitcherMod.MultiBlocksSwitcher.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typings.wordpressBlockEditor.multiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[typings.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[typings.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PlainText")
  @js.native
  val PlainText: ComponentType[typings.wordpressBlockEditor.plainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typings.wordpressBlockEditor.preserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  object RichText {
    
    @JSImport("@wordpress/block-editor", "RichText")
    @js.native
    def apply(
      props: typings.wordpressBlockEditor.richTextMod.RichText.Props[
          a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_a(props: ContentProps[a]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_abbr(props: ContentProps[abbr]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_address(props: ContentProps[address]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_applet(props: ContentProps[applet]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_area(props: ContentProps[area]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_article(props: ContentProps[article]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_aside(props: ContentProps[aside]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_audio(props: ContentProps[audio]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_b(props: ContentProps[b]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_base(props: ContentProps[base]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_basefont(props: ContentProps[basefont]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_bdi(props: ContentProps[bdi]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_bdo(props: ContentProps[bdo]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_blockquote(props: ContentProps[blockquote]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_body(props: ContentProps[body]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_br(props: ContentProps[br]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_button(props: ContentProps[button]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_canvas(props: ContentProps[canvas]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_caption(props: ContentProps[caption]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_cite(props: ContentProps[cite]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_code(props: ContentProps[code]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_col(props: ContentProps[col]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_colgroup(props: ContentProps[colgroup]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_data(props: ContentProps[data]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_datalist(props: ContentProps[datalist]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dd(props: ContentProps[dd]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_del(props: ContentProps[del]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_details(props: ContentProps[details]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dfn(props: ContentProps[dfn]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dialog(props: ContentProps[dialog]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dir(props: ContentProps[dir]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_div(props: ContentProps[div]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dl(props: ContentProps[dl]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dt(props: ContentProps[dt]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_em(props: ContentProps[em]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_embed(props: ContentProps[embed]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_fieldset(props: ContentProps[fieldset]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_figcaption(props: ContentProps[figcaption]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_figure(props: ContentProps[figure]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_font(props: ContentProps[font]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_footer(props: ContentProps[footer]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_form(props: ContentProps[form]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_frame(props: ContentProps[frame]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_frameset(props: ContentProps[frameset]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h1(props: ContentProps[h1]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h2(props: ContentProps[h2]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h3(props: ContentProps[h3]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h4(props: ContentProps[h4]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h5(props: ContentProps[h5]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h6(props: ContentProps[h6]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_head(props: ContentProps[head]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_header(props: ContentProps[header]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_hgroup(props: ContentProps[hgroup]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_hr(props: ContentProps[hr]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_html(props: ContentProps[html]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_i(props: ContentProps[i]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_iframe(props: ContentProps[iframe]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_img(props: ContentProps[img]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_input(props: ContentProps[input]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ins(props: ContentProps[ins]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_kbd(props: ContentProps[kbd]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_label(props: ContentProps[label]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_legend(props: ContentProps[legend]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_li(props: ContentProps[li]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_link(props: ContentProps[link]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_main(props: ContentProps[main]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_map(props: ContentProps[map]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_mark(props: ContentProps[mark]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_marquee(props: ContentProps[marquee]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_menu(props: ContentProps[menu]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_meta(props: ContentProps[meta]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_meter(props: ContentProps[meter]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_nav(props: ContentProps[nav]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_noscript(props: ContentProps[noscript]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_object(props: ContentProps[`object`]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ol(props: ContentProps[ol]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_optgroup(props: ContentProps[optgroup]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_option(props: ContentProps[option]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_output(props: ContentProps[output]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_p(props: ContentProps[p]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_param(props: ContentProps[param]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_picture(props: ContentProps[picture]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_pre(props: ContentProps[pre]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_progress(props: ContentProps[progress]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_q(props: ContentProps[q]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_rp(props: ContentProps[rp]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_rt(props: ContentProps[rt]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ruby(props: ContentProps[ruby]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_s(props: ContentProps[s]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_samp(props: ContentProps[samp]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_script(props: ContentProps[script]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_section(props: ContentProps[section]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_select(props: ContentProps[select]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_slot(props: ContentProps[slot]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_small(props: ContentProps[small]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_source(props: ContentProps[source]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_span(props: ContentProps[span]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_strong(props: ContentProps[strong]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_style(props: ContentProps[style]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_sub(props: ContentProps[sub]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_summary(props: ContentProps[summary]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_sup(props: ContentProps[sup]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_table(props: ContentProps[table]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tbody(props: ContentProps[tbody]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_td(props: ContentProps[td]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_template(props: ContentProps[template]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_textarea(props: ContentProps[textarea]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tfoot(props: ContentProps[tfoot]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_th(props: ContentProps[th]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_thead(props: ContentProps[thead]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_time(props: ContentProps[time]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_title(props: ContentProps[title]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tr(props: ContentProps[tr]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_track(props: ContentProps[track]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_u(props: ContentProps[u]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ul(props: ContentProps[ul]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_var(props: ContentProps[`var`]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_video(props: ContentProps[video]): Element = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_wbr(props: ContentProps[wbr]): Element = js.native
    
    @JSImport("@wordpress/block-editor", "RichText.isEmpty")
    @js.native
    def isEmpty(value: String): Boolean = js.native
    @JSImport("@wordpress/block-editor", "RichText.isEmpty")
    @js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  @JSImport("@wordpress/block-editor", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "SETTINGS_DEFAULTS")
  @js.native
  val SETTINGS_DEFAULTS: EditorSettings = js.native
  
  @JSImport("@wordpress/block-editor", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[typings.wordpressBlockEditor.skipToSelectedBlockMod.SkipToSelectedBlock.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  val URLInput: ComponentType[typings.wordpressBlockEditor.urlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[typings.wordpressBlockEditor.buttonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typings.wordpressBlockEditor.urlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "Warning")
  @js.native
  val Warning: ComponentType[typings.wordpressBlockEditor.warningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typings.wordpressBlockEditor.writingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "createCustomColorsHOC")
  @js.native
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  @JSImport("@wordpress/block-editor", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  
  @JSImport("@wordpress/block-editor", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  @JSImport("@wordpress/block-editor", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  
  @JSImport("@wordpress/block-editor", "getFontSize")
  @js.native
  def getFontSize(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  @JSImport("@wordpress/block-editor", "getFontSize")
  @js.native
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
  
  @JSImport("@wordpress/block-editor", "getFontSizeClass")
  @js.native
  def getFontSizeClass(fontSizeSlug: String): String = js.native
  
  object storeConfig {
    
    @JSImport("@wordpress/block-editor", "storeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "storeConfig.actions")
    @js.native
    def actions: js.Any = js.native
    @scala.inline
    def actions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.controls")
    @js.native
    def controls: js.Any = js.native
    @scala.inline
    def controls_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controls")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.reducer")
    @js.native
    def reducer: js.Any = js.native
    @scala.inline
    def reducer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reducer")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.selectors")
    @js.native
    def selectors: js.Any = js.native
    @scala.inline
    def selectors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "transformStyles")
  @js.native
  def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = js.native
  @JSImport("@wordpress/block-editor", "transformStyles")
  @js.native
  def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/block-editor", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, ComponentState]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  @JSImport("@wordpress/block-editor", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "withColors")
  @js.native
  def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  
  @JSImport("@wordpress/block-editor", "withFontSizes")
  @js.native
  def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedSelectors = js.native
  }
  
  @js.native
  trait EditorBaseSetting extends StObject {
    
    var name: String = js.native
    
    var slug: String = js.native
  }
  object EditorBaseSetting {
    
    @scala.inline
    def apply(name: String, slug: String): EditorBaseSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorBaseSetting]
    }
    
    @scala.inline
    implicit class EditorBaseSettingMutableBuilder[Self <: EditorBaseSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorBlockListSettings extends StObject {
    
    var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
    
    var templateLock: js.UndefOr[EditorTemplateLock] = js.native
  }
  object EditorBlockListSettings {
    
    @scala.inline
    def apply(): EditorBlockListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorBlockListSettings]
    }
    
    @scala.inline
    implicit class EditorBlockListSettingsMutableBuilder[Self <: EditorBlockListSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
      
      @scala.inline
      def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value :_*))
      
      @scala.inline
      def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.html
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorBlockMode extends StObject
  object EditorBlockMode {
    
    @scala.inline
    def html: typings.wordpressBlockEditor.wordpressBlockEditorStrings.html = "html".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.html]
    
    @scala.inline
    def visual: typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  @js.native
  trait EditorColor extends EditorBaseSetting {
    
    var color: String = js.native
  }
  object EditorColor {
    
    @scala.inline
    def apply(color: String, name: String, slug: String): EditorColor = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorColor]
    }
    
    @scala.inline
    implicit class EditorColorMutableBuilder[Self <: EditorColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorFontSize extends EditorBaseSetting {
    
    var size: Double = js.native
  }
  object EditorFontSize {
    
    @scala.inline
    def apply(name: String, size: Double, slug: String): EditorFontSize = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorFontSize]
    }
    
    @scala.inline
    implicit class EditorFontSizeMutableBuilder[Self <: EditorFontSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type EditorImageSize = EditorBaseSetting
  
  @js.native
  trait EditorInserterItem extends StObject {
    
    /**
      * Block category that the item is associated with.
      */
    var category: String = js.native
    
    /**
      * Hueristic that combines frequency and recency.
      */
    var frecency: Double = js.native
    
    var hasChildBlocksWithInserterSupport: Boolean = js.native
    
    /**
      * Icon for the item, as it appears in the inserter.
      */
    var icon: BlockIconNormalized = js.native
    
    /**
      * Unique identifier for the item.
      */
    var id: String = js.native
    
    /**
      * Attributes to pass to the newly created block.
      */
    var initialAttributes: Record[String, _] = js.native
    
    /**
      * Whether or not the user should be prevented from inserting this item.
      */
    var isDisabled: Boolean = js.native
    
    /**
      * Keywords that can be searched to find this item.
      */
    var keywords: js.Array[String] = js.native
    
    /**
      * The type of block to create.
      */
    var name: String = js.native
    
    /**
      * Title of the item, as it appears in the inserter.
      */
    var title: String = js.native
    
    /**
      * How useful we think this item is, between 0 and 3.
      */
    var utility: Double = js.native
  }
  object EditorInserterItem {
    
    @scala.inline
    def apply(
      category: String,
      frecency: Double,
      hasChildBlocksWithInserterSupport: Boolean,
      icon: BlockIconNormalized,
      id: String,
      initialAttributes: Record[String, _],
      isDisabled: Boolean,
      keywords: js.Array[String],
      name: String,
      title: String,
      utility: Double
    ): EditorInserterItem = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], frecency = frecency.asInstanceOf[js.Any], hasChildBlocksWithInserterSupport = hasChildBlocksWithInserterSupport.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialAttributes = initialAttributes.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], utility = utility.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorInserterItem]
    }
    
    @scala.inline
    implicit class EditorInserterItemMutableBuilder[Self <: EditorInserterItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrecency(value: Double): Self = StObject.set(x, "frecency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildBlocksWithInserterSupport(value: Boolean): Self = StObject.set(x, "hasChildBlocksWithInserterSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialAttributes(value: Record[String, _]): Self = StObject.set(x, "initialAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtility(value: Double): Self = StObject.set(x, "utility", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.text
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorMode extends StObject
  object EditorMode {
    
    @scala.inline
    def text: typings.wordpressBlockEditor.wordpressBlockEditorStrings.text = "text".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.text]
    
    @scala.inline
    def visual: typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  @js.native
  trait EditorSelection extends StObject {
    
    /**
      * The selected block attribute key.
      */
    var attributeKey: js.UndefOr[String] = js.native
    
    /**
      * The selected block client ID.
      */
    var clientId: js.UndefOr[String] = js.native
    
    /**
      * The selected block attribute offset.
      */
    var offset: js.UndefOr[Double] = js.native
  }
  object EditorSelection {
    
    @scala.inline
    def apply(): EditorSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorSelection]
    }
    
    @scala.inline
    implicit class EditorSelectionMutableBuilder[Self <: EditorSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeKey(value: String): Self = StObject.set(x, "attributeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeKeyUndefined: Self = StObject.set(x, "attributeKey", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait EditorSettings extends StObject {
    
    /**
      * Enable/Disable Wide/Full Alignments
      * @defaultValue `false`
      */
    var alignWide: Boolean = js.native
    
    /**
      * Array of allowed block types, `true` for all blocks, or `false` for no blocks.
      * @defaultValue `true`
      */
    var allowedBlockTypes: js.Array[String] | Boolean = js.native
    
    /**
      * Mapping of extension:mimetype
      * @example
      * ```js
      * {
      *   "jpg|jpeg|jpe": "image/jpeg",
      * }
      * ```
      */
    var allowedMimeTypes: (Record[String, String]) | Null = js.native
    
    var autosaveInterval: Double = js.native
    
    /**
      * Array of objects representing the legacy widgets available.
      */
    var availableLegacyWidgets: js.Array[Description] = js.native
    
    // FIXME: it is unclear what this value should be.
    var availableTemplates: js.Array[_] = js.native
    
    /**
      * Empty post placeholder.
      * @defaultValue `"Start writing or type / to choose a block"`
      */
    var bodyPlaceholder: String = js.native
    
    /**
      * Whether or not the user can switch to the code editor.
      */
    var codeEditingEnabled: Boolean = js.native
    
    /**
      * Palette colors.
      */
    var colors: js.Array[EditorColor] = js.native
    
    /**
      * Whether or not the custom colors are disabled.
      */
    var disableCustomColors: Boolean = js.native
    
    /**
      * Whether or not the custom font sizes are disabled.
      */
    var disableCustomEditorFontSizes: Boolean = js.native
    
    /**
      * Whether or not the custom post formats are disabled.
      */
    var disablePostFormats: Boolean = js.native
    
    /**
      * Whether or not the custom fields are enabled.
      */
    var enableCustomFields: Boolean = js.native
    
    /**
      * Whether the focus mode is enabled or not.
      */
    var focusMode: Boolean = js.native
    
    /**
      * Array of available font sizes.
      */
    var fontSizes: js.Array[EditorFontSize] = js.native
    
    /**
      * Whether or not the editor toolbar is fixed.
      */
    var hasFixedToolbar: Boolean = js.native
    
    /**
      * Whether or not the user is able to manage widgets.
      */
    var hasPermissionsToManageWidgets: Boolean = js.native
    
    /**
      * Available image sizes.
      */
    var imageSizes: js.Array[EditorImageSize] = js.native
    
    /**
      * Whether the editor is in RTL mode.
      */
    var isRTL: Boolean = js.native
    
    var maxUploadFileSize: Double = js.native
    
    /**
      * Max width to constraint resizing.
      */
    var maxWidth: Double = js.native
    
    var postLock: IsLocked = js.native
    
    var postLockUtils: AjaxUrl = js.native
    
    var richEditingEnabled: Boolean = js.native
    
    var styles: js.Array[EditorStyle] = js.native
    
    /**
      * Empty title placeholder.
      * @defaultValue `"Add title"`
      */
    var titlePlaceholder: String = js.native
  }
  object EditorSettings {
    
    @scala.inline
    def apply(
      alignWide: Boolean,
      allowedBlockTypes: js.Array[String] | Boolean,
      autosaveInterval: Double,
      availableLegacyWidgets: js.Array[Description],
      availableTemplates: js.Array[_],
      bodyPlaceholder: String,
      codeEditingEnabled: Boolean,
      colors: js.Array[EditorColor],
      disableCustomColors: Boolean,
      disableCustomEditorFontSizes: Boolean,
      disablePostFormats: Boolean,
      enableCustomFields: Boolean,
      focusMode: Boolean,
      fontSizes: js.Array[EditorFontSize],
      hasFixedToolbar: Boolean,
      hasPermissionsToManageWidgets: Boolean,
      imageSizes: js.Array[EditorImageSize],
      isRTL: Boolean,
      maxUploadFileSize: Double,
      maxWidth: Double,
      postLock: IsLocked,
      postLockUtils: AjaxUrl,
      richEditingEnabled: Boolean,
      styles: js.Array[EditorStyle],
      titlePlaceholder: String
    ): EditorSettings = {
      val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomEditorFontSizes = disableCustomEditorFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorSettings]
    }
    
    @scala.inline
    implicit class EditorSettingsMutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[_]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorStyle extends StObject {
    
    var baseURL: js.UndefOr[String] = js.native
    
    var css: String = js.native
  }
  object EditorStyle {
    
    @scala.inline
    def apply(css: String): EditorStyle = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorStyle]
    }
    
    @scala.inline
    implicit class EditorStyleMutableBuilder[Self <: EditorStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.all
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert
  */
  trait EditorTemplateLock extends StObject
  object EditorTemplateLock {
    
    @scala.inline
    def all: typings.wordpressBlockEditor.wordpressBlockEditorStrings.all = "all".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.all]
    
    @scala.inline
    def `false`: typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false` = false.asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`]
    
    @scala.inline
    def insert: typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert = "insert".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert]
  }
}
