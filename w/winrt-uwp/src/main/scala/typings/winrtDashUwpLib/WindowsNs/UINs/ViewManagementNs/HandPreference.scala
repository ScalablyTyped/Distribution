package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandPreference extends js.Object

/** Defines the set of directional preferences for the user interface presented by the app view. */
@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends js.Object {
  /** The preferred layout is for left-directional users. */
  @js.native
  sealed trait leftHanded
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.HandPreference
  
  /** The preferred layout is for right-directional users. */
  @js.native
  sealed trait rightHanded
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.HandPreference
  
  /* 0 */ val leftHanded: leftHanded with scala.Double = js.native
  /* 1 */ val rightHanded: rightHanded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.HandPreference with scala.Double] = js.native
}

