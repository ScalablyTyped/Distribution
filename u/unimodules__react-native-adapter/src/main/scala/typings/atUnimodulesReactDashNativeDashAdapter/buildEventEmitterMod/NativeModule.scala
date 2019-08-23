package typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeModule extends js.Object {
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object NativeModule {
  @scala.inline
  def apply(
    addListener: String => Unit,
    removeListeners: Double => Unit,
    startObserving: () => Unit = null,
    stopObserving: () => Unit = null
  ): NativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    if (startObserving != null) __obj.updateDynamic("startObserving")(js.Any.fromFunction0(startObserving))
    if (stopObserving != null) __obj.updateDynamic("stopObserving")(js.Any.fromFunction0(stopObserving))
    __obj.asInstanceOf[NativeModule]
  }
}

