package typings.winrtUwp.Windows.ApplicationModel.Email

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
  
}

