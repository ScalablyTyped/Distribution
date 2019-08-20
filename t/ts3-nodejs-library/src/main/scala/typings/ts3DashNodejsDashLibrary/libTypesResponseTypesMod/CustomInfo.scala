package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomInfo extends js.Object {
  /** only available in the first element of the response array */
  var cldbid: js.UndefOr[Double] = js.undefined
  var ident: String
  var value: String
}

object CustomInfo {
  @scala.inline
  def apply(ident: String, value: String, cldbid: Int | Double = null): CustomInfo = {
    val __obj = js.Dynamic.literal(ident = ident, value = value)
    if (cldbid != null) __obj.updateDynamic("cldbid")(cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomInfo]
  }
}

