package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedTrigger extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SupportedTrigger] (val x: Self) extends AnyVal {
    
    inline def setDefaultPollingInterval(value: Double): Self = StObject.set(x, "defaultPollingInterval", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setSupportedCapabilities(value: StringDictionary[SupportLevel]): Self = StObject.set(x, "supportedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setType(value: DefinitionTriggerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
