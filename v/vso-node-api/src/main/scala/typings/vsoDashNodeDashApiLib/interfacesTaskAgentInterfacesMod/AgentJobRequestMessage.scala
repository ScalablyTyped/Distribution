package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AgentJobRequestMessage extends JobRequestMessage {
  var lockToken: java.lang.String
  var lockedUntil: stdLib.Date
  var requestId: scala.Double
  var tasks: js.Array[TaskInstance]
}

