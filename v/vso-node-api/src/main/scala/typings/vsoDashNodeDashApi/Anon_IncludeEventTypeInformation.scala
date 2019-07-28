package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: Double
  var includeGroup: Double
  var includeUser: Double
  var includeUserAndGroup: Double
  var none: Double
}

object Anon_IncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: Double,
    includeGroup: Double,
    includeUser: Double,
    includeUserAndGroup: Double,
    none: Double
  ): Anon_IncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation, includeGroup = includeGroup, includeUser = includeUser, includeUserAndGroup = includeUserAndGroup, none = none)
  
    __obj.asInstanceOf[Anon_IncludeEventTypeInformation]
  }
}

