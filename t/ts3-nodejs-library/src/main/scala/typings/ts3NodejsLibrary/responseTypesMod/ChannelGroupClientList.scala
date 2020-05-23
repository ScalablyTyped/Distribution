package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelGroupClientList extends js.Object {
  var cgid: js.UndefOr[Double] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var cldbid: js.UndefOr[Double] = js.undefined
}

object ChannelGroupClientList {
  @scala.inline
  def apply(
    cgid: js.UndefOr[Double] = js.undefined,
    cid: js.UndefOr[Double] = js.undefined,
    cldbid: js.UndefOr[Double] = js.undefined
  ): ChannelGroupClientList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cgid)) __obj.updateDynamic("cgid")(cgid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cldbid)) __obj.updateDynamic("cldbid")(cldbid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupClientList]
  }
}

