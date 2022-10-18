package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsFilter extends StObject {
  
  var configurationNames: js.Array[String]
  
  var testcaseIds: js.Array[Double]
  
  var testers: js.Array[IdentityRef]
}
object PointsFilter {
  
  inline def apply(
    configurationNames: js.Array[String],
    testcaseIds: js.Array[Double],
    testers: js.Array[IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal(configurationNames = configurationNames.asInstanceOf[js.Any], testcaseIds = testcaseIds.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsFilter]
  }
  
  extension [Self <: PointsFilter](x: Self) {
    
    inline def setConfigurationNames(value: js.Array[String]): Self = StObject.set(x, "configurationNames", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNamesVarargs(value: String*): Self = StObject.set(x, "configurationNames", js.Array(value*))
    
    inline def setTestcaseIds(value: js.Array[Double]): Self = StObject.set(x, "testcaseIds", value.asInstanceOf[js.Any])
    
    inline def setTestcaseIdsVarargs(value: Double*): Self = StObject.set(x, "testcaseIds", js.Array(value*))
    
    inline def setTesters(value: js.Array[IdentityRef]): Self = StObject.set(x, "testers", value.asInstanceOf[js.Any])
    
    inline def setTestersVarargs(value: IdentityRef*): Self = StObject.set(x, "testers", js.Array(value*))
  }
}
