package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeRemoteServices extends js.Object {
  var includeRemoteServices: scala.Double
  var none: scala.Double
}

object Anon_IncludeRemoteServices {
  @scala.inline
  def apply(includeRemoteServices: scala.Double, none: scala.Double): Anon_IncludeRemoteServices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeRemoteServices")(includeRemoteServices)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_IncludeRemoteServices]
  }
}

