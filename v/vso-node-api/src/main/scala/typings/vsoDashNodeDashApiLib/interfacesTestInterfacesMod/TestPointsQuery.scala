package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPointsQuery extends js.Object {
  var orderBy: java.lang.String
  var points: js.Array[TestPoint]
  var pointsFilter: PointsFilter
  var witFields: js.Array[java.lang.String]
}

object TestPointsQuery {
  @scala.inline
  def apply(
    orderBy: java.lang.String,
    points: js.Array[TestPoint],
    pointsFilter: PointsFilter,
    witFields: js.Array[java.lang.String]
  ): TestPointsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orderBy")(orderBy)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("pointsFilter")(pointsFilter)
    __obj.updateDynamic("witFields")(witFields)
    __obj.asInstanceOf[TestPointsQuery]
  }
}

