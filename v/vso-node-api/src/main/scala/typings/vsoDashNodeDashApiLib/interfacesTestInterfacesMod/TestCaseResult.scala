package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestCaseResult extends js.Object {
  var afnStripId: scala.Double
  var area: ShallowReference
  var associatedBugs: js.Array[ShallowReference]
  var automatedTestId: java.lang.String
  var automatedTestName: java.lang.String
  var automatedTestStorage: java.lang.String
  var automatedTestType: java.lang.String
  var automatedTestTypeId: java.lang.String
  var build: ShallowReference
  var buildReference: BuildReference
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var computerName: java.lang.String
  var configuration: ShallowReference
  var createdDate: stdLib.Date
  var customFields: js.Array[CustomTestField]
  var durationInMs: scala.Double
  var errorMessage: java.lang.String
  var failingSince: FailingSince
  var failureType: java.lang.String
  var id: scala.Double
  var iterationDetails: js.Array[TestIterationDetailsModel]
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var priority: scala.Double
  var project: ShallowReference
  var release: ShallowReference
  var releaseReference: ReleaseReference
  var resetCount: scala.Double
  var resolutionState: java.lang.String
  var resolutionStateId: scala.Double
  var revision: scala.Double
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: stdLib.Date
  var state: java.lang.String
  var testCase: ShallowReference
  var testCaseReferenceId: scala.Double
  var testCaseTitle: java.lang.String
  var testPlan: ShallowReference
  var testPoint: ShallowReference
  var testRun: ShallowReference
  var testSuite: ShallowReference
  var url: java.lang.String
}

