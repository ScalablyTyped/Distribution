package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsFilter extends StObject {
  
  var configurationNames: js.Array[String]
  
  var testcaseIds: js.Array[Double]
  
  var testers: js.Array[IdentityRef]
}
object PointsFilter {
  
  @scala.inline
  def apply(
    configurationNames: js.Array[String],
    testcaseIds: js.Array[Double],
    testers: js.Array[IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal(configurationNames = configurationNames.asInstanceOf[js.Any], testcaseIds = testcaseIds.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsFilter]
  }
  
  @scala.inline
  implicit class PointsFilterMutableBuilder[Self <: PointsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationNames(value: js.Array[String]): Self = StObject.set(x, "configurationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNamesVarargs(value: String*): Self = StObject.set(x, "configurationNames", js.Array(value :_*))
    
    @scala.inline
    def setTestcaseIds(value: js.Array[Double]): Self = StObject.set(x, "testcaseIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestcaseIdsVarargs(value: Double*): Self = StObject.set(x, "testcaseIds", js.Array(value :_*))
    
    @scala.inline
    def setTesters(value: js.Array[IdentityRef]): Self = StObject.set(x, "testers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestersVarargs(value: IdentityRef*): Self = StObject.set(x, "testers", js.Array(value :_*))
  }
}
