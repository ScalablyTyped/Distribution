package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskOrchestrationJob extends TaskOrchestrationItem {
  var demands: js.Array[_]
  var executeAs: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var executionMode: java.lang.String
  var executionTimeout: js.Any
  var instanceId: java.lang.String
  var name: java.lang.String
  var tasks: js.Array[TaskInstance]
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

