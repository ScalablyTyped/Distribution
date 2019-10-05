package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastTemplateType extends js.Object

@JSGlobal("Windows.UI.Notifications.ToastTemplateType")
@js.native
object ToastTemplateType extends js.Object {
  @js.native
  sealed trait toastImageAndText01 extends ToastTemplateType
  
  @js.native
  sealed trait toastImageAndText02 extends ToastTemplateType
  
  @js.native
  sealed trait toastImageAndText03 extends ToastTemplateType
  
  @js.native
  sealed trait toastImageAndText04 extends ToastTemplateType
  
  @js.native
  sealed trait toastText01 extends ToastTemplateType
  
  @js.native
  sealed trait toastText02 extends ToastTemplateType
  
  @js.native
  sealed trait toastText03 extends ToastTemplateType
  
  @js.native
  sealed trait toastText04 extends ToastTemplateType
  
  /* 0 */ val toastImageAndText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 with Double = js.native
  /* 1 */ val toastImageAndText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 with Double = js.native
  /* 2 */ val toastImageAndText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 with Double = js.native
  /* 3 */ val toastImageAndText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 with Double = js.native
  /* 4 */ val toastText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText01 with Double = js.native
  /* 5 */ val toastText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText02 with Double = js.native
  /* 6 */ val toastText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText03 with Double = js.native
  /* 7 */ val toastText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText04 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastTemplateType with Double] = js.native
}

