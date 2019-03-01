package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelOffsetSupport extends js.Object {
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    */
  var labelOffsetSupport: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_LabelOffsetSupport {
  @scala.inline
  def apply(labelOffsetSupport: js.UndefOr[scala.Boolean] = js.undefined): Anon_LabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelOffsetSupport)) __obj.updateDynamic("labelOffsetSupport")(labelOffsetSupport)
    __obj.asInstanceOf[Anon_LabelOffsetSupport]
  }
}

