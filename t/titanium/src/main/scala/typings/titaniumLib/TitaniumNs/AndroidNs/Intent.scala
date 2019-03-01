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
    addCategory: js.Function1[java.lang.String, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addFlags: js.Function1[scala.Double, scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    className: java.lang.String,
    data: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    flags: scala.Double,
    getAction: js.Function0[java.lang.String],
    getApiName: js.Function0[java.lang.String],
    getBlobExtra: js.Function1[java.lang.String, titaniumLib.TitaniumNs.Blob],
    getBooleanExtra: js.Function2[java.lang.String, scala.Boolean, scala.Boolean],
    getBubbleParent: js.Function0[scala.Boolean],
    getClassName: js.Function0[java.lang.String],
    getData: js.Function0[java.lang.String],
    getDoubleExtra: js.Function2[java.lang.String, scala.Double, scala.Double],
    getFlags: js.Function0[scala.Double],
    getIntExtra: js.Function2[java.lang.String, scala.Double, scala.Double],
    getLongExtra: js.Function2[java.lang.String, scala.Double, scala.Double],
    getPackageName: js.Function0[java.lang.String],
    getStringExtra: js.Function1[java.lang.String, java.lang.String],
    getType: js.Function0[java.lang.String],
    getUrl: js.Function0[java.lang.String],
    hasExtra: js.Function1[java.lang.String, scala.Boolean],
    packageName: java.lang.String,
    putExtra: js.Function2[java.lang.String, js.Any, scala.Unit],
    putExtraUri: js.Function2[java.lang.String, js.Any, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAction: js.Function1[java.lang.String, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setClassName: js.Function1[java.lang.String, scala.Unit],
    setFlags: js.Function1[scala.Double, scala.Unit],
    setPackageName: js.Function1[java.lang.String, scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    `type`: java.lang.String,
    url: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Intent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("addCategory")(addCategory)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFlags")(addFlags)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("getAction")(getAction)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBlobExtra")(getBlobExtra)
    __obj.updateDynamic("getBooleanExtra")(getBooleanExtra)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getClassName")(getClassName)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getDoubleExtra")(getDoubleExtra)
    __obj.updateDynamic("getFlags")(getFlags)
    __obj.updateDynamic("getIntExtra")(getIntExtra)
    __obj.updateDynamic("getLongExtra")(getLongExtra)
    __obj.updateDynamic("getPackageName")(getPackageName)
    __obj.updateDynamic("getStringExtra")(getStringExtra)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("hasExtra")(hasExtra)
    __obj.updateDynamic("packageName")(packageName)
    __obj.updateDynamic("putExtra")(putExtra)
    __obj.updateDynamic("putExtraUri")(putExtraUri)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAction")(setAction)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setClassName")(setClassName)
    __obj.updateDynamic("setFlags")(setFlags)
    __obj.updateDynamic("setPackageName")(setPackageName)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.updateDynamic("url")(url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Intent]
  }
}

