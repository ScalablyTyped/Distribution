package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeRemoteServices extends js.Object {
  var includeRemoteServices: Double
  var none: Double
}

object AnonIncludeRemoteServices {
  @scala.inline
  def apply(includeRemoteServices: Double, none: Double): AnonIncludeRemoteServices = {
    val __obj = js.Dynamic.literal(includeRemoteServices = includeRemoteServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeRemoteServices]
  }
}

