package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskInstance extends js.Object {
  var instanceId: java.lang.String
  var oncanceled: js.Any
  var progress: scala.Double
  var suspendedCount: scala.Double
  var task: BackgroundTaskRegistration
  var triggerDetails: js.Any
  def getDeferral(): BackgroundTaskDeferral
}

