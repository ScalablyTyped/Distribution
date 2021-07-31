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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var airMode: js.UndefOr[Boolean] = js.undefined
  
  var callbacks: js.UndefOr[js.Any] = js.undefined
  
  // todo
  var codemirror: js.UndefOr[CodemirrorOptions] = js.undefined
  
  var codeviewFilter: js.UndefOr[Boolean] = js.undefined
  
  var codeviewFilterRegex: js.UndefOr[String] = js.undefined
  
  var codeviewIframeFilter: js.UndefOr[Boolean] = js.undefined
  
  var codeviewIframeWhitelistSrc: js.UndefOr[js.Array[String]] = js.undefined
  
  var colors: js.UndefOr[colorsDef] = js.undefined
  
  var dialogsFade: js.UndefOr[Boolean] = js.undefined
  
  var dialogsInBody: js.UndefOr[Boolean] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var disableDragAndDrop: js.UndefOr[Boolean] = js.undefined
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var fontNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontNamesIgnoreCheck: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontSizeUnits: js.UndefOr[js.Array[fontSizeUnitOptions]] = js.undefined
  
  var fontSizes: js.UndefOr[js.Array[String]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hint: js.UndefOr[HintOptions] = js.undefined
  
  var icons: js.UndefOr[IconsOptions] = js.undefined
  
  var insertTableMaxSize: js.UndefOr[InsertTableMaxSizeOptions] = js.undefined
  
  var keyMap: js.UndefOr[KeyMapOptions] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var lineHeights: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maximumImageFileSize: js.UndefOr[js.Any] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var modules: js.UndefOr[ModuleOptions] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var popover: js.UndefOr[PopoverOptions] = js.undefined
  
  var shortcuts: js.UndefOr[Boolean] = js.undefined
  
  var styleTags: js.UndefOr[js.Array[styleTagsOptions]] = js.undefined
  
  var styleWithSpan: js.UndefOr[Boolean] = js.undefined
  
  var tabDisable: js.UndefOr[Boolean] = js.undefined
  
  var tableClassName: js.UndefOr[String] = js.undefined
  
  var tabsize: js.UndefOr[Double] = js.undefined
  
  var textareaAutoSync: js.UndefOr[Boolean] = js.undefined
  
  var toolbar: js.UndefOr[toolbarDef] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAirMode(value: Boolean): Self = StObject.set(x, "airMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirModeUndefined: Self = StObject.set(x, "airMode", js.undefined)
    
    @scala.inline
    def setCallbacks(value: js.Any): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    @scala.inline
    def setCodemirror(value: CodemirrorOptions): Self = StObject.set(x, "codemirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodemirrorUndefined: Self = StObject.set(x, "codemirror", js.undefined)
    
    @scala.inline
    def setCodeviewFilter(value: Boolean): Self = StObject.set(x, "codeviewFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeviewFilterRegex(value: String): Self = StObject.set(x, "codeviewFilterRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeviewFilterRegexUndefined: Self = StObject.set(x, "codeviewFilterRegex", js.undefined)
    
    @scala.inline
    def setCodeviewFilterUndefined: Self = StObject.set(x, "codeviewFilter", js.undefined)
    
    @scala.inline
    def setCodeviewIframeFilter(value: Boolean): Self = StObject.set(x, "codeviewIframeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeviewIframeFilterUndefined: Self = StObject.set(x, "codeviewIframeFilter", js.undefined)
    
    @scala.inline
    def setCodeviewIframeWhitelistSrc(value: js.Array[String]): Self = StObject.set(x, "codeviewIframeWhitelistSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeviewIframeWhitelistSrcUndefined: Self = StObject.set(x, "codeviewIframeWhitelistSrc", js.undefined)
    
    @scala.inline
    def setCodeviewIframeWhitelistSrcVarargs(value: String*): Self = StObject.set(x, "codeviewIframeWhitelistSrc", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: colorsDef): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Array[js.Array[String]]*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setDialogsFade(value: Boolean): Self = StObject.set(x, "dialogsFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsFadeUndefined: Self = StObject.set(x, "dialogsFade", js.undefined)
    
    @scala.inline
    def setDialogsInBody(value: Boolean): Self = StObject.set(x, "dialogsInBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsInBodyUndefined: Self = StObject.set(x, "dialogsInBody", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisableDragAndDrop(value: Boolean): Self = StObject.set(x, "disableDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDragAndDropUndefined: Self = StObject.set(x, "disableDragAndDrop", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFontNames(value: js.Array[String]): Self = StObject.set(x, "fontNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNamesIgnoreCheck(value: js.Array[String]): Self = StObject.set(x, "fontNamesIgnoreCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNamesIgnoreCheckUndefined: Self = StObject.set(x, "fontNamesIgnoreCheck", js.undefined)
    
    @scala.inline
    def setFontNamesIgnoreCheckVarargs(value: String*): Self = StObject.set(x, "fontNamesIgnoreCheck", js.Array(value :_*))
    
    @scala.inline
    def setFontNamesUndefined: Self = StObject.set(x, "fontNames", js.undefined)
    
    @scala.inline
    def setFontNamesVarargs(value: String*): Self = StObject.set(x, "fontNames", js.Array(value :_*))
    
    @scala.inline
    def setFontSizeUnits(value: js.Array[fontSizeUnitOptions]): Self = StObject.set(x, "fontSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUnitsUndefined: Self = StObject.set(x, "fontSizeUnits", js.undefined)
    
    @scala.inline
    def setFontSizeUnitsVarargs(value: fontSizeUnitOptions*): Self = StObject.set(x, "fontSizeUnits", js.Array(value :_*))
    
    @scala.inline
    def setFontSizes(value: js.Array[String]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(value: String*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHint(value: HintOptions): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setIcons(value: IconsOptions): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setInsertTableMaxSize(value: InsertTableMaxSizeOptions): Self = StObject.set(x, "insertTableMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableMaxSizeUndefined: Self = StObject.set(x, "insertTableMaxSize", js.undefined)
    
    @scala.inline
    def setKeyMap(value: KeyMapOptions): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLineHeights(value: js.Array[String]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(value: String*): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaximumImageFileSize(value: js.Any): Self = StObject.set(x, "maximumImageFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumImageFileSizeUndefined: Self = StObject.set(x, "maximumImageFileSize", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleOptions): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopover(value: PopoverOptions): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    @scala.inline
    def setShortcuts(value: Boolean): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    
    @scala.inline
    def setStyleTags(value: js.Array[styleTagsOptions]): Self = StObject.set(x, "styleTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleTagsUndefined: Self = StObject.set(x, "styleTags", js.undefined)
    
    @scala.inline
    def setStyleTagsVarargs(value: styleTagsOptions*): Self = StObject.set(x, "styleTags", js.Array(value :_*))
    
    @scala.inline
    def setStyleWithSpan(value: Boolean): Self = StObject.set(x, "styleWithSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleWithSpanUndefined: Self = StObject.set(x, "styleWithSpan", js.undefined)
    
    @scala.inline
    def setTabDisable(value: Boolean): Self = StObject.set(x, "tabDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabDisableUndefined: Self = StObject.set(x, "tabDisable", js.undefined)
    
    @scala.inline
    def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
    
    @scala.inline
    def setTabsize(value: Double): Self = StObject.set(x, "tabsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsizeUndefined: Self = StObject.set(x, "tabsize", js.undefined)
    
    @scala.inline
    def setTextareaAutoSync(value: Boolean): Self = StObject.set(x, "textareaAutoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaAutoSyncUndefined: Self = StObject.set(x, "textareaAutoSync", js.undefined)
    
    @scala.inline
    def setToolbar(value: toolbarDef): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(
      value: (js.Tuple2[
          style | font | fontsize_ | color | para | height | table | insert | view | help | misc, 
          js.Array[
            miscGroupOptions | toolbarColorGroupOptions | toolbarFontGroupOptions | toolbarFontsizeGroupOptions | toolbarHeightGroupOptions | toolbarHelpGroupOptions | toolbarInsertGroupOptions | toolbarParaGroupOptions | toolbarStyleGroupOptions | toolbarTableGroupOptions | toolbarViewGroupOptions
          ]
        ])*
    ): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
