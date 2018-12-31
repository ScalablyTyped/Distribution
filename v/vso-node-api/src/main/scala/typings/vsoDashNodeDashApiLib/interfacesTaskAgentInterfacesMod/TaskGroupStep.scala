package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupStep extends js.Object {
  var alwaysRun: scala.Boolean
  var continueOnError: scala.Boolean
  var displayName: java.lang.String
  var enabled: scala.Boolean
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var task: TaskDefinitionReference
  var timeoutInMinutes: scala.Double
}

