package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerExecutionDefinition extends js.Object {
  var events: JobEventsConfig
}

object ServerExecutionDefinition {
  @scala.inline
  def apply(events: JobEventsConfig): ServerExecutionDefinition = {
    val __obj = js.Dynamic.literal(events = events)
  
    __obj.asInstanceOf[ServerExecutionDefinition]
  }
}

