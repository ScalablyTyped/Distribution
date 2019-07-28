package typings.winrt.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  @js.native
  sealed trait landscape extends ApplicationViewOrientation
  
  @js.native
  sealed trait portrait extends ApplicationViewOrientation
  
  /* 0 */ val landscape: typings.winrt.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation.landscape with Double = js.native
  /* 1 */ val portrait: typings.winrt.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation.portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewOrientation with Double] = js.native
}

