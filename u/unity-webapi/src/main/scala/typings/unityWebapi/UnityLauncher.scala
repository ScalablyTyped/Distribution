package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityLauncher extends js.Object {
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  def clearCount(): js.Any
  def clearProgress(): js.Any
  def removeAction(name: String): js.Any
  def removeActions(): js.Any
  def setCount(count: Double): js.Any
  def setProgress(progress: Double): js.Any
  def setUrgent(urgent: Boolean): js.Any
}

object UnityLauncher {
  @scala.inline
  def apply(
    addAction: (String, js.Function) => js.Any,
    clearCount: () => js.Any,
    clearProgress: () => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any,
    setCount: Double => js.Any,
    setProgress: Double => js.Any,
    setUrgent: Boolean => js.Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
}

