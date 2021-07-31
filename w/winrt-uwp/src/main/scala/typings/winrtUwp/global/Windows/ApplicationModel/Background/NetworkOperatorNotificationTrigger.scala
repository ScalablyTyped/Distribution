package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile network operator notification trigger. */
@JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger")
@js.native
class NetworkOperatorNotificationTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger {
  /**
    * Initializes a new instance of a mobile network operator notification.
    * @param networkAccountId Specifies the unique identifier of the mobile broadband account.
    */
  def this(networkAccountId: String) = this()
  
  /** Gets the account identifier for the mobile network operator notification trigger. */
  /* CompleteClass */
  var networkAccountId: String = js.native
}
