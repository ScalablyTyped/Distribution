package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanUpdateModel extends StObject {
  
  var area: ShallowReference = js.native
  
  var automatedTestEnvironment: TestEnvironment = js.native
  
  var automatedTestSettings: TestSettings = js.native
  
  var build: ShallowReference = js.native
  
  var buildDefinition: ShallowReference = js.native
  
  var configurationIds: js.Array[Double] = js.native
  
  var description: String = js.native
  
  var endDate: String = js.native
  
  var iteration: String = js.native
  
  var manualTestEnvironment: TestEnvironment = js.native
  
  var manualTestSettings: TestSettings = js.native
  
  var name: String = js.native
  
  var owner: IdentityRef = js.native
  
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference = js.native
  
  var startDate: String = js.native
  
  var state: String = js.native
  
  var status: String = js.native
}
object PlanUpdateModel {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    configurationIds: js.Array[Double],
    description: String,
    endDate: String,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    startDate: String,
    state: String,
    status: String
  ): PlanUpdateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanUpdateModel]
  }
  
  @scala.inline
  implicit class PlanUpdateModelMutableBuilder[Self <: PlanUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "automatedTestEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestSettings(value: TestSettings): Self = StObject.set(x, "automatedTestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDefinition(value: ShallowReference): Self = StObject.set(x, "buildDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIds(value: js.Array[Double]): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: Double*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "manualTestEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualTestSettings(value: TestSettings): Self = StObject.set(x, "manualTestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = StObject.set(x, "releaseEnvironmentDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
