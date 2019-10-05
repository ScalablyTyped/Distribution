package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserDefaults module is used for storing application-related data in property/value pairs
			 * that persist beyond application sessions and device power cycles. UserDefaults allows the suiteName
			 * of the UserDefaults to be specified at creation time.
			 */
@js.native
trait UserDefaults extends Proxy {
  /**
  				 * Sets the name of the suite to be used to access UserDefaults.
  				 */
  var suiteName: String = js.native
  /**
  				 * Returns the value of a property as a boolean data type.
  				 */
  def getBool(property: String): Boolean = js.native
  def getBool(property: String, defaultValue: Boolean): Boolean = js.native
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
  				 * Gets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 */
  def getSuiteName(): String = js.native
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
  				 * Removes a property if it exists, or does nothing otherwise.
  				 */
  def removeProperty(property: String): Unit = js.native
  /**
  				 * Sets the value of a property as a boolean data type. The property will be created if it
  				 * does not exist.
  				 */
  def setBool(property: String, value: Boolean): Unit = js.native
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
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 */
  def setSuiteName(suiteName: String): Unit = js.native
}

