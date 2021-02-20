package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsGroupsForBuild extends StObject {
  
  /**
    * BuildId for which groupby result is fetched.
    */
  var buildId: Double = js.native
  
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults] = js.native
}
object TestResultsGroupsForBuild {
  
  @scala.inline
  def apply(buildId: Double, fields: js.Array[FieldDetailsForTestResults]): TestResultsGroupsForBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForBuild]
  }
  
  @scala.inline
  implicit class TestResultsGroupsForBuildMutableBuilder[Self <: TestResultsGroupsForBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[FieldDetailsForTestResults]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldDetailsForTestResults*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
