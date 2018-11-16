package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Gesture module is responsible for high-level device gestures such as orientation changes
	 * and shake gestures.
	 */
@JSGlobal("Titanium.Gesture")
@js.native
object GestureNs extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Indicates if the device is currently held in landscape form.
  		 */
  val landscape: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Orientation of the device.
  		 */
  val orientation: scala.Double = js.native
  /**
  		 * Indicates if the device is currently held in portrait form.
  		 */
  val portrait: scala.Boolean = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Gesture.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Gesture.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Gesture.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Gesture.orientation> property.
  		 */
  def getOrientation(): scala.Double = js.native
  /**
  		 * Returns whether or not the device is currently held in landscape form.
  		 */
  def isLandscape(): scala.Boolean = js.native
  /**
  		 * Returns whether or not the device is currently held in portrait form.
  		 */
  def isPortrait(): scala.Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Gesture.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Gesture.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Gesture.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

