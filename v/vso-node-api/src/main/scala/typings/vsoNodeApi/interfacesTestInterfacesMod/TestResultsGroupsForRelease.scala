package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultsGroupsForRelease extends StObject {
  
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults]
  
  /**
    * Release Environment Id for which groupby result is fetched.
    */
  var releaseEnvId: Double
  
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: Double
}
object TestResultsGroupsForRelease {
  
  inline def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: Double, releaseId: Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], releaseEnvId = releaseEnvId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
  
  extension [Self <: TestResultsGroupsForRelease](x: Self) {
    
    inline def setFields(value: js.Array[FieldDetailsForTestResults]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldDetailsForTestResults*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setReleaseEnvId(value: Double): Self = StObject.set(x, "releaseEnvId", value.asInstanceOf[js.Any])
    
    inline def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
