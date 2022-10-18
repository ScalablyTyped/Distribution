package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPointsQuery extends StObject {
  
  var orderBy: String
  
  var points: js.Array[TestPoint]
  
  var pointsFilter: PointsFilter
  
  var witFields: js.Array[String]
}
object TestPointsQuery {
  
  inline def apply(
    orderBy: String,
    points: js.Array[TestPoint],
    pointsFilter: PointsFilter,
    witFields: js.Array[String]
  ): TestPointsQuery = {
    val __obj = js.Dynamic.literal(orderBy = orderBy.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsFilter = pointsFilter.asInstanceOf[js.Any], witFields = witFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPointsQuery]
  }
  
  extension [Self <: TestPointsQuery](x: Self) {
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[TestPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsFilter(value: PointsFilter): Self = StObject.set(x, "pointsFilter", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: TestPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setWitFields(value: js.Array[String]): Self = StObject.set(x, "witFields", value.asInstanceOf[js.Any])
    
    inline def setWitFieldsVarargs(value: String*): Self = StObject.set(x, "witFields", js.Array(value*))
  }
}
