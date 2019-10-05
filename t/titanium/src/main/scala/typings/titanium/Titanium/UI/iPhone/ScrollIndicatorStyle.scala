package typings.titanium.Titanium.UI.iPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
			 */
@JSGlobal("Titanium.UI.iPhone.ScrollIndicatorStyle")
@js.native
object ScrollIndicatorStyle extends js.Object {
  /**
  				 * A style of indicator which is black smaller than the default style. This style is good
  				 * against a white content background.
  				 */
  val BLACK: Double = js.native
  /**
  				 * The default style of scroll indicator, which is black with a white border. This style is
  				 * good against any content background.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * A style of indicator is white and smaller than the default style. This style is good against
  				 * a black content background.
  				 */
  val WHITE: Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.ScrollIndicatorStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.ScrollIndicatorStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.ScrollIndicatorStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

