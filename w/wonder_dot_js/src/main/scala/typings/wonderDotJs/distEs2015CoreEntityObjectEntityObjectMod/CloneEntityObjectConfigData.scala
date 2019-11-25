package typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneEntityObjectConfigData extends js.Object {
  var cloneChildren: js.UndefOr[Boolean] = js.undefined
  var cloneGeometry: js.UndefOr[Boolean] = js.undefined
  var shareGeometry: js.UndefOr[Boolean] = js.undefined
}

object CloneEntityObjectConfigData {
  @scala.inline
  def apply(
    cloneChildren: js.UndefOr[Boolean] = js.undefined,
    cloneGeometry: js.UndefOr[Boolean] = js.undefined,
    shareGeometry: js.UndefOr[Boolean] = js.undefined
  ): CloneEntityObjectConfigData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cloneChildren)) __obj.updateDynamic("cloneChildren")(cloneChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(cloneGeometry)) __obj.updateDynamic("cloneGeometry")(cloneGeometry.asInstanceOf[js.Any])
    if (!js.isUndefined(shareGeometry)) __obj.updateDynamic("shareGeometry")(shareGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneEntityObjectConfigData]
  }
}

