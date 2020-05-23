package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeRemoteServices extends js.Object {
  var includeRemoteServices: scala.Double
  var none: scala.Double
}

object IncludeRemoteServices {
  @scala.inline
  def apply(includeRemoteServices: scala.Double, none: scala.Double): IncludeRemoteServices = {
    val __obj = js.Dynamic.literal(includeRemoteServices = includeRemoteServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeRemoteServices]
  }
}

