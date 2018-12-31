package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserDefaults module is used for storing application-related data in property/value pairs
			 * that persist beyond application sessions and device power cycles. UserDefaults allows the suiteName
			 * of the UserDefaults to be specified at creation time.
			 */
@js.native
trait UserDefaults
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Sets the name of the suite to be used to access UserDefaults.
  				 */
  var suiteName: java.lang.String = js.native
  /**
  				 * Returns the value of a property as a boolean data type.
  				 */
  def getBool(property: java.lang.String): scala.Boolean = js.native
  def getBool(property: java.lang.String, defaultValue: scala.Boolean): scala.Boolean = js.native
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
  				 * Gets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 */
  def getSuiteName(): java.lang.String = js.native
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
  				 * Removes a property if it exists, or does nothing otherwise.
  				 */
  def removeProperty(property: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of a property as a boolean data type. The property will be created if it
  				 * does not exist.
  				 */
  def setBool(property: java.lang.String, value: scala.Boolean): scala.Unit = js.native
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
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 */
  def setSuiteName(suiteName: java.lang.String): scala.Unit = js.native
}

