package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFields extends js.Object {
  var all: scala.Double
  var fields: scala.Double
  var links: scala.Double
  var none: scala.Double
  var relations: scala.Double
}

object Anon_AllFields {
  @scala.inline
  def apply(
    all: scala.Double,
    fields: scala.Double,
    links: scala.Double,
    none: scala.Double,
    relations: scala.Double
  ): Anon_AllFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("relations")(relations)
    __obj.asInstanceOf[Anon_AllFields]
  }
}

