package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneLineChangeKind extends js.Object

/** Indicates the type of change for a background phone line change trigger. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind")
@js.native
object PhoneLineChangeKind extends js.Object {
  /** A new phone line was added. */
  @js.native
  sealed trait added
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineChangeKind
  
  /** A phone line has updated properties. */
  @js.native
  sealed trait propertiesChanged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineChangeKind
  
  /** A phone line was removed. */
  @js.native
  sealed trait removed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineChangeKind
  
  val added: added with java.lang.String = js.native
  val propertiesChanged: propertiesChanged with java.lang.String = js.native
  val removed: removed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineChangeKind with java.lang.String
  ] = js.native
}

