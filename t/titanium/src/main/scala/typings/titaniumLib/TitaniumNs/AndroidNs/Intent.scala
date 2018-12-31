package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Message objects passed between Android application components.
		 */
trait Intent
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The action associated with this intent.
  			 */
  var action: java.lang.String
  /**
  			 * The Java class name of the activity associated with this intent
  			 * ([packageName](Titanium.Android.Intent.packageName) must also be set).
  			 */
  var className: java.lang.String
  /**
  			 * The Intent's Data URI.
  			 */
  val data: java.lang.String
  /**
  			 * Intent flags.
  			 */
  var flags: scala.Double
  /**
  			 * The fully-qualified Java package name of the activity.
  			 */
  var packageName: java.lang.String
  /**
  			 * The MIME type for this Intent.
  			 */
  val `type`: java.lang.String
  /**
  			 * The URL to a Titanium JavaScript Activity.
  			 */
  var url: java.lang.String
  /**
  			 * Adds a category to this Intent.
  			 */
  def addCategory(name: java.lang.String): scala.Unit
  /**
  			 * Adds to the existing flags on the `Intent`.
  			 */
  def addFlags(flags: scala.Double): scala.Unit
  /**
  			 * Gets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def getAction(): java.lang.String
  /**
  			 * Get a <Titanium.Blob> property from this `Intent`.
  			 */
  def getBlobExtra(name: java.lang.String): titaniumLib.TitaniumNs.Blob
  /**
  			 * Get a boolean property from this Intent.
  			 */
  def getBooleanExtra(name: java.lang.String, defaultValue: scala.Boolean): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def getClassName(): java.lang.String
  /**
  			 * Get the Data URI from this `Intent`.
  			 */
  def getData(): java.lang.String
  /**
  			 * Get a double property from this `Intent`.
  			 */
  def getDoubleExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def getFlags(): scala.Double
  /**
  			 * Get an integer property from this `Intent`.
  			 */
  def getIntExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double
  /**
  			 * Get a long property from this `Intent`.
  			 */
  def getLongExtra(name: java.lang.String, defaultValue: scala.Double): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def getPackageName(): java.lang.String
  /**
  			 * Get a string property from this `Intent`.
  			 */
  def getStringExtra(name: java.lang.String): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.type> property.
  			 */
  def getType(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * Returns `true` if this `Intent` has the specified property.
  			 */
  def hasExtra(name: java.lang.String): scala.Boolean
  /**
  			 * Puts an extra property on this `Intent`.
  			 */
  def putExtra(name: java.lang.String, value: js.Any): scala.Unit
  /**
  			 * Put a URI property on this `Intent` (useful for <Titanium.Android.EXTRA_STREAM>).
  			 */
  def putExtraUri(name: java.lang.String, value: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def setAction(action: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def setClassName(className: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def setFlags(flags: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def setPackageName(packageName: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
}

