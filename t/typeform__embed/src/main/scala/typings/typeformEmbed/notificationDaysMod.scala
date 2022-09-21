package typings.typeformEmbed

import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationDaysMod {
  
  @JSImport("@typeform/embed/types/factories/create-popover/notification-days", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildNotificationDot(): HTMLSpanElement = ^.asInstanceOf[js.Dynamic].applyDynamic("buildNotificationDot")().asInstanceOf[HTMLSpanElement]
  
  inline def canBuildNotificationDot(formId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBuildNotificationDot")(formId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def saveNotificationDotHideUntilTime(formId: String, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveNotificationDotHideUntilTime")(formId.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
