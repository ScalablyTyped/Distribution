package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /** The query is for email messages that have been flagged. */
  @js.native
  sealed trait flagged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /** The query is for email messages marked Important. */
  @js.native
  sealed trait important
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /** The query is for all email messages that have been read. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /** The query is for all unread email messages. */
  @js.native
  sealed trait unread
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /** The query is for all email messages that have not yet been seen. */
  @js.native
  sealed trait unseen
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 2 */ val flagged: flagged with scala.Double = js.native
  /* 1 */ val important: important with scala.Double = js.native
  /* 4 */ val read: read with scala.Double = js.native
  /* 3 */ val unread: unread with scala.Double = js.native
  /* 5 */ val unseen: unseen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind with scala.Double
  ] = js.native
}

