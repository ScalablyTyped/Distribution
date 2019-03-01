package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserActivity module is used to enable device Handoff and to create User Activities.
			 */
trait UserActivity
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Name of the activity type.
  				 */
  var activityType: java.lang.String
  /**
  				 * Set to true if this user activity should be eligible to be handed off to another device
  				 */
  var eligibleForHandoff: scala.Boolean
  /**
  				 * Set to `true` if the user activity can be publicly accessed by all iOS users.
  				 */
  var eligibleForPublicIndexing: scala.Boolean
  /**
  				 * Set to true if the user activity should be added to the on-device index.
  				 */
  var eligibleForSearch: scala.Boolean
  /**
  				 * Absolute date after which the activity is no longer eligible to be indexed or handed off.
  				 */
  var expirationDate: java.lang.String
  /**
  				 * An array of string keywords representing words or phrases that might help the user to find the activity in the application history.
  				 */
  var keywords: js.Array[java.lang.String]
  /**
  				 * Set to true everytime you have updated the user activity and need the changes to be saved before handing it off to another device.
  				 */
  var needsSave: scala.Boolean
  /**
  				 * An array of String keys from the userInfo property which represent the minimal information about the user activity that should be stored for later restoration.
  				 */
  var requiredUserInfoKeys: js.Array[java.lang.String]
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  var supported: scala.Boolean
  /**
  				 * An optional, user-visible title for this activity such as a document name or web page title.
  				 */
  var title: java.lang.String
  /**
  				 * The userInfo dictionary contains application-specific state needed to continue an activity on another device.
  				 */
  var userInfo: js.Any
  /**
  				 * When no suitable application is installed on a resuming device and the `webpageURL` property is set,
  				 * the user activity will instead be continued in a web browser by loading the specified URL.
  				 */
  var webpageURL: java.lang.String
  /**
  				 * Adds a Titanium.App.iOS.SearchableItemAttributeSet to the user activity.
  				 */
  def addContentAttributeSet(contentAttributeSet: SearchableItemAttributeSet): scala.Unit
  /**
  				 * Marks the activity as currently in use by the user.
  				 */
  def becomeCurrent(): scala.Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def getActivityType(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def getEligibleForHandoff(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def getEligibleForPublicIndexing(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def getEligibleForSearch(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def getExpirationDate(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def getKeywords(): js.Array[java.lang.String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def getNeedsSave(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def getRequiredUserInfoKeys(): js.Array[java.lang.String]
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def getSupported(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def getUserInfo(): js.Any
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def getWebpageURL(): java.lang.String
  /**
  				 * Invalidates an activity when it is no longer eligible for continuation.
  				 */
  def invalidate(): scala.Unit
  /**
  				 * Determines if user activities are supported (`true`) or not (`false`) by the device.
  				 */
  def isSupported(): scala.Boolean
  /**
  				 * Marks the activity as currently **not** in use and ineligible to be continued.
  				 */
  def resignCurrent(): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def setActivityType(activityType: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def setEligibleForHandoff(eligibleForHandoff: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPublicIndexing> property.
  				 */
  def setEligibleForPublicIndexing(eligibleForPublicIndexing: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForSearch> property.
  				 */
  def setEligibleForSearch(eligibleForSearch: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.keywords> property.
  				 */
  def setKeywords(keywords: js.Array[java.lang.String]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.needsSave> property.
  				 */
  def setNeedsSave(needsSave: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.requiredUserInfoKeys> property.
  				 */
  def setRequiredUserInfoKeys(requiredUserInfoKeys: js.Array[java.lang.String]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.supported> property.
  				 */
  def setSupported(supported: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.userInfo> property.
  				 */
  def setUserInfo(userInfo: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.webpageURL> property.
  				 */
  def setWebpageURL(webpageURL: java.lang.String): scala.Unit
}

object UserActivity {
  @scala.inline
  def apply(
    activityType: java.lang.String,
    addContentAttributeSet: js.Function1[SearchableItemAttributeSet, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    becomeCurrent: js.Function0[scala.Unit],
    bubbleParent: scala.Boolean,
    eligibleForHandoff: scala.Boolean,
    eligibleForPublicIndexing: scala.Boolean,
    eligibleForSearch: scala.Boolean,
    expirationDate: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getActivityType: js.Function0[java.lang.String],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getEligibleForHandoff: js.Function0[scala.Boolean],
    getEligibleForPublicIndexing: js.Function0[scala.Boolean],
    getEligibleForSearch: js.Function0[scala.Boolean],
    getExpirationDate: js.Function0[java.lang.String],
    getKeywords: js.Function0[js.Array[java.lang.String]],
    getNeedsSave: js.Function0[scala.Boolean],
    getRequiredUserInfoKeys: js.Function0[js.Array[java.lang.String]],
    getSupported: js.Function0[scala.Boolean],
    getTitle: js.Function0[java.lang.String],
    getUserInfo: js.Function0[js.Any],
    getWebpageURL: js.Function0[java.lang.String],
    invalidate: js.Function0[scala.Unit],
    isSupported: js.Function0[scala.Boolean],
    keywords: js.Array[java.lang.String],
    needsSave: scala.Boolean,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    requiredUserInfoKeys: js.Array[java.lang.String],
    resignCurrent: js.Function0[scala.Unit],
    setActivityType: js.Function1[java.lang.String, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setEligibleForHandoff: js.Function1[scala.Boolean, scala.Unit],
    setEligibleForPublicIndexing: js.Function1[scala.Boolean, scala.Unit],
    setEligibleForSearch: js.Function1[scala.Boolean, scala.Unit],
    setExpirationDate: js.Function1[java.lang.String, scala.Unit],
    setKeywords: js.Function1[js.Array[java.lang.String], scala.Unit],
    setNeedsSave: js.Function1[scala.Boolean, scala.Unit],
    setRequiredUserInfoKeys: js.Function1[js.Array[java.lang.String], scala.Unit],
    setSupported: js.Function1[scala.Boolean, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    setUserInfo: js.Function1[js.Any, scala.Unit],
    setWebpageURL: js.Function1[java.lang.String, scala.Unit],
    supported: scala.Boolean,
    title: java.lang.String,
    userInfo: js.Any,
    webpageURL: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): UserActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activityType")(activityType)
    __obj.updateDynamic("addContentAttributeSet")(addContentAttributeSet)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("becomeCurrent")(becomeCurrent)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("eligibleForHandoff")(eligibleForHandoff)
    __obj.updateDynamic("eligibleForPublicIndexing")(eligibleForPublicIndexing)
    __obj.updateDynamic("eligibleForSearch")(eligibleForSearch)
    __obj.updateDynamic("expirationDate")(expirationDate)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getActivityType")(getActivityType)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getEligibleForHandoff")(getEligibleForHandoff)
    __obj.updateDynamic("getEligibleForPublicIndexing")(getEligibleForPublicIndexing)
    __obj.updateDynamic("getEligibleForSearch")(getEligibleForSearch)
    __obj.updateDynamic("getExpirationDate")(getExpirationDate)
    __obj.updateDynamic("getKeywords")(getKeywords)
    __obj.updateDynamic("getNeedsSave")(getNeedsSave)
    __obj.updateDynamic("getRequiredUserInfoKeys")(getRequiredUserInfoKeys)
    __obj.updateDynamic("getSupported")(getSupported)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getUserInfo")(getUserInfo)
    __obj.updateDynamic("getWebpageURL")(getWebpageURL)
    __obj.updateDynamic("invalidate")(invalidate)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("keywords")(keywords)
    __obj.updateDynamic("needsSave")(needsSave)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("requiredUserInfoKeys")(requiredUserInfoKeys)
    __obj.updateDynamic("resignCurrent")(resignCurrent)
    __obj.updateDynamic("setActivityType")(setActivityType)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setEligibleForHandoff")(setEligibleForHandoff)
    __obj.updateDynamic("setEligibleForPublicIndexing")(setEligibleForPublicIndexing)
    __obj.updateDynamic("setEligibleForSearch")(setEligibleForSearch)
    __obj.updateDynamic("setExpirationDate")(setExpirationDate)
    __obj.updateDynamic("setKeywords")(setKeywords)
    __obj.updateDynamic("setNeedsSave")(setNeedsSave)
    __obj.updateDynamic("setRequiredUserInfoKeys")(setRequiredUserInfoKeys)
    __obj.updateDynamic("setSupported")(setSupported)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setUserInfo")(setUserInfo)
    __obj.updateDynamic("setWebpageURL")(setWebpageURL)
    __obj.updateDynamic("supported")(supported)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.updateDynamic("webpageURL")(webpageURL)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserActivity]
  }
}

