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
  
  val toastImageAndText01: toastImageAndText01 with java.lang.String = js.native
  val toastImageAndText02: toastImageAndText02 with java.lang.String = js.native
  val toastImageAndText03: toastImageAndText03 with java.lang.String = js.native
  val toastImageAndText04: toastImageAndText04 with java.lang.String = js.native
  val toastText01: toastText01 with java.lang.String = js.native
  val toastText02: toastText02 with java.lang.String = js.native
  val toastText03: toastText03 with java.lang.String = js.native
  val toastText04: toastText04 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType with java.lang.String
  ] = js.native
}

