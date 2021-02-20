package typings.wordpressBlockEditor.anon

import typings.std.Record
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.mod.EditorFontSize
import typings.wordpressBlockEditor.mod.EditorImageSize
import typings.wordpressBlockEditor.mod.EditorStyle
import typings.wordpressBlockEditor.mod.EditorTemplateLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorSettings & @wordpress/block-editor.@wordpress/block-editor.EditorBlockListSettings> */
@js.native
trait PartialEditorSettingsEdit extends StObject {
  
  var alignWide: js.UndefOr[Boolean] = js.native
  
  var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
  
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
  
  var templateLock: js.UndefOr[EditorTemplateLock] = js.native
  
  var titlePlaceholder: js.UndefOr[String] = js.native
}
object PartialEditorSettingsEdit {
  
  @scala.inline
  def apply(): PartialEditorSettingsEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorSettingsEdit]
  }
  
  @scala.inline
  implicit class PartialEditorSettingsEditMutableBuilder[Self <: PartialEditorSettingsEdit] (val x: Self) extends AnyVal {
    
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
    def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
    
    @scala.inline
    def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value :_*))
    
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
    def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
    
    @scala.inline
    def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
  }
}
