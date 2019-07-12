package typings
package atWordpressNuxLib.storeSelectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideInfo extends js.Object {
  /**
    * The guide's currently showing tip.
    */
  var currentTipId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The guide's next tip to show.
    */
  var nextTipId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Which tips the guide contains.
    */
  var tipIds: js.Array[java.lang.String]
}

object GuideInfo {
  @scala.inline
  def apply(
    tipIds: js.Array[java.lang.String],
    currentTipId: java.lang.String = null,
    nextTipId: java.lang.String = null
  ): GuideInfo = {
    val __obj = js.Dynamic.literal(tipIds = tipIds)
    if (currentTipId != null) __obj.updateDynamic("currentTipId")(currentTipId)
    if (nextTipId != null) __obj.updateDynamic("nextTipId")(nextTipId)
    __obj.asInstanceOf[GuideInfo]
  }
}

