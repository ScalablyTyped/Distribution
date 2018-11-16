package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  @js.native
  sealed trait landscape
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  @js.native
  sealed trait portrait
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  val landscape: landscape with java.lang.String = js.native
  val portrait: portrait with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation with java.lang.String
  ] = js.native
}

