package typings.vscode.vscodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDialogOptions extends js.Object {
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
  		 * A human-readable string for the save button.
  		 */
  var saveLabel: js.UndefOr[String] = js.undefined
}

object SaveDialogOptions {
  @scala.inline
  def apply(
    defaultUri: Uri = null,
    filters: StringDictionary[js.Array[String]] = null,
    saveLabel: String = null
  ): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultUri != null) __obj.updateDynamic("defaultUri")(defaultUri)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (saveLabel != null) __obj.updateDynamic("saveLabel")(saveLabel)
    __obj.asInstanceOf[SaveDialogOptions]
  }
}

