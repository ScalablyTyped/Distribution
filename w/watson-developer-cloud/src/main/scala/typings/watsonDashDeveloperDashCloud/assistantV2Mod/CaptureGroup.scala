package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** CaptureGroup. */
trait CaptureGroup extends js.Object {
  /** A recognized capture group for the entity. */
  var group: String
  /** Zero-based character offsets that indicate where the entity value begins and ends in the input text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
}

object CaptureGroup {
  @scala.inline
  def apply(group: String, location: js.Array[Double] = null): CaptureGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureGroup]
  }
}

