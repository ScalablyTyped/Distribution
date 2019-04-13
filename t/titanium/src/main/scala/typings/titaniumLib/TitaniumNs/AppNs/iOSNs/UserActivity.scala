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
  				 * A Boolean value that determines whether Siri can suggest the user activity as a shortcut to the user.
  				 */
  var eligibleForPrediction: scala.Boolean
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
  				 * A value used to identify the user activity.
  				 */
  var persistentIdentifier: java.lang.String
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
  				 * Deletes all user activities created by your app.
  				 */
  def deleteAllSavedUserActivities(): scala.Unit
  /**
  				 * Deletes user activities created by your app that have the specified persistent identifiers.
  				 */
  def deleteSavedUserActivitiesForPersistentIdentifiers(persistentIdentifiers: js.Array[java.lang.String]): scala.Unit
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.activityType> property.
  				 */
  def getActivityType(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForHandoff> property.
  				 */
  def getEligibleForHandoff(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def getEligibleForPrediction(): scala.Boolean
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
  				 * Gets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def getPersistentIdentifier(): java.lang.String
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
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.eligibleForPrediction> property.
  				 */
  def setEligibleForPrediction(eligibleForPrediction: scala.Boolean): scala.Unit
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
  				 * Sets the value of the <Titanium.App.iOS.UserActivity.persistentIdentifier> property.
  				 */
  def setPersistentIdentifier(persistentIdentifier: java.lang.String): scala.Unit
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
    addContentAttributeSet: SearchableItemAttributeSet => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    becomeCurrent: () => scala.Unit,
    bubbleParent: scala.Boolean,
    deleteAllSavedUserActivities: () => scala.Unit,
    deleteSavedUserActivitiesForPersistentIdentifiers: js.Array[java.lang.String] => scala.Unit,
    eligibleForHandoff: scala.Boolean,
    eligibleForPrediction: scala.Boolean,
    eligibleForPublicIndexing: scala.Boolean,
    eligibleForSearch: scala.Boolean,
    expirationDate: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getActivityType: () => java.lang.String,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getEligibleForHandoff: () => scala.Boolean,
    getEligibleForPrediction: () => scala.Boolean,
    getEligibleForPublicIndexing: () => scala.Boolean,
    getEligibleForSearch: () => scala.Boolean,
    getExpirationDate: () => java.lang.String,
    getKeywords: () => js.Array[java.lang.String],
    getNeedsSave: () => scala.Boolean,
    getPersistentIdentifier: () => java.lang.String,
    getRequiredUserInfoKeys: () => js.Array[java.lang.String],
    getSupported: () => scala.Boolean,
    getTitle: () => java.lang.String,
    getUserInfo: () => js.Any,
    getWebpageURL: () => java.lang.String,
    invalidate: () => scala.Unit,
    isSupported: () => scala.Boolean,
    keywords: js.Array[java.lang.String],
    needsSave: scala.Boolean,
    persistentIdentifier: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    requiredUserInfoKeys: js.Array[java.lang.String],
    resignCurrent: () => scala.Unit,
    setActivityType: java.lang.String => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setEligibleForHandoff: scala.Boolean => scala.Unit,
    setEligibleForPrediction: scala.Boolean => scala.Unit,
    setEligibleForPublicIndexing: scala.Boolean => scala.Unit,
    setEligibleForSearch: scala.Boolean => scala.Unit,
    setExpirationDate: java.lang.String => scala.Unit,
    setKeywords: js.Array[java.lang.String] => scala.Unit,
    setNeedsSave: scala.Boolean => scala.Unit,
    setPersistentIdentifier: java.lang.String => scala.Unit,
    setRequiredUserInfoKeys: js.Array[java.lang.String] => scala.Unit,
    setSupported: scala.Boolean => scala.Unit,
    setTitle: java.lang.String => scala.Unit,
    setUserInfo: js.Any => scala.Unit,
    setWebpageURL: java.lang.String => scala.Unit,
    supported: scala.Boolean,
    title: java.lang.String,
    userInfo: js.Any,
    webpageURL: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): UserActivity = {
    val __obj = js.Dynamic.literal(activityType = activityType, addContentAttributeSet = js.Any.fromFunction1(addContentAttributeSet), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), becomeCurrent = js.Any.fromFunction0(becomeCurrent), bubbleParent = bubbleParent, deleteAllSavedUserActivities = js.Any.fromFunction0(deleteAllSavedUserActivities), deleteSavedUserActivitiesForPersistentIdentifiers = js.Any.fromFunction1(deleteSavedUserActivitiesForPersistentIdentifiers), eligibleForHandoff = eligibleForHandoff, eligibleForPrediction = eligibleForPrediction, eligibleForPublicIndexing = eligibleForPublicIndexing, eligibleForSearch = eligibleForSearch, expirationDate = expirationDate, fireEvent = js.Any.fromFunction2(fireEvent), getActivityType = js.Any.fromFunction0(getActivityType), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEligibleForHandoff = js.Any.fromFunction0(getEligibleForHandoff), getEligibleForPrediction = js.Any.fromFunction0(getEligibleForPrediction), getEligibleForPublicIndexing = js.Any.fromFunction0(getEligibleForPublicIndexing), getEligibleForSearch = js.Any.fromFunction0(getEligibleForSearch), getExpirationDate = js.Any.fromFunction0(getExpirationDate), getKeywords = js.Any.fromFunction0(getKeywords), getNeedsSave = js.Any.fromFunction0(getNeedsSave), getPersistentIdentifier = js.Any.fromFunction0(getPersistentIdentifier), getRequiredUserInfoKeys = js.Any.fromFunction0(getRequiredUserInfoKeys), getSupported = js.Any.fromFunction0(getSupported), getTitle = js.Any.fromFunction0(getTitle), getUserInfo = js.Any.fromFunction0(getUserInfo), getWebpageURL = js.Any.fromFunction0(getWebpageURL), invalidate = js.Any.fromFunction0(invalidate), isSupported = js.Any.fromFunction0(isSupported), keywords = keywords, needsSave = needsSave, persistentIdentifier = persistentIdentifier, removeEventListener = js.Any.fromFunction2(removeEventListener), requiredUserInfoKeys = requiredUserInfoKeys, resignCurrent = js.Any.fromFunction0(resignCurrent), setActivityType = js.Any.fromFunction1(setActivityType), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEligibleForHandoff = js.Any.fromFunction1(setEligibleForHandoff), setEligibleForPrediction = js.Any.fromFunction1(setEligibleForPrediction), setEligibleForPublicIndexing = js.Any.fromFunction1(setEligibleForPublicIndexing), setEligibleForSearch = js.Any.fromFunction1(setEligibleForSearch), setExpirationDate = js.Any.fromFunction1(setExpirationDate), setKeywords = js.Any.fromFunction1(setKeywords), setNeedsSave = js.Any.fromFunction1(setNeedsSave), setPersistentIdentifier = js.Any.fromFunction1(setPersistentIdentifier), setRequiredUserInfoKeys = js.Any.fromFunction1(setRequiredUserInfoKeys), setSupported = js.Any.fromFunction1(setSupported), setTitle = js.Any.fromFunction1(setTitle), setUserInfo = js.Any.fromFunction1(setUserInfo), setWebpageURL = js.Any.fromFunction1(setWebpageURL), supported = supported, title = title, userInfo = userInfo, webpageURL = webpageURL)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserActivity]
  }
}

