package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQueryKind extends js.Object

/** Defines the type of email query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryKind")
@js.native
object EmailQueryKind extends js.Object {
  /** The query is for all email messages. */
  @js.native
  sealed trait all extends EmailQueryKind
  
  /** The query is for email messages that have been flagged. */
  @js.native
  sealed trait flagged extends EmailQueryKind
  
  /** The query is for email messages marked Important. */
  @js.native
  sealed trait important extends EmailQueryKind
  
  /** The query is for all email messages that have been read. */
  @js.native
  sealed trait read extends EmailQueryKind
  
  /** The query is for all unread email messages. */
  @js.native
  sealed trait unread extends EmailQueryKind
  
  /** The query is for all email messages that have not yet been seen. */
  @js.native
  sealed trait unseen extends EmailQueryKind
  
  /* 0 */ val all: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.all with Double = js.native
  /* 2 */ val flagged: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.flagged with Double = js.native
  /* 1 */ val important: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.important with Double = js.native
  /* 4 */ val read: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.read with Double = js.native
  /* 3 */ val unread: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.unread with Double = js.native
  /* 5 */ val unseen: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.unseen with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQueryKind with Double] = js.native
}

