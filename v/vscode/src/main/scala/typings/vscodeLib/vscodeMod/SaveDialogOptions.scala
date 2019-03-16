package typings
package vscodeLib.vscodeMod

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
  var filters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
  		 * A human-readable string for the save button.
  		 */
  var saveLabel: js.UndefOr[java.lang.String] = js.undefined
}

object SaveDialogOptions {
  @scala.inline
  def apply(
    defaultUri: Uri = null,
    filters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    saveLabel: java.lang.String = null
  ): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultUri != null) __obj.updateDynamic("defaultUri")(defaultUri)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (saveLabel != null) __obj.updateDynamic("saveLabel")(saveLabel)
    __obj.asInstanceOf[SaveDialogOptions]
  }
}

