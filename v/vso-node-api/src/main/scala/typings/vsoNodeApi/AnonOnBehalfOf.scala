package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnBehalfOf extends js.Object {
  var onBehalfOf: Double
  var revalidateApproverIdentity: Double
}

object AnonOnBehalfOf {
  @scala.inline
  def apply(onBehalfOf: Double, revalidateApproverIdentity: Double): AnonOnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnBehalfOf]
  }
}

