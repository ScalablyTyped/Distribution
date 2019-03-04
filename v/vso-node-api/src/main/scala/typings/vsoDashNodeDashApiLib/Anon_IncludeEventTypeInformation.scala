package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: scala.Double
  var includeGroup: scala.Double
  var includeUser: scala.Double
  var includeUserAndGroup: scala.Double
  var none: scala.Double
}

object Anon_IncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: scala.Double,
    includeGroup: scala.Double,
    includeUser: scala.Double,
    includeUserAndGroup: scala.Double,
    none: scala.Double
  ): Anon_IncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation, includeGroup = includeGroup, includeUser = includeUser, includeUserAndGroup = includeUserAndGroup, none = none)
  
    __obj.asInstanceOf[Anon_IncludeEventTypeInformation]
  }
}

