package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android application component that executes in the background.
		 */
trait Service
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The intent used to start or bind to the Service.
  			 */
  val intent: Intent
  /**
  			 * A service can be started more than once -- this number (based on an incrementing integer)
  			 * indicates which "start number" in the sequence the current service instance is.
  			 */
  val serviceInstanceId: scala.Double
  /**
  			 * Puts the service into the "background" state and removes its foreground notification.
  			 */
  def foregroundCancel(): scala.Unit
  /**
  			 * Puts the service into the "foreground" state and displays a notification.
  			 */
  def foregroundNotify(id: scala.Double, notification: Notification): scala.Unit
  /**
  			 * Gets the value of the <Titanium.Android.Service.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.Service.serviceInstanceId> property.
  			 */
  def getServiceInstanceId(): scala.Double
  /**
  			 * Starts the Service.
  			 */
  def start(): scala.Unit
  /**
  			 * Stops this running instance of the Service.
  			 */
  def stop(): scala.Unit
}

object Service {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    foregroundCancel: js.Function0[scala.Unit],
    foregroundNotify: js.Function2[scala.Double, Notification, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getIntent: js.Function0[Intent],
    getServiceInstanceId: js.Function0[scala.Double],
    intent: Intent,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    serviceInstanceId: scala.Double,
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Service = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, foregroundCancel = foregroundCancel, foregroundNotify = foregroundNotify, getApiName = getApiName, getBubbleParent = getBubbleParent, getIntent = getIntent, getServiceInstanceId = getServiceInstanceId, intent = intent, removeEventListener = removeEventListener, serviceInstanceId = serviceInstanceId, setBubbleParent = setBubbleParent, start = start, stop = stop)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Service]
  }
}

