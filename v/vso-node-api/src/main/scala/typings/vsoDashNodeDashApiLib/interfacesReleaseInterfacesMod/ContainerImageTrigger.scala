package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerImageTrigger extends ReleaseTriggerBase {
  var alias: java.lang.String
}

object ContainerImageTrigger {
  @scala.inline
  def apply(alias: java.lang.String, triggerType: ReleaseTriggerType): ContainerImageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias, triggerType = triggerType)
  
    __obj.asInstanceOf[ContainerImageTrigger]
  }
}

