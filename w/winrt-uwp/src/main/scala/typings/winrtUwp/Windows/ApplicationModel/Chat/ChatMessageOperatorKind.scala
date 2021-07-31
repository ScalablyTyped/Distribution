package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageOperatorKind extends StObject
/** Specifies the message operator type. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageOperatorKind")
@js.native
object ChatMessageOperatorKind extends StObject {
  
  /** MMS message */
  @js.native
  sealed trait mms
    extends StObject
       with ChatMessageOperatorKind
  
  /** RCS message */
  @js.native
  sealed trait rcs
    extends StObject
       with ChatMessageOperatorKind
  
  /** SMS message */
  @js.native
  sealed trait sms
    extends StObject
       with ChatMessageOperatorKind
  
  /** The value hasn't been set. */
  @js.native
  sealed trait unspecified
    extends StObject
       with ChatMessageOperatorKind
}
