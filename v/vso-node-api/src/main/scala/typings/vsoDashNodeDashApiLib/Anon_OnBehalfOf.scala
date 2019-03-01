package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnBehalfOf extends js.Object {
  var onBehalfOf: scala.Double
  var revalidateApproverIdentity: scala.Double
}

object Anon_OnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: scala.Double, revalidateApproverIdentity: scala.Double): Anon_OnBehalfOf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onBehalfOf")(onBehalfOf)
    __obj.updateDynamic("revalidateApproverIdentity")(revalidateApproverIdentity)
    __obj.asInstanceOf[Anon_OnBehalfOf]
  }
}

