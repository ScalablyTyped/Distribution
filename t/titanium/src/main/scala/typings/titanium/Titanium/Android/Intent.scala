package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message objects passed between Android application components.
  */
@js.native
trait Intent extends Proxy {
  
  /**
    * The action associated with this intent.
    */
  var action: String = js.native
  
  /**
    * Adds a category to this Intent.
    */
  def addCategory(name: String): Unit = js.native
  
  /**
    * Adds to the existing flags on the `Intent`.
    */
  def addFlags(flags: Double): Unit = js.native
  
  /**
    * The Java class name of the activity associated with this intent
    * ([packageName](Titanium.Android.Intent.packageName) must also be set).
    */
  var className: String = js.native
  
  /**
    * The Intent's Data URI.
    */
  val data: String = js.native
  
  /**
    * Intent flags.
    */
  var flags: Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.action> property.
    * @deprecated Access <Titanium.Android.Intent.action> instead.
    */
  def getAction(): String = js.native
  
  /**
    * Get a <Titanium.Blob> property from this `Intent`.
    */
  def getBlobExtra(name: String): Blob = js.native
  
  /**
    * Get a boolean property from this Intent.
    */
  def getBooleanExtra(name: String, defaultValue: Boolean): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.className> property.
    * @deprecated Access <Titanium.Android.Intent.className> instead.
    */
  def getClassName(): String = js.native
  
  /**
    * Get the Data URI from this `Intent`.
    */
  def getData(): String = js.native
  
  /**
    * Get a double property from this `Intent`.
    */
  def getDoubleExtra(name: String, defaultValue: Double): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.flags> property.
    * @deprecated Access <Titanium.Android.Intent.flags> instead.
    */
  def getFlags(): Double = js.native
  
  /**
    * Get an integer property from this `Intent`.
    */
  def getIntExtra(name: String, defaultValue: Double): Double = js.native
  
  /**
    * Get a long property from this `Intent`.
    */
  def getLongExtra(name: String, defaultValue: Double): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.packageName> property.
    * @deprecated Access <Titanium.Android.Intent.packageName> instead.
    */
  def getPackageName(): String = js.native
  
  /**
    * Get a string property from this `Intent`.
    */
  def getStringExtra(name: String): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.type> property.
    * @deprecated Access <Titanium.Android.Intent.type> instead.
    */
  def getType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Intent.url> property.
    * @deprecated Access <Titanium.Android.Intent.url> instead.
    */
  def getUrl(): String = js.native
  
  /**
    * Returns `true` if this `Intent` has the specified property.
    */
  def hasExtra(name: String): Boolean = js.native
  
  /**
    * The fully-qualified Java package name of the activity.
    */
  var packageName: String = js.native
  
  /**
    * Puts an extra property on this `Intent`.
    */
  def putExtra(name: String, value: js.Any): Unit = js.native
  
  /**
    * Put a URI property on this `Intent` (useful for <Titanium.Android.EXTRA_STREAM>).
    */
  def putExtraUri(name: String, value: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.Intent.action> property.
    * @deprecated Set the value using <Titanium.Android.Intent.action> instead.
    */
  def setAction(action: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.Intent.className> property.
    * @deprecated Set the value using <Titanium.Android.Intent.className> instead.
    */
  def setClassName(className: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.Intent.flags> property.
    * @deprecated Set the value using <Titanium.Android.Intent.flags> instead.
    */
  def setFlags(flags: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.Intent.packageName> property.
    * @deprecated Set the value using <Titanium.Android.Intent.packageName> instead.
    */
  def setPackageName(packageName: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.Intent.url> property.
    * @deprecated Set the value using <Titanium.Android.Intent.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  
  /**
    * The MIME type for this Intent.
    */
  val `type`: String = js.native
  
  /**
    * The URL to a Titanium JavaScript Activity.
    */
  var url: String = js.native
}
