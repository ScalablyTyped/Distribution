package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuite extends js.Object {
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
}

