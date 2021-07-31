package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents event parameters used by the event handler that processes message change events. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangedEventArgs")
@js.native
abstract class ChatMessageChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangedEventArgs {
  
  /**
    * The message changed event handler that an application registers with the message store receives a deferral object in the event parameters. The GetDeferral method registers a change deferral and allows an application to take action related to the change before the message store completes the change.
    * @return Gets a deferral for the MessageChanged event.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangedDeferral = js.native
}
