package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskBuilder extends js.Object {
  var name: java.lang.String
  var taskEntryPoint: java.lang.String
  def addCondition(condition: IBackgroundCondition): scala.Unit
  def register(): BackgroundTaskRegistration
  def setTrigger(trigger: IBackgroundTrigger): scala.Unit
}

