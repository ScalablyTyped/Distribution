package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFilter extends js.Object {
  /**
  		 * A language id, like `typescript`.
  		 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * A [glob pattern](#GlobPattern) that is matched on the absolute path of the document. Use a [relative pattern](#RelativePattern)
  		 * to filter documents to a [workspace folder](#WorkspaceFolder).
  		 */
  var pattern: js.UndefOr[GlobPattern] = js.undefined
  /**
  		 * A Uri [scheme](#Uri.scheme), like `file` or `untitled`.
  		 */
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentFilter {
  @scala.inline
  def apply(language: java.lang.String = null, pattern: GlobPattern = null, scheme: java.lang.String = null): DocumentFilter = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[DocumentFilter]
  }
}

