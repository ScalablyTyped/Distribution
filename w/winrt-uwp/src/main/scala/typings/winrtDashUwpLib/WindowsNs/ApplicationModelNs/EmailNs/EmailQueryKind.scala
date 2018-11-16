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
  
  val all: all with java.lang.String = js.native
  val flagged: flagged with java.lang.String = js.native
  val important: important with java.lang.String = js.native
  val read: read with java.lang.String = js.native
  val unread: unread with java.lang.String = js.native
  val unseen: unseen with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQueryKind with java.lang.String
  ] = js.native
}

