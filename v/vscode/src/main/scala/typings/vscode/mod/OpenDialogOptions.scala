package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogOptions extends js.Object {
  /**
  		 * Allow to select files, defaults to `true`.
  		 */
  var canSelectFiles: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Allow to select folders, defaults to `false`.
  		 */
  var canSelectFolders: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Allow to select many files or folders.
  		 */
  var canSelectMany: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The resource the dialog shows when opened.
  		 */
  var defaultUri: js.UndefOr[Uri] = js.undefined
  /**
  		 * A set of file filters that are used by the dialog. Each entry is a human readable label,
  		 * like "TypeScript", and an array of extensions, e.g.
  		 * ```ts
  		 * {
  		 * 	'Images': ['png', 'jpg']
  		 * 	'TypeScript': ['ts', 'tsx']
  		 * }
  		 * ```
  		 */
  var filters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
  		 * A human-readable string for the open button.
  		 */
  var openLabel: js.UndefOr[String] = js.undefined
}

object OpenDialogOptions {
  @scala.inline
  def apply(
    canSelectFiles: js.UndefOr[Boolean] = js.undefined,
    canSelectFolders: js.UndefOr[Boolean] = js.undefined,
    canSelectMany: js.UndefOr[Boolean] = js.undefined,
    defaultUri: Uri = null,
    filters: StringDictionary[js.Array[String]] = null,
    openLabel: String = null
  ): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canSelectFiles)) __obj.updateDynamic("canSelectFiles")(canSelectFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(canSelectFolders)) __obj.updateDynamic("canSelectFolders")(canSelectFolders.asInstanceOf[js.Any])
    if (!js.isUndefined(canSelectMany)) __obj.updateDynamic("canSelectMany")(canSelectMany.asInstanceOf[js.Any])
    if (defaultUri != null) __obj.updateDynamic("defaultUri")(defaultUri.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (openLabel != null) __obj.updateDynamic("openLabel")(openLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogOptions]
  }
}

