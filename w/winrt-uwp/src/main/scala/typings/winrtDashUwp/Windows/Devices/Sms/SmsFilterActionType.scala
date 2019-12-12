package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sms.SmsFilterActionType.accept
import typings.winrtDashUwp.Windows.Devices.Sms.SmsFilterActionType.acceptImmediately
import typings.winrtDashUwp.Windows.Devices.Sms.SmsFilterActionType.drop
import typings.winrtDashUwp.Windows.Devices.Sms.SmsFilterActionType.peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsFilterActionType extends js.Object

/** Values that describe the action to be taken on a message filter. */
@JSGlobal("Windows.Devices.Sms.SmsFilterActionType")
@js.native
object SmsFilterActionType extends js.Object {
  /** Filters with this action type are applied after Peek filters. Messages filtered on this action type are delivered to your app. A copy of the message can also be delivered to the messaging application to be shown to the user if appropriate. Note that if multiple applications register the same filter with this action type, each application gets its own copy of the message. */
  @js.native
  sealed trait accept extends SmsFilterActionType
  
  /** The first action type to be taken. Messages filtered on this action type are delivered to your application and are not delivered to the messaging application to be shown to the user. Note that if multiple applications register the same filter with this action type, each application gets its own copy of the message. */
  @js.native
  sealed trait acceptImmediately extends SmsFilterActionType
  
  /** Filters with this action type are applied after AcceptImmediately filters. Messages filtered on this action type are dropped, and neither your app nor the messaging app receive the message or any notification that a message arrived and was dropped. */
  @js.native
  sealed trait drop extends SmsFilterActionType
  
  /** Filters with this action type are applied after Drop filters. This action type allows your app to inspect each message and decide which are dropped and which continue on to be processed or shown to the user. */
  @js.native
  sealed trait peek extends SmsFilterActionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsFilterActionType with Double] = js.native
  /* 3 */ @js.native
  object accept extends TopLevel[accept with Double]
  
  /* 0 */ @js.native
  object acceptImmediately extends TopLevel[acceptImmediately with Double]
  
  /* 1 */ @js.native
  object drop extends TopLevel[drop with Double]
  
  /* 2 */ @js.native
  object peek extends TopLevel[peek with Double]
  
}

