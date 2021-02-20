package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPointsQuery extends StObject {
  
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
  implicit class TestPointsQueryMutableBuilder[Self <: TestPointsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[TestPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsFilter(value: PointsFilter): Self = StObject.set(x, "pointsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: TestPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setWitFields(value: js.Array[String]): Self = StObject.set(x, "witFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitFieldsVarargs(value: String*): Self = StObject.set(x, "witFields", js.Array(value :_*))
  }
}
