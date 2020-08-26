package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDialogOptions extends js.Object {
  /**
    * Allow to select files, defaults to `true`.
    */
  var canSelectFiles: js.UndefOr[Boolean] = js.native
  /**
    * Allow to select folders, defaults to `false`.
    */
  var canSelectFolders: js.UndefOr[Boolean] = js.native
  /**
    * Allow to select many files or folders.
    */
  var canSelectMany: js.UndefOr[Boolean] = js.native
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
    * A human-readable string for the open button.
    */
  var openLabel: js.UndefOr[String] = js.native
  /**
    * Dialog title.
    *
    * This parameter might be ignored, as not all operating systems display a title on open dialogs
    * (for example, macOS).
    */
  var title: js.UndefOr[String] = js.native
}

object OpenDialogOptions {
  @scala.inline
  def apply(): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogOptions]
  }
  @scala.inline
  implicit class OpenDialogOptionsOps[Self <: OpenDialogOptions] (val x: Self) extends AnyVal {
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
    def setCanSelectFiles(value: Boolean): Self = this.set("canSelectFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanSelectFiles: Self = this.set("canSelectFiles", js.undefined)
    @scala.inline
    def setCanSelectFolders(value: Boolean): Self = this.set("canSelectFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanSelectFolders: Self = this.set("canSelectFolders", js.undefined)
    @scala.inline
    def setCanSelectMany(value: Boolean): Self = this.set("canSelectMany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanSelectMany: Self = this.set("canSelectMany", js.undefined)
    @scala.inline
    def setDefaultUri(value: Uri): Self = this.set("defaultUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultUri: Self = this.set("defaultUri", js.undefined)
    @scala.inline
    def setFilters(value: StringDictionary[js.Array[String]]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOpenLabel(value: String): Self = this.set("openLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenLabel: Self = this.set("openLabel", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

