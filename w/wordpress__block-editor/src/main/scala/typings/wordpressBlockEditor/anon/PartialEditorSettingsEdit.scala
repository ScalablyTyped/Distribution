package typings.wordpressBlockEditor.anon

import typings.std.Record
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressBlockEditor.mod.EditorImageSize
import typings.wordpressBlockEditor.mod.EditorStyle
import typings.wordpressBlockEditor.mod.EditorTemplateLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorSettings & @wordpress/block-editor.@wordpress/block-editor.EditorBlockListSettings> */
trait PartialEditorSettingsEdit extends StObject {
  
  var alignWide: js.UndefOr[Boolean] = js.undefined
  
  var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
  
  var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.undefined
  
  var autosaveInterval: js.UndefOr[Double] = js.undefined
  
  var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.undefined
  
  var availableTemplates: js.UndefOr[js.Array[Any]] = js.undefined
  
  var bodyPlaceholder: js.UndefOr[String] = js.undefined
  
  var codeEditingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var colors: js.UndefOr[js.Array[EditorColor]] = js.undefined
  
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  
  var disableCustomEditorFontSizes: js.UndefOr[Boolean] = js.undefined
  
  var disablePostFormats: js.UndefOr[Boolean] = js.undefined
  
  var enableCustomFields: js.UndefOr[Boolean] = js.undefined
  
  var focusMode: js.UndefOr[Boolean] = js.undefined
  
  var fontSizes: js.UndefOr[js.Array[EditorFontSize]] = js.undefined
  
  var hasFixedToolbar: js.UndefOr[Boolean] = js.undefined
  
  var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.undefined
  
  var imageSizes: js.UndefOr[js.Array[EditorImageSize]] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var maxUploadFileSize: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var postLock: js.UndefOr[IsLocked] = js.undefined
  
  var postLockUtils: js.UndefOr[AjaxUrl] = js.undefined
  
  var richEditingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[EditorStyle]] = js.undefined
  
  var templateLock: js.UndefOr[EditorTemplateLock] = js.undefined
  
  var titlePlaceholder: js.UndefOr[String] = js.undefined
}
object PartialEditorSettingsEdit {
  
  inline def apply(): PartialEditorSettingsEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorSettingsEdit]
  }
  
  extension [Self <: PartialEditorSettingsEdit](x: Self) {
    
    inline def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
    
    inline def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
    
    inline def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedBlockTypesUndefined: Self = StObject.set(x, "allowedBlockTypes", js.undefined)
    
    inline def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value*))
    
    inline def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
    
    inline def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
    
    inline def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value*))
    
    inline def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
    
    inline def setAllowedMimeTypesUndefined: Self = StObject.set(x, "allowedMimeTypes", js.undefined)
    
    inline def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
    
    inline def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
    
    inline def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
    
    inline def setAvailableLegacyWidgetsUndefined: Self = StObject.set(x, "availableLegacyWidgets", js.undefined)
    
    inline def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value*))
    
    inline def setAvailableTemplates(value: js.Array[Any]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
    
    inline def setAvailableTemplatesUndefined: Self = StObject.set(x, "availableTemplates", js.undefined)
    
    inline def setAvailableTemplatesVarargs(value: Any*): Self = StObject.set(x, "availableTemplates", js.Array(value*))
    
    inline def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setBodyPlaceholderUndefined: Self = StObject.set(x, "bodyPlaceholder", js.undefined)
    
    inline def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCodeEditingEnabledUndefined: Self = StObject.set(x, "codeEditingEnabled", js.undefined)
    
    inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
    
    inline def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
    
    inline def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
    
    inline def setDisableCustomEditorFontSizesUndefined: Self = StObject.set(x, "disableCustomEditorFontSizes", js.undefined)
    
    inline def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
    
    inline def setDisablePostFormatsUndefined: Self = StObject.set(x, "disablePostFormats", js.undefined)
    
    inline def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomFieldsUndefined: Self = StObject.set(x, "enableCustomFields", js.undefined)
    
    inline def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    inline def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
    
    inline def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    inline def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value*))
    
    inline def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
    
    inline def setHasFixedToolbarUndefined: Self = StObject.set(x, "hasFixedToolbar", js.undefined)
    
    inline def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
    
    inline def setHasPermissionsToManageWidgetsUndefined: Self = StObject.set(x, "hasPermissionsToManageWidgets", js.undefined)
    
    inline def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
    
    inline def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value*))
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    inline def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadFileSizeUndefined: Self = StObject.set(x, "maxUploadFileSize", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
    
    inline def setPostLockUndefined: Self = StObject.set(x, "postLock", js.undefined)
    
    inline def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
    
    inline def setPostLockUtilsUndefined: Self = StObject.set(x, "postLockUtils", js.undefined)
    
    inline def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
    
    inline def setRichEditingEnabledUndefined: Self = StObject.set(x, "richEditingEnabled", js.undefined)
    
    inline def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
    
    inline def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
    
    inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    
    inline def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
  }
}
