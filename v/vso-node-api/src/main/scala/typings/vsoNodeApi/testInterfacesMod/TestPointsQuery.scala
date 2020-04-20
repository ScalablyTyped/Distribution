package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(orderBy = orderBy.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsFilter = pointsFilter.asInstanceOf[js.Any], witFields = witFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPointsQuery]
  }
}

