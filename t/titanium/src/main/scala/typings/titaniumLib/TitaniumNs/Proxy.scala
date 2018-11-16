package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The base for all Titanium objects.
	 */

trait Proxy extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean
  /**
  		 * Gets the value of the <Titanium.Proxy.lifecycleContainer> property.
  		 */
  var getLifecycleContainer: js.UndefOr[
    js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup]
  ] = js.undefined
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: js.UndefOr[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = js.undefined
  /**
  		 * Sets the value of the <Titanium.Proxy.lifecycleContainer> property.
  		 */
  var setLifecycleContainer: js.UndefOr[
    (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit])
  ] = js.undefined
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  		 * Gets the value of the <Titanium.Proxy.apiName> property.
  		 */
  def getApiName(): java.lang.String
  /**
  		 * Gets the value of the <Titanium.Proxy.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  		 * Sets the value of the <Titanium.Proxy.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

