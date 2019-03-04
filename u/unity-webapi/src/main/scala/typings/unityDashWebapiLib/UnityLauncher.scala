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

object UnityLauncher {
  @scala.inline
  def apply(
    addAction: js.Function2[java.lang.String, js.Function, js.Any],
    clearCount: js.Function0[js.Any],
    clearProgress: js.Function0[js.Any],
    removeAction: js.Function1[java.lang.String, js.Any],
    removeActions: js.Function0[js.Any],
    setCount: js.Function1[scala.Double, js.Any],
    setProgress: js.Function1[scala.Double, js.Any],
    setUrgent: js.Function1[scala.Boolean, js.Any]
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = addAction, clearCount = clearCount, clearProgress = clearProgress, removeAction = removeAction, removeActions = removeActions, setCount = setCount, setProgress = setProgress, setUrgent = setUrgent)
  
    __obj.asInstanceOf[UnityLauncher]
  }
}

