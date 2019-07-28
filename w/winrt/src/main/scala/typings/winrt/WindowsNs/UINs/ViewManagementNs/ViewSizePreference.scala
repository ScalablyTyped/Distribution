package typings.winrt.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewSizePreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
@js.native
object ViewSizePreference extends js.Object {
  @js.native
  sealed trait default extends ViewSizePreference
  
  @js.native
  sealed trait useHalf extends ViewSizePreference
  
  @js.native
  sealed trait useLess extends ViewSizePreference
  
  @js.native
  sealed trait useMinimum extends ViewSizePreference
  
  @js.native
  sealed trait useMore extends ViewSizePreference
  
  @js.native
  sealed trait useNone extends ViewSizePreference
  
  /* 0 */ val default: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.default with Double = js.native
  /* 2 */ val useHalf: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useHalf with Double = js.native
  /* 1 */ val useLess: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useLess with Double = js.native
  /* 4 */ val useMinimum: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useMinimum with Double = js.native
  /* 3 */ val useMore: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useMore with Double = js.native
  /* 5 */ val useNone: typings.winrt.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useNone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewSizePreference with Double] = js.native
}

