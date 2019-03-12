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

object Intent {
  @scala.inline
  def apply(
    action: java.lang.String,
    addCategory: java.lang.String => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addFlags: scala.Double => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    className: java.lang.String,
    data: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    flags: scala.Double,
    getAction: () => java.lang.String,
    getApiName: () => java.lang.String,
    getBlobExtra: java.lang.String => titaniumLib.TitaniumNs.Blob,
    getBooleanExtra: (java.lang.String, scala.Boolean) => scala.Boolean,
    getBubbleParent: () => scala.Boolean,
    getClassName: () => java.lang.String,
    getData: () => java.lang.String,
    getDoubleExtra: (java.lang.String, scala.Double) => scala.Double,
    getFlags: () => scala.Double,
    getIntExtra: (java.lang.String, scala.Double) => scala.Double,
    getLongExtra: (java.lang.String, scala.Double) => scala.Double,
    getPackageName: () => java.lang.String,
    getStringExtra: java.lang.String => java.lang.String,
    getType: () => java.lang.String,
    getUrl: () => java.lang.String,
    hasExtra: java.lang.String => scala.Boolean,
    packageName: java.lang.String,
    putExtra: (java.lang.String, js.Any) => scala.Unit,
    putExtraUri: (java.lang.String, js.Any) => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setAction: java.lang.String => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setClassName: java.lang.String => scala.Unit,
    setFlags: scala.Double => scala.Unit,
    setPackageName: java.lang.String => scala.Unit,
    setUrl: java.lang.String => scala.Unit,
    `type`: java.lang.String,
    url: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Intent = {
    val __obj = js.Dynamic.literal(action = action, addCategory = js.Any.fromFunction1(addCategory), addEventListener = js.Any.fromFunction2(addEventListener), addFlags = js.Any.fromFunction1(addFlags), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, className = className, data = data, fireEvent = js.Any.fromFunction2(fireEvent), flags = flags, getAction = js.Any.fromFunction0(getAction), getApiName = js.Any.fromFunction0(getApiName), getBlobExtra = js.Any.fromFunction1(getBlobExtra), getBooleanExtra = js.Any.fromFunction2(getBooleanExtra), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getClassName = js.Any.fromFunction0(getClassName), getData = js.Any.fromFunction0(getData), getDoubleExtra = js.Any.fromFunction2(getDoubleExtra), getFlags = js.Any.fromFunction0(getFlags), getIntExtra = js.Any.fromFunction2(getIntExtra), getLongExtra = js.Any.fromFunction2(getLongExtra), getPackageName = js.Any.fromFunction0(getPackageName), getStringExtra = js.Any.fromFunction1(getStringExtra), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), hasExtra = js.Any.fromFunction1(hasExtra), packageName = packageName, putExtra = js.Any.fromFunction2(putExtra), putExtraUri = js.Any.fromFunction2(putExtraUri), removeEventListener = js.Any.fromFunction2(removeEventListener), setAction = js.Any.fromFunction1(setAction), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setClassName = js.Any.fromFunction1(setClassName), setFlags = js.Any.fromFunction1(setFlags), setPackageName = js.Any.fromFunction1(setPackageName), setUrl = js.Any.fromFunction1(setUrl), url = url)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Intent]
  }
}

