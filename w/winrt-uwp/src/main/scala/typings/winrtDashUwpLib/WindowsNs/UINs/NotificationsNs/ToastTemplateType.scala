package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

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
  sealed trait toastImageAndText01
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** A large image, one string of bold text on the first line, one string of regular text wrapped across the second and third lines. */
  @js.native
  sealed trait toastImageAndText02
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** A large image, one string of bold text wrapped across the first two lines, one string of regular text on the third line. */
  @js.native
  sealed trait toastImageAndText03
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** A large image, one string of bold text on the first line, one string of regular text on the second line, one string of regular text on the third line. */
  @js.native
  sealed trait toastImageAndText04
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** A single string wrapped across three lines of text. */
  @js.native
  sealed trait toastText01
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** One string of bold text on the first line, one string of regular text wrapped across the second and third lines. */
  @js.native
  sealed trait toastText02
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** One string of bold text wrapped across the first and second lines, one string of regular text on the third line. */
  @js.native
  sealed trait toastText03
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /** One string of bold text on the first line, one string of regular text on the second line, one string of regular text on the third line. */
  @js.native
  sealed trait toastText04
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType
  
  /* 0 */ val toastImageAndText01: toastImageAndText01 with scala.Double = js.native
  /* 1 */ val toastImageAndText02: toastImageAndText02 with scala.Double = js.native
  /* 2 */ val toastImageAndText03: toastImageAndText03 with scala.Double = js.native
  /* 3 */ val toastImageAndText04: toastImageAndText04 with scala.Double = js.native
  /* 4 */ val toastText01: toastText01 with scala.Double = js.native
  /* 5 */ val toastText02: toastText02 with scala.Double = js.native
  /* 6 */ val toastText03: toastText03 with scala.Double = js.native
  /* 7 */ val toastText04: toastText04 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType with scala.Double
  ] = js.native
}

