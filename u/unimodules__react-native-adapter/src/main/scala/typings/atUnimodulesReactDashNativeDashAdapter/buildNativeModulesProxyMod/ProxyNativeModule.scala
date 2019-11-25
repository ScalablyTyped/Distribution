package typings.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyNativeModule
  extends /* propertyName */ StringDictionary[js.Any] {
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object ProxyNativeModule {
  @scala.inline
  def apply(
    addListener: String => Unit,
    removeListeners: Double => Unit,
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null
  ): ProxyNativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ProxyNativeModule]
  }
}

