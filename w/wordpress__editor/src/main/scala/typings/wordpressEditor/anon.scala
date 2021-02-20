package typings.wordpressEditor

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.std.IterableIterator
import typings.std.Partial
import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Decontextualize
import typings.wordpressApiFetch.mod.Schema.PostOrPage
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressBlockEditor.anon.AjaxUrl
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.anon.Description
import typings.wordpressBlockEditor.anon.Index
import typings.wordpressBlockEditor.anon.IsLocked
import typings.wordpressBlockEditor.anon.OmitPropsname
import typings.wordpressBlockEditor.anon.PartialBlockInstancekstri
import typings.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typings.wordpressBlockEditor.mod.EditorBlockListSettings
import typings.wordpressBlockEditor.mod.EditorBlockMode
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressBlockEditor.mod.EditorImageSize
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressBlockEditor.mod.EditorSettings
import typings.wordpressBlockEditor.mod.EditorStyle
import typings.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.templatesMod.TemplateArray
import typings.wordpressCoreData.mod.Autosave
import typings.wordpressEditor.wordpressEditorNumbers.`-1`
import typings.wordpressEditor.wordpressEditorNumbers.`1`
import typings.wordpressEditor.wordpressEditorStrings.`object`
import typings.wordpressEditor.wordpressEditorStrings.`private`
import typings.wordpressEditor.wordpressEditorStrings.`var`
import typings.wordpressEditor.wordpressEditorStrings.a
import typings.wordpressEditor.wordpressEditorStrings.abbr
import typings.wordpressEditor.wordpressEditorStrings.address
import typings.wordpressEditor.wordpressEditorStrings.applet
import typings.wordpressEditor.wordpressEditorStrings.area
import typings.wordpressEditor.wordpressEditorStrings.article
import typings.wordpressEditor.wordpressEditorStrings.aside
import typings.wordpressEditor.wordpressEditorStrings.audio
import typings.wordpressEditor.wordpressEditorStrings.b
import typings.wordpressEditor.wordpressEditorStrings.base
import typings.wordpressEditor.wordpressEditorStrings.basefont
import typings.wordpressEditor.wordpressEditorStrings.bdi
import typings.wordpressEditor.wordpressEditorStrings.bdo
import typings.wordpressEditor.wordpressEditorStrings.blockquote
import typings.wordpressEditor.wordpressEditorStrings.body
import typings.wordpressEditor.wordpressEditorStrings.br
import typings.wordpressEditor.wordpressEditorStrings.button
import typings.wordpressEditor.wordpressEditorStrings.canvas
import typings.wordpressEditor.wordpressEditorStrings.caption
import typings.wordpressEditor.wordpressEditorStrings.cite
import typings.wordpressEditor.wordpressEditorStrings.code
import typings.wordpressEditor.wordpressEditorStrings.col
import typings.wordpressEditor.wordpressEditorStrings.colgroup
import typings.wordpressEditor.wordpressEditorStrings.data
import typings.wordpressEditor.wordpressEditorStrings.datalist
import typings.wordpressEditor.wordpressEditorStrings.dd
import typings.wordpressEditor.wordpressEditorStrings.del
import typings.wordpressEditor.wordpressEditorStrings.details
import typings.wordpressEditor.wordpressEditorStrings.dfn
import typings.wordpressEditor.wordpressEditorStrings.dialog
import typings.wordpressEditor.wordpressEditorStrings.dir
import typings.wordpressEditor.wordpressEditorStrings.div
import typings.wordpressEditor.wordpressEditorStrings.dl
import typings.wordpressEditor.wordpressEditorStrings.dt
import typings.wordpressEditor.wordpressEditorStrings.edit
import typings.wordpressEditor.wordpressEditorStrings.em
import typings.wordpressEditor.wordpressEditorStrings.embed
import typings.wordpressEditor.wordpressEditorStrings.fieldset
import typings.wordpressEditor.wordpressEditorStrings.figcaption
import typings.wordpressEditor.wordpressEditorStrings.figure
import typings.wordpressEditor.wordpressEditorStrings.font
import typings.wordpressEditor.wordpressEditorStrings.footer
import typings.wordpressEditor.wordpressEditorStrings.form
import typings.wordpressEditor.wordpressEditorStrings.frame
import typings.wordpressEditor.wordpressEditorStrings.frameset
import typings.wordpressEditor.wordpressEditorStrings.h1
import typings.wordpressEditor.wordpressEditorStrings.h2
import typings.wordpressEditor.wordpressEditorStrings.h3
import typings.wordpressEditor.wordpressEditorStrings.h4
import typings.wordpressEditor.wordpressEditorStrings.h5
import typings.wordpressEditor.wordpressEditorStrings.h6
import typings.wordpressEditor.wordpressEditorStrings.head
import typings.wordpressEditor.wordpressEditorStrings.header
import typings.wordpressEditor.wordpressEditorStrings.hgroup
import typings.wordpressEditor.wordpressEditorStrings.hr
import typings.wordpressEditor.wordpressEditorStrings.html
import typings.wordpressEditor.wordpressEditorStrings.i
import typings.wordpressEditor.wordpressEditorStrings.iframe
import typings.wordpressEditor.wordpressEditorStrings.img
import typings.wordpressEditor.wordpressEditorStrings.input
import typings.wordpressEditor.wordpressEditorStrings.ins
import typings.wordpressEditor.wordpressEditorStrings.kbd
import typings.wordpressEditor.wordpressEditorStrings.label
import typings.wordpressEditor.wordpressEditorStrings.legend
import typings.wordpressEditor.wordpressEditorStrings.li
import typings.wordpressEditor.wordpressEditorStrings.link
import typings.wordpressEditor.wordpressEditorStrings.main
import typings.wordpressEditor.wordpressEditorStrings.map
import typings.wordpressEditor.wordpressEditorStrings.mark
import typings.wordpressEditor.wordpressEditorStrings.marquee
import typings.wordpressEditor.wordpressEditorStrings.menu
import typings.wordpressEditor.wordpressEditorStrings.meta
import typings.wordpressEditor.wordpressEditorStrings.meter
import typings.wordpressEditor.wordpressEditorStrings.nav
import typings.wordpressEditor.wordpressEditorStrings.noscript
import typings.wordpressEditor.wordpressEditorStrings.ol
import typings.wordpressEditor.wordpressEditorStrings.optgroup
import typings.wordpressEditor.wordpressEditorStrings.option
import typings.wordpressEditor.wordpressEditorStrings.output
import typings.wordpressEditor.wordpressEditorStrings.p
import typings.wordpressEditor.wordpressEditorStrings.param
import typings.wordpressEditor.wordpressEditorStrings.password
import typings.wordpressEditor.wordpressEditorStrings.picture
import typings.wordpressEditor.wordpressEditorStrings.pre
import typings.wordpressEditor.wordpressEditorStrings.preview_link
import typings.wordpressEditor.wordpressEditorStrings.progress
import typings.wordpressEditor.wordpressEditorStrings.public
import typings.wordpressEditor.wordpressEditorStrings.q
import typings.wordpressEditor.wordpressEditorStrings.rp
import typings.wordpressEditor.wordpressEditorStrings.rt
import typings.wordpressEditor.wordpressEditorStrings.ruby
import typings.wordpressEditor.wordpressEditorStrings.s
import typings.wordpressEditor.wordpressEditorStrings.samp
import typings.wordpressEditor.wordpressEditorStrings.script
import typings.wordpressEditor.wordpressEditorStrings.section
import typings.wordpressEditor.wordpressEditorStrings.select
import typings.wordpressEditor.wordpressEditorStrings.slot
import typings.wordpressEditor.wordpressEditorStrings.small
import typings.wordpressEditor.wordpressEditorStrings.source
import typings.wordpressEditor.wordpressEditorStrings.span
import typings.wordpressEditor.wordpressEditorStrings.strong
import typings.wordpressEditor.wordpressEditorStrings.style
import typings.wordpressEditor.wordpressEditorStrings.sub
import typings.wordpressEditor.wordpressEditorStrings.summary
import typings.wordpressEditor.wordpressEditorStrings.sup
import typings.wordpressEditor.wordpressEditorStrings.table
import typings.wordpressEditor.wordpressEditorStrings.tbody
import typings.wordpressEditor.wordpressEditorStrings.td
import typings.wordpressEditor.wordpressEditorStrings.template
import typings.wordpressEditor.wordpressEditorStrings.textarea
import typings.wordpressEditor.wordpressEditorStrings.tfoot
import typings.wordpressEditor.wordpressEditorStrings.th
import typings.wordpressEditor.wordpressEditorStrings.thead
import typings.wordpressEditor.wordpressEditorStrings.time
import typings.wordpressEditor.wordpressEditorStrings.title
import typings.wordpressEditor.wordpressEditorStrings.tr
import typings.wordpressEditor.wordpressEditorStrings.track
import typings.wordpressEditor.wordpressEditorStrings.u
import typings.wordpressEditor.wordpressEditorStrings.ul
import typings.wordpressEditor.wordpressEditorStrings.video
import typings.wordpressEditor.wordpressEditorStrings.view
import typings.wordpressEditor.wordpressEditorStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorSettings> */
  @js.native
  trait PartialEditorSettings extends StObject {
    
    var alignWide: js.UndefOr[Boolean] = js.native
    
    var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.native
    
    var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.native
    
    var autosaveInterval: js.UndefOr[Double] = js.native
    
    var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.native
    
    var availableTemplates: js.UndefOr[js.Array[_]] = js.native
    
    var bodyPlaceholder: js.UndefOr[String] = js.native
    
    var codeEditingEnabled: js.UndefOr[Boolean] = js.native
    
    var colors: js.UndefOr[js.Array[EditorColor]] = js.native
    
    var disableCustomColors: js.UndefOr[Boolean] = js.native
    
    var disableCustomEditorFontSizes: js.UndefOr[Boolean] = js.native
    
    var disablePostFormats: js.UndefOr[Boolean] = js.native
    
    var enableCustomFields: js.UndefOr[Boolean] = js.native
    
    var focusMode: js.UndefOr[Boolean] = js.native
    
    var fontSizes: js.UndefOr[js.Array[EditorFontSize]] = js.native
    
    var hasFixedToolbar: js.UndefOr[Boolean] = js.native
    
    var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.native
    
    var imageSizes: js.UndefOr[js.Array[EditorImageSize]] = js.native
    
    var isRTL: js.UndefOr[Boolean] = js.native
    
    var maxUploadFileSize: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var postLock: js.UndefOr[IsLocked] = js.native
    
    var postLockUtils: js.UndefOr[AjaxUrl] = js.native
    
    var richEditingEnabled: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[js.Array[EditorStyle]] = js.native
    
    var titlePlaceholder: js.UndefOr[String] = js.native
  }
  object PartialEditorSettings {
    
    @scala.inline
    def apply(): PartialEditorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEditorSettings]
    }
    
    @scala.inline
    implicit class PartialEditorSettingsMutableBuilder[Self <: PartialEditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesUndefined: Self = StObject.set(x, "allowedBlockTypes", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAllowedMimeTypesUndefined: Self = StObject.set(x, "allowedMimeTypes", js.undefined)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsUndefined: Self = StObject.set(x, "availableLegacyWidgets", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[_]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesUndefined: Self = StObject.set(x, "availableTemplates", js.undefined)
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPlaceholderUndefined: Self = StObject.set(x, "bodyPlaceholder", js.undefined)
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabledUndefined: Self = StObject.set(x, "codeEditingEnabled", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
      
      @scala.inline
      def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomEditorFontSizesUndefined: Self = StObject.set(x, "disableCustomEditorFontSizes", js.undefined)
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormatsUndefined: Self = StObject.set(x, "disablePostFormats", js.undefined)
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFieldsUndefined: Self = StObject.set(x, "enableCustomFields", js.undefined)
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
      
      @scala.inline
      def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      @scala.inline
      def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFixedToolbarUndefined: Self = StObject.set(x, "hasFixedToolbar", js.undefined)
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgetsUndefined: Self = StObject.set(x, "hasPermissionsToManageWidgets", js.undefined)
      
      @scala.inline
      def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
      
      @scala.inline
      def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSizeUndefined: Self = StObject.set(x, "maxUploadFileSize", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUndefined: Self = StObject.set(x, "postLock", js.undefined)
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtilsUndefined: Self = StObject.set(x, "postLockUtils", js.undefined)
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabledUndefined: Self = StObject.set(x, "richEditingEnabled", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  @js.native
  trait PostName extends StObject {
    
    var postName: String = js.native
    
    var prefix: String = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object PostName {
    
    @scala.inline
    def apply(postName: String, prefix: String): PostName = {
      val __obj = js.Dynamic.literal(postName = postName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostName]
    }
    
    @scala.inline
    implicit class PostNameMutableBuilder[Self <: PostName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostName(value: String): Self = StObject.set(x, "postName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(props: Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApply extends StObject {
    
    def apply(props: typings.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApplySlot extends StObject {
    
    def apply(props: typings.wordpressBlockEditor.inspectorControlsMod.InspectorControls.Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofButtonBlockerAppender extends StObject {
    
    def apply(props: typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props): Element = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    var ButtonBlockerAppender: ComponentType[Children] = js.native
    
    var Content: ComponentType[Children] = js.native
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    var DefaultBlockAppender: ComponentType[Children] = js.native
  }
  
  @js.native
  trait TypeofContent extends StObject {
    
    def apply(
      props: typings.wordpressBlockEditor.richTextMod.RichText.Props[
          a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSName("Content")
    def Content_a(props: ContentProps[a]): Element = js.native
    @JSName("Content")
    def Content_abbr(props: ContentProps[abbr]): Element = js.native
    @JSName("Content")
    def Content_address(props: ContentProps[address]): Element = js.native
    @JSName("Content")
    def Content_applet(props: ContentProps[applet]): Element = js.native
    @JSName("Content")
    def Content_area(props: ContentProps[area]): Element = js.native
    @JSName("Content")
    def Content_article(props: ContentProps[article]): Element = js.native
    @JSName("Content")
    def Content_aside(props: ContentProps[aside]): Element = js.native
    @JSName("Content")
    def Content_audio(props: ContentProps[audio]): Element = js.native
    @JSName("Content")
    def Content_b(props: ContentProps[b]): Element = js.native
    @JSName("Content")
    def Content_base(props: ContentProps[base]): Element = js.native
    @JSName("Content")
    def Content_basefont(props: ContentProps[basefont]): Element = js.native
    @JSName("Content")
    def Content_bdi(props: ContentProps[bdi]): Element = js.native
    @JSName("Content")
    def Content_bdo(props: ContentProps[bdo]): Element = js.native
    @JSName("Content")
    def Content_blockquote(props: ContentProps[blockquote]): Element = js.native
    @JSName("Content")
    def Content_body(props: ContentProps[body]): Element = js.native
    @JSName("Content")
    def Content_br(props: ContentProps[br]): Element = js.native
    @JSName("Content")
    def Content_button(props: ContentProps[button]): Element = js.native
    @JSName("Content")
    def Content_canvas(props: ContentProps[canvas]): Element = js.native
    @JSName("Content")
    def Content_caption(props: ContentProps[caption]): Element = js.native
    @JSName("Content")
    def Content_cite(props: ContentProps[cite]): Element = js.native
    @JSName("Content")
    def Content_code(props: ContentProps[code]): Element = js.native
    @JSName("Content")
    def Content_col(props: ContentProps[col]): Element = js.native
    @JSName("Content")
    def Content_colgroup(props: ContentProps[colgroup]): Element = js.native
    @JSName("Content")
    def Content_data(props: ContentProps[data]): Element = js.native
    @JSName("Content")
    def Content_datalist(props: ContentProps[datalist]): Element = js.native
    @JSName("Content")
    def Content_dd(props: ContentProps[dd]): Element = js.native
    @JSName("Content")
    def Content_del(props: ContentProps[del]): Element = js.native
    @JSName("Content")
    def Content_details(props: ContentProps[details]): Element = js.native
    @JSName("Content")
    def Content_dfn(props: ContentProps[dfn]): Element = js.native
    @JSName("Content")
    def Content_dialog(props: ContentProps[dialog]): Element = js.native
    @JSName("Content")
    def Content_dir(props: ContentProps[dir]): Element = js.native
    @JSName("Content")
    def Content_div(props: ContentProps[div]): Element = js.native
    @JSName("Content")
    def Content_dl(props: ContentProps[dl]): Element = js.native
    @JSName("Content")
    def Content_dt(props: ContentProps[dt]): Element = js.native
    @JSName("Content")
    def Content_em(props: ContentProps[em]): Element = js.native
    @JSName("Content")
    def Content_embed(props: ContentProps[embed]): Element = js.native
    @JSName("Content")
    def Content_fieldset(props: ContentProps[fieldset]): Element = js.native
    @JSName("Content")
    def Content_figcaption(props: ContentProps[figcaption]): Element = js.native
    @JSName("Content")
    def Content_figure(props: ContentProps[figure]): Element = js.native
    @JSName("Content")
    def Content_font(props: ContentProps[font]): Element = js.native
    @JSName("Content")
    def Content_footer(props: ContentProps[footer]): Element = js.native
    @JSName("Content")
    def Content_form(props: ContentProps[form]): Element = js.native
    @JSName("Content")
    def Content_frame(props: ContentProps[frame]): Element = js.native
    @JSName("Content")
    def Content_frameset(props: ContentProps[frameset]): Element = js.native
    @JSName("Content")
    def Content_h1(props: ContentProps[h1]): Element = js.native
    @JSName("Content")
    def Content_h2(props: ContentProps[h2]): Element = js.native
    @JSName("Content")
    def Content_h3(props: ContentProps[h3]): Element = js.native
    @JSName("Content")
    def Content_h4(props: ContentProps[h4]): Element = js.native
    @JSName("Content")
    def Content_h5(props: ContentProps[h5]): Element = js.native
    @JSName("Content")
    def Content_h6(props: ContentProps[h6]): Element = js.native
    @JSName("Content")
    def Content_head(props: ContentProps[head]): Element = js.native
    @JSName("Content")
    def Content_header(props: ContentProps[header]): Element = js.native
    @JSName("Content")
    def Content_hgroup(props: ContentProps[hgroup]): Element = js.native
    @JSName("Content")
    def Content_hr(props: ContentProps[hr]): Element = js.native
    @JSName("Content")
    def Content_html(props: ContentProps[html]): Element = js.native
    @JSName("Content")
    def Content_i(props: ContentProps[i]): Element = js.native
    @JSName("Content")
    def Content_iframe(props: ContentProps[iframe]): Element = js.native
    @JSName("Content")
    def Content_img(props: ContentProps[img]): Element = js.native
    @JSName("Content")
    def Content_input(props: ContentProps[input]): Element = js.native
    @JSName("Content")
    def Content_ins(props: ContentProps[ins]): Element = js.native
    @JSName("Content")
    def Content_kbd(props: ContentProps[kbd]): Element = js.native
    @JSName("Content")
    def Content_label(props: ContentProps[label]): Element = js.native
    @JSName("Content")
    def Content_legend(props: ContentProps[legend]): Element = js.native
    @JSName("Content")
    def Content_li(props: ContentProps[li]): Element = js.native
    @JSName("Content")
    def Content_link(props: ContentProps[link]): Element = js.native
    @JSName("Content")
    def Content_main(props: ContentProps[main]): Element = js.native
    @JSName("Content")
    def Content_map(props: ContentProps[map]): Element = js.native
    @JSName("Content")
    def Content_mark(props: ContentProps[mark]): Element = js.native
    @JSName("Content")
    def Content_marquee(props: ContentProps[marquee]): Element = js.native
    @JSName("Content")
    def Content_menu(props: ContentProps[menu]): Element = js.native
    @JSName("Content")
    def Content_meta(props: ContentProps[meta]): Element = js.native
    @JSName("Content")
    def Content_meter(props: ContentProps[meter]): Element = js.native
    @JSName("Content")
    def Content_nav(props: ContentProps[nav]): Element = js.native
    @JSName("Content")
    def Content_noscript(props: ContentProps[noscript]): Element = js.native
    @JSName("Content")
    def Content_object(props: ContentProps[`object`]): Element = js.native
    @JSName("Content")
    def Content_ol(props: ContentProps[ol]): Element = js.native
    @JSName("Content")
    def Content_optgroup(props: ContentProps[optgroup]): Element = js.native
    @JSName("Content")
    def Content_option(props: ContentProps[option]): Element = js.native
    @JSName("Content")
    def Content_output(props: ContentProps[output]): Element = js.native
    @JSName("Content")
    def Content_p(props: ContentProps[p]): Element = js.native
    @JSName("Content")
    def Content_param(props: ContentProps[param]): Element = js.native
    @JSName("Content")
    def Content_picture(props: ContentProps[picture]): Element = js.native
    @JSName("Content")
    def Content_pre(props: ContentProps[pre]): Element = js.native
    @JSName("Content")
    def Content_progress(props: ContentProps[progress]): Element = js.native
    @JSName("Content")
    def Content_q(props: ContentProps[q]): Element = js.native
    @JSName("Content")
    def Content_rp(props: ContentProps[rp]): Element = js.native
    @JSName("Content")
    def Content_rt(props: ContentProps[rt]): Element = js.native
    @JSName("Content")
    def Content_ruby(props: ContentProps[ruby]): Element = js.native
    @JSName("Content")
    def Content_s(props: ContentProps[s]): Element = js.native
    @JSName("Content")
    def Content_samp(props: ContentProps[samp]): Element = js.native
    @JSName("Content")
    def Content_script(props: ContentProps[script]): Element = js.native
    @JSName("Content")
    def Content_section(props: ContentProps[section]): Element = js.native
    @JSName("Content")
    def Content_select(props: ContentProps[select]): Element = js.native
    @JSName("Content")
    def Content_slot(props: ContentProps[slot]): Element = js.native
    @JSName("Content")
    def Content_small(props: ContentProps[small]): Element = js.native
    @JSName("Content")
    def Content_source(props: ContentProps[source]): Element = js.native
    @JSName("Content")
    def Content_span(props: ContentProps[span]): Element = js.native
    @JSName("Content")
    def Content_strong(props: ContentProps[strong]): Element = js.native
    @JSName("Content")
    def Content_style(props: ContentProps[style]): Element = js.native
    @JSName("Content")
    def Content_sub(props: ContentProps[sub]): Element = js.native
    @JSName("Content")
    def Content_summary(props: ContentProps[summary]): Element = js.native
    @JSName("Content")
    def Content_sup(props: ContentProps[sup]): Element = js.native
    @JSName("Content")
    def Content_table(props: ContentProps[table]): Element = js.native
    @JSName("Content")
    def Content_tbody(props: ContentProps[tbody]): Element = js.native
    @JSName("Content")
    def Content_td(props: ContentProps[td]): Element = js.native
    @JSName("Content")
    def Content_template(props: ContentProps[template]): Element = js.native
    @JSName("Content")
    def Content_textarea(props: ContentProps[textarea]): Element = js.native
    @JSName("Content")
    def Content_tfoot(props: ContentProps[tfoot]): Element = js.native
    @JSName("Content")
    def Content_th(props: ContentProps[th]): Element = js.native
    @JSName("Content")
    def Content_thead(props: ContentProps[thead]): Element = js.native
    @JSName("Content")
    def Content_time(props: ContentProps[time]): Element = js.native
    @JSName("Content")
    def Content_title(props: ContentProps[title]): Element = js.native
    @JSName("Content")
    def Content_tr(props: ContentProps[tr]): Element = js.native
    @JSName("Content")
    def Content_track(props: ContentProps[track]): Element = js.native
    @JSName("Content")
    def Content_u(props: ContentProps[u]): Element = js.native
    @JSName("Content")
    def Content_ul(props: ContentProps[ul]): Element = js.native
    @JSName("Content")
    def Content_var(props: ContentProps[`var`]): Element = js.native
    @JSName("Content")
    def Content_video(props: ContentProps[video]): Element = js.native
    @JSName("Content")
    def Content_wbr(props: ContentProps[wbr]): Element = js.native
    
    def isEmpty(value: String): Boolean = js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  @js.native
  trait TypeofSlot extends StObject {
    
    def apply(props: typings.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def autosave(): IterableIterator[Unit] = js.native
    def autosave(options: Record[String, Boolean]): IterableIterator[Unit] = js.native
    
    def clearSelectedBlock(): Unit = js.native
    
    def createUndoLevel(): Unit = js.native
    
    def disablePublishSidebar(): Unit = js.native
    
    def editPost(edits: Record[String, _]): Unit = js.native
    
    def enablePublishSidebar(): Unit = js.native
    
    def enterFormattedText(): Unit = js.native
    
    def exitFormattedText(): Unit = js.native
    
    def hideInsertionPoint(): Unit = js.native
    
    def insertBlock(block: BlockInstance[StringDictionary[_]]): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: Double,
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double, rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: Double,
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double, rootClientId: String): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    
    def insertDefaultBlock(): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String, index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _]): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: String, index: Double): Unit = js.native
    
    def lockPostSaving(lockName: String): Unit = js.native
    
    def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = js.native
    
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: String,
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: String,
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: String,
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    
    def moveBlocksDown(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def moveBlocksUp(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def multiSelect(start: String, end: String): Unit = js.native
    
    def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    
    def redo(): Unit = js.native
    
    def refreshPost(): IterableIterator[Unit] = js.native
    
    def removeBlock(clientId: String): Unit = js.native
    def removeBlock(clientId: String, selectPrevious: Boolean): Unit = js.native
    
    def removeBlocks(clientIds: String): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = js.native
    
    def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[_]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[_]]): Unit = js.native
    
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(
      clientIds: js.Array[String],
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      indexToSelect: Double
    ): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
    
    def resetAutosave(newAutosave: Autosave): IterableIterator[Unit] = js.native
    
    def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], options: Record[String, _]): IterableIterator[Unit] = js.native
    
    def resetPost(post: Record[String, _]): Unit = js.native
    
    def savePost(): IterableIterator[Unit] = js.native
    def savePost(options: Record[String, _]): IterableIterator[Unit] = js.native
    
    def selectBlock(clientId: String): Unit = js.native
    def selectBlock(clientId: String, initialPosition: Double): Unit = js.native
    
    def setTemplateValidity(isValid: Boolean): Unit = js.native
    
    def setupEditor(post: Record[String, _]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: js.UndefOr[scala.Nothing], template: TemplateArray): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: Record[String, _]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: Record[String, _], template: TemplateArray): IterableIterator[Unit] = js.native
    
    def setupEditorState(post: Record[String, _]): Unit = js.native
    
    def showInsertionPoint(): Unit = js.native
    def showInsertionPoint(rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def showInsertionPoint(rootClientId: String): Unit = js.native
    def showInsertionPoint(rootClientId: String, index: Double): Unit = js.native
    
    def startMultiSelect(): Unit = js.native
    
    def startTyping(): Unit = js.native
    
    def stopMultiSelect(): Unit = js.native
    
    def stopTyping(): Unit = js.native
    
    def synchronizeTemplate(): Unit = js.native
    
    def toggleBlockMode(clientId: String): Unit = js.native
    
    def toggleSelection(): Unit = js.native
    def toggleSelection(isSelectionEnabled: Boolean): Unit = js.native
    
    def trashPost(): IterableIterator[Unit] = js.native
    
    def undo(): Unit = js.native
    
    def unlockPostSaving(lockName: String): Unit = js.native
    
    def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = js.native
    
    def updateBlockAttributes(clientId: String, attributes: Record[String, _]): Unit = js.native
    
    def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = js.native
    
    def updateEditorSettings(settings: PartialEditorSettings): Unit = js.native
    
    def updatePost(edits: Record[String, _]): Unit = js.native
    
    def updatePostLock(lock: IsLocked): Unit = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def canInsertBlockType(blockName: String): Boolean = js.native
    def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
    
    def canUserUseUnfilteredHTML(): Boolean = js.native
    
    def didPostSaveRequestFail(): Boolean = js.native
    
    def didPostSaveRequestSucceed(): Boolean = js.native
    
    def getActivePostLock(): js.UndefOr[String] = js.native
    
    def getAdjacentBlockClientId(): String | Null = js.native
    def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `-1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = js.native
    
    def getAutosave(): Autosave | js.Object = js.native
    
    @JSName("getAutosaveAttribute")
    def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = js.native
    
    def getBlock(clientId: String): BlockInstance[StringDictionary[_]] | Null = js.native
    
    def getBlockAttributes(clientId: String): (Record[String, _]) | Null = js.native
    
    def getBlockCount(): Double = js.native
    def getBlockCount(rootClientId: String): Double = js.native
    
    def getBlockHierarchyRootClientId(clientId: String): String = js.native
    
    def getBlockIndex(clientId: String): Double = js.native
    def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
    
    def getBlockInsertionPoint(): Index = js.native
    
    def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
    def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
    
    def getBlockMode(clientId: String): EditorBlockMode = js.native
    
    def getBlockName(clientId: String): String | Null = js.native
    
    def getBlockOrder(): js.Array[String] = js.native
    def getBlockOrder(rootClientId: String): js.Array[String] = js.native
    
    def getBlockRootClientId(clientId: String): String | Null = js.native
    
    def getBlockSelectionEnd(): js.UndefOr[String] = js.native
    
    def getBlockSelectionStart(): js.UndefOr[String] = js.native
    
    def getBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
    def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
    
    def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
    
    def getClientIdsWithDescendants(): js.Array[String] = js.native
    
    def getCurrentPost(): Decontextualize[PostOrPage[edit]] = js.native
    
    def getCurrentPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getCurrentPostId(): Double = js.native
    
    def getCurrentPostLastRevisionId(): Double | Null = js.native
    
    def getCurrentPostRevisionsCount(): Double = js.native
    
    def getCurrentPostType(): String = js.native
    
    def getEditedPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getEditedPostContent(): String = js.native
    
    def getEditedPostPreviewLink(): String | Null = js.native
    
    def getEditedPostVisibility(): password | `private` | public = js.native
    
    def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getEditorSettings(): EditorSettings = js.native
    
    def getFirstMultiSelectedBlockClientId(): String | Null = js.native
    
    def getGlobalBlockCount(): Double = js.native
    def getGlobalBlockCount(blockName: String): Double = js.native
    
    def getInserterItems(): js.Array[EditorInserterItem] = js.native
    def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
    
    def getLastMultiSelectedBlockClientId(): String | Null = js.native
    
    def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
    
    def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getMultiSelectedBlocksEndClientId(): String | Null = js.native
    
    def getMultiSelectedBlocksStartClientId(): String | Null = js.native
    
    def getNextBlockClientId(): String | Null = js.native
    def getNextBlockClientId(startClientId: String): String | Null = js.native
    
    def getPermalink(): String | Null = js.native
    
    def getPermalinkParts(): PostName | Null = js.native
    
    def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = js.native
    
    def getPostLockUser(): js.UndefOr[User[view] | Null] = js.native
    
    def getPreviousBlockClientId(): String | Null = js.native
    def getPreviousBlockClientId(startClientId: String): String | Null = js.native
    
    def getReferenceByDistinctEdits(): js.Array[js.Any] = js.native
    
    def getSelectedBlock(): BlockInstance[StringDictionary[_]] | Null = js.native
    
    def getSelectedBlockClientId(): String | Null = js.native
    
    def getSelectedBlockCount(): Double = js.native
    
    def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
    
    def getStateBeforeOptimisticTransaction(transactionId: js.Object): js.Any = js.native
    
    def getSuggestedPostFormat(): String | Null = js.native
    
    def getTemplate(): js.Any = js.native
    
    def getTemplateLock(): js.UndefOr[String] = js.native
    def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
    
    def hasAutosave(): Boolean = js.native
    
    def hasChangedContent(): Boolean = js.native
    
    def hasEditorRedo(): Boolean = js.native
    
    def hasEditorUndo(): Boolean = js.native
    
    def hasInserterItems(): Boolean = js.native
    def hasInserterItems(rootClientId: String): Boolean = js.native
    
    def hasMultiSelection(): Boolean = js.native
    
    def hasSelectedBlock(): Boolean = js.native
    
    def hasSelectedInnerBlock(clientId: String): Boolean = js.native
    def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
    
    def inSomeHistory(predicate: js.Function1[/* state */ Record[String, _], Boolean]): Boolean = js.native
    
    def isAncestorMultiSelected(clientId: String): Boolean = js.native
    
    def isAutosavingPost(): Boolean = js.native
    
    def isBlockInsertionPointVisible(): Boolean = js.native
    
    def isBlockMultiSelected(clientId: String): Boolean = js.native
    
    def isBlockSelected(clientId: String): Boolean = js.native
    
    def isBlockValid(clientId: String): Boolean = js.native
    
    def isBlockWithinSelection(clientId: String): Boolean = js.native
    
    def isCaretWithinFormattedText(): Boolean = js.native
    
    def isCleanNewPost(): Boolean = js.native
    
    def isCurrentPostPending(): Boolean = js.native
    
    def isCurrentPostPublished(): Boolean = js.native
    
    def isCurrentPostScheduled(): Boolean = js.native
    
    def isEditedPostAutosaveable(): Boolean = js.native
    
    def isEditedPostBeingScheduled(): Boolean = js.native
    
    def isEditedPostDateFloating(): Boolean = js.native
    
    def isEditedPostDirty(): Boolean = js.native
    
    def isEditedPostEmpty(): Boolean = js.native
    
    def isEditedPostNew(): Boolean = js.native
    
    def isEditedPostPublishable(): Boolean = js.native
    
    def isEditedPostSaveable(): Boolean = js.native
    
    def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
    
    def isMultiSelecting(): Boolean = js.native
    
    def isPermalinkEditable(): Boolean = js.native
    
    def isPostLockTakeover(): Boolean = js.native
    
    def isPostLocked(): Boolean = js.native
    
    def isPostSavingLocked(): Boolean = js.native
    
    def isPreviewingPost(): Boolean = js.native
    
    def isPublishSidebarEnabled(): Boolean = js.native
    
    def isPublishingPost(): Boolean = js.native
    
    def isSavingPost(): Boolean = js.native
    
    def isSelectionEnabled(): Boolean = js.native
    
    def isTyping(): Boolean = js.native
    
    def isValidTemplate(): Boolean = js.native
  }
}
