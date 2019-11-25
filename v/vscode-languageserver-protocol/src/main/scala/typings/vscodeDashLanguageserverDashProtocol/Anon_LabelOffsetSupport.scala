package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelOffsetSupport extends js.Object {
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.undefined
}

object Anon_LabelOffsetSupport {
  @scala.inline
  def apply(labelOffsetSupport: js.UndefOr[Boolean] = js.undefined): Anon_LabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelOffsetSupport)) __obj.updateDynamic("labelOffsetSupport")(labelOffsetSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LabelOffsetSupport]
  }
}

