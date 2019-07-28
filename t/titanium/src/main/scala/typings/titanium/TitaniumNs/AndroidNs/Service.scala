package typings.titanium.TitaniumNs.AndroidNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Android application component that executes in the background.
		 */
trait Service extends Proxy {
  /**
  			 * The intent used to start or bind to the Service.
  			 */
  val intent: Intent
  /**
  			 * A service can be started more than once -- this number (based on an incrementing integer)
  			 * indicates which "start number" in the sequence the current service instance is.
  			 */
  val serviceInstanceId: Double
  /**
  			 * Puts the service into the "background" state and removes its foreground notification.
  			 */
  def foregroundCancel(): Unit
  /**
  			 * Puts the service into the "foreground" state and displays a notification.
  			 */
  def foregroundNotify(id: Double, notification: Notification): Unit
  /**
  			 * Gets the value of the <Titanium.Android.Service.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.Service.serviceInstanceId> property.
  			 */
  def getServiceInstanceId(): Double
  /**
  			 * Starts the Service.
  			 */
  def start(): Unit
  /**
  			 * Stops this running instance of the Service.
  			 */
  def stop(): Unit
}

object Service {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    foregroundCancel: () => Unit,
    foregroundNotify: (Double, Notification) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getIntent: () => Intent,
    getServiceInstanceId: () => Double,
    intent: Intent,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    serviceInstanceId: Double,
    setBubbleParent: Boolean => Unit,
    start: () => Unit,
    stop: () => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Service = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), foregroundCancel = js.Any.fromFunction0(foregroundCancel), foregroundNotify = js.Any.fromFunction2(foregroundNotify), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getIntent = js.Any.fromFunction0(getIntent), getServiceInstanceId = js.Any.fromFunction0(getServiceInstanceId), intent = intent, removeEventListener = js.Any.fromFunction2(removeEventListener), serviceInstanceId = serviceInstanceId, setBubbleParent = js.Any.fromFunction1(setBubbleParent), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Service]
  }
}

