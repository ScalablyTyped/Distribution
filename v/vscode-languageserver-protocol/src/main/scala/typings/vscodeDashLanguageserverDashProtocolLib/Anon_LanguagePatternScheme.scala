package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LanguagePatternScheme
  extends vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentFilter {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: java.lang.String
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LanguagePatternScheme {
  @scala.inline
  def apply(pattern: java.lang.String, language: java.lang.String = null, scheme: java.lang.String = null): Anon_LanguagePatternScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pattern")(pattern)
    if (language != null) __obj.updateDynamic("language")(language)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_LanguagePatternScheme]
  }
}

