package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultsGroupsForBuild extends StObject {
  
  /**
    * BuildId for which groupby result is fetched.
    */
  var buildId: Double
  
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults]
}
object TestResultsGroupsForBuild {
  
  inline def apply(buildId: Double, fields: js.Array[FieldDetailsForTestResults]): TestResultsGroupsForBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForBuild]
  }
  
  extension [Self <: TestResultsGroupsForBuild](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[FieldDetailsForTestResults]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldDetailsForTestResults*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
