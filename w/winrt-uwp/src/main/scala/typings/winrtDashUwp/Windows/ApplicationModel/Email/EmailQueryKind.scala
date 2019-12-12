package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.all
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.flagged
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.important
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.read
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.unread
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQueryKind.unseen
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQueryKind with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object flagged extends TopLevel[flagged with Double]
  
  /* 1 */ @js.native
  object important extends TopLevel[important with Double]
  
  /* 4 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 3 */ @js.native
  object unread extends TopLevel[unread with Double]
  
  /* 5 */ @js.native
  object unseen extends TopLevel[unseen with Double]
  
}

