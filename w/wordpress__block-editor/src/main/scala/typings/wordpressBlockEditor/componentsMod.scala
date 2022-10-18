package typings.wordpressBlockEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.componentsAlignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.componentsRichTextMod.RichText.ContentProps
import typings.wordpressBlockEditor.componentsUseBlockPropsMod.UseBlockProps_
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.base
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
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h6
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@wordpress/block-editor/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/block-editor/components", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor/components", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  object BlockControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsBlockControlsMod.BlockControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "BlockControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "BlockControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typings.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typings.wordpressBlockEditor.componentsBlockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockEditorProvider")
  @js.native
  val BlockEditorProvider: ComponentType[typings.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props] = js.native
  
  object BlockFormatControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsBlockFormatControlsMod.BlockFormatControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "BlockFormatControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "BlockFormatControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typings.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[typings.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockList")
  @js.native
  val BlockList: ComponentType[typings.wordpressBlockEditor.componentsBlockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typings.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[
    typings.wordpressBlockEditor.componentsBlockNavigationDropdownMod.BlockNavigationDropdown.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typings.wordpressBlockEditor.componentsBlockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[typings.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockVerticalAlignmentToolbar")
  @js.native
  val BlockVerticalAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsBlockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ButtonBlockAppender")
  @js.native
  val ButtonBlockAppender: ComponentType[
    typings.wordpressBlockEditor.componentsButtonBlockAppenderMod.ButtonBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typings.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[typings.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typings.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[
    typings.wordpressBlockEditor.componentsDefaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typings.wordpressBlockEditor.componentsFontSizesMod.FontSizePicker.Props] = js.native
  
  object InnerBlocks {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InnerBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.ButtonBlockAppender")
    @js.native
    def ButtonBlockAppender: ComponentType[Children] = js.native
    inline def ButtonBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.Content")
    @js.native
    def Content: ComponentType[Children] = js.native
    inline def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ComponentType[Children] = js.native
    inline def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "Inserter")
  @js.native
  val Inserter: ComponentType[typings.wordpressBlockEditor.componentsInserterMod.Inserter.Props] = js.native
  
  object InspectorAdvancedControls {
    
    inline def apply(
      props: typings.wordpressBlockEditor.componentsInspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InspectorAdvancedControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "InspectorAdvancedControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object InspectorControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsInspectorControlsMod.InspectorControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InspectorControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "InspectorControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  inline def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor/components", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[
    typings.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSwitcherMultiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typings.wordpressBlockEditor.componentsMultiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsNavigableToolbarMod.NavigableToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[typings.wordpressBlockEditor.componentsObserveTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[
    typings.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PlainText")
  @js.native
  val PlainText: ComponentType[typings.wordpressBlockEditor.componentsPlainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typings.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  object RichText {
    
    inline def apply(
      props: typings.wordpressBlockEditor.componentsRichTextMod.RichText.Props[
          a | abbr | address | area | article | aside | audio | b | base | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | div | dl | dt | em | embed | fieldset | figcaption | figure | footer | form | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "RichText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    inline def Content_a(props: ContentProps[a]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_abbr(props: ContentProps[abbr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_address(props: ContentProps[address]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_area(props: ContentProps[area]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_article(props: ContentProps[article]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_aside(props: ContentProps[aside]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_audio(props: ContentProps[audio]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_b(props: ContentProps[b]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_base(props: ContentProps[base]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_bdi(props: ContentProps[bdi]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_bdo(props: ContentProps[bdo]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_blockquote(props: ContentProps[blockquote]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_body(props: ContentProps[body]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_br(props: ContentProps[br]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_button(props: ContentProps[button]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_canvas(props: ContentProps[canvas]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_caption(props: ContentProps[caption]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_cite(props: ContentProps[cite]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_code(props: ContentProps[code]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_col(props: ContentProps[col]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_colgroup(props: ContentProps[colgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_data(props: ContentProps[data]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_datalist(props: ContentProps[datalist]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dd(props: ContentProps[dd]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_del(props: ContentProps[del]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_details(props: ContentProps[details]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dfn(props: ContentProps[dfn]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dialog(props: ContentProps[dialog]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_div(props: ContentProps[div]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dl(props: ContentProps[dl]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dt(props: ContentProps[dt]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_em(props: ContentProps[em]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_embed(props: ContentProps[embed]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_fieldset(props: ContentProps[fieldset]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_figcaption(props: ContentProps[figcaption]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_figure(props: ContentProps[figure]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_footer(props: ContentProps[footer]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_form(props: ContentProps[form]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h1(props: ContentProps[h1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h2(props: ContentProps[h2]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h3(props: ContentProps[h3]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h4(props: ContentProps[h4]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h5(props: ContentProps[h5]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h6(props: ContentProps[h6]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_head(props: ContentProps[head]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_header(props: ContentProps[header]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_hgroup(props: ContentProps[hgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_hr(props: ContentProps[hr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_html(props: ContentProps[html]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_i(props: ContentProps[i]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_iframe(props: ContentProps[iframe]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_img(props: ContentProps[img]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_input(props: ContentProps[input]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ins(props: ContentProps[ins]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_kbd(props: ContentProps[kbd]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_label(props: ContentProps[label]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_legend(props: ContentProps[legend]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_li(props: ContentProps[li]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_link(props: ContentProps[link]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_main(props: ContentProps[main]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_map(props: ContentProps[map]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_mark(props: ContentProps[mark]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_menu(props: ContentProps[menu]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_meta(props: ContentProps[meta]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_meter(props: ContentProps[meter]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_nav(props: ContentProps[nav]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_noscript(props: ContentProps[noscript]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_object(props: ContentProps[`object`]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ol(props: ContentProps[ol]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_optgroup(props: ContentProps[optgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_option(props: ContentProps[option]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_output(props: ContentProps[output]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_p(props: ContentProps[p]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_picture(props: ContentProps[picture]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_pre(props: ContentProps[pre]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_progress(props: ContentProps[progress]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_q(props: ContentProps[q]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_rp(props: ContentProps[rp]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_rt(props: ContentProps[rt]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ruby(props: ContentProps[ruby]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_s(props: ContentProps[s]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_samp(props: ContentProps[samp]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_script(props: ContentProps[script]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_section(props: ContentProps[section]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_select(props: ContentProps[select]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_slot(props: ContentProps[slot]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_small(props: ContentProps[small]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_source(props: ContentProps[source]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_span(props: ContentProps[span]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_strong(props: ContentProps[strong]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_style(props: ContentProps[style]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_sub(props: ContentProps[sub]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_summary(props: ContentProps[summary]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_sup(props: ContentProps[sup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_table(props: ContentProps[table]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tbody(props: ContentProps[tbody]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_td(props: ContentProps[td]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_template(props: ContentProps[template]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_textarea(props: ContentProps[textarea]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tfoot(props: ContentProps[tfoot]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_th(props: ContentProps[th]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_thead(props: ContentProps[thead]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_time(props: ContentProps[time]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_title(props: ContentProps[title]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tr(props: ContentProps[tr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_track(props: ContentProps[track]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_u(props: ContentProps[u]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ul(props: ContentProps[ul]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_var(props: ContentProps[`var`]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_video(props: ContentProps[video]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_wbr(props: ContentProps[wbr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def isEmpty(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isEmpty(value: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@wordpress/block-editor/components", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[typings.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[typings.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[
    typings.wordpressBlockEditor.componentsSkipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLInput")
  @js.native
  val URLInput: ComponentType[typings.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[typings.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typings.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "Warning")
  @js.native
  val Warning: ComponentType[typings.wordpressBlockEditor.componentsWarningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typings.wordpressBlockEditor.componentsWritingFlowMod.WritingFlow.Props] = js.native
  
  inline def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomColorsHOC")(colorsArray.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
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
  
  inline def getFontSizeClass(fontSizeSlug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeClass")(fontSizeSlug.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@wordpress/block-editor/components", "useBlockProps")
  @js.native
  val useBlockProps: UseBlockProps_ = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  
  inline def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColors")(colorTypes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFontSizes")(attributeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
