package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a phone event that triggers a background task. */
@JSGlobal("Windows.ApplicationModel.Background.PhoneTrigger")
@js.native
class PhoneTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.PhoneTrigger {
  /**
    * Initializes a new instance of the PhoneTrigger class.
    * @param type Specifies the type of phone event.
    * @param oneShot Indicates if the trigger is a one-shot notification. If you weren't subscribed when a one-shot notification was sent, you get nothing. If you weren't connected when you fired a one-shot notification, nothing happens.
    */
  def this(`type`: PhoneTriggerType, oneShot: Boolean) = this()
  
  /** Gets a Boolean value indicating if the trigger is a one-shot notification. */
  /* CompleteClass */
  var oneShot: Boolean = js.native
  
  /** Gets the type of phone event indicated by the trigger. */
  /* CompleteClass */
  var triggerType: PhoneTriggerType = js.native
}
