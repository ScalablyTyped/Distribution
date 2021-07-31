package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSuite extends StObject {
  
  var areaUri: String
  
  var children: js.Array[TestSuite]
  
  var defaultConfigurations: js.Array[ShallowReference]
  
  var defaultTesters: js.Array[ShallowReference]
  
  var id: Double
  
  var inheritDefaultConfigurations: Boolean
  
  var lastError: String
  
  var lastPopulatedDate: Date
  
  var lastUpdatedBy: IdentityRef
  
  var lastUpdatedDate: Date
  
  var name: String
  
  var parent: ShallowReference
  
  var plan: ShallowReference
  
  var project: ShallowReference
  
  var queryString: String
  
  var requirementId: Double
  
  var revision: Double
  
  var state: String
  
  var suiteType: String
  
  var suites: js.Array[ShallowReference]
  
  var testCaseCount: Double
  
  var testCasesUrl: String
  
  var text: String
  
  var url: String
}
object TestSuite {
  
  @scala.inline
  def apply(
    areaUri: String,
    children: js.Array[TestSuite],
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    id: Double,
    inheritDefaultConfigurations: Boolean,
    lastError: String,
    lastPopulatedDate: Date,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    name: String,
    parent: ShallowReference,
    plan: ShallowReference,
    project: ShallowReference,
    queryString: String,
    requirementId: Double,
    revision: Double,
    state: String,
    suiteType: String,
    suites: js.Array[ShallowReference],
    testCaseCount: Double,
    testCasesUrl: String,
    text: String,
    url: String
  ): TestSuite = {
    val __obj = js.Dynamic.literal(areaUri = areaUri.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], defaultConfigurations = defaultConfigurations.asInstanceOf[js.Any], defaultTesters = defaultTesters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritDefaultConfigurations = inheritDefaultConfigurations.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], lastPopulatedDate = lastPopulatedDate.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requirementId = requirementId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suiteType = suiteType.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], testCaseCount = testCaseCount.asInstanceOf[js.Any], testCasesUrl = testCasesUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuite]
  }
  
  @scala.inline
  implicit class TestSuiteMutableBuilder[Self <: TestSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaUri(value: String): Self = StObject.set(x, "areaUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[TestSuite]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TestSuite*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDefaultConfigurations(value: js.Array[ShallowReference]): Self = StObject.set(x, "defaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfigurationsVarargs(value: ShallowReference*): Self = StObject.set(x, "defaultConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTesters(value: js.Array[ShallowReference]): Self = StObject.set(x, "defaultTesters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTestersVarargs(value: ShallowReference*): Self = StObject.set(x, "defaultTesters", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritDefaultConfigurations(value: Boolean): Self = StObject.set(x, "inheritDefaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastError(value: String): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPopulatedDate(value: Date): Self = StObject.set(x, "lastPopulatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ShallowReference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: ShallowReference): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementId(value: Double): Self = StObject.set(x, "requirementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteType(value: String): Self = StObject.set(x, "suiteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuites(value: js.Array[ShallowReference]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuitesVarargs(value: ShallowReference*): Self = StObject.set(x, "suites", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseCount(value: Double): Self = StObject.set(x, "testCaseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUrl(value: String): Self = StObject.set(x, "testCasesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
