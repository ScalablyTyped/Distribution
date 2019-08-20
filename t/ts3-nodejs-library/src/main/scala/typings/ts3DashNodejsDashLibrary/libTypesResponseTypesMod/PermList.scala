package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    permid: Int | Double = null,
    permsid: String = null
  ): PermList = {
    val __obj = js.Dynamic.literal(permnegated = permnegated, permskip = permskip, permvalue = permvalue)
    if (permid != null) __obj.updateDynamic("permid")(permid.asInstanceOf[js.Any])
    if (permsid != null) __obj.updateDynamic("permsid")(permsid)
    __obj.asInstanceOf[PermList]
  }
}

