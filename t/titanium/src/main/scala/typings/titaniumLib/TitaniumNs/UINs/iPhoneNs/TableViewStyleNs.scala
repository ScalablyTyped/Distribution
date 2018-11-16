package typings
package titaniumLib.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the button `style` property of
			 * <Titanium.UI.TableView>.
			 */
@JSGlobal("Titanium.UI.iPhone.TableViewStyle")
@js.native
object TableViewStyleNs extends js.Object {
  /**
  				 * A table view whose sections present distinct groups of rows. The section headers and footers
  				 * do not float.
  				 */
  val GROUPED: scala.Double = js.native
  /**
  				 * A plain table view. Any section headers or footers are displayed as inline separators and
  				 * float when the table view is scrolled.
  				 */
  val PLAIN: scala.Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

