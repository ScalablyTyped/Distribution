package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToastTemplateType extends StObject
/** Specifies the template to use in a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastTemplateType")
@js.native
object ToastTemplateType extends StObject {
  
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
}
