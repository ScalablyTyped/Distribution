package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanUpdateModel extends js.Object {
  var area: ShallowReference
  var automatedTestEnvironment: TestEnvironment
  var automatedTestSettings: TestSettings
  var build: ShallowReference
  var buildDefinition: ShallowReference
  var configurationIds: js.Array[scala.Double]
  var description: java.lang.String
  var endDate: java.lang.String
  var iteration: java.lang.String
  var manualTestEnvironment: TestEnvironment
  var manualTestSettings: TestSettings
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  var startDate: java.lang.String
  var state: java.lang.String
  var status: java.lang.String
}

