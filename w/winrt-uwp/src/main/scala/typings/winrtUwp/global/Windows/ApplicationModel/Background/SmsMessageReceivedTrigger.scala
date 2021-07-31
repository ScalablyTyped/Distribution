package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Sms.SmsFilterRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is raised when an SMS message has arrived. */
@JSGlobal("Windows.ApplicationModel.Background.SmsMessageReceivedTrigger")
@js.native
class SmsMessageReceivedTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.SmsMessageReceivedTrigger {
  /**
    * Initializes a new instance of an SMS message received trigger.
    * @param filterRules Filter rules to be applied to incoming SMS messages. Only messages that pass through the filter rules raise the trigger.
    */
  def this(filterRules: SmsFilterRules) = this()
}
