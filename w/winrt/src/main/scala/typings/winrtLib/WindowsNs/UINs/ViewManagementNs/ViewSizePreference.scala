package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewSizePreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
@js.native
object ViewSizePreference extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  @js.native
  sealed trait useHalf
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  @js.native
  sealed trait useLess
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  @js.native
  sealed trait useMinimum
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  @js.native
  sealed trait useMore
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  @js.native
  sealed trait useNone
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 2 */ val useHalf: useHalf with scala.Double = js.native
  /* 1 */ val useLess: useLess with scala.Double = js.native
  /* 4 */ val useMinimum: useMinimum with scala.Double = js.native
  /* 3 */ val useMore: useMore with scala.Double = js.native
  /* 5 */ val useNone: useNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference with scala.Double] = js.native
}

