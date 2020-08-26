package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveDialogOptions extends js.Object {
  /**
    * The resource the dialog shows when opened.
    */
  var defaultUri: js.UndefOr[Uri] = js.native
  /**
    * A set of file filters that are used by the dialog. Each entry is a human-readable label,
    * like "TypeScript", and an array of extensions, e.g.
    * ```ts
    * {
    *     'Images': ['png', 'jpg']
    *     'TypeScript': ['ts', 'tsx']
    * }
    * ```
    */
  var filters: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * A human-readable string for the save button.
    */
  var saveLabel: js.UndefOr[String] = js.native
  /**
    * Dialog title.
    *
    * This parameter might be ignored, as not all operating systems display a title on save dialogs
    * (for example, macOS).
    */
  var title: js.UndefOr[String] = js.native
}

object SaveDialogOptions {
  @scala.inline
  def apply(): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogOptions]
  }
  @scala.inline
  implicit class SaveDialogOptionsOps[Self <: SaveDialogOptions] (val x: Self) extends AnyVal {
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
    def setDefaultUri(value: Uri): Self = this.set("defaultUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultUri: Self = this.set("defaultUri", js.undefined)
    @scala.inline
    def setFilters(value: StringDictionary[js.Array[String]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setSaveLabel(value: String): Self = this.set("saveLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveLabel: Self = this.set("saveLabel", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

