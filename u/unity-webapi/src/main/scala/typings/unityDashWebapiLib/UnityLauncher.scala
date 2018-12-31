package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityLauncher extends js.Object {
  def addAction(name: java.lang.String, onActionInvoked: js.Function): js.Any
  def clearCount(): js.Any
  def clearProgress(): js.Any
  def removeAction(name: java.lang.String): js.Any
  def removeActions(): js.Any
  def setCount(count: scala.Double): js.Any
  def setProgress(progress: scala.Double): js.Any
  def setUrgent(urgent: scala.Boolean): js.Any
}

