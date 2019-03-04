package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language
  extends vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentFilter {
  /** A language id, like `typescript`. */
  var language: java.lang.String
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Language {
  @scala.inline
  def apply(language: java.lang.String, pattern: java.lang.String = null, scheme: java.lang.String = null): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_Language]
  }
}

