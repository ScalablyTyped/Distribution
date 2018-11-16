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
  
  val deletedItems: deletedItems with java.lang.String = js.native
  val drafts: drafts with java.lang.String = js.native
  val inbox: inbox with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val outbox: outbox with java.lang.String = js.native
  val root: root with java.lang.String = js.native
  val sent: sent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailSpecialFolderKind with java.lang.String
  ] = js.native
}

