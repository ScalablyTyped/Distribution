package typings.wordpressBlockEditor.mod

import typings.std.Record
import typings.wordpressBlockEditor.anon.AjaxUrl
import typings.wordpressBlockEditor.anon.Description
import typings.wordpressBlockEditor.anon.IsLocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSettings extends js.Object {
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
  var availableTemplates: js.Array[_]
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
    titlePlaceholder: String,
    allowedMimeTypes: Record[String, String] = null
  ): EditorSettings = {
    val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomEditorFontSizes = disableCustomEditorFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any], allowedMimeTypes = allowedMimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSettings]
  }
}

