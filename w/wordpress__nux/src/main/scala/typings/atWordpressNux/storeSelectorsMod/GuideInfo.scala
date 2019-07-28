package typings.atWordpressNux.storeSelectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideInfo extends js.Object {
  /**
    * The guide's currently showing tip.
    */
  var currentTipId: js.UndefOr[String] = js.undefined
  /**
    * The guide's next tip to show.
    */
  var nextTipId: js.UndefOr[String] = js.undefined
  /**
    * Which tips the guide contains.
    */
  var tipIds: js.Array[String]
}

object GuideInfo {
  @scala.inline
  def apply(tipIds: js.Array[String], currentTipId: String = null, nextTipId: String = null): GuideInfo = {
    val __obj = js.Dynamic.literal(tipIds = tipIds)
    if (currentTipId != null) __obj.updateDynamic("currentTipId")(currentTipId)
    if (nextTipId != null) __obj.updateDynamic("nextTipId")(nextTipId)
    __obj.asInstanceOf[GuideInfo]
  }
}

