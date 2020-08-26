package typings.wordpressEditPost.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/edit-post.@wordpress/edit-post.EditorSettings> */
@js.native
trait PartialEditorSettings extends js.Object {
  var alignWide: js.UndefOr[Boolean] = js.native
  var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.native
  var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.native
  var autosaveInterval: js.UndefOr[Double] = js.native
  var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.native
  var availableTemplates: js.UndefOr[js.Array[_]] = js.native
  var bodyPlaceholder: js.UndefOr[String] = js.native
  var codeEditingEnabled: js.UndefOr[Boolean] = js.native
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var disableCustomColors: js.UndefOr[Boolean] = js.native
  var disableCustomFontSizes: js.UndefOr[Boolean] = js.native
  var disablePostFormats: js.UndefOr[Boolean] = js.native
  var enableCustomFields: js.UndefOr[Boolean] = js.native
  var focusMode: js.UndefOr[Boolean] = js.native
  var fontSizes: js.UndefOr[js.Array[Name]] = js.native
  var hasFixedToolbar: js.UndefOr[Boolean] = js.native
  var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.native
  var imageSizes: js.UndefOr[js.Array[Slug]] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  var maxUploadFileSize: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var postLock: js.UndefOr[IsLocked] = js.native
  var postLockUtils: js.UndefOr[AjaxUrl] = js.native
  var richEditingEnabled: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[js.Array[Css]] = js.native
  var titlePlaceholder: js.UndefOr[String] = js.native
}

object PartialEditorSettings {
  @scala.inline
  def apply(): PartialEditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorSettings]
  }
  @scala.inline
  implicit class PartialEditorSettingsOps[Self <: PartialEditorSettings] (val x: Self) extends AnyVal {
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
    def deleteAlignWide: Self = this.set("alignWide", js.undefined)
    @scala.inline
    def setAllowedBlockTypesVarargs(value: String*): Self = this.set("allowedBlockTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = this.set("allowedBlockTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedBlockTypes: Self = this.set("allowedBlockTypes", js.undefined)
    @scala.inline
    def setAllowedMimeTypes(value: Record[String, String]): Self = this.set("allowedMimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedMimeTypes: Self = this.set("allowedMimeTypes", js.undefined)
    @scala.inline
    def setAllowedMimeTypesNull: Self = this.set("allowedMimeTypes", null)
    @scala.inline
    def setAutosaveInterval(value: Double): Self = this.set("autosaveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosaveInterval: Self = this.set("autosaveInterval", js.undefined)
    @scala.inline
    def setAvailableLegacyWidgetsVarargs(value: Description*): Self = this.set("availableLegacyWidgets", js.Array(value :_*))
    @scala.inline
    def setAvailableLegacyWidgets(value: js.Array[Description]): Self = this.set("availableLegacyWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableLegacyWidgets: Self = this.set("availableLegacyWidgets", js.undefined)
    @scala.inline
    def setAvailableTemplatesVarargs(value: js.Any*): Self = this.set("availableTemplates", js.Array(value :_*))
    @scala.inline
    def setAvailableTemplates(value: js.Array[_]): Self = this.set("availableTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableTemplates: Self = this.set("availableTemplates", js.undefined)
    @scala.inline
    def setBodyPlaceholder(value: String): Self = this.set("bodyPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyPlaceholder: Self = this.set("bodyPlaceholder", js.undefined)
    @scala.inline
    def setCodeEditingEnabled(value: Boolean): Self = this.set("codeEditingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeEditingEnabled: Self = this.set("codeEditingEnabled", js.undefined)
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = this.set("disableCustomColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCustomColors: Self = this.set("disableCustomColors", js.undefined)
    @scala.inline
    def setDisableCustomFontSizes(value: Boolean): Self = this.set("disableCustomFontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCustomFontSizes: Self = this.set("disableCustomFontSizes", js.undefined)
    @scala.inline
    def setDisablePostFormats(value: Boolean): Self = this.set("disablePostFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePostFormats: Self = this.set("disablePostFormats", js.undefined)
    @scala.inline
    def setEnableCustomFields(value: Boolean): Self = this.set("enableCustomFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCustomFields: Self = this.set("enableCustomFields", js.undefined)
    @scala.inline
    def setFocusMode(value: Boolean): Self = this.set("focusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusMode: Self = this.set("focusMode", js.undefined)
    @scala.inline
    def setFontSizesVarargs(value: Name*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(value: js.Array[Name]): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    @scala.inline
    def setHasFixedToolbar(value: Boolean): Self = this.set("hasFixedToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFixedToolbar: Self = this.set("hasFixedToolbar", js.undefined)
    @scala.inline
    def setHasPermissionsToManageWidgets(value: Boolean): Self = this.set("hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPermissionsToManageWidgets: Self = this.set("hasPermissionsToManageWidgets", js.undefined)
    @scala.inline
    def setImageSizesVarargs(value: Slug*): Self = this.set("imageSizes", js.Array(value :_*))
    @scala.inline
    def setImageSizes(value: js.Array[Slug]): Self = this.set("imageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSizes: Self = this.set("imageSizes", js.undefined)
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    @scala.inline
    def setMaxUploadFileSize(value: Double): Self = this.set("maxUploadFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUploadFileSize: Self = this.set("maxUploadFileSize", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setPostLock(value: IsLocked): Self = this.set("postLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostLock: Self = this.set("postLock", js.undefined)
    @scala.inline
    def setPostLockUtils(value: AjaxUrl): Self = this.set("postLockUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostLockUtils: Self = this.set("postLockUtils", js.undefined)
    @scala.inline
    def setRichEditingEnabled(value: Boolean): Self = this.set("richEditingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRichEditingEnabled: Self = this.set("richEditingEnabled", js.undefined)
    @scala.inline
    def setStylesVarargs(value: Css*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[Css]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTitlePlaceholder(value: String): Self = this.set("titlePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePlaceholder: Self = this.set("titlePlaceholder", js.undefined)
  }
  
}

