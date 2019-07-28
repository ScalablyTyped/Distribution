package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerImageTrigger extends ReleaseTriggerBase {
  var alias: String
}

object ContainerImageTrigger {
  @scala.inline
  def apply(alias: String, triggerType: ReleaseTriggerType): ContainerImageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias, triggerType = triggerType)
  
    __obj.asInstanceOf[ContainerImageTrigger]
  }
}

