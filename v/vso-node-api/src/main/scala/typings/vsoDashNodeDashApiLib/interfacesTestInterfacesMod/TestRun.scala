package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestRun extends js.Object {
  var build: ShallowReference
  var buildConfiguration: BuildConfiguration
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var controller: java.lang.String
  var createdDate: stdLib.Date
  var customFields: js.Array[CustomTestField]
  var dropLocation: java.lang.String
  var dtlAutEnvironment: ShallowReference
  var dtlEnvironment: ShallowReference
  var dtlEnvironmentCreationDetails: DtlEnvironmentDetails
  var dueDate: stdLib.Date
  var errorMessage: java.lang.String
  var filter: RunFilter
  var id: scala.Double
  var incompleteTests: scala.Double
  var isAutomated: scala.Boolean
  var iteration: java.lang.String
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var name: java.lang.String
  var notApplicableTests: scala.Double
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var passedTests: scala.Double
  var phase: java.lang.String
  var plan: ShallowReference
  var postProcessState: java.lang.String
  var project: ShallowReference
  var release: ReleaseReference
  var releaseEnvironmentUri: java.lang.String
  var releaseUri: java.lang.String
  var revision: scala.Double
  var runStatistics: js.Array[RunStatistic]
  var startedDate: stdLib.Date
  var state: java.lang.String
  var substate: TestRunSubstate
  var testEnvironment: TestEnvironment
  var testMessageLogId: scala.Double
  var testSettings: ShallowReference
  var totalTests: scala.Double
  var unanalyzedTests: scala.Double
  var url: java.lang.String
  var webAccessUrl: java.lang.String
}

