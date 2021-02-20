package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBadgeUpdater extends StObject {
  
  def clear(): Unit = js.native
  
  def startPeriodicUpdate(badgeContent: Uri, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, startTime: Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  
  def stopPeriodicUpdate(): Unit = js.native
  
  def update(notification: BadgeNotification): Unit = js.native
}
