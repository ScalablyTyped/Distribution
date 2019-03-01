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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areaUri")(areaUri)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("defaultConfigurations")(defaultConfigurations)
    __obj.updateDynamic("defaultTesters")(defaultTesters)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inheritDefaultConfigurations")(inheritDefaultConfigurations)
    __obj.updateDynamic("lastError")(lastError)
    __obj.updateDynamic("lastPopulatedDate")(lastPopulatedDate)
    __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("queryString")(queryString)
    __obj.updateDynamic("requirementId")(requirementId)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("suiteType")(suiteType)
    __obj.updateDynamic("suites")(suites)
    __obj.updateDynamic("testCaseCount")(testCaseCount)
    __obj.updateDynamic("testCasesUrl")(testCasesUrl)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestSuite]
  }
}

