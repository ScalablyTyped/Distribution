package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailSpecialFolderKind extends StObject
/** Defines the email special folders. */
@JSGlobal("Windows.ApplicationModel.Email.EmailSpecialFolderKind")
@js.native
object EmailSpecialFolderKind extends StObject {
  
  /** This is the deleted items folder. */
  @js.native
  sealed trait deletedItems
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is the drafts folder. */
  @js.native
  sealed trait drafts
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is the inbox folder. */
  @js.native
  sealed trait inbox
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is not a special folder. */
  @js.native
  sealed trait none
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is the outbox folder. */
  @js.native
  sealed trait outbox
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is the root folder. */
  @js.native
  sealed trait root
    extends StObject
       with EmailSpecialFolderKind
  
  /** This is the sent items folder. */
  @js.native
  sealed trait sent
    extends StObject
       with EmailSpecialFolderKind
}
