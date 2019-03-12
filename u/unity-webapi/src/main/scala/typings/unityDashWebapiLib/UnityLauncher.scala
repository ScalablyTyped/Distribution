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
    addAction: (java.lang.String, js.Function) => js.Any,
    clearCount: () => js.Any,
    clearProgress: () => js.Any,
    removeAction: java.lang.String => js.Any,
    removeActions: () => js.Any,
    setCount: scala.Double => js.Any,
    setProgress: scala.Double => js.Any,
    setUrgent: scala.Boolean => js.Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
  
    __obj.asInstanceOf[UnityLauncher]
  }
}

