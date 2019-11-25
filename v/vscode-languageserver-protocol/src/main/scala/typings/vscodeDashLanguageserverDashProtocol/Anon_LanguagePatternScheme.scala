package typings.vscodeDashLanguageserverDashProtocol

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LanguagePatternScheme extends DocumentFilter {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: String
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}

object Anon_LanguagePatternScheme {
  @scala.inline
  def apply(pattern: String, language: String = null, scheme: String = null): Anon_LanguagePatternScheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LanguagePatternScheme]
  }
}

