package typings
package titaniumLib.TitaniumNs.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The App Properties module is used for storing application-related data in property/value pairs
		 * that persist beyond application sessions and device power cycles.
		 */
@JSGlobal("Titanium.App.Properties")
@js.native
object PropertiesNs extends js.Object {
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
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Returns the value of a property as a boolean data type.
  			 */
  def getBool(property: java.lang.String): scala.Boolean = js.native
  def getBool(property: java.lang.String, defaultValue: scala.Boolean): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Returns the value of a property as a double (double-precision, floating point) data type.
  			 */
  def getDouble(property: java.lang.String): scala.Double = js.native
  def getDouble(property: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  /**
  			 * Returns the value of a property as an integer data type.
  			 */
  def getInt(property: java.lang.String): scala.Double = js.native
  def getInt(property: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Returns the value of a property as an array data type.
  			 */
  def getList(property: java.lang.String): js.Array[_] = js.native
  def getList(property: java.lang.String, defaultValue: js.Array[_]): js.Array[_] = js.native
  /**
  			 * Returns the value of a property as an object.
  			 */
  def getObject(property: java.lang.String): js.Any = js.native
  def getObject(property: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /**
  			 * Returns the value of a property as a string data type.
  			 */
  def getString(property: java.lang.String): java.lang.String = js.native
  def getString(property: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  /**
  			 * Indicates whether a property exists.
  			 */
  def hasProperty(property: java.lang.String): scala.Boolean = js.native
  /**
  			 * Returns an array of property names.
  			 */
  def listProperties(): js.Array[_] = js.native
  /**
  			 * Removes all properties that have been set by the user on runtime, or does nothing otherwise.
  			 */
  def removeAllProperties(): scala.Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Removes a property if it exists, or does nothing otherwise.
  			 */
  def removeProperty(property: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of a property as a boolean data type. The property will be created if it
  			 * does not exist.
  			 */
  def setBool(property: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Properties.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of a property as a double (double-precision, floating point) data type. The
  			 * property will be created if it does not exist.
  			 */
  def setDouble(property: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of a property as an integer data type. The property will be created if it
  			 * does not exist.
  			 */
  def setInt(property: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Properties.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Properties.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  			 * Sets the value of a property as an array data type. The property will be created if it
  			 * does not exist.
  			 */
  def setList(property: java.lang.String, value: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of a property as an object data type. The property will be created if it
  			 * does not exist.
  			 */
  def setObject(property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of a property as a string data type. The property will be created if it
  			 * does not exist.
  			 */
  def setString(property: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

