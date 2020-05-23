package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBehalfOf extends js.Object {
  var onBehalfOf: scala.Double
  var revalidateApproverIdentity: scala.Double
}

object OnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: scala.Double, revalidateApproverIdentity: scala.Double): OnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOf]
  }
}

