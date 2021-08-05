package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlan extends StObject {
  
  var area: ShallowReference
  
  var automatedTestEnvironment: TestEnvironment
  
  var automatedTestSettings: TestSettings
  
  var build: ShallowReference
  
  var buildDefinition: ShallowReference
  
  var clientUrl: String
  
  var description: String
  
  var endDate: Date
  
  var id: Double
  
  var iteration: String
  
  var manualTestEnvironment: TestEnvironment
  
  var manualTestSettings: TestSettings
  
  var name: String
  
  var owner: IdentityRef
  
  var previousBuild: ShallowReference
  
  var project: ShallowReference
  
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  
  var revision: Double
  
  var rootSuite: ShallowReference
  
  var startDate: Date
  
  var state: String
  
  var updatedBy: IdentityRef
  
  var updatedDate: Date
  
  var url: String
}
object TestPlan {
  
  inline def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    clientUrl: String,
    description: String,
    endDate: Date,
    id: Double,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    previousBuild: ShallowReference,
    project: ShallowReference,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    revision: Double,
    rootSuite: ShallowReference,
    startDate: Date,
    state: String,
    updatedBy: IdentityRef,
    updatedDate: Date,
    url: String
  ): TestPlan = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], clientUrl = clientUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], previousBuild = previousBuild.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rootSuite = rootSuite.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  extension [Self <: TestPlan](x: Self) {
    
    inline def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "automatedTestEnvironment", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestSettings(value: TestSettings): Self = StObject.set(x, "automatedTestSettings", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildDefinition(value: ShallowReference): Self = StObject.set(x, "buildDefinition", value.asInstanceOf[js.Any])
    
    inline def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    inline def setManualTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "manualTestEnvironment", value.asInstanceOf[js.Any])
    
    inline def setManualTestSettings(value: TestSettings): Self = StObject.set(x, "manualTestSettings", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPreviousBuild(value: ShallowReference): Self = StObject.set(x, "previousBuild", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = StObject.set(x, "releaseEnvironmentDefinition", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRootSuite(value: ShallowReference): Self = StObject.set(x, "rootSuite", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: IdentityRef): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
