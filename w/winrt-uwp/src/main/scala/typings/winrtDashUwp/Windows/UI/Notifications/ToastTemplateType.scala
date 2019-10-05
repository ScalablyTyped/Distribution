package typings.winrtDashUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastTemplateType extends js.Object

/** Specifies the template to use in a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastTemplateType")
@js.native
object ToastTemplateType extends js.Object {
  /** A large image and a single string wrapped across three lines of text. */
  @js.native
  sealed trait toastImageAndText01 extends ToastTemplateType
  
  /** A large image, one string of bold text on the first line, one string of regular text wrapped across the second and third lines. */
  @js.native
  sealed trait toastImageAndText02 extends ToastTemplateType
  
  /** A large image, one string of bold text wrapped across the first two lines, one string of regular text on the third line. */
  @js.native
  sealed trait toastImageAndText03 extends ToastTemplateType
  
  /** A large image, one string of bold text on the first line, one string of regular text on the second line, one string of regular text on the third line. */
  @js.native
  sealed trait toastImageAndText04 extends ToastTemplateType
  
  /** A single string wrapped across three lines of text. */
  @js.native
  sealed trait toastText01 extends ToastTemplateType
  
  /** One string of bold text on the first line, one string of regular text wrapped across the second and third lines. */
  @js.native
  sealed trait toastText02 extends ToastTemplateType
  
  /** One string of bold text wrapped across the first and second lines, one string of regular text on the third line. */
  @js.native
  sealed trait toastText03 extends ToastTemplateType
  
  /** One string of bold text on the first line, one string of regular text on the second line, one string of regular text on the third line. */
  @js.native
  sealed trait toastText04 extends ToastTemplateType
  
  /* 0 */ val toastImageAndText01: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 with Double = js.native
  /* 1 */ val toastImageAndText02: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 with Double = js.native
  /* 2 */ val toastImageAndText03: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 with Double = js.native
  /* 3 */ val toastImageAndText04: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 with Double = js.native
  /* 4 */ val toastText01: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText01 with Double = js.native
  /* 5 */ val toastText02: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText02 with Double = js.native
  /* 6 */ val toastText03: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText03 with Double = js.native
  /* 7 */ val toastText04: typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText04 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastTemplateType with Double] = js.native
}

