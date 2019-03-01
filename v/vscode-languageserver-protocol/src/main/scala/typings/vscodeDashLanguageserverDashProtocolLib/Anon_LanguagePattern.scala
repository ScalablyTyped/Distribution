package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LanguagePattern
  extends vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentFilter {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: java.lang.String
}

object Anon_LanguagePattern {
  @scala.inline
  def apply(scheme: java.lang.String, language: java.lang.String = null, pattern: java.lang.String = null): Anon_LanguagePattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scheme")(scheme)
    if (language != null) __obj.updateDynamic("language")(language)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[Anon_LanguagePattern]
  }
}

