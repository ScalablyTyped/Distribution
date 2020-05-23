package typings.wordpressEditPost.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/edit-post.@wordpress/edit-post.EditorSettings> */
trait PartialEditorSettings extends js.Object {
  var alignWide: js.UndefOr[Boolean] = js.undefined
  var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var allowedMimeTypes: js.UndefOr[Record[String, String]] = js.undefined
  var autosaveInterval: js.UndefOr[Double] = js.undefined
  var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.undefined
  var availableTemplates: js.UndefOr[js.Array[_]] = js.undefined
  var bodyPlaceholder: js.UndefOr[String] = js.undefined
  var codeEditingEnabled: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  var disableCustomFontSizes: js.UndefOr[Boolean] = js.undefined
  var disablePostFormats: js.UndefOr[Boolean] = js.undefined
  var enableCustomFields: js.UndefOr[Boolean] = js.undefined
  var focusMode: js.UndefOr[Boolean] = js.undefined
  var fontSizes: js.UndefOr[js.Array[Name]] = js.undefined
  var hasFixedToolbar: js.UndefOr[Boolean] = js.undefined
  var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.undefined
  var imageSizes: js.UndefOr[js.Array[Slug]] = js.undefined
  var isRTL: js.UndefOr[Boolean] = js.undefined
  var maxUploadFileSize: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var postLock: js.UndefOr[IsLocked] = js.undefined
  var postLockUtils: js.UndefOr[AjaxUrl] = js.undefined
  var richEditingEnabled: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Array[Css]] = js.undefined
  var titlePlaceholder: js.UndefOr[String] = js.undefined
}

object PartialEditorSettings {
  @scala.inline
  def apply(
    alignWide: js.UndefOr[Boolean] = js.undefined,
    allowedBlockTypes: js.Array[String] | Boolean = null,
    allowedMimeTypes: Record[String, String] = null,
    autosaveInterval: js.UndefOr[Double] = js.undefined,
    availableLegacyWidgets: js.Array[Description] = null,
    availableTemplates: js.Array[_] = null,
    bodyPlaceholder: String = null,
    codeEditingEnabled: js.UndefOr[Boolean] = js.undefined,
    colors: js.Array[Color] = null,
    disableCustomColors: js.UndefOr[Boolean] = js.undefined,
    disableCustomFontSizes: js.UndefOr[Boolean] = js.undefined,
    disablePostFormats: js.UndefOr[Boolean] = js.undefined,
    enableCustomFields: js.UndefOr[Boolean] = js.undefined,
    focusMode: js.UndefOr[Boolean] = js.undefined,
    fontSizes: js.Array[Name] = null,
    hasFixedToolbar: js.UndefOr[Boolean] = js.undefined,
    hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.undefined,
    imageSizes: js.Array[Slug] = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxUploadFileSize: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    postLock: IsLocked = null,
    postLockUtils: AjaxUrl = null,
    richEditingEnabled: js.UndefOr[Boolean] = js.undefined,
    styles: js.Array[Css] = null,
    titlePlaceholder: String = null
  ): PartialEditorSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignWide)) __obj.updateDynamic("alignWide")(alignWide.get.asInstanceOf[js.Any])
    if (allowedBlockTypes != null) __obj.updateDynamic("allowedBlockTypes")(allowedBlockTypes.asInstanceOf[js.Any])
    if (allowedMimeTypes != null) __obj.updateDynamic("allowedMimeTypes")(allowedMimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(autosaveInterval)) __obj.updateDynamic("autosaveInterval")(autosaveInterval.get.asInstanceOf[js.Any])
    if (availableLegacyWidgets != null) __obj.updateDynamic("availableLegacyWidgets")(availableLegacyWidgets.asInstanceOf[js.Any])
    if (availableTemplates != null) __obj.updateDynamic("availableTemplates")(availableTemplates.asInstanceOf[js.Any])
    if (bodyPlaceholder != null) __obj.updateDynamic("bodyPlaceholder")(bodyPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(codeEditingEnabled)) __obj.updateDynamic("codeEditingEnabled")(codeEditingEnabled.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCustomColors)) __obj.updateDynamic("disableCustomColors")(disableCustomColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCustomFontSizes)) __obj.updateDynamic("disableCustomFontSizes")(disableCustomFontSizes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePostFormats)) __obj.updateDynamic("disablePostFormats")(disablePostFormats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCustomFields)) __obj.updateDynamic("enableCustomFields")(enableCustomFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusMode)) __obj.updateDynamic("focusMode")(focusMode.get.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFixedToolbar)) __obj.updateDynamic("hasFixedToolbar")(hasFixedToolbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPermissionsToManageWidgets)) __obj.updateDynamic("hasPermissionsToManageWidgets")(hasPermissionsToManageWidgets.get.asInstanceOf[js.Any])
    if (imageSizes != null) __obj.updateDynamic("imageSizes")(imageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUploadFileSize)) __obj.updateDynamic("maxUploadFileSize")(maxUploadFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (postLock != null) __obj.updateDynamic("postLock")(postLock.asInstanceOf[js.Any])
    if (postLockUtils != null) __obj.updateDynamic("postLockUtils")(postLockUtils.asInstanceOf[js.Any])
    if (!js.isUndefined(richEditingEnabled)) __obj.updateDynamic("richEditingEnabled")(richEditingEnabled.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (titlePlaceholder != null) __obj.updateDynamic("titlePlaceholder")(titlePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEditorSettings]
  }
}

