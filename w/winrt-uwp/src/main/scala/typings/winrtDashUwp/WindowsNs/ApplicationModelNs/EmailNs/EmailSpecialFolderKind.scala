package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait deletedItems extends EmailSpecialFolderKind
  
  /** This is the drafts folder. */
  @js.native
  sealed trait drafts extends EmailSpecialFolderKind
  
  /** This is the inbox folder. */
  @js.native
  sealed trait inbox extends EmailSpecialFolderKind
  
  /** This is not a special folder. */
  @js.native
  sealed trait none extends EmailSpecialFolderKind
  
  /** This is the outbox folder. */
  @js.native
  sealed trait outbox extends EmailSpecialFolderKind
  
  /** This is the root folder. */
  @js.native
  sealed trait root extends EmailSpecialFolderKind
  
  /** This is the sent items folder. */
  @js.native
  sealed trait sent extends EmailSpecialFolderKind
  
  /* 5 */ val deletedItems: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.deletedItems with Double = js.native
  /* 4 */ val drafts: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.drafts with Double = js.native
  /* 2 */ val inbox: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.inbox with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.none with Double = js.native
  /* 3 */ val outbox: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.outbox with Double = js.native
  /* 1 */ val root: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.root with Double = js.native
  /* 6 */ val sent: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind.sent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailSpecialFolderKind with Double] = js.native
}

