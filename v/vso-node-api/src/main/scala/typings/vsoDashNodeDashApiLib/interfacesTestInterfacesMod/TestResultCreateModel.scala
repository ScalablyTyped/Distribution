package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultCreateModel extends js.Object {
  var area: ShallowReference
  var associatedWorkItems: js.Array[scala.Double]
  var automatedTestId: java.lang.String
  var automatedTestName: java.lang.String
  var automatedTestStorage: java.lang.String
  var automatedTestType: java.lang.String
  var automatedTestTypeId: java.lang.String
  var comment: java.lang.String
  var completedDate: java.lang.String
  var computerName: java.lang.String
  var configuration: ShallowReference
  var customFields: js.Array[CustomTestField]
  var durationInMs: java.lang.String
  var errorMessage: java.lang.String
  var failureType: java.lang.String
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var resolutionState: java.lang.String
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: java.lang.String
  var state: java.lang.String
  var testCase: ShallowReference
  var testCasePriority: java.lang.String
  var testCaseTitle: java.lang.String
  var testPoint: ShallowReference
}

