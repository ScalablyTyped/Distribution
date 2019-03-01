package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dShadedOption extends js.Object {
  var groupid: js.UndefOr[IdType] = js.undefined
  var orientation: js.UndefOr[TopBottomEnumType] = js.undefined
}

object Graph2dShadedOption {
  @scala.inline
  def apply(groupid: IdType = null, orientation: TopBottomEnumType = null): Graph2dShadedOption = {
    val __obj = js.Dynamic.literal()
    if (groupid != null) __obj.updateDynamic("groupid")(groupid.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[Graph2dShadedOption]
  }
}

