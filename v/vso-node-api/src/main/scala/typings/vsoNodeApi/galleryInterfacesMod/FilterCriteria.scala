package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var filterType: Double
  /**
    * The value used in the match based on the filter type.
    */
  var value: String
}

object FilterCriteria {
  @scala.inline
  def apply(filterType: Double, value: String): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

