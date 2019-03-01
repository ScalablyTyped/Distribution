package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var filterType: scala.Double
  /**
    * The value used in the match based on the filter type.
    */
  var value: java.lang.String
}

object FilterCriteria {
  @scala.inline
  def apply(filterType: scala.Double, value: java.lang.String): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterType")(filterType)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilterCriteria]
  }
}

