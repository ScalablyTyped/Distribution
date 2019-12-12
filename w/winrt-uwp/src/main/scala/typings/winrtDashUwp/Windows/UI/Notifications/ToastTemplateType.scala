package typings.winrtDashUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText01
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText02
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText03
import typings.winrtDashUwp.Windows.UI.Notifications.ToastTemplateType.toastText04
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastTemplateType with Double] = js.native
  /* 0 */ @js.native
  object toastImageAndText01 extends TopLevel[toastImageAndText01 with Double]
  
  /* 1 */ @js.native
  object toastImageAndText02 extends TopLevel[toastImageAndText02 with Double]
  
  /* 2 */ @js.native
  object toastImageAndText03 extends TopLevel[toastImageAndText03 with Double]
  
  /* 3 */ @js.native
  object toastImageAndText04 extends TopLevel[toastImageAndText04 with Double]
  
  /* 4 */ @js.native
  object toastText01 extends TopLevel[toastText01 with Double]
  
  /* 5 */ @js.native
  object toastText02 extends TopLevel[toastText02 with Double]
  
  /* 6 */ @js.native
  object toastText03 extends TopLevel[toastText03 with Double]
  
  /* 7 */ @js.native
  object toastText04 extends TopLevel[toastText04 with Double]
  
}

