package typings.wordpressBlockEditor.mod

import typings.std.Record
import typings.wordpressBlockEditor.anon.AjaxUrl
import typings.wordpressBlockEditor.anon.Description
import typings.wordpressBlockEditor.anon.IsLocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSettings extends js.Object {
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
  implicit class EditorSettingsOps[Self <: EditorSettings] (val x: Self) extends AnyVal {
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
    def setAlignWide(value: Boolean): Self = this.set("alignWide", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedBlockTypesVarargs(value: String*): Self = this.set("allowedBlockTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = this.set("allowedBlockTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutosaveInterval(value: Double): Self = this.set("autosaveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailableLegacyWidgetsVarargs(value: Description*): Self = this.set("availableLegacyWidgets", js.Array(value :_*))
    @scala.inline
    def setAvailableLegacyWidgets(value: js.Array[Description]): Self = this.set("availableLegacyWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailableTemplatesVarargs(value: js.Any*): Self = this.set("availableTemplates", js.Array(value :_*))
    @scala.inline
    def setAvailableTemplates(value: js.Array[_]): Self = this.set("availableTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyPlaceholder(value: String): Self = this.set("bodyPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeEditingEnabled(value: Boolean): Self = this.set("codeEditingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorsVarargs(value: EditorColor*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[EditorColor]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableCustomEditorFontSizes(value: Boolean): Self = this.set("disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisablePostFormats(value: Boolean): Self = this.set("disablePostFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableCustomFields(value: Boolean): Self = this.set("enableCustomFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusMode(value: Boolean): Self = this.set("focusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSizesVarargs(value: EditorFontSize*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(value: js.Array[EditorFontSize]): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasFixedToolbar(value: Boolean): Self = this.set("hasFixedToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPermissionsToManageWidgets(value: Boolean): Self = this.set("hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSizesVarargs(value: EditorImageSize*): Self = this.set("imageSizes", js.Array(value :_*))
    @scala.inline
    def setImageSizes(value: js.Array[EditorImageSize]): Self = this.set("imageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxUploadFileSize(value: Double): Self = this.set("maxUploadFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostLock(value: IsLocked): Self = this.set("postLock", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostLockUtils(value: AjaxUrl): Self = this.set("postLockUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def setRichEditingEnabled(value: Boolean): Self = this.set("richEditingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: EditorStyle*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[EditorStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitlePlaceholder(value: String): Self = this.set("titlePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedMimeTypes(value: Record[String, String]): Self = this.set("allowedMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedMimeTypesNull: Self = this.set("allowedMimeTypes", null)
  }
  
}

