package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  var areaUri: String = js.native
  var children: js.Array[TestSuite] = js.native
  var defaultConfigurations: js.Array[ShallowReference] = js.native
  var defaultTesters: js.Array[ShallowReference] = js.native
  var id: Double = js.native
  var inheritDefaultConfigurations: Boolean = js.native
  var lastError: String = js.native
  var lastPopulatedDate: Date = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: Date = js.native
  var name: String = js.native
  var parent: ShallowReference = js.native
  var plan: ShallowReference = js.native
  var project: ShallowReference = js.native
  var queryString: String = js.native
  var requirementId: Double = js.native
  var revision: Double = js.native
  var state: String = js.native
  var suiteType: String = js.native
  var suites: js.Array[ShallowReference] = js.native
  var testCaseCount: Double = js.native
  var testCasesUrl: String = js.native
  var text: String = js.native
  var url: String = js.native
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
  implicit class TestSuiteOps[Self <: TestSuite] (val x: Self) extends AnyVal {
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
    def setAreaUri(value: String): Self = this.set("areaUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: TestSuite*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TestSuite]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultConfigurationsVarargs(value: ShallowReference*): Self = this.set("defaultConfigurations", js.Array(value :_*))
    @scala.inline
    def setDefaultConfigurations(value: js.Array[ShallowReference]): Self = this.set("defaultConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTestersVarargs(value: ShallowReference*): Self = this.set("defaultTesters", js.Array(value :_*))
    @scala.inline
    def setDefaultTesters(value: js.Array[ShallowReference]): Self = this.set("defaultTesters", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritDefaultConfigurations(value: Boolean): Self = this.set("inheritDefaultConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastError(value: String): Self = this.set("lastError", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPopulatedDate(value: Date): Self = this.set("lastPopulatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ShallowReference): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: ShallowReference): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequirementId(value: Double): Self = this.set("requirementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuiteType(value: String): Self = this.set("suiteType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuitesVarargs(value: ShallowReference*): Self = this.set("suites", js.Array(value :_*))
    @scala.inline
    def setSuites(value: js.Array[ShallowReference]): Self = this.set("suites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestCaseCount(value: Double): Self = this.set("testCaseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestCasesUrl(value: String): Self = this.set("testCasesUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

