package typings
package whichLib.whichMod.whichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() async API */
trait AsyncOptions extends js.Object {
  /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** Use instead of the PATH environment variable. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Use instead of the PATHEXT environment variable. */
  var pathExt: js.UndefOr[java.lang.String] = js.undefined
}

