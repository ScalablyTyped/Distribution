package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackDebug extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Logs messages with a `debug` severity-level.
  		 */
  def debug(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with a `debug` severity-level.
  		 */
  def debug(message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Logs messages with an `error` severity-level.
  		 */
  def error(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with an `error` severity-level.
  		 */
  def error(message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.API.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.API.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.API.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Logs messages with an `info` severity-level.
  		 */
  def info(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with an `info` severity-level.
  		 */
  def info(message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Logs messages with the specified severity-level.
  		 */
  def log(level: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with the specified severity-level.
  		 */
  def log(level: java.lang.String, message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.API.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.API.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.API.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Logs messages with a `timestamp` severity-level, prefixed with a timestamp float number
  		 * representing the number of seconds since January 1st, 2001.
  		 */
  def timestamp(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with a `timestamp` severity-level, prefixed with a timestamp float number
  		 * representing the number of seconds since January 1st, 2001.
  		 */
  def timestamp(message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Logs messages with a `trace` severity-level.
  		 */
  def trace(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with a `trace` severity-level.
  		 */
  def trace(message: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Logs messages with a `warn` severity-level.
  		 */
  def warn(message: java.lang.String): scala.Unit = js.native
  /**
  		 * Logs messages with a `warn` severity-level.
  		 */
  def warn(message: js.Array[java.lang.String]): scala.Unit = js.native
}

