package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteCreateModel extends StObject {
  
  var name: String
  
  var queryString: String
  
  var requirementIds: js.Array[Double]
  
  var suiteType: String
}
object SuiteCreateModel {
  
  @scala.inline
  def apply(name: String, queryString: String, requirementIds: js.Array[Double], suiteType: String): SuiteCreateModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requirementIds = requirementIds.asInstanceOf[js.Any], suiteType = suiteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteCreateModel]
  }
  
  @scala.inline
  implicit class SuiteCreateModelMutableBuilder[Self <: SuiteCreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementIds(value: js.Array[Double]): Self = StObject.set(x, "requirementIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementIdsVarargs(value: Double*): Self = StObject.set(x, "requirementIds", js.Array(value :_*))
    
    @scala.inline
    def setSuiteType(value: String): Self = StObject.set(x, "suiteType", value.asInstanceOf[js.Any])
  }
}
