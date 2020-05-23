package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var cgid: js.UndefOr[Double] = js.undefined
}

object ChannelGroupCopy {
  @scala.inline
  def apply(cgid: js.UndefOr[Double] = js.undefined): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cgid)) __obj.updateDynamic("cgid")(cgid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupCopy]
  }
}

