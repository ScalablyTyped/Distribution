package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedTrigger extends js.Object {
  /**
    * The default interval to wait between polls (only relevant when NotificationType is Polling).
    */
  var defaultPollingInterval: scala.Double
  /**
    * How the trigger is notified of changes.
    */
  var notificationType: java.lang.String
  /**
    * The capabilities supported by this trigger.
    */
  var supportedCapabilities: org.scalablytyped.runtime.StringDictionary[SupportLevel]
  /**
    * The type of trigger.
    */
  var `type`: DefinitionTriggerType
}

object SupportedTrigger {
  @scala.inline
  def apply(
    defaultPollingInterval: scala.Double,
    notificationType: java.lang.String,
    supportedCapabilities: org.scalablytyped.runtime.StringDictionary[SupportLevel],
    `type`: DefinitionTriggerType
  ): SupportedTrigger = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("defaultPollingInterval")(defaultPollingInterval)
    __obj.updateDynamic("notificationType")(notificationType)
    __obj.updateDynamic("supportedCapabilities")(supportedCapabilities)
    __obj.asInstanceOf[SupportedTrigger]
  }
}

