package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactCardHeaderKind extends StObject
/** Specifies the type of header information to show on a contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardHeaderKind")
@js.native
object ContactCardHeaderKind extends StObject {
  
  /** Display the default header. */
  @js.native
  sealed trait default extends ContactCardHeaderKind
  
  /** Display a basic header. */
  @js.native
  sealed trait basic extends ContactCardHeaderKind
  
  /** Display an enterprise header. */
  @js.native
  sealed trait enterprise extends ContactCardHeaderKind
}
