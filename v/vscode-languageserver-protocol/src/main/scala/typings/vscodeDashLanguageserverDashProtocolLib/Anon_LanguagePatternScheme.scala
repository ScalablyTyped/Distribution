package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LanguagePatternScheme extends js.Object {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: java.lang.String
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

