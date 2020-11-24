package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPointsQuery extends js.Object {
  
  var orderBy: String = js.native
  
  var points: js.Array[TestPoint] = js.native
  
  var pointsFilter: PointsFilter = js.native
  
  var witFields: js.Array[String] = js.native
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
  
  @scala.inline
  implicit class TestPointsQueryOps[Self <: TestPointsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: TestPoint*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[TestPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsFilter(value: PointsFilter): Self = this.set("pointsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitFieldsVarargs(value: String*): Self = this.set("witFields", js.Array(value :_*))
    
    @scala.inline
    def setWitFields(value: js.Array[String]): Self = this.set("witFields", value.asInstanceOf[js.Any])
  }
}
