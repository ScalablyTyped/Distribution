package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Message objects passed between Android application components.
		 */
trait Intent extends Proxy {
  /**
  			 * The action associated with this intent.
  			 */
  var action: String
  /**
  			 * The Java class name of the activity associated with this intent
  			 * ([packageName](Titanium.Android.Intent.packageName) must also be set).
  			 */
  var className: String
  /**
  			 * The Intent's Data URI.
  			 */
  val data: String
  /**
  			 * Intent flags.
  			 */
  var flags: Double
  /**
  			 * The fully-qualified Java package name of the activity.
  			 */
  var packageName: String
  /**
  			 * The MIME type for this Intent.
  			 */
  val `type`: String
  /**
  			 * The URL to a Titanium JavaScript Activity.
  			 */
  var url: String
  /**
  			 * Adds a category to this Intent.
  			 */
  def addCategory(name: String): Unit
  /**
  			 * Adds to the existing flags on the `Intent`.
  			 */
  def addFlags(flags: Double): Unit
  /**
  			 * Gets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def getAction(): String
  /**
  			 * Get a <Titanium.Blob> property from this `Intent`.
  			 */
  def getBlobExtra(name: String): Blob
  /**
  			 * Get a boolean property from this Intent.
  			 */
  def getBooleanExtra(name: String, defaultValue: Boolean): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def getClassName(): String
  /**
  			 * Get the Data URI from this `Intent`.
  			 */
  def getData(): String
  /**
  			 * Get a double property from this `Intent`.
  			 */
  def getDoubleExtra(name: String, defaultValue: Double): Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def getFlags(): Double
  /**
  			 * Get an integer property from this `Intent`.
  			 */
  def getIntExtra(name: String, defaultValue: Double): Double
  /**
  			 * Get a long property from this `Intent`.
  			 */
  def getLongExtra(name: String, defaultValue: Double): Double
  /**
  			 * Gets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def getPackageName(): String
  /**
  			 * Get a string property from this `Intent`.
  			 */
  def getStringExtra(name: String): String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.type> property.
  			 */
  def getType(): String
  /**
  			 * Gets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Returns `true` if this `Intent` has the specified property.
  			 */
  def hasExtra(name: String): Boolean
  /**
  			 * Puts an extra property on this `Intent`.
  			 */
  def putExtra(name: String, value: js.Any): Unit
  /**
  			 * Put a URI property on this `Intent` (useful for <Titanium.Android.EXTRA_STREAM>).
  			 */
  def putExtraUri(name: String, value: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.action> property.
  			 */
  def setAction(action: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.className> property.
  			 */
  def setClassName(className: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.flags> property.
  			 */
  def setFlags(flags: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.packageName> property.
  			 */
  def setPackageName(packageName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.Intent.url> property.
  			 */
  def setUrl(url: String): Unit
}

object Intent {
  @scala.inline
  def apply(
    action: String,
    addCategory: String => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addFlags: Double => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    className: String,
    data: String,
    fireEvent: (String, js.Any) => Unit,
    flags: Double,
    getAction: () => String,
    getApiName: () => String,
    getBlobExtra: String => Blob,
    getBooleanExtra: (String, Boolean) => Boolean,
    getBubbleParent: () => Boolean,
    getClassName: () => String,
    getData: () => String,
    getDoubleExtra: (String, Double) => Double,
    getFlags: () => Double,
    getIntExtra: (String, Double) => Double,
    getLongExtra: (String, Double) => Double,
    getPackageName: () => String,
    getStringExtra: String => String,
    getType: () => String,
    getUrl: () => String,
    hasExtra: String => Boolean,
    packageName: String,
    putExtra: (String, js.Any) => Unit,
    putExtraUri: (String, js.Any) => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAction: String => Unit,
    setBubbleParent: Boolean => Unit,
    setClassName: String => Unit,
    setFlags: Double => Unit,
    setPackageName: String => Unit,
    setUrl: String => Unit,
    `type`: String,
    url: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Intent = {
    val __obj = js.Dynamic.literal(action = action, addCategory = js.Any.fromFunction1(addCategory), addEventListener = js.Any.fromFunction2(addEventListener), addFlags = js.Any.fromFunction1(addFlags), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, className = className, data = data, fireEvent = js.Any.fromFunction2(fireEvent), flags = flags, getAction = js.Any.fromFunction0(getAction), getApiName = js.Any.fromFunction0(getApiName), getBlobExtra = js.Any.fromFunction1(getBlobExtra), getBooleanExtra = js.Any.fromFunction2(getBooleanExtra), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getClassName = js.Any.fromFunction0(getClassName), getData = js.Any.fromFunction0(getData), getDoubleExtra = js.Any.fromFunction2(getDoubleExtra), getFlags = js.Any.fromFunction0(getFlags), getIntExtra = js.Any.fromFunction2(getIntExtra), getLongExtra = js.Any.fromFunction2(getLongExtra), getPackageName = js.Any.fromFunction0(getPackageName), getStringExtra = js.Any.fromFunction1(getStringExtra), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), hasExtra = js.Any.fromFunction1(hasExtra), packageName = packageName, putExtra = js.Any.fromFunction2(putExtra), putExtraUri = js.Any.fromFunction2(putExtraUri), removeEventListener = js.Any.fromFunction2(removeEventListener), setAction = js.Any.fromFunction1(setAction), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setClassName = js.Any.fromFunction1(setClassName), setFlags = js.Any.fromFunction1(setFlags), setPackageName = js.Any.fromFunction1(setPackageName), setUrl = js.Any.fromFunction1(setUrl), url = url)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Intent]
  }
}

