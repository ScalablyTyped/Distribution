package typings.wordpressBlockEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressBlockEditor.anon.AjaxUrl
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.anon.ClassName
import typings.wordpressBlockEditor.anon.Description
import typings.wordpressBlockEditor.anon.IsLocked
import typings.wordpressBlockEditor.anon.MinFontSize
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.anon.PickEditorColorcolor
import typings.wordpressBlockEditor.anon.TypeofimportedActions
import typings.wordpressBlockEditor.anon.TypeofimportedSelectors
import typings.wordpressBlockEditor.componentsAlignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.componentsInnerBlocksMod.UseInnerBlocksProps_
import typings.wordpressBlockEditor.componentsRichTextMod.RichText.ContentProps
import typings.wordpressBlockEditor.componentsUseBlockPropsMod.UseBlockProps_
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`coreSlashblock-editor`
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
import typings.wordpressBlocks.BlockAttributes
import typings.wordpressBlocks.BlockIconNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/block-editor", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // eslint-disable-next-line no-unnecessary-generics
  inline def Autocomplete[T](props: typings.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  object BlockControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsBlockControlsMod.BlockControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor", "BlockControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typings.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typings.wordpressBlockEditor.componentsBlockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  val BlockEditorProvider: ComponentType[typings.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props] = js.native
  
  object BlockFormatControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsBlockFormatControlsMod.BlockFormatControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typings.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[typings.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockList")
  @js.native
  val BlockList: ComponentType[typings.wordpressBlockEditor.componentsBlockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typings.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[
    typings.wordpressBlockEditor.componentsBlockNavigationDropdownMod.BlockNavigationDropdown.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typings.wordpressBlockEditor.componentsBlockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[typings.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockVerticalAlignmentToolbar")
  @js.native
  val BlockVerticalAlignmentToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsBlockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ButtonBlockAppender")
  @js.native
  val ButtonBlockAppender: ComponentType[
    typings.wordpressBlockEditor.componentsButtonBlockAppenderMod.ButtonBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typings.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[typings.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typings.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[
    typings.wordpressBlockEditor.componentsDefaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typings.wordpressBlockEditor.componentsFontSizesMod.FontSizePicker.Props] = js.native
  
  object InnerBlocks {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor", "InnerBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.ButtonBlockAppender")
    @js.native
    def ButtonBlockAppender: ComponentType[Children] = js.native
    inline def ButtonBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.Content")
    @js.native
    def Content: ComponentType[Children] = js.native
    inline def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ComponentType[Children] = js.native
    inline def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "Inserter")
  @js.native
  val Inserter: ComponentType[typings.wordpressBlockEditor.componentsInserterMod.Inserter.Props] = js.native
  
  object InspectorAdvancedControls {
    
    inline def apply(
      props: typings.wordpressBlockEditor.componentsInspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object InspectorControls {
    
    inline def apply(props: typings.wordpressBlockEditor.componentsInspectorControlsMod.InspectorControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor", "InspectorControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  inline def MediaPlaceholder[T /* <: Boolean */](props: typings.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MediaUpload[T /* <: Boolean */](props: typings.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[
    typings.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[
    typings.wordpressBlockEditor.componentsBlockSwitcherMultiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typings.wordpressBlockEditor.componentsMultiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[
    typings.wordpressBlockEditor.componentsNavigableToolbarMod.NavigableToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[typings.wordpressBlockEditor.componentsObserveTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[
    typings.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "PlainText")
  @js.native
  val PlainText: ComponentType[typings.wordpressBlockEditor.componentsPlainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PreserveScrollInReorder")
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
    
    @JSImport("@wordpress/block-editor", "RichText")
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
  
  @JSImport("@wordpress/block-editor", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[typings.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[typings.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "SETTINGS_DEFAULTS")
  @js.native
  val SETTINGS_DEFAULTS: EditorSettings = js.native
  
  @JSImport("@wordpress/block-editor", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[
    typings.wordpressBlockEditor.componentsSkipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  val URLInput: ComponentType[typings.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[typings.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typings.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "Warning")
  @js.native
  val Warning: ComponentType[typings.wordpressBlockEditor.componentsWarningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "WritingFlow")
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
  
  inline def getTypographyClassesAndStyles(attributes: BlockAttributes, fluidTypographySettings: Boolean): ClassName = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyClassesAndStyles")(attributes.asInstanceOf[js.Any], fluidTypographySettings.asInstanceOf[js.Any])).asInstanceOf[ClassName]
  inline def getTypographyClassesAndStyles(attributes: BlockAttributes, fluidTypographySettings: MinFontSize): ClassName = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyClassesAndStyles")(attributes.asInstanceOf[js.Any], fluidTypographySettings.asInstanceOf[js.Any])).asInstanceOf[ClassName]
  
  @JSImport("@wordpress/block-editor", "store")
  @js.native
  val store: Any = js.native
  
  object storeConfig {
    
    @JSImport("@wordpress/block-editor", "storeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "storeConfig.actions")
    @js.native
    def actions: Any = js.native
    inline def actions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.controls")
    @js.native
    def controls: Any = js.native
    inline def controls_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controls")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.reducer")
    @js.native
    def reducer: Any = js.native
    inline def reducer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reducer")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.selectors")
    @js.native
    def selectors: Any = js.native
    inline def selectors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectors")(x.asInstanceOf[js.Any])
  }
  
  inline def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any], wrapperClassName.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("@wordpress/block-editor", "useBlockProps")
  @js.native
  val useBlockProps: UseBlockProps_ = js.native
  
  inline def useCachedTruthy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCachedTruthy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@wordpress/block-editor", "useInnerBlocksProps")
  @js.native
  val useInnerBlocksProps: UseInnerBlocksProps_ = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  
  inline def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColors")(colorTypes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFontSizes")(attributeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  trait EditorBaseSetting extends StObject {
    
    var name: String
    
    var slug: String
  }
  object EditorBaseSetting {
    
    inline def apply(name: String, slug: String): EditorBaseSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorBaseSetting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorBaseSetting] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorBlockListSettings extends StObject {
    
    var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
    
    var templateLock: js.UndefOr[EditorTemplateLock] = js.undefined
  }
  object EditorBlockListSettings {
    
    inline def apply(): EditorBlockListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorBlockListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorBlockListSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
      
      inline def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value*))
      
      inline def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
      
      inline def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.html
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorBlockMode extends StObject
  object EditorBlockMode {
    
    inline def html: typings.wordpressBlockEditor.wordpressBlockEditorStrings.html = "html".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.html]
    
    inline def visual: typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  trait EditorColor
    extends StObject
       with EditorBaseSetting {
    
    var color: String
  }
  object EditorColor {
    
    inline def apply(color: String, name: String, slug: String): EditorColor = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorColor] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorFontSize
    extends StObject
       with EditorBaseSetting {
    
    var size: Double
  }
  object EditorFontSize {
    
    inline def apply(name: String, size: Double, slug: String): EditorFontSize = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorFontSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorFontSize] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type EditorImageSize = EditorBaseSetting
  
  trait EditorInserterItem extends StObject {
    
    /**
      * Block category that the item is associated with.
      */
    var category: String
    
    /**
      * Hueristic that combines frequency and recency.
      */
    var frecency: Double
    
    var hasChildBlocksWithInserterSupport: Boolean
    
    /**
      * Icon for the item, as it appears in the inserter.
      */
    var icon: BlockIconNormalized
    
    /**
      * Unique identifier for the item.
      */
    var id: String
    
    /**
      * Attributes to pass to the newly created block.
      */
    var initialAttributes: Record[String, Any]
    
    /**
      * Whether or not the user should be prevented from inserting this item.
      */
    var isDisabled: Boolean
    
    /**
      * Keywords that can be searched to find this item.
      */
    var keywords: js.Array[String]
    
    /**
      * The type of block to create.
      */
    var name: String
    
    /**
      * Title of the item, as it appears in the inserter.
      */
    var title: String
    
    /**
      * How useful we think this item is, between 0 and 3.
      */
    var utility: Double
  }
  object EditorInserterItem {
    
    inline def apply(
      category: String,
      frecency: Double,
      hasChildBlocksWithInserterSupport: Boolean,
      icon: BlockIconNormalized,
      id: String,
      initialAttributes: Record[String, Any],
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
    implicit open class MutableBuilder[Self <: EditorInserterItem] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setFrecency(value: Double): Self = StObject.set(x, "frecency", value.asInstanceOf[js.Any])
      
      inline def setHasChildBlocksWithInserterSupport(value: Boolean): Self = StObject.set(x, "hasChildBlocksWithInserterSupport", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialAttributes(value: Record[String, Any]): Self = StObject.set(x, "initialAttributes", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUtility(value: Double): Self = StObject.set(x, "utility", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.text
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorMode extends StObject
  object EditorMode {
    
    inline def text: typings.wordpressBlockEditor.wordpressBlockEditorStrings.text = "text".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.text]
    
    inline def visual: typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  trait EditorSelection extends StObject {
    
    /**
      * The selected block attribute key.
      */
    var attributeKey: js.UndefOr[String] = js.undefined
    
    /**
      * The selected block client ID.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * The selected block attribute offset.
      */
    var offset: js.UndefOr[Double] = js.undefined
  }
  object EditorSelection {
    
    inline def apply(): EditorSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorSelection] (val x: Self) extends AnyVal {
      
      inline def setAttributeKey(value: String): Self = StObject.set(x, "attributeKey", value.asInstanceOf[js.Any])
      
      inline def setAttributeKeyUndefined: Self = StObject.set(x, "attributeKey", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait EditorSettings extends StObject {
    
    /**
      * Enable/Disable Wide/Full Alignments
      * @defaultValue `false`
      */
    var alignWide: Boolean
    
    /**
      * Array of allowed block types, `true` for all blocks, or `false` for no blocks.
      * @defaultValue `true`
      */
    var allowedBlockTypes: js.Array[String] | Boolean
    
    /**
      * Mapping of extension:mimetype
      * @example
      * ```js
      * {
      *   "jpg|jpeg|jpe": "image/jpeg",
      * }
      * ```
      */
    var allowedMimeTypes: (Record[String, String]) | Null
    
    var autosaveInterval: Double
    
    /**
      * Array of objects representing the legacy widgets available.
      */
    var availableLegacyWidgets: js.Array[Description]
    
    // FIXME: it is unclear what this value should be.
    var availableTemplates: js.Array[Any]
    
    /**
      * Empty post placeholder.
      * @defaultValue `"Start writing or type / to choose a block"`
      */
    var bodyPlaceholder: String
    
    /**
      * Whether or not the user can switch to the code editor.
      */
    var codeEditingEnabled: Boolean
    
    /**
      * Palette colors.
      */
    var colors: js.Array[EditorColor]
    
    /**
      * Whether or not the custom colors are disabled.
      */
    var disableCustomColors: Boolean
    
    /**
      * Whether or not the custom font sizes are disabled.
      */
    var disableCustomEditorFontSizes: Boolean
    
    /**
      * Whether or not the custom post formats are disabled.
      */
    var disablePostFormats: Boolean
    
    /**
      * Whether or not the custom fields are enabled.
      */
    var enableCustomFields: Boolean
    
    /**
      * Whether the focus mode is enabled or not.
      */
    var focusMode: Boolean
    
    /**
      * Array of available font sizes.
      */
    var fontSizes: js.Array[EditorFontSize]
    
    /**
      * Whether or not the editor toolbar is fixed.
      */
    var hasFixedToolbar: Boolean
    
    /**
      * Whether or not the user is able to manage widgets.
      */
    var hasPermissionsToManageWidgets: Boolean
    
    /**
      * Available image sizes.
      */
    var imageSizes: js.Array[EditorImageSize]
    
    /**
      * Whether the editor is in RTL mode.
      */
    var isRTL: Boolean
    
    var maxUploadFileSize: Double
    
    /**
      * Max width to constraint resizing.
      */
    var maxWidth: Double
    
    var postLock: IsLocked
    
    var postLockUtils: AjaxUrl
    
    var richEditingEnabled: Boolean
    
    var styles: js.Array[EditorStyle]
    
    /**
      * Empty title placeholder.
      * @defaultValue `"Add title"`
      */
    var titlePlaceholder: String
  }
  object EditorSettings {
    
    inline def apply(
      alignWide: Boolean,
      allowedBlockTypes: js.Array[String] | Boolean,
      autosaveInterval: Double,
      availableLegacyWidgets: js.Array[Description],
      availableTemplates: js.Array[Any],
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
      val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomEditorFontSizes = disableCustomEditorFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any], allowedMimeTypes = null)
      __obj.asInstanceOf[EditorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
      
      inline def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value*))
      
      inline def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      inline def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      inline def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      inline def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value*))
      
      inline def setAvailableTemplates(value: js.Array[Any]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      inline def setAvailableTemplatesVarargs(value: Any*): Self = StObject.set(x, "availableTemplates", js.Array(value*))
      
      inline def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      inline def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      inline def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      inline def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      inline def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      inline def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value*))
      
      inline def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      inline def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      inline def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      inline def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value*))
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      inline def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      inline def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorStyle extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var css: String
  }
  object EditorStyle {
    
    inline def apply(css: String): EditorStyle = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorStyle] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.all
    - typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert
  */
  trait EditorTemplateLock extends StObject
  object EditorTemplateLock {
    
    inline def all: typings.wordpressBlockEditor.wordpressBlockEditorStrings.all = "all".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.all]
    
    inline def `false`: typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false` = false.asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`]
    
    inline def insert: typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert = "insert".asInstanceOf[typings.wordpressBlockEditor.wordpressBlockEditorStrings.insert]
  }
}
