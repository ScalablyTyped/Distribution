package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(areaUri = areaUri, children = children, defaultConfigurations = defaultConfigurations, defaultTesters = defaultTesters, id = id, inheritDefaultConfigurations = inheritDefaultConfigurations, lastError = lastError, lastPopulatedDate = lastPopulatedDate, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, name = name, parent = parent, plan = plan, project = project, queryString = queryString, requirementId = requirementId, revision = revision, state = state, suiteType = suiteType, suites = suites, testCaseCount = testCaseCount, testCasesUrl = testCasesUrl, text = text, url = url)
  
    __obj.asInstanceOf[TestSuite]
  }
}

