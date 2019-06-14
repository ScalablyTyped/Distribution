package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailSpecialFolderKind extends js.Object

/** Defines the email special folders. */
@JSGlobal("Windows.ApplicationModel.Email.EmailSpecialFolderKind")
@js.native
object EmailSpecialFolderKind extends js.Object {
  /** This is the deleted items folder. */
  @js.native
  sealed trait deletedItems
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is the drafts folder. */
  @js.native
  sealed trait drafts
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is the inbox folder. */
  @js.native
  sealed trait inbox
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is not a special folder. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is the outbox folder. */
  @js.native
  sealed trait outbox
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is the root folder. */
  @js.native
  sealed trait root
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /** This is the sent items folder. */
  @js.native
  sealed trait sent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind
  
  /* 5 */ val deletedItems: deletedItems with scala.Double = js.native
  /* 4 */ val drafts: drafts with scala.Double = js.native
  /* 2 */ val inbox: inbox with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val outbox: outbox with scala.Double = js.native
  /* 1 */ val root: root with scala.Double = js.native
  /* 6 */ val sent: sent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind with scala.Double
  ] = js.native
}

