package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPointsQuery extends js.Object {
  var orderBy: String
  var points: js.Array[TestPoint]
  var pointsFilter: PointsFilter
  var witFields: js.Array[String]
}

object TestPointsQuery {
  @scala.inline
  def apply(
    orderBy: String,
    points: js.Array[TestPoint],
    pointsFilter: PointsFilter,
    witFields: js.Array[String]
  ): TestPointsQuery = {
    val __obj = js.Dynamic.literal(orderBy = orderBy, points = points, pointsFilter = pointsFilter, witFields = witFields)
  
    __obj.asInstanceOf[TestPointsQuery]
  }
}

