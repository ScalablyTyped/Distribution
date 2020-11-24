package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactCardTabKind extends js.Object
/** Specifies which tab to display on a mini contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardTabKind")
@js.native
object ContactCardTabKind extends js.Object {
  
  /** The default tab. */
  @js.native
  sealed trait default extends ContactCardTabKind
  
  /** The email tab. */
  @js.native
  sealed trait email extends ContactCardTabKind
  
  /** The messaging tab. */
  @js.native
  sealed trait messaging extends ContactCardTabKind
  
  /** The phone tab. */
  @js.native
  sealed trait phone extends ContactCardTabKind
  
  /** The video tab. */
  @js.native
  sealed trait video extends ContactCardTabKind
}
