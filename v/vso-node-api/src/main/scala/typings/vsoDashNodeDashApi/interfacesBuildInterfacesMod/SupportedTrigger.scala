package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedTrigger extends js.Object {
  /**
    * The default interval to wait between polls (only relevant when NotificationType is Polling).
    */
  var defaultPollingInterval: Double
  /**
    * How the trigger is notified of changes.
    */
  var notificationType: String
  /**
    * The capabilities supported by this trigger.
    */
  var supportedCapabilities: StringDictionary[SupportLevel]
  /**
    * The type of trigger.
    */
  var `type`: DefinitionTriggerType
}

object SupportedTrigger {
  @scala.inline
  def apply(
    defaultPollingInterval: Double,
    notificationType: String,
    supportedCapabilities: StringDictionary[SupportLevel],
    `type`: DefinitionTriggerType
  ): SupportedTrigger = {
    val __obj = js.Dynamic.literal(defaultPollingInterval = defaultPollingInterval, notificationType = notificationType, supportedCapabilities = supportedCapabilities)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SupportedTrigger]
  }
}

