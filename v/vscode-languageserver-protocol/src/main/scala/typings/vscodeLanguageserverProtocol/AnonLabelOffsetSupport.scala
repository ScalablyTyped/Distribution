package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelOffsetSupport extends js.Object {
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    *
    * @since 3.14.0
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.undefined
}

object AnonLabelOffsetSupport {
  @scala.inline
  def apply(labelOffsetSupport: js.UndefOr[Boolean] = js.undefined): AnonLabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelOffsetSupport)) __obj.updateDynamic("labelOffsetSupport")(labelOffsetSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelOffsetSupport]
  }
}

