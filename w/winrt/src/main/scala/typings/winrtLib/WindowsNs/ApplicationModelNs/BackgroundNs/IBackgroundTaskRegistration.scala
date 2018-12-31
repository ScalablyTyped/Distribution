package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskRegistration extends js.Object {
  var name: java.lang.String
  var oncompleted: js.Any
  var onprogress: js.Any
  var taskId: java.lang.String
  def unregister(cancelTask: scala.Boolean): scala.Unit
}

