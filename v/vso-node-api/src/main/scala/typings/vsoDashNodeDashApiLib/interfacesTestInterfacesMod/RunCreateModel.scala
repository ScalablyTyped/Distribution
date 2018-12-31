package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCreateModel extends js.Object {
  var automated: scala.Boolean
  var build: ShallowReference
  var buildDropLocation: java.lang.String
  var buildFlavor: java.lang.String
  var buildPlatform: java.lang.String
  var comment: java.lang.String
  var completeDate: java.lang.String
  var configurationIds: js.Array[scala.Double]
  var controller: java.lang.String
  var customTestFields: js.Array[CustomTestField]
  var dtlAutEnvironment: ShallowReference
  var dtlTestEnvironment: ShallowReference
  var dueDate: java.lang.String
  var environmentDetails: DtlEnvironmentDetails
  var errorMessage: java.lang.String
  var filter: RunFilter
  var iteration: java.lang.String
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var plan: ShallowReference
  var pointIds: js.Array[scala.Double]
  var releaseEnvironmentUri: java.lang.String
  var releaseUri: java.lang.String
  var runTimeout: js.Any
  var sourceWorkflow: java.lang.String
  var startDate: java.lang.String
  var state: java.lang.String
  var testConfigurationsMapping: java.lang.String
  var testEnvironmentId: java.lang.String
  var testSettings: ShallowReference
  var `type`: java.lang.String
}

