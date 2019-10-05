package typings.winrt.Windows.UI.ViewManagement

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
  
  /* 0 */ val default: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.default with Double = js.native
  /* 2 */ val useHalf: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useHalf with Double = js.native
  /* 1 */ val useLess: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useLess with Double = js.native
  /* 4 */ val useMinimum: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMinimum with Double = js.native
  /* 3 */ val useMore: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMore with Double = js.native
  /* 5 */ val useNone: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useNone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewSizePreference with Double] = js.native
}

