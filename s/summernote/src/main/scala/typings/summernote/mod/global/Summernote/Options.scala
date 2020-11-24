package typings.summernote.mod.global.Summernote

import typings.summernote.summernoteStrings.color
import typings.summernote.summernoteStrings.font
import typings.summernote.summernoteStrings.fontsize_
import typings.summernote.summernoteStrings.height
import typings.summernote.summernoteStrings.help
import typings.summernote.summernoteStrings.insert
import typings.summernote.summernoteStrings.misc
import typings.summernote.summernoteStrings.para
import typings.summernote.summernoteStrings.style
import typings.summernote.summernoteStrings.table
import typings.summernote.summernoteStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var airMode: js.UndefOr[Boolean] = js.native
  
  var callbacks: js.UndefOr[js.Any] = js.native
  
   // todo
  var codemirror: js.UndefOr[CodemirrorOptions] = js.native
  
  var codeviewFilter: js.UndefOr[Boolean] = js.native
  
  var codeviewFilterRegex: js.UndefOr[String] = js.native
  
  var codeviewIframeFilter: js.UndefOr[Boolean] = js.native
  
  var codeviewIframeWhitelistSrc: js.UndefOr[js.Array[String]] = js.native
  
  var colors: js.UndefOr[colorsDef] = js.native
  
  var dialogsFade: js.UndefOr[Boolean] = js.native
  
  var dialogsInBody: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var disableDragAndDrop: js.UndefOr[Boolean] = js.native
  
  var focus: js.UndefOr[Boolean] = js.native
  
  var fontNames: js.UndefOr[js.Array[String]] = js.native
  
  var fontNamesIgnoreCheck: js.UndefOr[js.Array[String]] = js.native
  
  var fontSizeUnits: js.UndefOr[js.Array[fontSizeUnitOptions]] = js.native
  
  var fontSizes: js.UndefOr[js.Array[String]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hint: js.UndefOr[HintOptions] = js.native
  
  var icons: js.UndefOr[IconsOptions] = js.native
  
  var insertTableMaxSize: js.UndefOr[InsertTableMaxSizeOptions] = js.native
  
  var keyMap: js.UndefOr[KeyMapOptions] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var lineHeights: js.UndefOr[js.Array[String]] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maximumImageFileSize: js.UndefOr[js.Any] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var modules: js.UndefOr[ModuleOptions] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popover: js.UndefOr[PopoverOptions] = js.native
  
  var shortcuts: js.UndefOr[Boolean] = js.native
  
  var styleTags: js.UndefOr[js.Array[styleTagsOptions]] = js.native
  
  var styleWithSpan: js.UndefOr[Boolean] = js.native
  
  var tabDisable: js.UndefOr[Boolean] = js.native
  
  var tableClassName: js.UndefOr[String] = js.native
  
  var tabsize: js.UndefOr[Double] = js.native
  
  var textareaAutoSync: js.UndefOr[Boolean] = js.native
  
  var toolbar: js.UndefOr[toolbarDef] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAirMode(value: Boolean): Self = this.set("airMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAirMode: Self = this.set("airMode", js.undefined)
    
    @scala.inline
    def setCallbacks(value: js.Any): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setCodemirror(value: CodemirrorOptions): Self = this.set("codemirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodemirror: Self = this.set("codemirror", js.undefined)
    
    @scala.inline
    def setCodeviewFilter(value: Boolean): Self = this.set("codeviewFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeviewFilter: Self = this.set("codeviewFilter", js.undefined)
    
    @scala.inline
    def setCodeviewFilterRegex(value: String): Self = this.set("codeviewFilterRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeviewFilterRegex: Self = this.set("codeviewFilterRegex", js.undefined)
    
    @scala.inline
    def setCodeviewIframeFilter(value: Boolean): Self = this.set("codeviewIframeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeviewIframeFilter: Self = this.set("codeviewIframeFilter", js.undefined)
    
    @scala.inline
    def setCodeviewIframeWhitelistSrcVarargs(value: String*): Self = this.set("codeviewIframeWhitelistSrc", js.Array(value :_*))
    
    @scala.inline
    def setCodeviewIframeWhitelistSrc(value: js.Array[String]): Self = this.set("codeviewIframeWhitelistSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeviewIframeWhitelistSrc: Self = this.set("codeviewIframeWhitelistSrc", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Array[js.Array[String]]*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: colorsDef): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDialogsFade(value: Boolean): Self = this.set("dialogsFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogsFade: Self = this.set("dialogsFade", js.undefined)
    
    @scala.inline
    def setDialogsInBody(value: Boolean): Self = this.set("dialogsInBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogsInBody: Self = this.set("dialogsInBody", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisableDragAndDrop(value: Boolean): Self = this.set("disableDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDragAndDrop: Self = this.set("disableDragAndDrop", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFontNamesVarargs(value: String*): Self = this.set("fontNames", js.Array(value :_*))
    
    @scala.inline
    def setFontNames(value: js.Array[String]): Self = this.set("fontNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontNames: Self = this.set("fontNames", js.undefined)
    
    @scala.inline
    def setFontNamesIgnoreCheckVarargs(value: String*): Self = this.set("fontNamesIgnoreCheck", js.Array(value :_*))
    
    @scala.inline
    def setFontNamesIgnoreCheck(value: js.Array[String]): Self = this.set("fontNamesIgnoreCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontNamesIgnoreCheck: Self = this.set("fontNamesIgnoreCheck", js.undefined)
    
    @scala.inline
    def setFontSizeUnitsVarargs(value: fontSizeUnitOptions*): Self = this.set("fontSizeUnits", js.Array(value :_*))
    
    @scala.inline
    def setFontSizeUnits(value: js.Array[fontSizeUnitOptions]): Self = this.set("fontSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeUnits: Self = this.set("fontSizeUnits", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(value: String*): Self = this.set("fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setFontSizes(value: js.Array[String]): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHint(value: HintOptions): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setIcons(value: IconsOptions): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setInsertTableMaxSize(value: InsertTableMaxSizeOptions): Self = this.set("insertTableMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableMaxSize: Self = this.set("insertTableMaxSize", js.undefined)
    
    @scala.inline
    def setKeyMap(value: KeyMapOptions): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(value: String*): Self = this.set("lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setLineHeights(value: js.Array[String]): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaximumImageFileSize(value: js.Any): Self = this.set("maximumImageFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumImageFileSize: Self = this.set("maximumImageFileSize", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleOptions): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopover(value: PopoverOptions): Self = this.set("popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
    
    @scala.inline
    def setShortcuts(value: Boolean): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    
    @scala.inline
    def setStyleTagsVarargs(value: styleTagsOptions*): Self = this.set("styleTags", js.Array(value :_*))
    
    @scala.inline
    def setStyleTags(value: js.Array[styleTagsOptions]): Self = this.set("styleTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleTags: Self = this.set("styleTags", js.undefined)
    
    @scala.inline
    def setStyleWithSpan(value: Boolean): Self = this.set("styleWithSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleWithSpan: Self = this.set("styleWithSpan", js.undefined)
    
    @scala.inline
    def setTabDisable(value: Boolean): Self = this.set("tabDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDisable: Self = this.set("tabDisable", js.undefined)
    
    @scala.inline
    def setTableClassName(value: String): Self = this.set("tableClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableClassName: Self = this.set("tableClassName", js.undefined)
    
    @scala.inline
    def setTabsize(value: Double): Self = this.set("tabsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsize: Self = this.set("tabsize", js.undefined)
    
    @scala.inline
    def setTextareaAutoSync(value: Boolean): Self = this.set("textareaAutoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextareaAutoSync: Self = this.set("textareaAutoSync", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(
      value: (js.Tuple2[
          style | font | fontsize_ | color | para | height | table | insert | view | help | misc, 
          js.Array[
            miscGroupOptions | toolbarColorGroupOptions | toolbarFontGroupOptions | toolbarFontsizeGroupOptions | toolbarHeightGroupOptions | toolbarHelpGroupOptions | toolbarInsertGroupOptions | toolbarParaGroupOptions | toolbarStyleGroupOptions | toolbarTableGroupOptions | toolbarViewGroupOptions
          ]
        ])*
    ): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: toolbarDef): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
