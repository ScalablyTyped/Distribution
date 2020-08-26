package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedTrigger extends js.Object {
  /**
    * The default interval to wait between polls (only relevant when NotificationType is Polling).
    */
  var defaultPollingInterval: Double = js.native
  /**
    * How the trigger is notified of changes.
    */
  var notificationType: String = js.native
  /**
    * The capabilities supported by this trigger.
    */
  var supportedCapabilities: StringDictionary[SupportLevel] = js.native
  /**
    * The type of trigger.
    */
  var `type`: DefinitionTriggerType = js.native
}

object SupportedTrigger {
  @scala.inline
  def apply(
    defaultPollingInterval: Double,
    notificationType: String,
    supportedCapabilities: StringDictionary[SupportLevel],
    `type`: DefinitionTriggerType
  ): SupportedTrigger = {
    val __obj = js.Dynamic.literal(defaultPollingInterval = defaultPollingInterval.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], supportedCapabilities = supportedCapabilities.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedTrigger]
  }
  @scala.inline
  implicit class SupportedTriggerOps[Self <: SupportedTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultPollingInterval(value: Double): Self = this.set("defaultPollingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationType(value: String): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedCapabilities(value: StringDictionary[SupportLevel]): Self = this.set("supportedCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DefinitionTriggerType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

