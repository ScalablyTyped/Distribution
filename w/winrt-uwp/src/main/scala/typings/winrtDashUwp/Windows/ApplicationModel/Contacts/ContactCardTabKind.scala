package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind.default
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind.email
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind.messaging
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind.phone
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactCardTabKind.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactCardTabKind with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object email extends TopLevel[email with Double]
  
  /* 2 */ @js.native
  object messaging extends TopLevel[messaging with Double]
  
  /* 3 */ @js.native
  object phone extends TopLevel[phone with Double]
  
  /* 4 */ @js.native
  object video extends TopLevel[video with Double]
  
}

