package typings
package vinylLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  /**
    * If false, the destination stream will not be ended (same as node core).
    */
  var end: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: js.UndefOr[scala.Boolean] = js.undefined): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[Anon_End]
  }
}

