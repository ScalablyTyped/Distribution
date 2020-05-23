package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends DocumentFilter {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: String
}

object Pattern {
  @scala.inline
  def apply(scheme: String, language: String = null, pattern: String = null): Pattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

