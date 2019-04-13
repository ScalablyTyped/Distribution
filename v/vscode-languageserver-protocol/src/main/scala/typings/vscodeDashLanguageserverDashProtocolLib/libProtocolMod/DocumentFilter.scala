package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFilter extends js.Object {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[java.lang.String] = js.native
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[java.lang.String] = js.native
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[java.lang.String] = js.native
}

