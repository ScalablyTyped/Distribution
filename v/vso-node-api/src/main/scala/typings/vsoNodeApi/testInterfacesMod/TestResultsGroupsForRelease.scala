package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsGroupsForRelease extends js.Object {
  
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults] = js.native
  
  /**
    * Release Environment Id for which groupby result is fetched.
    */
  var releaseEnvId: Double = js.native
  
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: Double = js.native
}
object TestResultsGroupsForRelease {
  
  @scala.inline
  def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: Double, releaseId: Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], releaseEnvId = releaseEnvId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
  
  @scala.inline
  implicit class TestResultsGroupsForReleaseOps[Self <: TestResultsGroupsForRelease] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: FieldDetailsForTestResults*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldDetailsForTestResults]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvId(value: Double): Self = this.set("releaseEnvId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = this.set("releaseId", value.asInstanceOf[js.Any])
  }
}
