package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogOptions extends js.Object {
  /**
  		 * Allow to select files, defaults to `true`.
  		 */
  var canSelectFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Allow to select folders, defaults to `false`.
  		 */
  var canSelectFolders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Allow to select many files or folders.
  		 */
  var canSelectMany: js.UndefOr[scala.Boolean] = js.undefined
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
  var filters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
  		 * A human-readable string for the open button.
  		 */
  var openLabel: js.UndefOr[java.lang.String] = js.undefined
}

object OpenDialogOptions {
  @scala.inline
  def apply(
    canSelectFiles: js.UndefOr[scala.Boolean] = js.undefined,
    canSelectFolders: js.UndefOr[scala.Boolean] = js.undefined,
    canSelectMany: js.UndefOr[scala.Boolean] = js.undefined,
    defaultUri: Uri = null,
    filters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    openLabel: java.lang.String = null
  ): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canSelectFiles)) __obj.updateDynamic("canSelectFiles")(canSelectFiles)
    if (!js.isUndefined(canSelectFolders)) __obj.updateDynamic("canSelectFolders")(canSelectFolders)
    if (!js.isUndefined(canSelectMany)) __obj.updateDynamic("canSelectMany")(canSelectMany)
    if (defaultUri != null) __obj.updateDynamic("defaultUri")(defaultUri)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (openLabel != null) __obj.updateDynamic("openLabel")(openLabel)
    __obj.asInstanceOf[OpenDialogOptions]
  }
}

