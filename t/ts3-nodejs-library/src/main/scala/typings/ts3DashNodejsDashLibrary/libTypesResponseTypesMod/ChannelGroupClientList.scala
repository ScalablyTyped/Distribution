package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
  def apply(cgid: Int | Double = null, cid: Int | Double = null, cldbid: Int | Double = null): ChannelGroupClientList = {
    val __obj = js.Dynamic.literal()
    if (cgid != null) __obj.updateDynamic("cgid")(cgid.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (cldbid != null) __obj.updateDynamic("cldbid")(cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupClientList]
  }
}

