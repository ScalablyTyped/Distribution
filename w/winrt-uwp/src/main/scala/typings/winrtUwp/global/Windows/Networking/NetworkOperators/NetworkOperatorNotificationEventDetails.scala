package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.ISmsMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network operator notification. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
@js.native
abstract class NetworkOperatorNotificationEventDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails {
  
  /**
    * Used to indicate if tethering is permitted for a device. If it is not, a reason can be provided.
    * @param allow true if tethering is permitted; otherwise, false.
    * @param entitlementFailureReason The reason tethering is not permitted.
    */
  /* CompleteClass */
  override def authorizeTethering(allow: Boolean, entitlementFailureReason: String): Unit = js.native
  
  /** Gets the data-coding scheme (DCS) of the received message. */
  /* CompleteClass */
  var encodingType: Double = js.native
  
  /** Gets the message for the network operator notification. */
  /* CompleteClass */
  var message: String = js.native
  
  /** Gets a unique identifier for the mobile broadband account that received the notification. */
  /* CompleteClass */
  var networkAccountId: String = js.native
  
  /** Gets the type of the network notification. */
  /* CompleteClass */
  var notificationType: typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType = js.native
  
  /** Gets the identifier of the provisioned rule that matched and triggered the notification. */
  /* CompleteClass */
  var ruleId: String = js.native
  
  /** Gets an SMS message for the mobile broadband account that received the notification. */
  /* CompleteClass */
  var smsMessage: ISmsMessage = js.native
}
