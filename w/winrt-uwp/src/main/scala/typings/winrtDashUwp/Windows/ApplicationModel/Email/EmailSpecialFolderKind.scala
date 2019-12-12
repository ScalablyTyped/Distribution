package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.deletedItems
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.drafts
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.inbox
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.none
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.outbox
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.root
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailSpecialFolderKind.sent
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailSpecialFolderKind with Double] = js.native
  /* 5 */ @js.native
  object deletedItems extends TopLevel[deletedItems with Double]
  
  /* 4 */ @js.native
  object drafts extends TopLevel[drafts with Double]
  
  /* 2 */ @js.native
  object inbox extends TopLevel[inbox with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object outbox extends TopLevel[outbox with Double]
  
  /* 1 */ @js.native
  object root extends TopLevel[root with Double]
  
  /* 6 */ @js.native
  object sent extends TopLevel[sent with Double]
  
}

