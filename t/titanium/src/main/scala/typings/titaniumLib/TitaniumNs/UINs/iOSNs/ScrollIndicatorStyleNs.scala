package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
			 */
@JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle")
@js.native
object ScrollIndicatorStyleNs extends js.Object {
  /**
  				 * A style of indicator which is black smaller than the default style. This style is good
  				 * against a white content background.
  				 */
  val BLACK: scala.Double = js.native
  /**
  				 * The default style of scroll indicator, which is black with a white border. This style is
  				 * good against any content background.
  				 */
  val DEFAULT: scala.Double = js.native
  /**
  				 * A style of indicator is white and smaller than the default style. This style is good against
  				 * a black content background.
  				 */
  val WHITE: scala.Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.ScrollIndicatorStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.ScrollIndicatorStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.ScrollIndicatorStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

