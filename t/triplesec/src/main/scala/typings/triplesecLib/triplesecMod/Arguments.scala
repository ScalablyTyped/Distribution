package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments extends js.Object {
  var data: nodeLib.Buffer
  var key: nodeLib.Buffer
  var progress_hook: js.UndefOr[js.Function1[/* progress */ Progress, scala.Unit]] = js.undefined
}

