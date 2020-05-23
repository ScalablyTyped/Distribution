package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermList extends js.Object {
  var permid: js.UndefOr[Double] = js.undefined
  var permnegated: Double
  var permsid: js.UndefOr[String] = js.undefined
  var permskip: Double
  var permvalue: Double
}

object PermList {
  @scala.inline
  def apply(
    permnegated: Double,
    permskip: Double,
    permvalue: Double,
    permid: js.UndefOr[Double] = js.undefined,
    permsid: String = null
  ): PermList = {
    val __obj = js.Dynamic.literal(permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    if (!js.isUndefined(permid)) __obj.updateDynamic("permid")(permid.get.asInstanceOf[js.Any])
    if (permsid != null) __obj.updateDynamic("permsid")(permsid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermList]
  }
}

