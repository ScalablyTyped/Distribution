package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuite extends js.Object {
  var areaUri: java.lang.String
  var children: js.Array[TestSuite]
  var defaultConfigurations: js.Array[ShallowReference]
  var defaultTesters: js.Array[ShallowReference]
  var id: scala.Double
  var inheritDefaultConfigurations: scala.Boolean
  var lastError: java.lang.String
  var lastPopulatedDate: stdLib.Date
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var name: java.lang.String
  var parent: ShallowReference
  var plan: ShallowReference
  var project: ShallowReference
  var queryString: java.lang.String
  var requirementId: scala.Double
  var revision: scala.Double
  var state: java.lang.String
  var suiteType: java.lang.String
  var suites: js.Array[ShallowReference]
  var testCaseCount: scala.Double
  var testCasesUrl: java.lang.String
  var text: java.lang.String
  var url: java.lang.String
}

object TestSuite {
  @scala.inline
  def apply(
    areaUri: java.lang.String,
    children: js.Array[TestSuite],
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    id: scala.Double,
    inheritDefaultConfigurations: scala.Boolean,
    lastError: java.lang.String,
    lastPopulatedDate: stdLib.Date,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    name: java.lang.String,
    parent: ShallowReference,
    plan: ShallowReference,
    project: ShallowReference,
    queryString: java.lang.String,
    requirementId: scala.Double,
    revision: scala.Double,
    state: java.lang.String,
    suiteType: java.lang.String,
    suites: js.Array[ShallowReference],
    testCaseCount: scala.Double,
    testCasesUrl: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): TestSuite = {
    val __obj = js.Dynamic.literal(areaUri = areaUri, children = children, defaultConfigurations = defaultConfigurations, defaultTesters = defaultTesters, id = id, inheritDefaultConfigurations = inheritDefaultConfigurations, lastError = lastError, lastPopulatedDate = lastPopulatedDate, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, name = name, parent = parent, plan = plan, project = project, queryString = queryString, requirementId = requirementId, revision = revision, state = state, suiteType = suiteType, suites = suites, testCaseCount = testCaseCount, testCasesUrl = testCasesUrl, text = text, url = url)
  
    __obj.asInstanceOf[TestSuite]
  }
}

