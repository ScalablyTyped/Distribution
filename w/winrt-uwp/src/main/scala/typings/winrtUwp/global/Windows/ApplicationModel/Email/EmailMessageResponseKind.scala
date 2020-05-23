package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the type of response to an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageResponseKind")
@js.native
object EmailMessageResponseKind extends js.Object {
  /* 3 */ val forward: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.forward with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.none with Double = js.native
  /* 1 */ val reply: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.reply with Double = js.native
  /* 2 */ val replyAll: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.replyAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind with Double
  ] = js.native
}

