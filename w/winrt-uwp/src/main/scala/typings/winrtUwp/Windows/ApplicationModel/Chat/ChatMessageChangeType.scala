package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageChangeType extends StObject
/** Specifies the type of change made to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeType")
@js.native
object ChatMessageChangeType extends StObject {
  
  /** Change tracking lost. */
  @js.native
  sealed trait changeTrackingLost
    extends StObject
       with ChatMessageChangeType
  
  /** Message created. */
  @js.native
  sealed trait messageCreated
    extends StObject
       with ChatMessageChangeType
  
  /** Message deleted. */
  @js.native
  sealed trait messageDeleted
    extends StObject
       with ChatMessageChangeType
  
  /** Message modified. */
  @js.native
  sealed trait messageModified
    extends StObject
       with ChatMessageChangeType
}
