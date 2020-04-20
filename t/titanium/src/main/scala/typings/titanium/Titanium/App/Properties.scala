package typings.titanium.Titanium.App

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Module
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The App Properties module is used for storing application-related data in property/value pairs
		 * that persist beyond application sessions and device power cycles.
		 */
@JSGlobal("Titanium.App.Properties")
@js.native
class Properties () extends Module

/* static members */
@JSGlobal("Titanium.App.Properties")
@js.native
object Properties extends js.Object {
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PropertiesChangeEvent, Unit]
  ): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: PropertiesChangeEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.apiName> property.
  			 * @deprecated Access <Titanium.App.Properties.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Returns the value of a property as a boolean data type.
  			 */
  def getBool(property: String): Boolean = js.native
  def getBool(property: String, defaultValue: Boolean): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.bubbleParent> property.
  			 * @deprecated Access <Titanium.App.Properties.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Returns the value of a property as a double (double-precision, floating point) data type.
  			 */
  def getDouble(property: String): Double = js.native
  def getDouble(property: String, defaultValue: Double): Double = js.native
  /**
  			 * Returns the value of a property as an integer data type.
  			 */
  def getInt(property: String): Double = js.native
  def getInt(property: String, defaultValue: Double): Double = js.native
  /**
  			 * Gets the value of the <Titanium.App.Properties.lifecycleContainer> property.
  			 * @deprecated Access <Titanium.App.Properties.lifecycleContainer> instead.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Returns the value of a property as an array data type.
  			 */
  def getList(property: String): js.Array[_] = js.native
  def getList(property: String, defaultValue: js.Array[_]): js.Array[_] = js.native
  /**
  			 * Returns the value of a property as an object.
  			 */
  def getObject(property: String): js.Any = js.native
  def getObject(property: String, defaultValue: js.Any): js.Any = js.native
  /**
  			 * Returns the value of a property as a string data type.
  			 */
  def getString(property: String): String = js.native
  def getString(property: String, defaultValue: String): String = js.native
  /**
  			 * Indicates whether a property exists.
  			 */
  def hasProperty(property: String): Boolean = js.native
  /**
  			 * Returns an array of property names.
  			 */
  def listProperties(): js.Array[_] = js.native
  /**
  			 * Removes all properties that have been set by the user on runtime, or does nothing otherwise.
  			 */
  def removeAllProperties(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PropertiesChangeEvent, Unit]
  ): Unit = js.native
  /**
  			 * Removes a property if it exists, or does nothing otherwise.
  			 */
  def removeProperty(property: String): Unit = js.native
  /**
  			 * Sets the value of a property as a boolean data type. The property will be created if it
  			 * does not exist.
  			 */
  def setBool(property: String, value: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Properties.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.App.Properties.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of a property as a double (double-precision, floating point) data type. The
  			 * property will be created if it does not exist.
  			 */
  def setDouble(property: String, value: Double): Unit = js.native
  /**
  			 * Sets the value of a property as an integer data type. The property will be created if it
  			 * does not exist.
  			 */
  def setInt(property: String, value: Double): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Properties.lifecycleContainer> property.
  			 * @deprecated Set the value using <Titanium.App.Properties.lifecycleContainer> instead.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  			 * Sets the value of a property as an array data type. The property will be created if it
  			 * does not exist.
  			 */
  def setList(property: String, value: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of a property as an object data type. The property will be created if it
  			 * does not exist.
  			 */
  def setObject(property: String, value: js.Any): Unit = js.native
  /**
  			 * Sets the value of a property as a string data type. The property will be created if it
  			 * does not exist.
  			 */
  def setString(property: String, value: String): Unit = js.native
}

